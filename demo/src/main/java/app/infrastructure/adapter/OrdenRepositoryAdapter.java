package app.infrastructure.adapter;

import app.domain.model.Orden;
import app.domain.ports.Repository.OrdenRepository;
import app.infrastructure.entity.OrdenEntity;
import app.infrastructure.mappers.OrdenMapper;
import app.infrastructure.repository.OrdenJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrdenRepositoryAdapter implements OrdenRepository {

    @Autowired
    private OrdenJpaRepository repository;

    @Override
    public List<Orden> findAll() {
        return repository.findAll().stream().map(OrdenMapper::entityToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<Orden> findById(Long id) {
        return repository.findById(id).map(OrdenMapper::entityToDomain);
    }

    @Override
    public Orden save(Orden orden) {
        OrdenEntity e = OrdenMapper.domainToEntity(orden);
        OrdenEntity saved = repository.save(e);
        return OrdenMapper.entityToDomain(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
