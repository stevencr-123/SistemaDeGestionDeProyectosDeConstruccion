
package Model;

import java.time.LocalDate;
import java.util.List;

class EtapaConstructiva {
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Proyecto proyecto;
    private List<Tarea> tareas;
}
