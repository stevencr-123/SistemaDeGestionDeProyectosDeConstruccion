package Model;

import com.google.gson.annotations.SerializedName;
import model.EstadoProyecto;
import model.Prioridad;
import model.TipoReparacion;
import java.time.LocalDate;

public class Proyecto {
    private String codigo;
    private String nombre;
    private String direccion;
    private TipoReparacion tipoReparacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFinEstimada;
    private Prioridad prioridad;
    private double presupuesto;
    private EstadoProyecto estado;
    private String descripcion;
    
    @SerializedName("solicitudFuncionario")
    private Solicitud estadoEvaluacionFuncionario;

    public Proyecto(String codigo, String nombre, String direccion, TipoReparacion tipoReparacion,
                   LocalDate fechaInicio, LocalDate fechaFinEstimada, Prioridad prioridad,
                   double presupuesto, EstadoProyecto estado, String descripcion, 
                   Solicitud estadoEvaluacionFuncionario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoReparacion = tipoReparacion;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
        this.prioridad = prioridad;
        this.presupuesto = presupuesto;
        this.estado = estado;
        this.descripcion = descripcion;
        this.estadoEvaluacionFuncionario = estadoEvaluacionFuncionario != null 
            ? estadoEvaluacionFuncionario 
            : Solicitud.EN_ESPERA;  // Valor por defecto
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoReparacion getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(TipoReparacion tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(LocalDate fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Solicitud getEstadoEvaluacionFuncionario() {
        return estadoEvaluacionFuncionario;
    }

    public void setEstadoEvaluacionFuncionario(Solicitud estadoEvaluacionFuncionario) {
        this.estadoEvaluacionFuncionario = estadoEvaluacionFuncionario;
    }
}