package repository.impl;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import model.EstadoProyecto;
import model.Prioridad;
import model.TipoReparacion;
import Model.Proyecto;
import Model.Solicitud;
import model.EstadoProyecto;
import model.Prioridad;
import model.TipoReparacion;
import exceptions.ProyectoNoEncontradoException;
import Model.Proyecto;
import repository.interfaces.IProyectoRepository;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProyectoRepositoryJsonImpl implements IProyectoRepository {

    private static final String JSON_FILE = "C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\SistemaDeGestionDeProyectosDeConstruccion\\src\\Resource\\data\\proyectos.json";

    private final Gson gson;

    public ProyectoRepositoryJsonImpl() {
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, (JsonDeserializer<LocalDate>) 
                    (json, type, context) -> LocalDate.parse(json.getAsString()))
                .registerTypeAdapter(LocalDate.class, (JsonSerializer<LocalDate>) 
                    (date, type, context) -> new JsonPrimitive(date.toString()))
                .create();
    }

    @Override
    public void guardarProyecto(Proyecto proyecto) throws Exception {
        List<Proyecto> proyectos = listarProyectos();
        proyectos.add(proyecto);
        guardarProyectos(proyectos);
    }

    @Override
    public List<Proyecto> listarProyectos() throws Exception {
        List<Proyecto> proyectos = new ArrayList<>();
        try (Reader reader = new FileReader(JSON_FILE)) {
            JsonObject root = JsonParser.parseReader(reader).getAsJsonObject();
            JsonArray proyectosArray = root.getAsJsonArray("proyectos");

            for (JsonElement element : proyectosArray) {
                JsonObject obj = element.getAsJsonObject();

                Proyecto proyecto = new Proyecto(
    obj.get("codigo").getAsString(),
    obj.get("nombre").getAsString(),
    obj.get("direccion").getAsString(),
    TipoReparacion.valueOf(obj.get("tipoReparacion").getAsString().toUpperCase()),
    LocalDate.parse(obj.get("fechaInicio").getAsString()),
    LocalDate.parse(obj.get("fechaFinEstimada").getAsString()),
    Prioridad.valueOf(obj.get("prioridad").getAsString().toUpperCase()),
    obj.get("presupuesto").getAsDouble(),
    EstadoProyecto.valueOf(obj.get("estado").getAsString().toUpperCase()),
    obj.get("descripcion").getAsString(),
    obj.has("solicitudFuncionario")  
        ? Solicitud.valueOf(obj.get("solicitudFuncionario").getAsString().toUpperCase())
        : Solicitud.EN_ESPERA
);

                proyectos.add(proyecto);
            }
        } catch (Exception e) {
          
            System.err.println("Error al leer el archivo de proyectos: " + e.getMessage());
        }
        return proyectos;
    }

    private void guardarProyectos(List<Proyecto> proyectos) throws Exception {
        JsonArray proyectosJson = new JsonArray();

        for (Proyecto proyecto : proyectos) {
            JsonObject proyectoJson = new JsonObject();
            proyectoJson.addProperty("codigo", proyecto.getCodigo());
            proyectoJson.addProperty("nombre", proyecto.getNombre());
            proyectoJson.addProperty("direccion", proyecto.getDireccion());
            proyectoJson.addProperty("tipoReparacion", proyecto.getTipoReparacion().name().toLowerCase());
            proyectoJson.addProperty("fechaInicio", proyecto.getFechaInicio().toString());
            proyectoJson.addProperty("fechaFinEstimada", proyecto.getFechaFinEstimada().toString());
            proyectoJson.addProperty("prioridad", proyecto.getPrioridad().name().toLowerCase());
            proyectoJson.addProperty("presupuesto", proyecto.getPresupuesto());
            proyectoJson.addProperty("estado", proyecto.getEstado().name().toLowerCase());
            proyectoJson.addProperty("descripcion", proyecto.getDescripcion()); // Esta línea faltaba
            proyectoJson.addProperty(
    "solicitudFuncionario",  // Minúsculas
    proyecto.getEstadoEvaluacionFuncionario() != null 
        ? proyecto.getEstadoEvaluacionFuncionario().toString().toUpperCase() 
        : Solicitud.EN_ESPERA.toString()


);



            proyectosJson.add(proyectoJson);
        }

        JsonObject root = new JsonObject();
        root.add("proyectos", proyectosJson);

        try (Writer writer = new FileWriter(JSON_FILE)) {
            gson.toJson(root, writer);
        }
    }

    @Override
    public Proyecto buscarPorCodigo(String codigo) throws Exception {
        List<Proyecto> proyectos = listarProyectos();
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getCodigo().equalsIgnoreCase(codigo)) {
                return proyecto;
            }
        }
        return null;
    }
    @Override
public void actualizarProyecto(Proyecto proyectoActualizado) throws Exception {
    if (proyectoActualizado == null) {
        throw new IllegalArgumentException("El proyecto a actualizar no puede ser nulo");
    }
    
    if (proyectoActualizado.getCodigo() == null || proyectoActualizado.getCodigo().trim().isEmpty()) {
        throw new IllegalArgumentException("El código del proyecto no puede estar vacío");
    }

    List<Proyecto> proyectos = listarProyectos();
    boolean proyectoExiste = false;
    
    for (int i = 0; i < proyectos.size(); i++) {
        Proyecto proyectoExistente = proyectos.get(i);
        if (proyectoExistente.getCodigo().equalsIgnoreCase(proyectoActualizado.getCodigo())) {
            // Validar que los campos inmutables no hayan cambiado
            if (!proyectoExistente.getFechaInicio().equals(proyectoActualizado.getFechaInicio())) {
                throw new IllegalStateException("La fecha de inicio no puede modificarse");
            }
            
            if (!proyectoExistente.getCodigo().equals(proyectoActualizado.getCodigo())) {
                throw new IllegalStateException("El código del proyecto no puede modificarse");
            }
            
            proyectos.set(i, proyectoActualizado);
            proyectoExiste = true;
            break;
        }
    }
    
    if (!proyectoExiste) {
        throw new Exception("No se encontró el proyecto con código: " + proyectoActualizado.getCodigo());
    }
    
    guardarProyectos(proyectos);
}

    
    @Override
    public void eliminarProyecto(String codigo) throws ProyectoNoEncontradoException, Exception {
        List<Proyecto> proyectos = listarProyectos();
        boolean eliminado = proyectos.removeIf(p -> p.getCodigo().equalsIgnoreCase(codigo));

        if (!eliminado) {
            throw new ProyectoNoEncontradoException("No se encontró un proyecto con código: " + codigo);
        }

        guardarProyectos(proyectos);
    }
    

@Override
public void actualizar(Proyecto proyectoActualizado) throws Exception {
    List<Proyecto> proyectos = listarProyectos(); // corregido

    boolean actualizado = false;
    for (int i = 0; i < proyectos.size(); i++) {
        if (proyectos.get(i).getCodigo().equals(proyectoActualizado.getCodigo())) {
            proyectos.set(i, proyectoActualizado);
            actualizado = true;
            break;
        }
    }

    if (!actualizado) {
        throw new ProyectoNoEncontradoException("No se encontró el proyecto con código: " + proyectoActualizado.getCodigo());
    }

    guardarProyectos(proyectos); // corregido
}


    
}