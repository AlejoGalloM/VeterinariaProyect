package com.propietario.pro.dominio.servicio;

import com.propietario.pro.aplicacion.command.CommandPropietario;
import com.propietario.pro.aplicacion.factory.FactoryPropietario;
import com.propietario.pro.dominio.repositoriopuerto.RepositorioPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarPropietario {

    @Autowired
    public RepositorioPropietario repositorioPropietario;

    @Autowired
    public FactoryPropietario factoryPropietario;

    public List<CommandPropietario> findAll() {
        return factoryPropietario.entityToCommand(repositorioPropietario.listar());
    }
}
