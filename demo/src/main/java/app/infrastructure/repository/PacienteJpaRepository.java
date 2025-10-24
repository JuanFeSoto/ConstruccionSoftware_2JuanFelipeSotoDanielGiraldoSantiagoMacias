package app.infrastructure.repository;

import app.infrastructure.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteJpaRepository extends JpaRepository<PacienteEntity, Long> {

}
