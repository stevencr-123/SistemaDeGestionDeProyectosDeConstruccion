package model;

import com.google.gson.annotations.SerializedName;
import java.time.LocalDateTime;

public class Usuario {

    private String password;
    private LocalDateTime fechaRegistro;
    private boolean activo;
    private RolSistema rol; 

    @SerializedName("persona")
    private Persona persona;

    @SerializedName("correo")  
    private String email;

    // Constructor con parámetros
  public Usuario(String email, String password, RolSistema rol, Persona persona) {
    System.out.println("Constructor de Usuario llamado con: " + email);
    this.email = email;
    this.password = password;
    this.rol = rol;
    this.persona = persona;
    this.fechaRegistro = LocalDateTime.now();
    this.activo = true;
}


    // Constructor vacío
    public Usuario() {
        this.fechaRegistro = LocalDateTime.now();
        this.activo = true;
    }

    // --- Getters y Setters ---
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
