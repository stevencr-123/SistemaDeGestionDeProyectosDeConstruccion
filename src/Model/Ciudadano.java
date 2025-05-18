package model;

import java.time.LocalDateTime;

public class Ciudadano extends Persona {

    private LocalDateTime fechaRegistro;

    public Ciudadano(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre,
                     String primerApellido, String email, double sueldo, String telefono) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo, telefono);
        this.fechaRegistro = LocalDateTime.now(); // Registro automático
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
