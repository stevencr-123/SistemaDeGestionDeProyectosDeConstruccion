/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public enum Solicitud{
    APROBADO,
    DENEGADO,
    EN_ESPERA,;
    
    public static Solicitud getAPROBADO() {
        return APROBADO;
    }

    public static Solicitud getDENEGADO() {
        return DENEGADO;
    }

    public static Solicitud getEN_ESPERA() {
        return EN_ESPERA;
    }
}
