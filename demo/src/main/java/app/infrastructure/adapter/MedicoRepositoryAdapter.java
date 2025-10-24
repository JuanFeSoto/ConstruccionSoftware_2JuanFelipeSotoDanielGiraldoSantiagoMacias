package app.infrastructure.adapter;

import app.domain.model.Medico;
import app.domain.ports.Repository.MedicoRepositoryPort;
import app.infrastructure.entity.MedicoEntity;
import app.infrastructure.mappers.MedicoMapper;
import app.infrastructure.repository.MedicoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MedicoRepositoryAdapter implements MedicoRepositoryPort {

    @Autowired
    private MedicoJpaRepository repository;

    @Override
    public List<Medico> findAll() {
        return repository.findAll().stream().map(MedicoMapper::entityToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<Medico> findById(Long id) {
        return repository.findById(id).map(MedicoMapper::entityToDomain);
    }

    @Override
    public Medico save(Medico medico) {
        MedicoEntity e = MedicoMapper.domainToEntity(medico);
        MedicoEntity saved = repository.save(e);
        return MedicoMapper.entityToDomain(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
