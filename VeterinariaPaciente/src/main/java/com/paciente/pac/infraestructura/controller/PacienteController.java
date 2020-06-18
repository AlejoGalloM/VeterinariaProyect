package com.paciente.pac.infraestructura.controller;

import com.paciente.pac.aplicacion.command.CommandPaciente;
import com.paciente.pac.dominio.servicio.ServicioCrearPaciente;
import com.paciente.pac.dominio.servicio.ServicioListarPaciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    public ServicioListarPaciente servicioListarPaciente;

    @Autowired
    public ServicioCrearPaciente servicioCrearPaciente;

    @GetMapping()
    public List<CommandPaciente> listar() {
        return servicioListarPaciente.findAll();
    }


    @PostMapping()
    public void registroPaciente(@RequestBody CommandPaciente commandPaciente){
         servicioCrearPaciente.registrarPaciente(commandPaciente);
    }
}
