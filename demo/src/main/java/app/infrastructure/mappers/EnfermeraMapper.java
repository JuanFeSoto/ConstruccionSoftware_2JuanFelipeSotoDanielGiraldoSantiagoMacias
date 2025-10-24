package app.infrastructure.mappers;

import app.domain.model.Enfermera;
import app.infrastructure.entity.EnfermeraEntity;

public class EnfermeraMapper {
    public static EnfermeraEntity domainToEntity(Enfermera d){
        if(d==null) return null;
        EnfermeraEntity e = new EnfermeraEntity();
        e.setId(d.getId());
        e.setNombre(d.getNombre());
        e.setEspecialidad(d.getEspecialidad());
        return e;
    }

    public static Enfermera entityToDomain(EnfermeraEntity e){
        if(e==null) return null;
        Enfermera d = new Enfermera();
        d.setId(e.getId());
        d.setNombre(e.getNombre());
        d.setEspecialidad(e.getEspecialidad());
        return d;
    }
}
