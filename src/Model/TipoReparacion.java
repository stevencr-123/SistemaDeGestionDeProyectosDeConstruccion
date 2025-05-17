
package enums;

public enum TipoReparacion {
    ESTRUCTURAL,
    ELECTRICA,
    HIDRAULICA,
    PAVIMENTACION,
    OTROS;
    
    public static TipoReparacion getESTRUCTURAL() {    
        return ESTRUCTURAL;
    }

    public static TipoReparacion getELECTRICA() {
        return ELECTRICA;
    }

    public static TipoReparacion getHIDRAULICA() {
        return HIDRAULICA;
    }

    public static TipoReparacion getPAVIMENTACION() {
        return PAVIMENTACION;
    }

    public static TipoReparacion getOTROS() {
        return OTROS;
    }
}
