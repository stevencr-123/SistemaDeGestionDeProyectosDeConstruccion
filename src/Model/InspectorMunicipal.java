
package model;

import java.util.List;

public class InspectorMunicipal extends Persona {
    
    private String areaEspecializacion;
    private List<String> instrumentosCertificados;

    public InspectorMunicipal(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion,String primerNombre,
            String primerApellido, String email, String areaEspecializacion, List<String> instrumentosCertificados) {
        super(tipoIdentificacion, numeroIdentificacion, primerNombre, primerApellido, email);
        this.areaEspecializacion = areaEspecializacion;
        this.instrumentosCertificados = instrumentosCertificados;
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
    
    
}
