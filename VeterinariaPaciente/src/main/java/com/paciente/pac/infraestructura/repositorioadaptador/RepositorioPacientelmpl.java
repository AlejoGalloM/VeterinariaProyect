package com.paciente.pac.infraestructura.repositorioadaptador;

import com.paciente.pac.dominio.repositoriopuerto.RepositorioPaciente;
import com.paciente.pac.infraestructura.entidad.PacienteEntity;
import com.paciente.pac.infraestructura.repositoriojpa.RepositorioPacienteJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioPacientelmpl implements RepositorioPaciente {

    public RepositorioPacienteJpa repositorioPacienteJpa;

    public RepositorioPacientelmpl (RepositorioPacienteJpa repositorioPacienteJpa){
        this.repositorioPacienteJpa= repositorioPacienteJpa;
    }

    @Override
    public List<PacienteEntity> listar() { return  repositorioPacienteJpa.findAll(); }

    @Override
    public void save(PacienteEntity pacienteEntity) {
        repositorioPacienteJpa.save(pacienteEntity);
    }
}
