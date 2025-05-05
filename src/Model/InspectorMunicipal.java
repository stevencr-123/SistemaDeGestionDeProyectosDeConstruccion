package model;

import model.TipoIdentificacion;
import java.time.LocalDate;
import java.util.List;
import model.Persona;

public class InspectorMunicipal extends Persona {

    private String areaEspecializacion;
    private List<String> instrumentosCertificados;
    private LocalDate fechaRegistro;

    public InspectorMunicipal(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
                              String primerNombre, String primerApellido, String email,
                              String areaEspecializacion, List<String> instrumentosCertificados) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email);
        this.areaEspecializacion = areaEspecializacion;
        this.instrumentosCertificados = instrumentosCertificados;
        this.fechaRegistro = LocalDate.now();
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public List<String> getInstrumentosCertificados() {
        return instrumentosCertificados;
    }

    public void setInstrumentosCertificados(List<String> instrumentosCertificados) {
        this.instrumentosCertificados = instrumentosCertificados;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
