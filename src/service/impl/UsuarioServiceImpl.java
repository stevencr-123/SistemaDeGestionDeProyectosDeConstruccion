package service.impl;

import model.Usuario;
import model.Persona;
import model.RolSistema;
import exceptions.UsuarioNoEncontradoException;
import exceptions.UsuarioYaExisteException;
import repository.interfaces.IUsuarioRepository;
import repository.impl.UsuarioRepositoryJsonImpl;
import service.interfaces.IUsuarioService;
import java.util.List;

public class UsuarioServiceImpl implements IUsuarioService {

    private final IUsuarioRepository usuarioRepository;

    public UsuarioServiceImpl() {
        this.usuarioRepository = new UsuarioRepositoryJsonImpl();
    }

    @Override
    public void registrarUsuario(Usuario usuario) throws Exception {
        if (usuarioRepository.usuarioExiste(usuario.getEmail())) {
            throw new UsuarioYaExisteException("El usuario ya existe: " + usuario.getEmail());
        }
        usuarioRepository.guardarUsuario(usuario);
        System.out.println("Usuario registrado: " + usuario.getEmail());
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) throws Exception {
        Usuario usuario = usuarioRepository.buscarPorEmail(email);
        if (usuario == null) {
            throw new UsuarioNoEncontradoException("Usuario no encontrado: " + email);
        }
        return usuario;
    }

    @Override
    public List<Usuario> listarUsuarios() throws Exception {
        return usuarioRepository.listarUsuarios();
    }

    @Override
    public void eliminarUsuario(String email) throws Exception {
        if (!usuarioRepository.usuarioExiste(email)) {
            throw new UsuarioNoEncontradoException("No se puede eliminar. Usuario no encontrado: " + email);
        }
        usuarioRepository.eliminarUsuario(email);
        System.out.println("Usuario eliminado: " + email);
    }

    @Override
    public Usuario login(String email, String password) throws Exception {
        Usuario usuario = usuarioRepository.login(email, password);
        if (usuario == null) {
            throw new UsuarioNoEncontradoException("Credenciales incorrectas para el usuario: " + email);
        }
        System.out.println("Inicio de sesión exitoso: " + email);
        return usuario;
    }

    @Override
    public void cambiarContraseña(String email, String nuevaContraseña) throws Exception {
        if (!usuarioRepository.usuarioExiste(email)) {
            throw new UsuarioNoEncontradoException("No se puede cambiar la contraseña. Usuario no encontrado: " + email);
        }
        usuarioRepository.cambiarContraseña(email, nuevaContraseña);
        System.out.println("Contraseña cambiada para el usuario: " + email);
    }

    @Override
    public void actualizarUsuario(String emailOriginal, Usuario nuevoUsuario) throws Exception {
        if (!usuarioRepository.usuarioExiste(emailOriginal)) {
            throw new UsuarioNoEncontradoException("Usuario no encontrado para actualizar: " + emailOriginal);
        }
        usuarioRepository.actualizarUsuario(nuevoUsuario);
        System.out.println("Usuario actualizado: " + nuevoUsuario.getEmail());
    }

    @Override
    public boolean usuarioExiste(String email) throws Exception {
        return usuarioRepository.usuarioExiste(email);
    }

    @Override
    public void validarCorreo(String email) throws Exception {
        if (email == null || !email.contains("@")) {
            throw new Exception("El correo no es válido.");
        }
    }

    @Override
    public void validarSalario(double salario) throws Exception {
        if (salario <= 0) {
            throw new Exception("El salario debe ser mayor a cero.");
        }
    }
}