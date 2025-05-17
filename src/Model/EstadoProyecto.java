package model;

import java.util.List;
import java.util.Map;

public enum EstadoProyecto {
    PLANEACION, 
    EN_PROCESO, 
    SUSPENDIDO, 
    FINALIZADO,
    APROBADO;

    public static EstadoProyecto getAPROBADO() {
        return APROBADO;
    }
    public static EstadoProyecto getPLANEACION() {
        return PLANEACION;
    }

    public static EstadoProyecto getEN_PROCESO() {
        return EN_PROCESO;
    }

    public static EstadoProyecto getSUSPENDIDO() {
        return SUSPENDIDO;
    }

    public static EstadoProyecto getFINALIZADO() {
        return FINALIZADO;
    }
}