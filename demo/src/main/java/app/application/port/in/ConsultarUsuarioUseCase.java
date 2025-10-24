package app.application.port.in;

import app.domain.model.Usuario;

import java.util.Optional;

public interface ConsultarUsuarioUseCase {
    Optional<Usuario> consultarPorId(Long id);
}