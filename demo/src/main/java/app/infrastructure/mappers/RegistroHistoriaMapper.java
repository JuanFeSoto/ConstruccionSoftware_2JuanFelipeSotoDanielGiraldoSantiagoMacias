package app.infrastructure.mappers;

import app.domain.model.RegistroHistoria;
import app.infrastructure.entity.RegistroHistoriaEntity;

public class RegistroHistoriaMapper {
    public static RegistroHistoriaEntity domainToEntity(RegistroHistoria d){
        if(d==null) return null;
        RegistroHistoriaEntity e = new RegistroHistoriaEntity();
        e.setId(d.getId());
        e.setFecha(d.getFecha());
        e.setDiagnostico(d.getDiagnostico());
        e.setTratamiento(d.getTratamiento());
        return e;
    }

    public static RegistroHistoria entityToDomain(RegistroHistoriaEntity e){
        if(e==null) return null;
        return new RegistroHistoria(e.getFecha(), e.getDiagnostico(), e.getTratamiento());
    }
}
