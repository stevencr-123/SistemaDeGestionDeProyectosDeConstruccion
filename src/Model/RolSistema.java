
package Model;

public enum RolSistema {
   
    ADMINISTRADOR,
    FUNCIONARIO_PUBLICO,
    PROMOTOR,
    OBRERO,
    INSPECTOR_MUNICIPAL,
    CIUDADANO;

    public static RolSistema getADMINISTRADOR() {
        return ADMINISTRADOR;
    }

    public static RolSistema getFUNCIONARIO_PUBLICO() {
        return FUNCIONARIO_PUBLICO;
    }

    public static RolSistema getPROMOTOR() {
        return PROMOTOR;
    }

    public static RolSistema getOBRERO() {
        return OBRERO;
    }

    public static RolSistema getINSPECTOR_MUNICIPAL() {
        return INSPECTOR_MUNICIPAL;
    }

    public static RolSistema getCIUDADANO() {
        return CIUDADANO;
    }
    
    
}
