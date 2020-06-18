package com.historia.hist.dominio.excepcion;

public class ExcepcionPesoPacienteObligatorio extends RuntimeException {
    public ExcepcionPesoPacienteObligatorio(String mensaje) {
        super(mensaje);
    }
}
