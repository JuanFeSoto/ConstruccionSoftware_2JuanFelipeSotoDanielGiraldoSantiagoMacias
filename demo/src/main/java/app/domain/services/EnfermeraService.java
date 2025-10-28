
package app.domain.services;

import app.domain.model.Enfermera;
import app.domain.ports.Repository.EnfermeraRepositoryPort;
import app.application.port.in.EnfermeraUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnfermeraService implements EnfermeraUseCase {

    private final EnfermeraRepositoryPort enfermeraRepository;

    public EnfermeraService(EnfermeraRepositoryPort enfermeraRepository) {
        this.enfermeraRepository = enfermeraRepository;
    }

    public Enfermera guardar(Enfermera enfermera) {
        return enfermeraRepository.save(enfermera);
    }

    public List<Enfermera> listar() {
        return enfermeraRepository.findAll();
    }

    public Optional<Enfermera> buscarPorId(Long id) {
        return enfermeraRepository.findById(id);
    }

    public void eliminar(Long id) {
        enfermeraRepository.deleteById(id);
    }
}
