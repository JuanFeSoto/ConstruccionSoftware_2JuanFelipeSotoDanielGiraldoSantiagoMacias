package app.infrastructure.repository;

import app.infrastructure.entity.RegistroHistoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroHistoriaJpaRepository extends JpaRepository<RegistroHistoriaEntity, Long> {

}
