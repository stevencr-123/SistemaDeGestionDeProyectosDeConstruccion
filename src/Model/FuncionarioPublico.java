package model;

import model.TipoIdentificacion;
import java.time.LocalDate;
import model.Persona;

public class FuncionarioPublico extends Persona {

    private String cargo;
    private int nivelAcceso;
    private String departamento;
    private LocalDate fechaRegistro;

    public FuncionarioPublico(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
                              String primerNombre, String primerApellido, String email,
                              String cargo, String departamento) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email);
        this.cargo = cargo;
        this.departamento = departamento;
        this.fechaRegistro = LocalDate.now();
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

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
