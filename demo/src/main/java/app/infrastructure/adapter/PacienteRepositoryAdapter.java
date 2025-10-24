package app.infrastructure.adapter;

import app.domain.model.Paciente;
import app.domain.ports.Repository.PacienteRepository;
import app.infrastructure.entity.PacienteEntity;
import app.infrastructure.mappers.PacienteMapper;
import app.infrastructure.repository.PacienteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PacienteRepositoryAdapter implements PacienteRepository {

    @Autowired
    private PacienteJpaRepository repository;

    @Override
    public List<Paciente> findAll() {
        return repository.findAll().stream().map(PacienteMapper::entityToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<Paciente> findById(Long id) {
        return repository.findById(id).map(PacienteMapper::entityToDomain);
    }

    @Override
    public Paciente save(Paciente paciente) {
        PacienteEntity e = PacienteMapper.domainToEntity(paciente);
        PacienteEntity saved = repository.save(e);
        return PacienteMapper.entityToDomain(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
