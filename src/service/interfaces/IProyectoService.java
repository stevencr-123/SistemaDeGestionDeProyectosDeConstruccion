
package service.interfaces;

import java.util.List;
import model.Proyecto;

public interface IProyectoService {
    void crearProyecto(Proyecto proyecto)throws Exception;
    List<Proyecto> obtenerTodos()throws Exception;
    Proyecto buscarProyectoPorId(String codigo)throws Exception;
    List<Proyecto> buscarPorCampo(String campo, String texto, boolean caseSensitive) throws Exception;

}
