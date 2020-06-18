package com.historia.hist.infraestructura.restclient;

import com.historia.hist.aplicacion.dto.PacienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "servicio.rpopietario", url="localhost:8081/paciente")
public interface PacienteRestClient {

    @GetMapping()
    List<PacienteDTO> listar();

}
