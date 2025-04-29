package Dao;

import Model.Obrero;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;

public class ObreroDAO {
    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final String ARCHIVO_JSON = "C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\SistemaDeGestionDeProyectosDeConstruccion\\src\\Resource\\data\\Obrero.json";
    private final Gson gson;
    
    public ObreroDAO() {
        this.gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
            .setPrettyPrinting()
            .create();
    }
    
    // Método para cargar todos los obreros
    public List<Obrero> cargarTodos() {
        File file = new File(ARCHIVO_JSON);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }
        
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Obrero>>(){}.getType();
            List<Obrero> obreros = gson.fromJson(reader, tipoLista);
            return obreros != null ? obreros : new ArrayList<>();
        } catch (IOException e) {
            mostrarError("Error al cargar obreros: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    // Método para guardar un nuevo obrero
    public boolean guardarObrero(Obrero nuevoObrero) {
        List<Obrero> obreros = cargarTodos();
        
        // Validar que no exista un obrero con el mismo número de identificación o email
        boolean existe = obreros.stream().anyMatch(o -> 
            o.getNumeroIdentificacion().equals(nuevoObrero.getNumeroIdentificacion()) || 
            o.getEmail().equalsIgnoreCase(nuevoObrero.getEmail()));
        
        if (existe) {
            mostrarError("Ya existe un obrero con este número de identificación o email");
            return false;
        }
        
        obreros.add(nuevoObrero);
        return guardarListaObreros(obreros);
    }
    
   public boolean actualizarObrero(String numeroIdentificacion, String email,
                              String nuevaEspecialidad, Boolean tieneSeguro) {
    
    // 1. Validaciones iniciales
    if (numeroIdentificacion == null || numeroIdentificacion.isEmpty()) {
        mostrarError("Identificación requerida");
        return false;
    }

    // 2. Cargar datos
    List<Obrero> obreros = cargarTodos();
    Obrero obreroActualizado = null;

    // 3. Buscar obrero
    for (Obrero obrero : obreros) {
        if (obrero.getNumeroIdentificacion().equals(numeroIdentificacion)) {
            obreroActualizado = obrero;
            break;
        }
    }

    if (obreroActualizado == null) {
        mostrarError("Obrero no encontrado");
        return false;
    }

    // 4. Aplicar actualizaciones válidas
    boolean cambiosRealizados = false;

    // Actualización de email (validando unicidad)
    if (email != null && !email.isEmpty() && !email.equals(obreroActualizado.getEmail())) {
        if (emailExisteEnOtroObrero(email, numeroIdentificacion, obreros)) {
            mostrarError("Email ya está en uso");
            return false;
        }
        obreroActualizado.setEmail(email);
        cambiosRealizados = true;
    }

    // Actualización de especialidad
    if (nuevaEspecialidad != null && !nuevaEspecialidad.isEmpty()) {
        obreroActualizado.setEspecialidad(nuevaEspecialidad);
        cambiosRealizados = true;
    }

    // Actualización de seguro laboral
    if (tieneSeguro != null) {
        obreroActualizado.setSeguroLaboral(tieneSeguro);
        cambiosRealizados = true;
    }

    // 5. Persistir cambios si hubo modificaciones
    return cambiosRealizados ? guardarListaObreros(obreros) : false;
}

    public boolean actualizarPassword(String idObrero, String nuevaPassword) {
        // 1. Validación pura (lógica de negocio)
        if (!validarPassword(nuevaPassword)) {
            return false;
        }

        // 2. Operaciones de persistencia
        List<Obrero> obreros = cargarTodos();
        
        for (Obrero obrero : obreros) {
            if (obrero.getNumeroIdentificacion().equals(idObrero)) {
                // 3. Actualización simple del modelo
                obrero.getUsuario().setPassword(nuevaPassword);
                return guardarListaObreros(obreros);
            }
        }
        
        return false;
    }

    // Método para borrar un obrero
    public boolean borrarObrero(String numeroIdentificacion) {
        List<Obrero> obreros = cargarTodos();
        boolean eliminado = obreros.removeIf(obrero -> 
            obrero.getNumeroIdentificacion().equals(numeroIdentificacion));
        
        if (eliminado) {
            return guardarListaObreros(obreros);
        }
        return false;
    }
    
    // Métodos de búsqueda
    public Obrero obtenerPorEmail(String email) {
        return cargarTodos().stream()
            .filter(o -> o.getEmail().equalsIgnoreCase(email))
            .findFirst()
            .orElse(null);
    }
    
    public Obrero obtenerPorIdentificacion(String numeroIdentificacion) {
        return cargarTodos().stream()
            .filter(o -> o.getNumeroIdentificacion().equals(numeroIdentificacion))
            .findFirst()
            .orElse(null);
    }
    
    // Métodos auxiliares
    private boolean emailExisteEnOtroObrero(String email, String idExcluir, List<Obrero> obreros) {
    return obreros.stream()
        .filter(o -> !o.getNumeroIdentificacion().equals(idExcluir))
        .anyMatch(o -> o.getEmail().equalsIgnoreCase(email));
}    

    private boolean validarPassword(String password) {
        return password != null && 
               password.length() >= MIN_PASSWORD_LENGTH &&
               !password.trim().isEmpty();
    }
    
    private boolean guardarListaObreros(List<Obrero> obreros) {
        try (Writer writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(obreros, writer);
            return true;
        } catch (IOException e) {
            mostrarError("Error al guardar los datos: " + e.getMessage());
            return false;
        }
    }
    
    private void mostrarError(String mensaje) {
        System.err.println(mensaje);
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    // Adaptador para LocalDate
    private static class LocalDateAdapter extends TypeAdapter<LocalDate> {
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
    
}