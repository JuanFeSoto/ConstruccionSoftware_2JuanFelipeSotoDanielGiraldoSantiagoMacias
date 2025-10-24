package app.domain.services;



import app.domain.model.ContactoEmergencia;
import app.domain.ports.Repository.ContactoEmergenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoEmergenciaService {

    private final ContactoEmergenciaRepository contactoEmergenciaRepository;

    public ContactoEmergenciaService(ContactoEmergenciaRepository contactoEmergenciaRepository) {
        this.contactoEmergenciaRepository = contactoEmergenciaRepository;
    }

    public List<ContactoEmergencia> getAllContactos() {
        return contactoEmergenciaRepository.findAll();
    }

    public Optional<ContactoEmergencia> getContactoById(Long id) {
        return contactoEmergenciaRepository.findById(id);
    }

    public ContactoEmergencia saveContacto(ContactoEmergencia contacto) {
        return contactoEmergenciaRepository.save(contacto);
    }

    public void deleteContacto(Long id) {
        contactoEmergenciaRepository.deleteById(id);
    }
}
