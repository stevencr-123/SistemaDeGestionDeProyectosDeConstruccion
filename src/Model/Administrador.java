/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author Camilo Jurado
 */
public class Administrador extends Persona {
    LocalDate fechaCreacion;
    LocalDate ultimoAcceso;
    String ipUltimoAcceso;
    
    
    public Administrador(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre, String primerApellido, String email, String ipUltimoAcceso){
        super(TipoIdentificacion.REGISTROCIVIL, numeroIdentificacion, primerNombre, primerApellido, email);
        this.ultimoAcceso = ultimoAcceso;
        this.ipUltimoAcceso = ipUltimoAcceso;
    }
    
}
