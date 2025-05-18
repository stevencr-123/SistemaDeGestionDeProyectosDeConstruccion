package model;

import java.time.LocalDateTime;

public class Administrador extends Persona {
    private static Administrador instancia; // Instancia única
    private LocalDateTime fechaRegistro;

    // Constructor privado para evitar la creación directa
    private Administrador(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, 
                          String primerNombre, String primerApellido, String email, double sueldo,String telefono) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo, telefono);
        this.fechaRegistro = LocalDateTime.now(); // Registro automático
    }

    // Método estático para obtener la instancia única
    public static synchronized Administrador getInstance(TipoIdentificacion tipoIdentificacion, 
                                                         String numeroIdentificacion, String primerNombre, 
                                                         String primerApellido, String email, double sueldo, String telefono) {
        if (instancia == null) {
            instancia = new Administrador(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo, telefono);
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
