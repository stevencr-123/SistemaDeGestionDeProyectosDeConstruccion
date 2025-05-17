package util;

import model.Usuario;

public class SesionUtil {

    private static Usuario usuarioActual;

    private SesionUtil() {
        // Constructor privado para evitar instanciación
    }

    public static void iniciarSesion(Usuario usuario) {
        usuarioActual = usuario;
    }

    public static Usuario obtenerUsuarioActual() {
        return usuarioActual;
    }

    public static void cerrarSesion() {
        usuarioActual = null;
    }

    public static boolean haySesionActiva() {
        return usuarioActual != null;
    }
}
