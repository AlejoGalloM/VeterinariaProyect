package com.propietario.pro.aplicacion.factory;

import com.propietario.pro.aplicacion.command.CommandPropietario;
import com.propietario.pro.dominio.modelo.Propietario;
import com.propietario.pro.infraestructura.entidad.PropietarioEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FactoryPropietario {

    public List<CommandPropietario> entityToCommand(List<PropietarioEntity> listaPropietario) {
        List<CommandPropietario> listaCommandPropietario = new ArrayList<>();
        for (PropietarioEntity propietarioEntity : listaPropietario) {
            listaCommandPropietario.add(entityToCommand(propietarioEntity));
        }
        return listaCommandPropietario;
    }

    private CommandPropietario entityToCommand(PropietarioEntity propietarioEntity) {
        CommandPropietario commandPropietario = new CommandPropietario();
        commandPropietario.setId(propietarioEntity.getId());
        commandPropietario.setNombre(propietarioEntity.getNombre());
        commandPropietario.setApellido(propietarioEntity.getApellido());
        commandPropietario.setDireccion(propietarioEntity.getDireccion());
        commandPropietario.setEmail(propietarioEntity.getEmail());
        commandPropietario.setTelefono(propietarioEntity.getTelefono());
        return commandPropietario;
    }

    public Propietario crear(CommandPropietario commandPropietario) {
        return new Propietario(commandPropietario.getNombre(), commandPropietario.getApellido(),
                commandPropietario.getId(), commandPropietario.getTelefono(),
                commandPropietario.getDireccion(), commandPropietario.getEmail());
    }
}
