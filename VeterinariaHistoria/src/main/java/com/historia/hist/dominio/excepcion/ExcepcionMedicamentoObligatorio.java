package com.historia.hist.dominio.excepcion;

public class ExcepcionMedicamentoObligatorio extends RuntimeException {


    public ExcepcionMedicamentoObligatorio(String mensaje) {
        super(mensaje);
    }
}
