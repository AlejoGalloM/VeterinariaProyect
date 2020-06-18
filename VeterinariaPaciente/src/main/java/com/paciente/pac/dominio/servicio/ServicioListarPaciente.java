package com.paciente.pac.dominio.servicio;

import com.paciente.pac.aplicacion.command.CommandPaciente;
import com.paciente.pac.aplicacion.factory.FactoryPaciente;
import com.paciente.pac.dominio.repositoriopuerto.RepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarPaciente {

    @Autowired
    public RepositorioPaciente repositorioPaciente;

    @Autowired
    public FactoryPaciente factoryPaciente;

    public List<CommandPaciente> findAll() {
        return factoryPaciente.entityToCommand(repositorioPaciente.listar());

    }


}
