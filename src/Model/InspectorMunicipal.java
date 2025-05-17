package model.roles;

import enums.TipoIdentificacion;
import java.time.LocalDateTime;
import java.util.List;
import model.Persona;

public class InspectorMunicipal extends Persona {

    private String areaEspecializacion;
    private List<String> instrumentosCertificados;
    private LocalDateTime fechaRegistro;

    public InspectorMunicipal(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
                              String primerNombre, String primerApellido, String email,
                              String areaEspecializacion, List<String> instrumentosCertificados, double sueldo) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo);
        this.areaEspecializacion = areaEspecializacion;
        this.instrumentosCertificados = instrumentosCertificados;
        this.fechaRegistro = LocalDateTime.now();
    }

    public InspectorMunicipal(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,
                              String primerNombre, String primerApellido, String email, double sueldo){
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email, sueldo);
        this.fechaRegistro = LocalDateTime.now();
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

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
