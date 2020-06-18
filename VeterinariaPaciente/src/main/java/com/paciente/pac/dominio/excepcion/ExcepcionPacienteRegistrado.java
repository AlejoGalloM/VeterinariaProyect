package com.paciente.pac.dominio.excepcion;

public class ExcepcionPacienteRegistrado extends RuntimeException {
    public ExcepcionPacienteRegistrado(String mensaje) {
        super(mensaje);
    }
}
