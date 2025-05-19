package util;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new HashMap<>();
    private final Map<Class<?>, String> subtypeToLabel = new HashMap<>();

    private RuntimeTypeAdapterFactory(Class<?> baseType, String typeFieldName) {
        this.baseType = baseType;
        this.typeFieldName = typeFieldName;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> baseType, String typeFieldName) {
        return new RuntimeTypeAdapterFactory<>(baseType, typeFieldName);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> subtype, String label) {
        labelToSubtype.put(label, subtype);
        subtypeToLabel.put(subtype, label);
        return this;
    }

    @Override
    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> type) {
        if (!baseType.isAssignableFrom(type.getRawType())) {
            return null;
        }

        Map<String, TypeAdapter<?>> labelToDelegate = new HashMap<>();
        Map<Class<?>, TypeAdapter<?>> subtypeToDelegate = new HashMap<>();

        for (Map.Entry<String, Class<?>> entry : labelToSubtype.entrySet()) {
            TypeAdapter<?> delegate = gson.getDelegateAdapter(this, TypeToken.get(entry.getValue()));
            labelToDelegate.put(entry.getKey(), delegate);
            subtypeToDelegate.put(entry.getValue(), delegate);
        }

        return new TypeAdapter<R>() {
            @Override
            public void write(JsonWriter out, R value) throws IOException {
                Class<?> srcType = value.getClass();
                String label = subtypeToLabel.get(srcType);
                if (label == null) {
                    throw new JsonParseException("Cannot serialize subtype: " + srcType.getName());
                }

                TypeAdapter<R> delegate = (TypeAdapter<R>) subtypeToDelegate.get(srcType);
                if (delegate == null) {
                    throw new JsonParseException("Cannot find delegate for subtype: " + srcType.getName());
                }

                JsonObject jsonObject = delegate.toJsonTree(value).getAsJsonObject();
                jsonObject.addProperty(typeFieldName, label);
                gson.toJson(jsonObject, out);
            }

            @Override
            public R read(JsonReader in) throws IOException {
                JsonObject jsonObject = gson.fromJson(in, JsonObject.class);
                JsonElement labelJsonElement = jsonObject.remove(typeFieldName);
                if (labelJsonElement == null) {
                    throw new JsonParseException("Cannot deserialize: missing type field");
                }

                String label = labelJsonElement.getAsString();
                Class<?> subtype = labelToSubtype.get(label);
                if (subtype == null) {
                    throw new JsonParseException("Cannot find subtype for label: " + label);
                }

                TypeAdapter<?> delegate = labelToDelegate.get(label);
                return (R) delegate.fromJsonTree(jsonObject);
            }
        };
    }
}
