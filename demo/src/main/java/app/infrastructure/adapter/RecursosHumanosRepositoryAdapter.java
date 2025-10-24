package app.infrastructure.adapter;

import app.domain.model.RecursosHumanos;
import app.domain.ports.Repository.RecursosHumanosRepositoryPort;
import app.infrastructure.entity.RecursosHumanosEntity;
import app.infrastructure.mappers.RecursosHumanosMapper;
import app.infrastructure.repository.RecursosHumanosJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RecursosHumanosRepositoryAdapter implements RecursosHumanosRepositoryPort {

    @Autowired
    private RecursosHumanosJpaRepository repository;

    @Override
    public List<RecursosHumanos> findAll() {
        return repository.findAll().stream().map(RecursosHumanosMapper::entityToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<RecursosHumanos> findById(Long id) {
        return repository.findById(id).map(RecursosHumanosMapper::entityToDomain);
    }

    @Override
    public RecursosHumanos save(RecursosHumanos rh) {
        RecursosHumanosEntity e = RecursosHumanosMapper.domainToEntity(rh);
        RecursosHumanosEntity saved = repository.save(e);
        return RecursosHumanosMapper.entityToDomain(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
