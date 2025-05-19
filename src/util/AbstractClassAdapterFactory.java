package util;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import util.AbstractClassAdapter;

public class AbstractClassAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<T> baseClass;

    public AbstractClassAdapterFactory(Class<T> baseClass) {
        this.baseClass = baseClass;
    }

@Override
@SuppressWarnings("unchecked")
public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> type) {
    // Verificar si el tipo coincide con la clase base
    if (!baseClass.isAssignableFrom(type.getRawType())) {
        return null;
    }

    // Obtener el adaptador para la clase concreta utilizando Gson
    TypeAdapter<R> delegateAdapter = gson.getDelegateAdapter(this, type);

    // Crear el adaptador abstracto usando el adaptador delegado
    return new AbstractClassAdapter<>(delegateAdapter);
}

}
