package util;

import com.google.gson.*;
import util.RuntimeTypeAdapterFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import model.Persona;
import model.roles.Administrador;
import model.roles.Obrero;
import model.roles.InspectorMunicipal;
import model.roles.FuncionarioPublico;
import model.roles.Promotor;

public class JsonManager<T> {

    private final String filePath;
    private final String rootElement;
    private final Class<T> type;
    private final Gson gson;

    // Constructor actualizado para manejar subclases de Persona
  public JsonManager(String filePath, String rootElement, Class<T> type) {
    this.filePath = filePath;
    this.rootElement = rootElement;
    this.type = type;

    // Crear el RuntimeTypeAdapterFactory para manejar las subclases de Persona
    RuntimeTypeAdapterFactory<Persona> personaAdapterFactory = RuntimeTypeAdapterFactory
            .of(Persona.class, "type") // Campo que identifica el tipo
            .registerSubtype(Administrador.class, "Administrador")
            .registerSubtype(Obrero.class, "Obrero")
            .registerSubtype(Promotor.class, "Promotor")
            .registerSubtype(FuncionarioPublico.class, "FuncionarioPublico")
            .registerSubtype(InspectorMunicipal.class, "InspectorMunicipal");

    // Crear el objeto Gson con el adaptador de LocalDateTime y clases concretas
    this.gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
            .registerTypeAdapterFactory(personaAdapterFactory)
            .serializeNulls()
            .create();
}


    // Método para guardar una lista de objetos en el archivo JSON
    public void guardarLista(List<T> lista) throws Exception {
        JsonArray jsonArray = new JsonArray();

        for (T item : lista) {
            JsonElement jsonElement = gson.toJsonTree(item);
            jsonArray.add(jsonElement);
        }

        JsonObject root = new JsonObject();
        root.add(rootElement, jsonArray);

        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(root, writer);
        } catch (IOException e) {
            throw new Exception("Error al guardar en el archivo JSON: " + e.getMessage());
        }
    }

    // Método para leer una lista de objetos desde el archivo JSON
    public List<T> cargarLista() {
        List<T> lista = new ArrayList<>();

        try (Reader reader = new FileReader(filePath)) {
            JsonObject root = JsonParser.parseReader(reader).getAsJsonObject();
            JsonArray jsonArray = root.getAsJsonArray(rootElement);

            if (jsonArray != null) {
                for (JsonElement element : jsonArray) {
                    try {
                        T item = gson.fromJson(element, type);
                        lista.add(item);
                    } catch (JsonSyntaxException e) {
                        System.err.println("Error al deserializar un elemento: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo JSON: " + e.getMessage());
        }
        return lista;
    }
}
