package model;

import model.TipoIdentificacion;
import java.time.LocalDateTime;
import model.Persona;

public class Administrador extends Persona {
    private static Administrador instancia; // Instancia única
    private LocalDateTime fechaRegistro;

    // Constructor privado para evitar la creación directa
    private Administrador(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, 
                          String primerNombre, String primerApellido, String email, double sueldo) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo);
        this.fechaRegistro = LocalDateTime.now(); // Registro automático
    }

    // Método estático para obtener la instancia única
    public static synchronized Administrador getInstance(TipoIdentificacion tipoIdentificacion, 
                                                         String numeroIdentificacion, String primerNombre, 
                                                         String primerApellido, String email, double sueldo) {
        if (instancia == null) {
            instancia = new Administrador(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo);
            System.out.println("Instancia de Administrador creada.");
        }
        return instancia;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
