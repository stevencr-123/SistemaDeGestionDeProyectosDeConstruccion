package model;

import model.TipoIdentificacion;
import java.time.LocalDateTime;
import model.Persona;

public class Ciudadano extends Persona {

    private LocalDateTime fechaRegistro;

    public Ciudadano(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre,
                     String primerApellido, String email, double sueldo) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo);
        this.fechaRegistro = LocalDateTime.now(); // Registro automático
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
