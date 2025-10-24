package app.infrastructure.repository;

import app.infrastructure.entity.RecursosHumanosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursosHumanosJpaRepository extends JpaRepository<RecursosHumanosEntity, Long> {

}
