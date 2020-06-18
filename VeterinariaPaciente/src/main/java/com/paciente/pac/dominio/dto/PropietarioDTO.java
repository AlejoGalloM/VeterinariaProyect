package com.paciente.pac.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class PropietarioDTO {

    private String nombre;
    private String apellido;
    private Integer id;
    private String telefono;
    private String direccion;
    private String Email;

}
