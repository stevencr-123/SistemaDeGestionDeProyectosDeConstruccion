package service.impl;

import model.Usuario;
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
        if (usuarioRepository.buscarPorEmail(usuario.getEmail()) != null) {
            throw new Exception("El usuario ya existe con este email.");
        }
        usuarioRepository.guardarUsuario(usuario);
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) throws Exception {
        return usuarioRepository.buscarPorEmail(email);
    }

    @Override
    public List<Usuario> listarUsuarios() throws Exception {
        return usuarioRepository.listarUsuarios();
    }

    @Override
    public void eliminarUsuario(String email) throws Exception {
        usuarioRepository.eliminarUsuario(email);
    }

    @Override
    public Usuario login(String email, String password) throws Exception {
        return usuarioRepository.login(email, password);
    }
}
