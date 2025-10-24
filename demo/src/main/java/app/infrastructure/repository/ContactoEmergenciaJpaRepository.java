package app.infrastructure.repository;

import app.infrastructure.entity.ContactoEmergenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoEmergenciaJpaRepository extends JpaRepository<ContactoEmergenciaEntity, Long> {

}
