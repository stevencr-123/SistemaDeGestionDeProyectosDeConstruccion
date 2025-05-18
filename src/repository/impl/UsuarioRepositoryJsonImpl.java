package repository.impl;

import model.RolSistema;
import model.TipoIdentificacion;
import exceptions.UsuarioNoEncontradoException;
import model.Usuario;
import repository.interfaces.IUsuarioRepository;
import util.JsonManager;
import java.util.List;
import model.Administrador;

public class UsuarioRepositoryJsonImpl implements IUsuarioRepository {
    private static final String JSON_FILE = "C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects"
            + "\\GestionParaProyectosDeConstruccion\\src\\resource\\data\\usuarios.json";
    private static final String ROOT_ELEMENT = "usuarios";
    private final JsonManager<Usuario> jsonManager;

    public UsuarioRepositoryJsonImpl() {
        jsonManager = new JsonManager<>(JSON_FILE, ROOT_ELEMENT, Usuario.class);
        try {
            verificarOCrearAdministradorPorDefecto();
        } catch (Exception e) {
            System.err.println("Error al crear el administrador por defecto: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void verificarOCrearAdministradorPorDefecto() throws Exception {
    if (!usuarioExiste("admin@proyecto.com")) {
        Administrador adminPersona = Administrador.getInstance(
                TipoIdentificacion.CEDULA, "1143894331", "Admin", "Sistema", "admin@proyecto.com", 20000000, "3008053431");
        Usuario admin = new Usuario("admin@proyecto.com", "admin@proyecto.com", RolSistema.ADMINISTRADOR, adminPersona);
        guardarUsuario(admin);
        System.out.println("Administrador por defecto creado.");
    } else {
        System.out.println("El administrador por defecto ya existe.");
    }
}


    @Override
    public Usuario login(String email, String password) throws Exception {
        Usuario usuario = buscarPorEmail(email);
        if (usuario.getPassword().equals(password)) {
            return usuario;
        }
        throw new UsuarioNoEncontradoException("Credenciales incorrectas.");
    }

    @Override
    public Usuario buscarPorEmail(String email) throws Exception {
        return listarUsuarios().stream()
                .filter(u -> u.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElseThrow(() -> new UsuarioNoEncontradoException("Usuario no encontrado: " + email));
    }

    @Override
    public List<Usuario> listarUsuarios() throws Exception {
        return jsonManager.cargarLista();
    }

    @Override
    public void guardarUsuario(Usuario usuario) throws Exception {
        List<Usuario> usuarios = listarUsuarios();
        if (!usuarioExiste(usuario.getEmail())) {
            usuarios.add(usuario);
            jsonManager.guardarLista(usuarios);
            System.out.println("Usuario guardado: " + usuario.getEmail());
        } else {
            System.out.println("Usuario ya existente: " + usuario.getEmail());
        }
    }

    @Override
    public void eliminarUsuario(String email) throws Exception {
        List<Usuario> usuarios = listarUsuarios();
        usuarios.removeIf(u -> u.getEmail().equalsIgnoreCase(email));
        jsonManager.guardarLista(usuarios);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) throws Exception {
        eliminarUsuario(usuario.getEmail());
        guardarUsuario(usuario);
    }

    @Override
    public void cambiarContraseña(String email, String nuevaContraseña) throws Exception {
        Usuario usuario = buscarPorEmail(email);
        usuario.setPassword(nuevaContraseña);
        actualizarUsuario(usuario);
    }

    @Override
    public boolean usuarioExiste(String email) throws Exception {
        return listarUsuarios().stream().anyMatch(u -> u.getEmail().equalsIgnoreCase(email));
    }
}
