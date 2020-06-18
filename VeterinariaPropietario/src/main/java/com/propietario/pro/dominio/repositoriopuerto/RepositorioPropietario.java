package com.propietario.pro.dominio.repositoriopuerto;

import com.propietario.pro.dominio.modelo.Propietario;
import com.propietario.pro.infraestructura.entidad.PropietarioEntity;

import java.util.List;

public interface RepositorioPropietario {

    List<PropietarioEntity> listar();

    void guardar(Propietario propietario);
}
