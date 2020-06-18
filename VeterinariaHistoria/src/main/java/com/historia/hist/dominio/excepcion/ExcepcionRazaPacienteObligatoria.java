package com.historia.hist.dominio.excepcion;

public class ExcepcionRazaPacienteObligatoria extends RuntimeException {
    public ExcepcionRazaPacienteObligatoria(String mensaje) {
        super(mensaje);
    }
}
