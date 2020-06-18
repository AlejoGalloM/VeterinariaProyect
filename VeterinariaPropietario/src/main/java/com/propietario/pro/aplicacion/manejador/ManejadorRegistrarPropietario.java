package com.propietario.pro.aplicacion.manejador;

import com.propietario.pro.aplicacion.command.CommandPropietario;
import com.propietario.pro.aplicacion.factory.FactoryPropietario;
import com.propietario.pro.dominio.modelo.Propietario;
import com.propietario.pro.dominio.servicio.ServicioCrearPropietario;
import org.springframework.stereotype.Component;

@Component
public class ManejadorRegistrarPropietario {

    private final ServicioCrearPropietario servicioCrearPropietario;
    private final FactoryPropietario factoryPropietario;

    public ManejadorRegistrarPropietario(ServicioCrearPropietario servicioCrearPropietario, FactoryPropietario factoryPropietario) {
        this.servicioCrearPropietario = servicioCrearPropietario;
        this.factoryPropietario = factoryPropietario;
    }

    public void ejecutar(CommandPropietario commandPropietario){
        Propietario propietario = this.factoryPropietario.crear(commandPropietario);
        this.servicioCrearPropietario.ejecutar(propietario);
    }

}
