package app.infrastructure.repository;

import app.infrastructure.entity.EnfermeraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfermeraJpaRepository extends JpaRepository<EnfermeraEntity, Long> {

}
