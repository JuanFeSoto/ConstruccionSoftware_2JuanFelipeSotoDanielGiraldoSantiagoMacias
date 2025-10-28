package app.application.port.in;

import app.domain.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioUseCase {
    List<Usuario> listarUsuarios();
    Optional<Usuario> buscarPorId(Long id);
    Usuario guardarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
}