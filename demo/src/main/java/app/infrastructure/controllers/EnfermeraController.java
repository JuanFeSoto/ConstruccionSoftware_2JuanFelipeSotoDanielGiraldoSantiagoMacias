package app.infrastructure.controllers;

import app.application.port.in.EnfermeraUseCase;
import app.domain.model.Enfermera;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfermeras")
public class EnfermeraController {

    private final EnfermeraUseCase enfermeraUseCase;

    public EnfermeraController(EnfermeraUseCase enfermeraUseCase) {
        this.enfermeraUseCase = enfermeraUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Enfermera>> listar() {
        return ResponseEntity.ok(enfermeraUseCase.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enfermera> buscarPorId(@PathVariable Long id) {
        return enfermeraUseCase.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Enfermera> guardar(@RequestBody Enfermera enfermera) {
        return ResponseEntity.ok(enfermeraUseCase.guardar(enfermera));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        enfermeraUseCase.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}