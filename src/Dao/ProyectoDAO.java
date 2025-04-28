/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;



import model.Obrero;
import model.ProyectoReparacion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo Jurado
 */
public class ProyectoDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\SistemaDeGestionDeProyectosDeConstruccion\\src\\Resource\\data\\Proyecto.json";
    private final Gson gson;
    
    public ProyectoDAO() {
        this.gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new ProyectoDAO.LocalDateAdapter())
            .setPrettyPrinting()
            .create();
    }
    public List<ProyectoReparacion> cargarTodos() {
        File file = new File(ARCHIVO_JSON);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }
        
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<ProyectoReparacion>>(){}.getType();
            List<ProyectoReparacion> Proyectos = gson.fromJson(reader, tipoLista);
            return Proyectos != null ? Proyectos : new ArrayList<>();
        } catch (IOException e) {
            mostrarError("Error al cargar Proyectos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
     private void mostrarError(String mensaje) {
        System.err.println(mensaje);
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
   
     
     public boolean guardarProyecto(ProyectoReparacion nuevoProyecto) {
        List<ProyectoReparacion> Proyectos = cargarTodos();
        
        
       boolean existe = Proyectos.stream().anyMatch(o -> 
            o.getCodigo().equals(nuevoProyecto.getCodigo()) || 
            o.getNombre().equalsIgnoreCase(nuevoProyecto.getNombre()));
        
        if (existe) {
            mostrarError("Ya existe un obrero con este número de identificación o email");
            return false;
        }
        
        Proyectos.add(nuevoProyecto);
        return guardarListaProyectos(Proyectos);
    }
        public boolean guardarListaProyectos(List<ProyectoReparacion> proyectos) {
                try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
                    gson.toJson(proyectos, writer);
                    return true;
                } catch (IOException e) {
                    mostrarError("Error al guardar los datos: " + e.getMessage());
                    return false;
                }
            }
public static class LocalDateAdapter extends TypeAdapter<LocalDate> {
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
public boolean eliminarProyecto(String codigo) {
    List<ProyectoReparacion> lista = cargarTodos();
    boolean eliminado = lista.removeIf(p -> p.getCodigo().equals(codigo));
    if (eliminado) {
        return guardarListaProyectos(lista);
    } else {
        mostrarError("No se encontró el proyecto para eliminar");
        return false;
    }
}

public boolean actualizarProyecto(ProyectoReparacion proyectoModificado) {
    List<ProyectoReparacion> lista = cargarTodos();
    for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).getCodigo().equals(proyectoModificado.getCodigo())) {
            lista.set(i, proyectoModificado);
            return guardarListaProyectos(lista);
        }
    }
    mostrarError("Proyecto no encontrado para actualizar");
    return false;
}
public ProyectoReparacion buscarPorCodigo(String codigo) {
    return cargarTodos().stream()
        .filter(p -> p.getCodigo().equals(codigo))
        .findFirst()
        .orElse(null);
}


}
