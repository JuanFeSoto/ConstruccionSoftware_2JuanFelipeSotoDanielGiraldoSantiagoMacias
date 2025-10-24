package app.domain.services;

import app.domain.model.Medico;
import app.domain.ports.Repository.MedicoRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;   // ✅ IMPORTANTE

@Service
public class MedicoService {

    private final MedicoRepositoryPort medicoRepositoryPort;

    public MedicoService(MedicoRepositoryPort medicoRepositoryPort) {
        this.medicoRepositoryPort = medicoRepositoryPort;
    }

    public List<Medico> listarMedicos() {
        return medicoRepositoryPort.findAll();
    }

    public Optional<Medico> buscarPorId(Long id) {   // ✅ Long id bien declarado
        return medicoRepositoryPort.findById(id);
    }

    public Medico guardarMedico(Medico medico) {
        return medicoRepositoryPort.save(medico);
    }

    public void eliminarMedico(Long id) {            // ✅ Long id bien declarado
        medicoRepositoryPort.deleteById(id);
    }
}

