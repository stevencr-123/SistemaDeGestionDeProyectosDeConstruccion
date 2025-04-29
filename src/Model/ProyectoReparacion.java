/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.time.LocalDate;

/**
 *
 * @author Camilo Jurado
 */
public class ProyectoReparacion {
    private String codigo;
    private String nombre;
    private String direccion;
    private TipoReparacion tipoReparacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFinEstimada;
    private Prioridad prioridad;
    private double presupuesto;
    private EstadoProyecto estado;
    


    public ProyectoReparacion(String codigo, String nombre, String direccion, TipoReparacion tipoReparacion, LocalDate fechaInicio, LocalDate fechaFinEstimada, Prioridad prioridad, double presupuesto, EstadoProyecto estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoReparacion = tipoReparacion;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
        this.prioridad = prioridad;
        this.presupuesto = presupuesto;
        this.estado = estado;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
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

    


}