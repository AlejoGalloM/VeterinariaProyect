package com.historia.hist.dominio.excepcion;

public class ExcepcionTelefonoPropietarioObligatorio extends RuntimeException {
    public ExcepcionTelefonoPropietarioObligatorio(String mensaje) {
        super(mensaje);
    }
}
