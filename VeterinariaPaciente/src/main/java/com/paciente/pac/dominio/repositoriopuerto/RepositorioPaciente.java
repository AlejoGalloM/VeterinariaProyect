package com.paciente.pac.dominio.repositoriopuerto;


import com.paciente.pac.infraestructura.entidad.PacienteEntity;

import java.util.List;

public interface RepositorioPaciente {

    List<PacienteEntity> listar();
    void save(PacienteEntity pacienteEntity);
}
