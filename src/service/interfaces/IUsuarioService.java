package service.interfaces;

import model.Usuario;
import java.util.List;

public interface IUsuarioService {

    void registrarUsuario(Usuario usuario) throws Exception;

    Usuario buscarUsuarioPorEmail(String email) throws Exception;

    List<Usuario> listarUsuarios() throws Exception;

    void eliminarUsuario(String email) throws Exception;

    Usuario login(String email, String password) throws Exception;

    void cambiarContraseña(String email, String nuevaContraseña) throws Exception;

    void actualizarUsuario(String emailOriginal, Usuario nuevoUsuario) throws Exception;

    boolean usuarioExiste(String email) throws Exception;

    void validarCorreo(String email) throws Exception;

    void validarSalario(double salario) throws Exception;
}
