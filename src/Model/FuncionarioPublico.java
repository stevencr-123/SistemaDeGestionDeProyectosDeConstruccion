package model;

import java.time.LocalDateTime;

public class FuncionarioPublico extends Persona {

    private String cargo;
    private int nivelAcceso;
    private String departamento;
    private LocalDateTime fechaRegistro;

    public FuncionarioPublico(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
            String primerNombre, String primerApellido, String email, double sueldo,String telefono,
            String cargo, String departamento) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo, telefono);
        this.cargo = cargo;
        this.departamento = departamento;
        this.fechaRegistro = LocalDateTime.now();
    }

    public FuncionarioPublico(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
            String primerNombre, String primerApellido, String email, double sueldo, String telefono) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo, telefono);
        this.fechaRegistro = LocalDateTime.now();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
