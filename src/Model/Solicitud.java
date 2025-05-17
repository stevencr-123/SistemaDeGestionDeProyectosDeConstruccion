package Model;

public enum Solicitud {
    APROBADO,
    DENEGADO,
    EN_ESPERA;
    
    @Override
    public String toString() {
        return name();  // Devuelve "APROBADO", "DENEGADO" o "EN_ESPERA"
    }
}