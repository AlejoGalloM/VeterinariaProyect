package com.paciente.pac.dominio.util;


import com.paciente.pac.dominio.excepcion.ExcepcionEspeciePacienteObligatoria;
import com.paciente.pac.dominio.excepcion.ExcepcionPesoPacienteObligatorio;
import com.paciente.pac.dominio.excepcion.ExcepcionRazaPacienteObligatoria;

public class ValidadorArgumento {
    public static void validarEspecieNula(String especie, String mensaje) {
        if (especie == null) {
            throw new ExcepcionEspeciePacienteObligatoria(mensaje);
        }
    }

    public static void validarRazaNula(String raza, String mensaje) {
        if (raza == null) {
            throw new ExcepcionRazaPacienteObligatoria(mensaje);
        }
    }

    public static void validadorArgumento(Object valor, String mensaje){
        if(valor==null){

        }
    }

    public static void validarPesoNulo(Integer peso, String mensaje) {
        if (peso == null) {
            throw new ExcepcionPesoPacienteObligatorio(mensaje);
        }
    }

}
