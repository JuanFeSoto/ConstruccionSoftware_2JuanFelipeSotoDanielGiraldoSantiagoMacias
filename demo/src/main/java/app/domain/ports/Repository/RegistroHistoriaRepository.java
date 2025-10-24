package app.domain.ports.Repository;

import app.domain.model.RegistroHistoria;
import java.util.List;
import java.util.Optional;

public interface RegistroHistoriaRepository {
	List<RegistroHistoria> findAll();
	Optional<RegistroHistoria> findById(Long id);
	RegistroHistoria save(RegistroHistoria registro);
	void deleteById(Long id);
}

