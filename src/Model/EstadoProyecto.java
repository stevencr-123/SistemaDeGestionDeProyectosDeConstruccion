package Model;

import java.util.List;
import java.util.Map;

public enum EstadoProyecto {
    PLANEACION, 
    EN_PROGRESO, 
    SUSPENDIDO, 
    FINALIZADO;

    public static EstadoProyecto getPLANEACION() {
        return PLANEACION;
    }

    public static EstadoProyecto getEN_PROGRESO() {
        return EN_PROGRESO;
    }

    public static EstadoProyecto getSUSPENDIDO() {
        return SUSPENDIDO;
    }

    public static EstadoProyecto getFINALIZADO() {
        return FINALIZADO;
    }

    
}
