package app.infrastructure.adapter;

import app.domain.model.ContactoEmergencia;
import app.domain.ports.Repository.ContactoEmergenciaRepository;
import app.infrastructure.entity.ContactoEmergenciaEntity;
import app.infrastructure.mappers.ContactoEmergenciaMapper;
import app.infrastructure.repository.ContactoEmergenciaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContactoEmergenciaRepositoryAdapter implements ContactoEmergenciaRepository {

    @Autowired
    private ContactoEmergenciaJpaRepository repository;

    @Override
    public ContactoEmergencia save(ContactoEmergencia contacto) {
        ContactoEmergenciaEntity e = ContactoEmergenciaMapper.domainToEntity(contacto);
        ContactoEmergenciaEntity saved = repository.save(e);
        return ContactoEmergenciaMapper.entityToDomain(saved);
    }

    @Override
    public Optional<ContactoEmergencia> findById(Long id) {
        return repository.findById(id).map(ContactoEmergenciaMapper::entityToDomain);
    }

    @Override
    public List<ContactoEmergencia> findAll() {
        return repository.findAll().stream().map(ContactoEmergenciaMapper::entityToDomain).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
