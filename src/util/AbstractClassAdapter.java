package util;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public class AbstractClassAdapter<T> extends TypeAdapter<T> {
    private final TypeAdapter<T> delegate;

    public AbstractClassAdapter(TypeAdapter<T> delegate) {
        this.delegate = delegate;
    }

    @Override
    public void write(JsonWriter out, T value) throws IOException {
        delegate.write(out, value);
    }

    @Override
    public T read(JsonReader in) throws IOException {
        return delegate.read(in);
    }
}
