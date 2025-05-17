package repository.impl;

import com.google.gson.*;
import model.RolSistema;
import model.Usuario;
import repository.interfaces.IUsuarioRepository;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositoryJsonImpl implements IUsuarioRepository {

    private static final String JSON_FILE = "C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\SistemaDeGestionDeProyectosDeConstruccion\\src\\Resource\\data\\usuarios.json";

    public UsuarioRepositoryJsonImpl() {
        try {
            verificarOCrearAdministradorPorDefecto();
        } catch (Exception e) {
            System.err.println("Error al verificar o crear administrador por defecto: " + e.getMessage());
        }
    }

    private void verificarOCrearAdministradorPorDefecto() throws Exception {
        List<Usuario> usuarios = listarUsuarios();
        boolean existeAdmin = usuarios.stream()
                .anyMatch(u -> u.getRol() == RolSistema.ADMINISTRADOR);

        if (!existeAdmin) {
            Usuario admin = new Usuario(
                    "admin@proyecto.com",
                    "admin123",
                    RolSistema.ADMINISTRADOR
            );
            usuarios.add(admin);
            guardarUsuarios(usuarios);
            System.out.println("Administrador por defecto creado.");
        }
    }

    @Override
    public Usuario login(String email, String password) throws Exception {
        List<Usuario> usuarios = listarUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public Usuario buscarPorEmail(String email) throws Exception {
        List<Usuario> usuarios = listarUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void guardarUsuario(Usuario usuario) throws Exception {
        List<Usuario> usuarios = listarUsuarios();

        if (usuario.getRol() == RolSistema.ADMINISTRADOR) {
            boolean yaExisteAdmin = usuarios.stream()
                    .anyMatch(u -> u.getRol() == RolSistema.ADMINISTRADOR);
            if (yaExisteAdmin) {
                throw new Exception("Ya existe un administrador registrado en el sistema.");
            }
        }

        usuarios.add(usuario);
        guardarUsuarios(usuarios);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Reader reader = new FileReader(JSON_FILE)) {
            JsonObject root = JsonParser.parseReader(reader).getAsJsonObject();
            JsonArray usuariosArray = root.getAsJsonArray("usuarios");

            for (JsonElement element : usuariosArray) {
                JsonObject obj = element.getAsJsonObject();

                String correo = obj.get("correo").getAsString();
                String password = obj.get("password").getAsString();
                String rolString = obj.get("rol").getAsString().toUpperCase();

                RolSistema rol = RolSistema.valueOf(rolString);
                Usuario usuario = new Usuario(correo, password, rol);
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    private void guardarUsuarios(List<Usuario> usuarios) throws Exception {
        JsonArray usuariosJson = new JsonArray();

        for (Usuario usuario : usuarios) {
            JsonObject usuarioJson = new JsonObject();
            usuarioJson.addProperty("correo", usuario.getEmail());
            usuarioJson.addProperty("password", usuario.getPassword());
            usuarioJson.addProperty("rol", usuario.getRol().name().toLowerCase());

            usuariosJson.add(usuarioJson);
        }

        JsonObject root = new JsonObject();
        root.add("usuarios", usuariosJson);

        try (Writer writer = new FileWriter(JSON_FILE)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(root, writer);
        }
    }

    @Override
    public void eliminarUsuario(String email) throws Exception {
        List<Usuario> usuarios = listarUsuarios();
        usuarios.removeIf(u -> u.getEmail().equalsIgnoreCase(email));
        guardarUsuarios(usuarios);
    }
}
