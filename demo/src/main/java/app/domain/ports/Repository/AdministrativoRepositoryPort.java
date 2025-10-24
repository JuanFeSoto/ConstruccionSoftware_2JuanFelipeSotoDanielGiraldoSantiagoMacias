package app.domain.ports.Repository;

import app.domain.model.Administrativo;

import java.util.List;
import java.util.Optional;

public interface AdministrativoRepositoryPort {

    Administrativo save(Administrativo administrativo);

    Optional<Administrativo> findById(Long id);

    List<Administrativo> findAll();

    void deleteById(Long id);
}
