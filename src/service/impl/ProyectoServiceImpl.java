package service.impl;

import Model.Proyecto;
import Model.Solicitud;
import repository.interfaces.IProyectoRepository;
import service.interfaces.IProyectoService;
import java.util.List;
import java.util.stream.Collectors;

public class ProyectoServiceImpl implements IProyectoService {

    private final IProyectoRepository proyectoRepository;

    public ProyectoServiceImpl(IProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    @Override
    public void crearProyecto(Proyecto proyecto) throws Exception {
        validarProyecto(proyecto);
        
        // Establecer estado inicial
        proyecto.setEstadoEvaluacionFuncionario(Solicitud.EN_ESPERA);
        proyectoRepository.guardarProyecto(proyecto);
    }

    @Override
    public List<Proyecto> obtenerTodos() throws Exception {
        return proyectoRepository.listarProyectos();
    }

    @Override
    public Proyecto buscarProyectoPorId(String codigo) throws Exception {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código del proyecto no puede estar vacío");
        }
        return proyectoRepository.buscarPorCodigo(codigo);
    }

    @Override
    public List<Proyecto> buscarPorCampo(String campo, String texto, boolean caseSensitive) throws Exception {
        List<Proyecto> proyectos = proyectoRepository.listarProyectos();
        
        return proyectos.stream()
            .filter(p -> {
                try {
                    String valorCampo = obtenerValorCampo(p, campo);
                    String textoBusqueda = caseSensitive ? texto : texto.toLowerCase();
                    String valorComparar = caseSensitive ? valorCampo : valorCampo.toLowerCase();
                    return valorComparar.contains(textoBusqueda);
                } catch (Exception e) {
                    return false;
                }
            })
            .collect(Collectors.toList());
    }

    @Override
    public void actualizarProyecto(Proyecto proyecto) throws Exception {
        validarProyecto(proyecto);
        
        // Validar que el proyecto exista
        Proyecto existente = proyectoRepository.buscarPorCodigo(proyecto.getCodigo());
        if (existente == null) {
            throw new Exception("Proyecto no encontrado para actualización");
        }
        
        proyectoRepository.actualizarProyecto(proyecto);
    }

    // Métodos auxiliares
    private void validarProyecto(Proyecto proyecto) throws IllegalArgumentException {
        if (proyecto == null) {
            throw new IllegalArgumentException("El proyecto no puede ser nulo");
        }
        if (proyecto.getCodigo() == null || proyecto.getCodigo().trim().isEmpty()) {
            throw new IllegalArgumentException("El código del proyecto no puede estar vacío");
        }
        // Agregar más validaciones según sea necesario
    }

    private String obtenerValorCampo(Proyecto proyecto, String campo) throws Exception {
        return switch (campo.toLowerCase()) {
            case "codigo" -> proyecto.getCodigo();
            case "nombre" -> proyecto.getNombre();
            case "direccion" -> proyecto.getDireccion();
            case "tiporeparacion" -> proyecto.getTipoReparacion().name();
            case "prioridad" -> proyecto.getPrioridad().name();
            case "estado" -> proyecto.getEstado().name();
            case "evaluacion" -> proyecto.getEstadoEvaluacionFuncionario().name();
            default -> throw new Exception("Campo no válido para búsqueda: " + campo);
        };
    }
}