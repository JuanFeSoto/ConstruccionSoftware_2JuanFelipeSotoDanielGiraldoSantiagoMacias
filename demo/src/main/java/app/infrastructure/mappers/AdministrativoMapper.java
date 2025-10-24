package app.infrastructure.mappers;

import app.domain.model.Administrativo;
import app.infrastructure.entity.AdministrativoEntity;

public class AdministrativoMapper {

    public static AdministrativoEntity domainToEntity(Administrativo d){
        if(d == null) return null;
        AdministrativoEntity e = new AdministrativoEntity();
        e.setId(d.getId());
        e.setNombre(d.getNombre());
        e.setCargo(d.getCargo());
        return e;
    }

    public static Administrativo entityToDomain(AdministrativoEntity e){
        if(e == null) return null;
        return new Administrativo(e.getId(), e.getNombre(), e.getCargo());
    }
}
