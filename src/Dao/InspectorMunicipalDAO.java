
package DAO;

import Model.InspectorMunicipal;
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


public class InspectorMunicipalDAO {
    
    private static final String ARCHIVO_JSON = "C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\SistemaDeGestionDeProyectosDeConstruccion\\src\\Resource\\data\\inspectores.json";
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
    
    public InspectorMunicipalDAO() {
        this.gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .setPrettyPrinting()
            .create();
    }
    public List<InspectorMunicipal> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<InspectorMunicipal>>(){}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.err.println("Error al cargar inspectores: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void guardarInspectorMunicipal(InspectorMunicipal inspector) {
        List<InspectorMunicipal> inspectores = cargarTodos();
        inspectores.add(inspector);
        try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(inspectores, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar inspector: " + e.getMessage());
        }
    }
    
     
    public boolean borrarInspectorMunicipal(String numeroIdentificacion) {
        List<InspectorMunicipal> inspectores = cargarTodos();
        
        boolean eliminado = inspectores.removeIf(inspector -> 
            inspector.getNumeroIdentificacion().equals(numeroIdentificacion));
        
        if (eliminado) {
            try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
                gson.toJson(inspectores, writer);
                return true;
            } catch (IOException e) {
                System.err.println("Error al guardar los cambios después de eliminar: " + e.getMessage());
                return false;
            }
        }
        
        return eliminado;
    }
}
