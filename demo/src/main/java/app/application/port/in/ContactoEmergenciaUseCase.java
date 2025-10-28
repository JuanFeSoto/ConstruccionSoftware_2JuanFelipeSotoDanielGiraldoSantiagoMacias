package app.application.port.in;

import app.domain.model.ContactoEmergencia;
import java.util.List;
import java.util.Optional;

public interface ContactoEmergenciaUseCase {
    List<ContactoEmergencia> getAllContactos();
    Optional<ContactoEmergencia> getContactoById(Long id);
    ContactoEmergencia saveContacto(ContactoEmergencia contacto);
    void deleteContacto(Long id);
}