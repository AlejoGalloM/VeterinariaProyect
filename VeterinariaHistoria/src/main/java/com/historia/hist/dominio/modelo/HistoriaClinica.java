package com.historia.hist.dominio.modelo;


import com.historia.hist.dominio.util.ValidadorArgumento;
import lombok.Getter;


@Getter
public class HistoriaClinica {

    public static final String MEDICAMENTOS_REQUERIDOS = "LOS MEDICAMENTOS APLICADOS O RESETADOS DEBEN SER ESPABLECIDOS";
    public static final String PROCEDIMIENTOS_REQUERIDOS = "LOS PROCEDIMIENTOS REALIZADOS DEBEN  SER ACLARADOS";

    //El codigo de historia antes era Serializable, como consejo, no utilizar Serializable para los id, mejor utilizar Integer o mucho mejor utilizar Long
    private Integer codigoHistoria;
    private String procedimientos;
    private String medicamentos;
    private Integer codigoPaciente;
    private Integer codigoPropietario;

    public HistoriaClinica(Integer codigoHistoria, String procedimientos, String medicamentos,
                           Integer codigoPaciente, Integer codigoPropietario) {

        ValidadorArgumento.validarMedicamentoNulo(medicamentos,MEDICAMENTOS_REQUERIDOS);
        ValidadorArgumento.validarProcedimientoNulo(procedimientos,PROCEDIMIENTOS_REQUERIDOS);
        this.codigoHistoria = codigoHistoria;
        this.procedimientos = procedimientos;
        this.medicamentos = medicamentos;
        this.codigoPaciente = codigoPaciente;
        this.codigoPropietario = codigoPropietario;
    }
}