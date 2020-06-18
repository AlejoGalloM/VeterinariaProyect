package com.historia.hist.dominio.repositoriopuerto;


import com.historia.hist.infraestructura.entidad.HistoriaClinicaEntity;


import java.util.List;

public interface RepositorioHistoriaClinica {

    List<HistoriaClinicaEntity> listar();

    void save(HistoriaClinicaEntity historiaClinicaEntity);
}
