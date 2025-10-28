package app.domain.services;

import app.domain.model.RecursosHumanos;
import app.domain.ports.Repository.RecursosHumanosRepositoryPort;
import app.application.port.in.RecursosHumanosUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecursosHumanosService implements RecursosHumanosUseCase {

    private final RecursosHumanosRepositoryPort rhRepository;

    public RecursosHumanosService(RecursosHumanosRepositoryPort rhRepository) {
        this.rhRepository = rhRepository;
    }

    public List<RecursosHumanos> listarRH() {
        return rhRepository.findAll();
    }

    public Optional<RecursosHumanos> buscarPorId(Long id) {
        return rhRepository.findById(id);
    }

    public RecursosHumanos guardarRH(RecursosHumanos rh) {
        return rhRepository.save(rh);
    }

    public void eliminarRH(Long id) {
        rhRepository.deleteById(id);
    }
}

