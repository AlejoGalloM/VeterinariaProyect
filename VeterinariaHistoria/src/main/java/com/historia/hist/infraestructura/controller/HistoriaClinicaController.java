package com.historia.hist.infraestructura.controller;


import com.historia.hist.aplicacion.command.CommandHistoriaClinica;
import com.historia.hist.dominio.servicio.ServicioCrearHistoriaClinica;
import com.historia.hist.dominio.servicio.ServicioListarHistoriaClinica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/historia-clinica")
public class HistoriaClinicaController {

    @Autowired
    public ServicioListarHistoriaClinica servicioListarHistoriaClinica;

    @Autowired
    public ServicioCrearHistoriaClinica servicioCrearHistoriaClinica;

    @GetMapping()
    public List<CommandHistoriaClinica> listar(){
       return servicioListarHistoriaClinica.findAll();
    }

    @PostMapping()
    public void regitrarHistoriaClinica(@RequestBody  CommandHistoriaClinica commandHistoriaClinica){
         servicioCrearHistoriaClinica.registrarHistoriaClinica(commandHistoriaClinica);
    }
}
