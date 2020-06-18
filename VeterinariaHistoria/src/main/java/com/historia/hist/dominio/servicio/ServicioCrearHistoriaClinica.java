package com.historia.hist.dominio.servicio;


import com.historia.hist.aplicacion.command.CommandHistoriaClinica;
import com.historia.hist.aplicacion.dto.PacienteDTO;
import com.historia.hist.aplicacion.dto.PropietarioDTO;
import com.historia.hist.aplicacion.factory.FactoryHistorioClinica;
import com.historia.hist.dominio.excepcion.ExcepcionNombrePropietarioObligatorio;
import com.historia.hist.dominio.excepcion.ExcepcionPacienteNoRegistrado;
import com.historia.hist.dominio.excepcion.ExcepcionPropietarioNoRegistrado;
import com.historia.hist.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.historia.hist.infraestructura.entidad.HistoriaClinicaEntity;
import com.historia.hist.infraestructura.restclient.PacienteRestClient;
import com.historia.hist.infraestructura.restclient.PropietarioRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCrearHistoriaClinica {

    private static final String IDENTIFICACION_PACIENTE_OBLIGATORIA = "La identificación del paciente es obligatoria";
    private static final String PROPIETARIO_NO_REGISTRADO = "El propietario ingresado no se encuentra registrado en el sistema";
    private static final String PACIENTE_NO_REGISTRADO = "El paciente ingresado no se encuentra registrado en el  se";
    private static final String HISTORIA_CLINICA_CREADA_EXITOSAMENTE = "La historia Clinica ha sido creada con éxito ";
    private PropietarioDTO propietario;
    private PacienteDTO paciente;

    RepositorioHistoriaClinica repositorioHistoriaClinica;
    FactoryHistorioClinica factoryHistorioClinica;
    PacienteRestClient pacienteRestClient;
    PropietarioRestClient propietarioRestClient;

    public ServicioCrearHistoriaClinica(PropietarioDTO propietario, PacienteDTO paciente,
                                        RepositorioHistoriaClinica repositorioHistoriaClinica,
                                        FactoryHistorioClinica factoryHistorioClinica){
        this.propietario = propietario;
        this.paciente = paciente;
        this.repositorioHistoriaClinica = repositorioHistoriaClinica;
        this.factoryHistorioClinica = factoryHistorioClinica;

    }

    public void registrarHistoriaClinica(CommandHistoriaClinica commandHistoriaClinica) {
       /* validarPropietarioNoNulo(commandHistoriaClinica.getCodigoPropietario());
        validarPropietarioNoRegistrado(commandHistoriaClinica.getCodigoPropietario());
        validarPacinteNoRegistrado(commandHistoriaClinica.getCodigoPaciente());*/
        HistoriaClinicaEntity historiaClinicaEntity = new HistoriaClinicaEntity();
        historiaClinicaEntity.setCodigoHistoria(commandHistoriaClinica.getCodigoHistoria());
        historiaClinicaEntity.setCodigoPropietario(commandHistoriaClinica.getCodigoPropietario());
        historiaClinicaEntity.setCodigoPaciente(commandHistoriaClinica.getCodigoPaciente());
        historiaClinicaEntity.setMedicamentos(commandHistoriaClinica.getMedicamentos());
        historiaClinicaEntity.setProcedimientos(commandHistoriaClinica.getProcedimientos());
        repositorioHistoriaClinica.save(historiaClinicaEntity);

    }
/*
    private void validarPacinteNoRegistrado(Integer codigoPaciente) {
        List<PacienteDTO> listaPacientes = pacienteRestClient.listar();
        boolean registrado = false;
        for (PacienteDTO paciente: listaPacientes) {
            if(paciente.getCodigoPaciente().equals(codigoPaciente)){
                registrado = true;
                agregarPaciente(paciente);
                break;
            }

        }
        if(registrado==false){
            throw new ExcepcionPacienteNoRegistrado(PACIENTE_NO_REGISTRADO);
        }
    }

    private void agregarPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }

    private void validarPropietarioNoRegistrado(Integer codigoPropietario) {
        List<PropietarioDTO> listaPropietarios = propietarioRestClient.listar();
        boolean encontrado = false;
        for (PropietarioDTO propietario: listaPropietarios) {
            if(propietario.getId()==codigoPropietario){
                encontrado=true;
                this.propietario=propietario;
                break;
            }
        }
        if(encontrado==false){
            throw new ExcepcionPropietarioNoRegistrado(PROPIETARIO_NO_REGISTRADO);
        }
    }

    private void validarPropietarioNoNulo(Integer codigoPropietario) {
        if(codigoPropietario==null){
            throw new ExcepcionNombrePropietarioObligatorio(IDENTIFICACION_PACIENTE_OBLIGATORIA);
        }
    }*/
}
