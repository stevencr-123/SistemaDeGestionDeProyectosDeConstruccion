package model;

import java.util.List;
import java.util.Map;

public enum EstadoProyecto {
    PLANEACION, 
    EN_PROCESO, 
    SUSPENDIDO, 
    FINALIZADO;

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

public boolean puedeTransicionarA(EstadoProyecto nuevoEstado) {
    return switch (this) {
        case PLANEACION -> nuevoEstado == EN_PROCESO;
        case EN_PROCESO -> nuevoEstado == SUSPENDIDO || nuevoEstado == FINALIZADO;
        case SUSPENDIDO -> nuevoEstado == EN_PROCESO;
        case FINALIZADO -> false;
    };
}

    
}
