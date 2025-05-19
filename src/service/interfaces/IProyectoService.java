
package service.interfaces;

import exceptions.ProyectoNoEncontradoException;
import java.util.List;
import Model.Proyecto;

public interface IProyectoService {
    void crearProyecto(Proyecto proyecto)throws Exception;
    List<Proyecto> obtenerTodos()throws Exception;
    Proyecto buscarProyectoPorId(String codigo)throws Exception;
    List<Proyecto> buscarPorCampo(String campo, String texto, boolean caseSensitive) throws Exception;
    void actualizarProyecto(Proyecto proyecto) throws Exception;
    void eliminarProyecto(String codigo) throws ProyectoNoEncontradoException, Exception;

}
