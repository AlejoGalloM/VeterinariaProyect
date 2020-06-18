package com.historia.hist.dominio.servicio;

import com.historia.hist.aplicacion.command.CommandHistoriaClinica;
import com.historia.hist.aplicacion.factory.FactoryHistorioClinica;
import com.historia.hist.infraestructura.repositorioadaptador.RepositorioHistoriaClinicaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarHistoriaClinica {

    @Autowired
    private RepositorioHistoriaClinicaImpl repositorioHistoriaClinica;

    @Autowired
    private FactoryHistorioClinica factoryHistorioClinica;

    public List<CommandHistoriaClinica> findAll() {
        return factoryHistorioClinica.entityToCommand(repositorioHistoriaClinica.listar());

    }

}
