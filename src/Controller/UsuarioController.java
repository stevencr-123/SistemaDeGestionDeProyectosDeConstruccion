package controller;

import exceptions.AutenticacionException;
import model.Usuario;
import service.interfaces.IUsuarioService;
import service.impl.UsuarioServiceImpl;

public class UsuarioController {

    private final IUsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new UsuarioServiceImpl();
    }

    /**
     * Intenta loguear a un usuario usando su email y contraseña.
     *
     * @param email    El email ingresado.
     * @param password La contraseña ingresada.
     * @return El Usuario si las credenciales son correctas.
     * @throws AutenticacionException si las credenciales son inválidas o no se encuentra el usuario.
     */
    public Usuario login(String email, String password) throws AutenticacionException {
        if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new AutenticacionException("Debe ingresar el email y la contraseña.");
        }

        Usuario usuario;
        try {
            usuario = usuarioService.login(email.trim(), password.trim());
        } catch (Exception e) {
            throw new AutenticacionException("Ocurrió un error al intentar iniciar sesión: " + e.getMessage());
        }

        if (usuario == null) {
            throw new AutenticacionException("Credenciales incorrectas. Verifique sus datos.");
        }

        return usuario;
    }
}
