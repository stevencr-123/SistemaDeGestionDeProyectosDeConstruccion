
package model;

public class FuncionarioPublico extends Persona {
    private String cargo;
    private int nivelAcceso;
    private String departamento;

    public FuncionarioPublico(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
            String primerNombre, String primerApellido, String email, String cargo, String departamento) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email);
        this.cargo = cargo;
        this.departamento = departamento;
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
    
}
