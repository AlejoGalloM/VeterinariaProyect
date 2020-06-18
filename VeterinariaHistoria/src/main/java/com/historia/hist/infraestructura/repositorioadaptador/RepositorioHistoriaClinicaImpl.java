package com.historia.hist.infraestructura.repositorioadaptador;


import com.historia.hist.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.historia.hist.infraestructura.entidad.HistoriaClinicaEntity;
import com.historia.hist.infraestructura.repositoriojpa.RepositorioHistoriaClinicaJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioHistoriaClinicaImpl implements RepositorioHistoriaClinica {


    @Autowired
    public RepositorioHistoriaClinicaJpa repositorioHistoriaClinicaJpa;

    @Override
    public void save(HistoriaClinicaEntity historiaClinicaEntity) {
        repositorioHistoriaClinicaJpa.save(historiaClinicaEntity);
    }

    @Override
    public List<HistoriaClinicaEntity> listar() {
        return repositorioHistoriaClinicaJpa.findAll();
    }
}
