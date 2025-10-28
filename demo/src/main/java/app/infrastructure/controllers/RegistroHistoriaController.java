package app.infrastructure.controllers;

import app.application.port.in.RegistroHistoriaUseCase;
import app.domain.model.RegistroHistoria;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registros-historia")
public class RegistroHistoriaController {

    private final RegistroHistoriaUseCase registroHistoriaUseCase;

    public RegistroHistoriaController(RegistroHistoriaUseCase registroHistoriaUseCase) {
        this.registroHistoriaUseCase = registroHistoriaUseCase;
    }

    @GetMapping
    public ResponseEntity<List<RegistroHistoria>> getAllRegistros() {
        return ResponseEntity.ok(registroHistoriaUseCase.getAllRegistros());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistroHistoria> getRegistroById(@PathVariable Long id) {
        return registroHistoriaUseCase.getRegistroById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RegistroHistoria> saveRegistro(@RequestBody RegistroHistoria registro) {
        return ResponseEntity.ok(registroHistoriaUseCase.saveRegistro(registro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegistro(@PathVariable Long id) {
        registroHistoriaUseCase.deleteRegistro(id);
        return ResponseEntity.noContent().build();
    }
}