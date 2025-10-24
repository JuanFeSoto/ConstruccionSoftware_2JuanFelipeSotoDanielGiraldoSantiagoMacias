package app.infrastructure.mappers;

import app.domain.model.Orden;
import app.infrastructure.entity.OrdenEntity;

public class OrdenMapper {
    public static OrdenEntity domainToEntity(Orden d){
        if(d==null) return null;
        OrdenEntity e = new OrdenEntity();
        e.setId(d.getId());
        e.setTipo(d.getTipo());
        e.setDescripcion(d.getDescripcion());
        return e;
    }

    public static Orden entityToDomain(OrdenEntity e){
        if(e==null) return null;
        return new Orden(e.getTipo(), e.getDescripcion());
    }
}
