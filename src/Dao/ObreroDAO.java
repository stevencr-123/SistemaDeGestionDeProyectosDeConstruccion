
package DAO;

import Model.Obrero;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Camilo Jurado
 */
public class ObreroDAO {
    
    private static final String ARCHIVO_JSON = "C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\SistemaDeGestionDeProyectosDeConstruccion\\src\\Resource\\data\\Obrero.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public class LocalDateAdapter extends TypeAdapter<LocalDate> {
    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

    @Override
    public void write(JsonWriter out, LocalDate value) throws IOException {
        if (value == null) {
            out.nullValue();
        } else {
            out.value(formatter.format(value));
        }
    }

    @Override
    public LocalDate read(JsonReader in) throws IOException {
        if (in.peek() == null) {
            return null;
        }
        String dateStr = in.nextString();
        return LocalDate.parse(dateStr, formatter);
    }
}
    
    public ObreroDAO() {
        this.gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .setPrettyPrinting()
            .create();
    }
    public List<Obrero> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Obrero>>(){}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.err.println("Error al cargar obreros: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void guardarObrero(Obrero obrero) {
        List<Obrero> obreros = cargarTodos();
        obreros.add(obrero);
        try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(obreros, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar obrero: " + e.getMessage());
        }
    }
    public boolean borrarObrero(String numeroIdentificacion) {
        List<Obrero> obreros = cargarTodos();
        
        boolean eliminado = obreros.removeIf(obrero -> 
            obrero.getNumeroIdentificacion().equals(numeroIdentificacion));
        
        if (eliminado) {
            try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
                gson.toJson(obreros, writer);
                return true;
            } catch (IOException e) {
                System.err.println("Error al guardar los cambios después de eliminar: " + e.getMessage());
                return false;
            }
        }
        
        return eliminado;
    }
    
    
}
