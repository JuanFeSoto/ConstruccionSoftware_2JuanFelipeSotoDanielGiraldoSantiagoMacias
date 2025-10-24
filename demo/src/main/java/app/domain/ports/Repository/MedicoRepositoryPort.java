package app.domain.ports.Repository;

import app.domain.model.Medico;
import java.util.List;
import java.util.Optional;  

public interface MedicoRepositoryPort {
    List<Medico> findAll();
    Optional<Medico> findById(Long id);   
    void deleteById(Long id);
    Medico save(Medico medico);           
}
