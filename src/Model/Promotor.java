package model;

import java.time.LocalDateTime;

public class Promotor extends Persona {

    private String matriculaProfesional;
    private String departamento;
    private int proyectosActivos;
    private LocalDateTime fechaRegistro;

    public Promotor(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre,
                    String primerApellido, String email, double sueldo, String telefono, String departamento) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email,sueldo, telefono);
        this.departamento = departamento;
        this.fechaRegistro = LocalDateTime.now();
        this.proyectosActivos = 0;
    }
    
    public Promotor(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
            String primerNombre, String primerApellido, String email, double sueldo, String telefono) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo, telefono);
        this.fechaRegistro = LocalDateTime.now();
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

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
