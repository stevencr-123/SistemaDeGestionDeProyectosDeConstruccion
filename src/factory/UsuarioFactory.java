package factory;

import model.RolSistema;
import exceptions.RolNoPermitidoException;
import model.Persona;
import model.Usuario;

public class UsuarioFactory {

    public static Usuario crearUsuario(String correo, String password, RolSistema rol, Persona persona) throws RolNoPermitidoException {
        if (rol == null) {
            throw new RolNoPermitidoException("Debe asignar un rol válido.");
        }
        return new Usuario(correo, password, rol, persona);
    }
}
