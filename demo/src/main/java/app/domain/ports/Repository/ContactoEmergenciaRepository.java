package app.domain.ports.Repository;

import app.domain.model.ContactoEmergencia;

import java.util.List;
import java.util.Optional;

public interface ContactoEmergenciaRepository {
	List<ContactoEmergencia> findAll();
	Optional<ContactoEmergencia> findById(Long id);
	ContactoEmergencia save(ContactoEmergencia contacto);
	void deleteById(Long id);
}

