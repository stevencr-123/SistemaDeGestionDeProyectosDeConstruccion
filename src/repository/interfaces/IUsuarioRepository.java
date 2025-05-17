package repository.interfaces;

import model.Usuario;
import java.util.List;

public interface IUsuarioRepository {

    Usuario login(String email, String password) throws Exception;

    Usuario buscarPorEmail(String email) throws Exception;

    List<Usuario> listarUsuarios() throws Exception;

    void guardarUsuario(Usuario usuario) throws Exception;

    void eliminarUsuario(String email) throws Exception;

    void actualizarUsuario(Usuario usuario) throws Exception;

    void cambiarContraseña(String email, String nuevaContraseña) throws Exception;

    boolean usuarioExiste(String email) throws Exception;  // Nuevo método

}
