package com.historia.hist.infraestructura.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HistoriaClinica")
public class HistoriaClinicaEntity {

    @Id
    @GeneratedValue
    private Integer codigoHistoria;

    @Column(name = "procedimiento", nullable = false)
    private String procedimientos;

    @Column(name = "medicamentos", nullable = false)
    private String medicamentos;

    @JoinColumn
    private Integer codigoPaciente;

    @JoinColumn
    private Integer codigoPropietario;

}
