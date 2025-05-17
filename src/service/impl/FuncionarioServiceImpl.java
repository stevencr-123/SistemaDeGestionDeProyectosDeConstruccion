package service.impl;

import Model.Proyecto;
import Model.Solicitud;
import repository.interfaces.IProyectoRepository;
import service.interfaces.IFuncionarioService;
import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioServiceImpl implements IFuncionarioService {

    private final IProyectoRepository proyectoRepository;

    public FuncionarioServiceImpl(IProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    @Override
    public List<Proyecto> obtenerProyectosPendientes() throws Exception {
        return proyectoRepository.listarProyectos().stream()
                .filter(p -> p.getEstadoEvaluacionFuncionario() == Solicitud.EN_ESPERA)
                .collect(Collectors.toList());
    }

    @Override
    public void aprobarProyecto(String codigoProyecto) throws Exception {
        Proyecto proyecto = validarYObternerProyecto(codigoProyecto);
        
        if (proyecto.getEstadoEvaluacionFuncionario() != Solicitud.EN_ESPERA) {
            throw new IllegalStateException("Solo se pueden aprobar proyectos en estado EN_ESPERA");
        }

        proyecto.setEstadoEvaluacionFuncionario(Solicitud.APROBADO);
        proyectoRepository.actualizarProyecto(proyecto);
    }

    @Override
    public void denegarProyecto(String codigoProyecto) throws Exception {
        Proyecto proyecto = validarYObternerProyecto(codigoProyecto);
        
        

        proyecto.setEstadoEvaluacionFuncionario(Solicitud.DENEGADO);
        proyectoRepository.actualizarProyecto(proyecto);
    }

    @Override
    public Proyecto obtenerProyectoPorCodigo(String codigo) throws Exception {
        return validarYObternerProyecto(codigo);
    }

    private Proyecto validarYObternerProyecto(String codigo) throws Exception {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código del proyecto no puede estar vacío");
        }

        Proyecto proyecto = proyectoRepository.buscarPorCodigo(codigo);
        if (proyecto == null) {
            throw new Exception("No se encontró el proyecto con código: " + codigo);
        }
        return proyecto;
    }
}