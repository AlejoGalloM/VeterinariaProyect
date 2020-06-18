package com.historia.hist.dominio.excepcion;

public class ExcepcionPacienteRegistrado extends RuntimeException {
    public ExcepcionPacienteRegistrado(String mensaje) {
        super(mensaje);
    }
}
