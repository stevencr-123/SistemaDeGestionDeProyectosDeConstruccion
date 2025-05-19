package util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

    private static final DateTimeFormatter FORMATTER_COMPLETO = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    private static final DateTimeFormatter FORMATTER_SIMPLE = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public void write(JsonWriter out, LocalDateTime value) throws IOException {
        if (value != null) {
            out.value(value.format(FORMATTER_COMPLETO));
        } else {
            out.nullValue();
        }
    }

    @Override
    public LocalDateTime read(JsonReader in) throws IOException {
        String dateTimeString = in.nextString();
        try {
            // Verificar si la cadena contiene una "T" indicando que tiene hora
            if (dateTimeString.contains("T")) {
                return LocalDateTime.parse(dateTimeString, FORMATTER_COMPLETO);
            } else {
                return LocalDateTime.parse(dateTimeString + "T00:00:00", FORMATTER_COMPLETO);
            }
        } catch (Exception ex) {
            throw new IOException("Error al parsear la fecha y hora: " + dateTimeString, ex);
        }
    }
}
