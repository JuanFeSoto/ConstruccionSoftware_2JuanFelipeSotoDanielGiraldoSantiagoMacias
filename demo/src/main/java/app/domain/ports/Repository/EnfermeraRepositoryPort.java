package app.domain.ports.Repository;

import app.domain.model.Enfermera;
import java.util.List;
import java.util.Optional;

public interface EnfermeraRepositoryPort {
    Enfermera save(Enfermera enfermera);
    List<Enfermera> findAll();
    Optional<Enfermera> findById(Long id);
    void deleteById(Long id);
}