
package DAO;

import Model.Promotor;
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


public class PromotorDAO {
    
    private static final String ARCHIVO_JSON = "C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\GestionParaProyectosDeConstruccion\\src\\Resource\\data\\promotores.json";
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
    
    public PromotorDAO() {
        this.gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .setPrettyPrinting()
            .create();
    }
    public List<Promotor> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Promotor>>(){}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.err.println("Error al cargar promotores: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void guardarPromotor(Promotor promotor) {
        List<Promotor> promotores = cargarTodos();
        promotores.add(promotor);
        try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(promotores, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar promotor: " + e.getMessage());
        }
    }
    
        public boolean borrarPromotor(String numeroIdentificacion) {
        List<Promotor> promotores = cargarTodos();
        
        boolean eliminado = promotores.removeIf(promotor -> 
            promotor.getNumeroIdentificacion().equals(numeroIdentificacion));
        
        if (eliminado) {
            try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
                gson.toJson(promotores, writer);
                return true;
            } catch (IOException e) {
                System.err.println("Error al guardar los cambios después de eliminar: " + e.getMessage());
                return false;
            }
        }
        
        return eliminado;
    }
}
    
    