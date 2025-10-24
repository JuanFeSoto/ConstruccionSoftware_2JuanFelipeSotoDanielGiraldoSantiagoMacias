package app.domain.ports.Repository;

import app.domain.model.RecursosHumanos;
import java.util.List;
import java.util.Optional;

public interface RecursosHumanosRepositoryPort {
    List<RecursosHumanos> findAll();
    Optional<RecursosHumanos> findById(Long id);
    RecursosHumanos save(RecursosHumanos rh);
    void deleteById(Long id);
}
