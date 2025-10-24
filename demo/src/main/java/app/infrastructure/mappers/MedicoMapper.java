package app.infrastructure.mappers;

import app.domain.model.Medico;
import app.infrastructure.entity.MedicoEntity;

public class MedicoMapper {
    public static MedicoEntity domainToEntity(Medico d){
        if(d==null) return null;
        MedicoEntity e = new MedicoEntity();
        e.setId(d.getId());
        e.setNombre(d.getNombre());
        e.setEspecialidad(d.getEspecialidad());
        return e;
    }

    public static Medico entityToDomain(MedicoEntity e){
        if(e==null) return null;
        return new Medico(e.getNombre(), e.getEspecialidad());
    }
}
