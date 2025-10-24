package app.infrastructure.adapter;

import app.domain.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataMedicoRepository extends JpaRepository<Medico, Long> {
}
