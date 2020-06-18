package com.historia.hist.dominio.excepcion;

public class ExcepcionProcedimientoObligatorio extends RuntimeException {

    public ExcepcionProcedimientoObligatorio(String mensaje) {
        super(mensaje);
    }
}
