package app.application.port.in;

import app.domain.model.Administrativo;
import java.util.List;
import java.util.Optional;

public interface AdministrativoUseCase {
    Administrativo save(Administrativo administrativo);
    List<Administrativo> findAll();
    Optional<Administrativo> findById(Long id);
}