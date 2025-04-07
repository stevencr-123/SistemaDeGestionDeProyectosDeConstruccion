
package Model;

public class Promotor extends Persona {
    private String matriculaProfesional;
    private String departamento;
    private int proyectosActivos;

    public Promotor(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre,
            String primerApellido, String email, String departamento) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email);
        this.departamento = departamento;
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
    
    
}
