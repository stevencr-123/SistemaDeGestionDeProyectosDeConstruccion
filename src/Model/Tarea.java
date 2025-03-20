
package Model;

import java.time.LocalDate;
import java.util.List;

class Tarea {
    private String descripcion;
    private String tipo;
    private LocalDate fechaInicioReal;
    private LocalDate fechaInicioEstimado;
    private int duracionReal;
    private int duracionEstimada;
    private EtapaConstructiva etapa;
    private List<Documento> listaDeDocumentos;
    private List<Material> materiales;
    private String estado;
}
