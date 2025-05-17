
package repository.interfaces;

import java.util.List;
import Model.Proyecto;

public interface IProyectoRepository {
    void guardarProyecto(Proyecto proyecto) throws Exception;
    List<Proyecto> listarProyectos() throws Exception;
    Proyecto buscarPorCodigo(String codigo) throws Exception;
    void actualizarProyecto(Proyecto proyecto) throws Exception;
    
}
