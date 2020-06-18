package com.paciente.pac.infraestructura.restclient;

import com.paciente.pac.dominio.dto.PropietarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name="servicio.propietario", url="localhost:8082/propietario")
public interface PropietarioRestClient {

    @GetMapping()
    List<PropietarioDTO> listar();
}
