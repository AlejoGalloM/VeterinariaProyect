package com.propietario.pro.dominio.util;


import com.propietario.pro.dominio.excepcion.ExcepcionNombrePropietarioObligatorio;
import com.propietario.pro.dominio.excepcion.ExcepcionTelefonoPropietarioObligatorio;

public class ValidadorArgumento {


    public static void validarNombrePropietarioNulo(String nombre, String mensaje) {
        if (nombre == null) {
            throw new ExcepcionNombrePropietarioObligatorio(mensaje);
        }
    }

    public static void validarTelefonoNulo(String telefono, String mensaje) {
        if (telefono == null) {
            throw new ExcepcionTelefonoPropietarioObligatorio(mensaje);
        }
    }

}
