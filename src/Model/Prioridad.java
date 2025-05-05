
package model;

public enum Prioridad {
    URGENTE,
    ALTA,
    MEDIA,
    BAJA;
    
    public static Prioridad getURGENTE() {    
        return URGENTE;
    }

    public static Prioridad getALTA() {
        return ALTA;
    }

    public static Prioridad getMEDIA() {
        return MEDIA;
    }

    public static Prioridad getBAJA() {
        return BAJA;
    }
        
}
