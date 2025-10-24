package app.infrastructure.mappers;

import app.domain.model.ContactoEmergencia;
import app.infrastructure.entity.ContactoEmergenciaEntity;

public class ContactoEmergenciaMapper {
    public static ContactoEmergenciaEntity domainToEntity(ContactoEmergencia d){
        if(d==null) return null;
        ContactoEmergenciaEntity e = new ContactoEmergenciaEntity();
        e.setId(d.getId());
        e.setNombre(d.getNombre());
        e.setTelefono(d.getTelefono());
        e.setRelacion(d.getRelacion());
        return e;
    }

    public static ContactoEmergencia entityToDomain(ContactoEmergenciaEntity e){
        if(e==null) return null;
        ContactoEmergencia d = new ContactoEmergencia();
        d.setId(e.getId());
        d.setNombre(e.getNombre());
        d.setTelefono(e.getTelefono());
        d.setRelacion(e.getRelacion());
        return d;
    }
}
