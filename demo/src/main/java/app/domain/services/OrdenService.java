package app.domain.services;

import app.domain.model.Orden;
import app.domain.ports.Repository.OrdenRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenService {

    private final OrdenRepository ordenRepository;

    public OrdenService(OrdenRepository ordenRepository) {
        this.ordenRepository = ordenRepository;
    }

    public List<Orden> getAllOrdenes() {
        return ordenRepository.findAll();
    }

    public Optional<Orden> getOrdenById(Long id) {
        return ordenRepository.findById(id);
    }

    public Orden saveOrden(Orden orden) {
        return ordenRepository.save(orden);
    }

    public void deleteOrden(Long id) {
        ordenRepository.deleteById(id);
    }
}

