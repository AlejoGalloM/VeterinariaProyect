package com.historia.hist.aplicacion.factory;

import com.historia.hist.aplicacion.command.CommandHistoriaClinica;
import com.historia.hist.infraestructura.entidad.HistoriaClinicaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FactoryHistorioClinica {



    public List<CommandHistoriaClinica> entityToCommand(List<HistoriaClinicaEntity> listaHistoriaClinicaEntity) {
        List<CommandHistoriaClinica> listaCommandHistoriaClinica = new ArrayList<>();
        for(HistoriaClinicaEntity historiaClinicaEntity: listaHistoriaClinicaEntity){
            listaCommandHistoriaClinica.add(entityToCommand(historiaClinicaEntity));
        }
        return listaCommandHistoriaClinica;
    }

    private CommandHistoriaClinica entityToCommand(HistoriaClinicaEntity historiaClinicaEntity) {
        CommandHistoriaClinica commandHistoriaClinica = new CommandHistoriaClinica();
        commandHistoriaClinica.setCodigoHistoria(historiaClinicaEntity.getCodigoHistoria());
        commandHistoriaClinica.setCodigoPaciente(historiaClinicaEntity.getCodigoPaciente());
        commandHistoriaClinica.setCodigoPropietario(historiaClinicaEntity.getCodigoPropietario());
        commandHistoriaClinica.setMedicamentos(historiaClinicaEntity.getMedicamentos());
        commandHistoriaClinica.setProcedimientos(historiaClinicaEntity.getProcedimientos());

        return commandHistoriaClinica;
    }
}
