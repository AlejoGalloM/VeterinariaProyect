package com.propietario.pro.dominio.excepcion;

public class ExcepcionNombrePropietarioObligatorio extends RuntimeException
{
    public ExcepcionNombrePropietarioObligatorio(String mensaje) {
        super(mensaje);
    }
}
