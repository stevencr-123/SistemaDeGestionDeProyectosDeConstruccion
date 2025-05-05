
package repository.interfaces;

import java.util.List;
import model.Proyecto;

public interface IProyectoRepository {
    void guardarProyecto(Proyecto proyecto) throws Exception;
    List<Proyecto> listarProyectos() throws Exception;
    Proyecto buscarPorCodigo(String codigo) throws Exception;

    
}
