package app.infrastructure.adapter;

import app.domain.model.Enfermera;
import app.domain.ports.Repository.EnfermeraRepositoryPort;
import app.infrastructure.entity.EnfermeraEntity;
import app.infrastructure.mappers.EnfermeraMapper;
import app.infrastructure.repository.EnfermeraJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnfermeraRepositoryAdapter implements EnfermeraRepositoryPort {

    @Autowired
    private EnfermeraJpaRepository repository;

    @Override
    public Enfermera save(Enfermera enfermera) {
        EnfermeraEntity e = EnfermeraMapper.domainToEntity(enfermera);
        EnfermeraEntity saved = repository.save(e);
        return EnfermeraMapper.entityToDomain(saved);
    }

    @Override
    public Optional<Enfermera> findById(Long id) {
        return repository.findById(id).map(EnfermeraMapper::entityToDomain);
    }

    @Override
    public List<Enfermera> findAll() {
        return repository.findAll().stream().map(EnfermeraMapper::entityToDomain).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
