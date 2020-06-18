package com.historia.hist.dominio.excepcion;

public class ExcepcionEspeciePacienteObligatoria extends RuntimeException {
    public ExcepcionEspeciePacienteObligatoria(String mensaje) {
        super(mensaje);
    }
}
