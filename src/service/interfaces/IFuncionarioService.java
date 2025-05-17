package service.interfaces;

import Model.Proyecto;
import java.util.List;

public interface IFuncionarioService {
    List<Proyecto> obtenerProyectosPendientes() throws Exception;
    void aprobarProyecto(String codigoProyecto) throws Exception;
    void denegarProyecto(String codigoProyecto) throws Exception;
    Proyecto obtenerProyectoPorCodigo(String codigoProyecto) throws Exception;
     
}
