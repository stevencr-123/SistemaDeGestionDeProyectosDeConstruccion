package controller;

import model.RolSistema;
import exceptions.AutenticacionException;
import exceptions.UsuarioYaExisteException;
import model.Usuario;
import model.Persona;
import service.interfaces.IUsuarioService;
import service.impl.UsuarioServiceImpl;

import java.util.List;

public class UsuarioController {

    private final IUsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new UsuarioServiceImpl();
    }

    // Inicia sesión verificando el correo y la contraseña
    public Usuario login(String email, String password) throws AutenticacionException {
        if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new AutenticacionException("Debe ingresar el email y la contraseña.");
        }
        try {
            return usuarioService.login(email.trim(), password.trim());
        } catch (Exception e) {
            throw new AutenticacionException("Error al iniciar sesión: " + e.getMessage());
        }
    }

    // Registra un nuevo usuario con el rol especificado
public void registrarUsuario(String email, String password, String rol, Persona persona) throws Exception {
    try {
        RolSistema rolSistema = RolSistema.valueOf(rol.toUpperCase().replace(" ", "_"));
        
        // Crear el usuario directamente con el objeto Persona
        Usuario usuario = new Usuario(email, password, rolSistema, persona);
        
        usuarioService.validarCorreo(email);
        usuarioService.registrarUsuario(usuario);
        mostrarResumenUsuario(usuario);
    } catch (UsuarioYaExisteException e) {
        throw new Exception("El usuario ya existe: " + e.getMessage());
    } catch (IllegalArgumentException e) {
        throw new Exception("El rol proporcionado no es válido: " + rol);
    }
}



    // Muestra un resumen del usuario registrado y el aviso de contraseña
    private void mostrarResumenUsuario(Usuario usuario) {
        System.out.println("Usuario creado exitosamente:");
        System.out.println("Correo: " + usuario.getEmail());
        System.out.println("Rol: " + usuario.getRol());
        System.out.println("Fecha de registro: " + usuario.getFechaRegistro());
        if (usuario.getPersona() != null) {
            System.out.println("Nombre: " + usuario.getPersona().getPrimerNombre());
        } else {
            System.out.println("Nota: El usuario no tiene información personal asociada.");
        }
        System.out.println("Nota: La contraseña inicial es el propio correo. Cambiarla por seguridad.");
    }

    // Lista todos los usuarios registrados
    public List<Usuario> listarUsuarios() throws Exception {
        return usuarioService.listarUsuarios();
    }

    // Cambia la contraseña de un usuario existente
    public void cambiarContraseña(String email, String nuevaContraseña) throws Exception {
        usuarioService.cambiarContraseña(email, nuevaContraseña);
    }

    // Elimina un usuario por correo
    public void eliminarUsuario(String email) throws Exception {
        usuarioService.eliminarUsuario(email);
    }

    // Actualiza un usuario existente
    public void actualizarUsuario(String emailOriginal, Usuario usuario) throws Exception {
        usuarioService.actualizarUsuario(emailOriginal, usuario);
    }

    // Busca un usuario por su correo electrónico
    public Usuario buscarUsuarioPorCorreo(String correo) throws Exception {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(correo)) {
                return usuario;
            }
        }
        throw new Exception("Usuario no encontrado con el correo: " + correo);
    }
}
