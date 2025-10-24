package app.infrastructure.repository;

import app.infrastructure.entity.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoJpaRepository extends JpaRepository<MedicoEntity, Long> {

}
