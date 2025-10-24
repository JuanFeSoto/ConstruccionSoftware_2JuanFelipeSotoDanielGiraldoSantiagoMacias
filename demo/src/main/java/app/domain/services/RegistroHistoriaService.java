package app.domain.services;


import app.domain.model.RegistroHistoria;
import app.domain.ports.Repository.RegistroHistoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroHistoriaService {

    private final RegistroHistoriaRepository registroHistoriaRepository;

    public RegistroHistoriaService(RegistroHistoriaRepository registroHistoriaRepository) {
        this.registroHistoriaRepository = registroHistoriaRepository;
    }

    public List<RegistroHistoria> getAllRegistros() {
        return registroHistoriaRepository.findAll();
    }

    public Optional<RegistroHistoria> getRegistroById(Long id) {
        return registroHistoriaRepository.findById(id);
    }

    public RegistroHistoria saveRegistro(RegistroHistoria registro) {
        return registroHistoriaRepository.save(registro);
    }

    public void deleteRegistro(Long id) {
        registroHistoriaRepository.deleteById(id);
    }
}

