
package Model;

public enum TipoIdentificacion {
    CEDULA,
    PASAPORTE,
    REGISTROCIVIL,
    DIE,
    TI;

    public static TipoIdentificacion getCEDULA() {
        return CEDULA;
    }

    public static TipoIdentificacion getPASAPORTE() {
        return PASAPORTE;
    }

    public static TipoIdentificacion getREGISTROCIVIL() {
        return REGISTROCIVIL;
    }

    public static TipoIdentificacion getDIE() {
        return DIE;
    }

    public static TipoIdentificacion getTI() {
        return TI;
    }
        
}