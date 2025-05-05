package service.impl;

import model.Proyecto;
import repository.interfaces.IProyectoRepository;
import service.interfaces.IProyectoService;
import exceptions.ProyectoYaExisteException;
import exceptions.NombreProyectoExistenteException;
import exceptions.FechaInvalidaException;
import exceptions.ProyectoYaExisteException;

import java.time.LocalDate;
import java.util.List;

public class ProyectoServiceImpl implements IProyectoService {

    private final IProyectoRepository proyectoRepository;

    public ProyectoServiceImpl(IProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    @Override
    public void crearProyecto(Proyecto proyecto) throws Exception {
        if (proyecto == null) {
            throw new IllegalArgumentException("El proyecto no puede ser nulo.");
        }

        // Validar código único
        Proyecto existente = proyectoRepository.buscarPorCodigo(proyecto.getCodigo());
        if (existente != null) {
            throw new ProyectoYaExisteException("Ya existe un proyecto con el código: " + proyecto.getCodigo());
        }

        // Validar nombre único
        for (Proyecto p : proyectoRepository.listarProyectos()) {
            if (p.getNombre().equalsIgnoreCase(proyecto.getNombre())) {
                throw new NombreProyectoExistenteException("Ya existe un proyecto con el nombre: " + proyecto.getNombre());
            }
        }

        // Validar fecha estimada
        if (proyecto.getFechaFinEstimada().isBefore(LocalDate.now())) {
            throw new FechaInvalidaException("La fecha estimada de finalización no puede ser anterior a hoy.");
        }

        // Si todo es válido, guardar
        proyectoRepository.guardarProyecto(proyecto);
    }

    @Override
    public List<Proyecto> obtenerTodos() throws Exception {
        return proyectoRepository.listarProyectos();
    }

    @Override
    public Proyecto buscarProyectoPorId(String codigo) throws Exception {
        return proyectoRepository.buscarPorCodigo(codigo);
    }
    
@Override
public List<Proyecto> buscarPorCampo(String campo, String texto, boolean caseSensitive) throws Exception {
    List<Proyecto> todos = proyectoRepository.listarProyectos();
    
    // Crear copia final
    final String textoBusqueda = caseSensitive ? texto : texto.toLowerCase();

    return todos.stream()
        .filter(proyecto -> {
            String valorCampo;
            switch (campo.toLowerCase()) {
                case "codigo":
                    valorCampo = proyecto.getCodigo();
                    break;
                case "nombre":
                    valorCampo = proyecto.getNombre();
                    break;
                case "prioridad":
                    valorCampo = proyecto.getPrioridad().toString();
                    break;
                case "tipo":
                case "tiporeparacion":
                    valorCampo = proyecto.getTipoReparacion().toString();
                    break;
                case "fecha":
                case "fechafin":
                    valorCampo = proyecto.getFechaFinEstimada().toString();
                    break;
                default:
                    return false;
            }

            if (!caseSensitive) {
                valorCampo = valorCampo.toLowerCase();
            }

            return valorCampo.contains(textoBusqueda);
        })
        .toList();
}


}
