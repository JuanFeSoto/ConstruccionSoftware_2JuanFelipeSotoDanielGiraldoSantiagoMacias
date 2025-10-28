package app.infrastructure.controllers;

import app.application.port.in.MedicoUseCase;
import app.domain.model.Medico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    private final MedicoUseCase medicoUseCase;

    public MedicoController(MedicoUseCase medicoUseCase) {
        this.medicoUseCase = medicoUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Medico>> listarMedicos() {
        return ResponseEntity.ok(medicoUseCase.listarMedicos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> buscarPorId(@PathVariable Long id) {
        return medicoUseCase.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Medico> guardarMedico(@RequestBody Medico medico) {
        return ResponseEntity.ok(medicoUseCase.guardarMedico(medico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMedico(@PathVariable Long id) {
        medicoUseCase.eliminarMedico(id);
        return ResponseEntity.noContent().build();
    }
}