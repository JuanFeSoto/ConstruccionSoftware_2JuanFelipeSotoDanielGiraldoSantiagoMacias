package app.infrastructure.adapter;

import app.domain.model.RegistroHistoria;
import app.domain.ports.Repository.RegistroHistoriaRepository;
import app.infrastructure.entity.RegistroHistoriaEntity;
import app.infrastructure.mappers.RegistroHistoriaMapper;
import app.infrastructure.repository.RegistroHistoriaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RegistroHistoriaRepositoryAdapter implements RegistroHistoriaRepository {

    @Autowired
    private RegistroHistoriaJpaRepository repository;

    @Override
    public List<RegistroHistoria> findAll() {
        return repository.findAll().stream().map(RegistroHistoriaMapper::entityToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<RegistroHistoria> findById(Long id) {
        return repository.findById(id).map(RegistroHistoriaMapper::entityToDomain);
    }

    @Override
    public RegistroHistoria save(RegistroHistoria registro) {
        RegistroHistoriaEntity e = RegistroHistoriaMapper.domainToEntity(registro);
        RegistroHistoriaEntity saved = repository.save(e);
        return RegistroHistoriaMapper.entityToDomain(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
