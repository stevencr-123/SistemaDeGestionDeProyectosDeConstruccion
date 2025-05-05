package model;

import model.TipoIdentificacion;
import java.time.LocalDate;
import model.Persona;

public class Promotor extends Persona {

    private String matriculaProfesional;
    private String departamento;
    private int proyectosActivos;
    private LocalDate fechaRegistro;

    public Promotor(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre,
                    String primerApellido, String email, String departamento) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email);
        this.departamento = departamento;
        this.fechaRegistro = LocalDate.now();
        this.proyectosActivos = 0;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getProyectosActivos() {
        return proyectosActivos;
    }

    public void setProyectosActivos(int proyectosActivos) {
        this.proyectosActivos = proyectosActivos;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
