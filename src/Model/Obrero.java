
package Model;

import java.time.LocalDate;
import java.util.List;

public class Obrero extends Persona{
    private String especialidad;
    private LocalDate fechaContratacion;
    private double salarioHora;
    private boolean seguroLaboral;
    private List<String> certificaciones;

    public Obrero(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre, 
            String primerApellido, String email, String especialidad, boolean seguroLaboral, double salarioHora) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email);
        this.seguroLaboral = seguroLaboral;
        this.especialidad = especialidad;
        this.salarioHora = salarioHora;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
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
