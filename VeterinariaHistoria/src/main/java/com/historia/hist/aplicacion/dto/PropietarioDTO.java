package com.historia.hist.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class PropietarioDTO {
    private String nombre;
    private String apellido;
    private Integer id;
    private String telefono;
    private String direccion;
    private String Email;

}