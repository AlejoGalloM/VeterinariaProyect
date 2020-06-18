package com.historia.hist.infraestructura.repositoriojpa;


import com.historia.hist.infraestructura.entidad.HistoriaClinicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioHistoriaClinicaJpa extends JpaRepository<HistoriaClinicaEntity, Integer> {

}
