package app.infrastructure.controllers;

import app.application.port.in.ContactoEmergenciaUseCase;
import app.domain.model.ContactoEmergencia;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contactos-emergencia")
public class ContactoEmergenciaController {

    private final ContactoEmergenciaUseCase contactoEmergenciaUseCase;

    public ContactoEmergenciaController(ContactoEmergenciaUseCase contactoEmergenciaUseCase) {
        this.contactoEmergenciaUseCase = contactoEmergenciaUseCase;
    }

    @GetMapping
    public ResponseEntity<List<ContactoEmergencia>> getAllContactos() {
        return ResponseEntity.ok(contactoEmergenciaUseCase.getAllContactos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactoEmergencia> getContactoById(@PathVariable Long id) {
        return contactoEmergenciaUseCase.getContactoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ContactoEmergencia> saveContacto(@RequestBody ContactoEmergencia contacto) {
        return ResponseEntity.ok(contactoEmergenciaUseCase.saveContacto(contacto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContacto(@PathVariable Long id) {
        contactoEmergenciaUseCase.deleteContacto(id);
        return ResponseEntity.noContent().build();
    }
}