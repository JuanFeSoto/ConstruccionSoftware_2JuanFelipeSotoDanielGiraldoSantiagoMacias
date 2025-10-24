package app.application.port.in;

import app.domain.model.Usuario;

import java.util.List;

public interface ListarUsuariosUseCase {
    List<Usuario> listarTodos();
}