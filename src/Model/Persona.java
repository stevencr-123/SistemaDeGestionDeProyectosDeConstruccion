package model;

import enums.TipoIdentificacion;

public abstract class Persona {

    // atributos
    private TipoIdentificacion tipoIdentificacion;
    private String numeroIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String telefono;
    private double salario;

    // Constructor completo (campos obligatorios)
    public Persona(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String primerNombre, String primerApellido, String email,double sueldo) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.email = email;
        this.salario = sueldo;
    }

    // Constructor vacío (opcional para frameworks o deserialización JSON)
    public Persona() {
    }

    // --- Getters y Setters ---
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

    // --- Métodos útiles opcionales ---
 public String getNombreCompleto() {
    StringBuilder nombreCompleto = new StringBuilder();
    if (primerNombre != null) nombreCompleto.append(primerNombre);
    if (segundoNombre != null && !segundoNombre.isEmpty()) nombreCompleto.append(" ").append(segundoNombre);
    if (primerApellido != null) nombreCompleto.append(" ").append(primerApellido);
    if (segundoApellido != null && !segundoApellido.isEmpty()) nombreCompleto.append(" ").append(segundoApellido);
    return nombreCompleto.toString().trim();
}

}
