
package Model;

import java.util.List;
import java.time.LocalDate;

public class Proyecto {
    private String nombreClave;
    private String denominacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;
    private Empresa empresa;
    private Promotor empleadoPromotor;
    private List<EtapaConstructiva> etapas;
    private List<Empleado> empleados;
}
