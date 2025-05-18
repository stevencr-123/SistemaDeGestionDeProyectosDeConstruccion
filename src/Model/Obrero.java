package model;

import java.time.LocalDateTime;
import java.util.List;

public class Obrero extends Persona {

    private String especialidad;
    private LocalDateTime fechaContratacion;
    private boolean seguroLaboral;
    private List<String> certificaciones;

    public Obrero(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre,
                  String primerApellido, String email, double sueldo,String telefono, String especialidad, boolean seguroLaboral, double salarioHora) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo, telefono);
        this.especialidad = especialidad;
        this.seguroLaboral = seguroLaboral;
        this.fechaContratacion = LocalDateTime.now(); // Asignación automática
    }
    
    public Obrero(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
                              String primerNombre, String primerApellido, String email, double sueldo, String telefono){
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo, telefono);
        this.fechaContratacion = LocalDateTime.now();
        
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDateTime getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDateTime fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public boolean isSeguroLaboral() {
        return seguroLaboral;
    }

    public void setSeguroLaboral(boolean seguroLaboral) {
        this.seguroLaboral = seguroLaboral;
    }

    public List<String> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(List<String> certificaciones) {
        this.certificaciones = certificaciones;
    }
}
