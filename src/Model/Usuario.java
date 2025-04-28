
package model;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String password;
    private LocalDate fechaRegistro;
    private boolean activo;
    private RolSistema rol;
    private Persona persona;
    private String email;

    public Usuario(String email, String password, RolSistema rol) {
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public Usuario() {
    }

    public Persona getPersona() {
        return persona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public RolSistema getRol() {
        return rol;
    }

    public void setRol(RolSistema rol) {
        this.rol = rol;
    }
    
    
}
