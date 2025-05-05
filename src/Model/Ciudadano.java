package model;

import model.TipoIdentificacion;
import java.time.LocalDate;
import model.Persona;

public class Ciudadano extends Persona {

    private LocalDate fechaRegistro;

    public Ciudadano(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre,
                     String primerApellido, String email) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email);
        this.fechaRegistro = LocalDate.now(); // Registro automático
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
