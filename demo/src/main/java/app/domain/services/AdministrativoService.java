package app.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Administrativo;
import app.domain.ports.Repository.AdministrativoRepositoryPort;

@Service
public class AdministrativoService {
    @Autowired
    private  AdministrativoRepositoryPort administrativoRepositoryPort;



    public Administrativo save(Administrativo administrativo) {
        return administrativoRepositoryPort.save(administrativo);
    }

    public List<Administrativo> findAll() {
        return administrativoRepositoryPort.findAll();
    }

    public Optional<Administrativo> findById(Long id) { 
        return administrativoRepositoryPort.findById(id);
    }
}

