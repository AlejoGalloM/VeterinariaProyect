package com.historia.hist.infraestructura.restclient;

import com.historia.hist.aplicacion.dto.PropietarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "servicio.rpopietario", url="localhost:8082/propietario")
public interface PropietarioRestClient {
    @GetMapping()
    List<PropietarioDTO> listar();

}
