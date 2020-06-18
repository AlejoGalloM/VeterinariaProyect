package com.propietario.pro.infraestructura.repositoriojpa;


import com.propietario.pro.infraestructura.entidad.PropietarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioPropietarioJpa extends JpaRepository<PropietarioEntity, Serializable> {
}
