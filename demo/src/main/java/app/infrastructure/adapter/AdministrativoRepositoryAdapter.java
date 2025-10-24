package app.infrastructure.adapter;

import app.domain.model.Administrativo;
import app.domain.ports.Repository.AdministrativoRepositoryPort;
import app.infrastructure.entity.AdministrativoEntity;
import app.infrastructure.mappers.AdministrativoMapper;
import app.infrastructure.repository.AdministrativoJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AdministrativoRepositoryAdapter implements AdministrativoRepositoryPort {
    @Autowired
    private AdministrativoJpaRepository administrativoJpaRepository;

    @Override
    public Administrativo save(Administrativo administrativo) {
        AdministrativoEntity entity = AdministrativoMapper.domainToEntity(administrativo);
        AdministrativoEntity saved = administrativoJpaRepository.save(entity);
        return AdministrativoMapper.entityToDomain(saved);
    }

    @Override
    public Optional<Administrativo> findById(Long id) {
    Optional<AdministrativoEntity> e = administrativoJpaRepository.findById(id);
    return e.map(entity -> AdministrativoMapper.entityToDomain(entity));
    }

    @Override
    public List<Administrativo> findAll() {
        return administrativoJpaRepository.findAll()
                .stream()
                .map(AdministrativoMapper::entityToDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        administrativoJpaRepository.deleteById(id);
    }

    public void setAdministrativoJpaRepository(AdministrativoJpaRepository administrativoJpaRepository){
        this.administrativoJpaRepository = administrativoJpaRepository;
    }
}




