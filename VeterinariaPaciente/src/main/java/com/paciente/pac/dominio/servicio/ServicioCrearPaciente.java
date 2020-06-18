package com.paciente.pac.dominio.servicio;

import com.paciente.pac.aplicacion.command.CommandPaciente;
import com.paciente.pac.aplicacion.factory.FactoryPaciente;
import com.paciente.pac.dominio.dto.PropietarioDTO;
import com.paciente.pac.dominio.excepcion.ExcepcionEspeciePacienteObligatoria;
import com.paciente.pac.dominio.excepcion.ExcepcionPacienteRegistrado;
import com.paciente.pac.dominio.excepcion.ExcepcionPropietarioNoRegistrado;
import com.paciente.pac.dominio.repositoriopuerto.RepositorioPaciente;
import com.paciente.pac.infraestructura.entidad.PacienteEntity;
import com.paciente.pac.infraestructura.restclient.PropietarioRestClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCrearPaciente {

    private static final String ESPECIE_PACIENTE_OBLIGATORIO= "Es necesario ingresar la specie del paciente";
    private static final String PACIENTE_REGISTRADO = "El paciente indicado ya se encuentra registrado en el sistema";
    private static final String PACINETE_REGISTRADO_EXITOSAMENTE = "El paciente se ha registrado exitosamente";
    private static final String PROPIETARIO_NO_REGISTRADO = "El propietario ingresado no se encuentra registrado en el sistema";


    public RepositorioPaciente repositorioPaciente;
    public FactoryPaciente factoryPaciente;
    public ServicioListarPaciente servicioListarPaciente;
    public PropietarioRestClient propietarioRestClient;


    public ServicioCrearPaciente(RepositorioPaciente repositorioPaciente,
                                 FactoryPaciente factoryPaciente,
                                 ServicioListarPaciente servicioListarPaciente) {
        this.repositorioPaciente = repositorioPaciente;
        this.factoryPaciente = factoryPaciente;
        this.servicioListarPaciente = servicioListarPaciente;
    }

    public void registrarPaciente(CommandPaciente commandPaciente) {
        validarPacienteCreado(commandPaciente);
        validarEspeciePaciente(commandPaciente.getEspecie());
       /* validarPropietarioNoRegistrado(commandPaciente.getPropietario());*/
        PacienteEntity pacienteEntity = new PacienteEntity();
        pacienteEntity.setCodigoPaciente(commandPaciente.getCodigoPaciente());
        pacienteEntity.setCodigoPropietario(commandPaciente.getPropietario());
        pacienteEntity.setEspecie(commandPaciente.getEspecie());
        pacienteEntity.setNombre(commandPaciente.getNombre());
        pacienteEntity.setPeso(commandPaciente.getPeso());
        pacienteEntity.setRaza(commandPaciente.getRaza());
        repositorioPaciente.save(pacienteEntity);
    }

    private void validarEspeciePaciente(String especie) {
        if(("").equals(especie)){
            throw new ExcepcionEspeciePacienteObligatoria(ESPECIE_PACIENTE_OBLIGATORIO);
        }
    }

    private void validarPacienteCreado(CommandPaciente commandPaciente) {

        List<CommandPaciente> listapacientes = servicioListarPaciente.findAll();
            for (CommandPaciente paciente:listapacientes) {
                if(commandPaciente.equals(paciente)) {
                    throw  new ExcepcionPacienteRegistrado(PACIENTE_REGISTRADO);
                }
        }

    }
/*
    private void validarPropietarioNoRegistrado(Integer codigoPropietario) {
        List<PropietarioDTO> listaPropietarios = propietarioRestClient.listar();
        boolean encontrado = false;
        for (PropietarioDTO propietario: listaPropietarios) {
            if(propietario.getId().equals(codigoPropietario)){
                encontrado=true;
                break;
            }
        }
        if(encontrado==false){
            throw new ExcepcionPropietarioNoRegistrado(PROPIETARIO_NO_REGISTRADO);

        }
    }
*/
}
