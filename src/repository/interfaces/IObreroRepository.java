package repository.interfaces;

import java.util.List;
import model.Obrero;


public interface IObreroRepository {
    
    void guardarObrero(Obrero obrero) throws Exception;
    List<Obrero> listarProyectos() throws Exception;
    Obrero buscarPorIdentificacion(String Identificacion) throws Exception;

}