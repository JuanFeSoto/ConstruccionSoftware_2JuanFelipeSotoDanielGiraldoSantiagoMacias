package app.infrastructure.repository;

import app.infrastructure.entity.OrdenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenJpaRepository extends JpaRepository<OrdenEntity, Long> {

}
