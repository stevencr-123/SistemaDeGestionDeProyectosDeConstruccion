package Model;

public class ReporteFuncionario {
    private String codigoProyecto; // clave para asociar
    private String observaciones;
    private String evaluacion;

    public ReporteFuncionario(String codigoProyecto, String observaciones, String evaluacion) {
        this.codigoProyecto = codigoProyecto;
        this.observaciones = observaciones;
        this.evaluacion = evaluacion;
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    @Override
    public String toString() {
        return "Reporte del proyecto " + codigoProyecto + ":\n" +
               "Evaluación: " + evaluacion + "\n" +
               "Observaciones: " + observaciones;
    }
    
}
