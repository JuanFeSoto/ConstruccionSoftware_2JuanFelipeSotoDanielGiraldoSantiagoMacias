package app.infrastructure.mappers;

import app.domain.model.Usuario;
import app.infrastructure.entity.UsuarioEntity;

public class UsuarioMapper {
    public static UsuarioEntity domainToEntity(Usuario d){
        if(d==null) return null;
        UsuarioEntity e = new UsuarioEntity();
        e.setId(d.getId());
        e.setNombre(d.getNombre());
        e.setCorreo(d.getCorreo());
        e.setContrasena(d.getContraseña());
        return e;
    }

    public static Usuario entityToDomain(UsuarioEntity e){
        if(e==null) return null;
        Usuario u = new Usuario();
        u.setId(e.getId());
        u.setNombre(e.getNombre());
        u.setCorreo(e.getCorreo());
        u.setContraseña(e.getContrasena());
        return u;
    }
}
