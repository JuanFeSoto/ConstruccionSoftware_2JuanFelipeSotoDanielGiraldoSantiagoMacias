package app.domain.ports.Repository;

import app.domain.model.Orden;
import java.util.List;
import java.util.Optional;

public interface OrdenRepository {
    List<Orden> findAll();
    Optional<Orden> findById(Long id);
    Orden save(Orden orden);
    void deleteById(Long id);
}

