package app.infrastructure.adapter;

import app.domain.model.Usuario;
import app.domain.ports.Repository.UsuarioRepositoryPort;
import app.infrastructure.entity.UsuarioEntity;
import app.infrastructure.mappers.UsuarioMapper;
import app.infrastructure.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    @Autowired
    private UsuarioJpaRepository repository;

    @Override
    public List<Usuario> findAll() {
        return repository.findAll().stream().map(UsuarioMapper::entityToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return repository.findById(id).map(UsuarioMapper::entityToDomain);
    }

    @Override
    public Usuario save(Usuario usuario) {
        UsuarioEntity e = UsuarioMapper.domainToEntity(usuario);
        UsuarioEntity saved = repository.save(e);
        return UsuarioMapper.entityToDomain(saved);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
