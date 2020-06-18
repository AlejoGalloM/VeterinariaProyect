package com.propietario.pro.infraestructura.repositorioadaptador;

import com.propietario.pro.dominio.modelo.Propietario;
import com.propietario.pro.dominio.repositoriopuerto.RepositorioPropietario;
import com.propietario.pro.infraestructura.entidad.PropietarioEntity;
import com.propietario.pro.infraestructura.repositoriojpa.RepositorioPropietarioJpa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioPropietariolmpl implements RepositorioPropietario {

    private final ModelMapper modelMapper = new ModelMapper();

    public RepositorioPropietarioJpa repositorioPropietarioJpa;

    public RepositorioPropietariolmpl (RepositorioPropietarioJpa repositorioPropietarioJpa){
        this.repositorioPropietarioJpa = repositorioPropietarioJpa;
    }

    @Override
    public List<PropietarioEntity> listar() { return repositorioPropietarioJpa.findAll(); }

    @Override
    public void guardar(Propietario propietario) {
        PropietarioEntity propietarioEntity = modelMapper.map(propietario ,PropietarioEntity.class);
        repositorioPropietarioJpa.save(propietarioEntity);
    }
}
