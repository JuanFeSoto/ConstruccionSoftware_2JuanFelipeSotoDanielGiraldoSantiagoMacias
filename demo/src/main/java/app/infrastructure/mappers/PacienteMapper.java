package app.infrastructure.mappers;

import app.domain.model.Paciente;
import app.infrastructure.entity.PacienteEntity;

public class PacienteMapper {
    public static PacienteEntity domainToEntity(Paciente d){
        if(d==null) return null;
        PacienteEntity e = new PacienteEntity();
        e.setId(d.getId());
        e.setNombre(d.getNombre());
        e.setDocumento(d.getDocumento());
        e.setDireccion(d.getDireccion());
        e.setTelefono(d.getTelefono());
        return e;
    }

    public static Paciente entityToDomain(PacienteEntity e){
        if(e==null) return null;
        return new Paciente(e.getNombre(), e.getDocumento(), e.getDireccion(), e.getTelefono());
    }
}
