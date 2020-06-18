package com.paciente.pac.dominio.excepcion;

public class ExcepcionEspeciePacienteObligatoria extends RuntimeException {
    public ExcepcionEspeciePacienteObligatoria(String mensaje) {
        super(mensaje);
    }
}
