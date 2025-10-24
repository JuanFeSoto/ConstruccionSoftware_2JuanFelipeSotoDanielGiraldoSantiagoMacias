package app.infrastructure.repository;



import app.domain.ports.Repository.EnfermeraRepositoryPort;
import app.domain.model.Enfermera;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EnfermeraRepository extends JpaRepository<Enfermera, Long>, EnfermeraRepositoryPort {
    // Aquí puedes añadir métodos custom si hacen falta
}

