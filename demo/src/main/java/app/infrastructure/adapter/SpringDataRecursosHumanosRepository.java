package app.infrastructure.adapter;

import app.domain.model.RecursosHumanos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataRecursosHumanosRepository extends JpaRepository<RecursosHumanos, Long> {
}
