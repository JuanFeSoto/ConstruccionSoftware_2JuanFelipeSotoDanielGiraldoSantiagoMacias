package app.infrastructure.mappers;

import app.domain.model.RecursosHumanos;
import app.infrastructure.entity.RecursosHumanosEntity;

public class RecursosHumanosMapper {
    public static RecursosHumanosEntity domainToEntity(RecursosHumanos d){
        if(d==null) return null;
        RecursosHumanosEntity e = new RecursosHumanosEntity();
        e.setId(d.getId());
        e.setResponsable(d.getResponsable());
        e.setProceso(d.getProceso());
        return e;
    }

    public static RecursosHumanos entityToDomain(RecursosHumanosEntity e){
        if(e==null) return null;
        return new RecursosHumanos(e.getResponsable(), e.getProceso());
    }
}
