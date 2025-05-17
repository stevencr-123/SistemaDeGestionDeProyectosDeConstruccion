
package repository.interfaces;

import exceptions.ProyectoNoEncontradoException;
import java.util.List;
import model.Proyecto;

public interface IProyectoRepository {
    void guardarProyecto(Proyecto proyecto) throws Exception;
    List<Proyecto> listarProyectos() throws Exception;
    Proyecto buscarPorCodigo(String codigo) throws Exception;
   void eliminarProyecto(String codigo) throws ProyectoNoEncontradoException, Exception;
    void actualizar(Proyecto proyectoActualizado) throws Exception;

}
