package model;

/**
 * Clase singleton para almacenar el usuario autenticado durante la sesión.
 */
public class Sesion {
    private static Sesion instancia;
    private Usuario usuarioAutenticado;

    private Sesion() {}

    public static Sesion getInstancia() {
        if (instancia == null) {
            instancia = new Sesion();
        }
        return instancia;
    }

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuario) {
        this.usuarioAutenticado = usuario;
    }

    public void cerrarSesion() {
        this.usuarioAutenticado = null;
        instancia = null;
    }

    public boolean estaAutenticado() {
        return usuarioAutenticado != null;
    }
} 
