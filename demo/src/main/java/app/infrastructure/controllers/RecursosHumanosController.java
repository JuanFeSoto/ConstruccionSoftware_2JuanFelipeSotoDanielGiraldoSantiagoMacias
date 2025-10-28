package app.infrastructure.controllers;

import app.application.port.in.RecursosHumanosUseCase;
import app.domain.model.RecursosHumanos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos-humanos")
public class RecursosHumanosController {

    private final RecursosHumanosUseCase recursosHumanosUseCase;

    public RecursosHumanosController(RecursosHumanosUseCase recursosHumanosUseCase) {
        this.recursosHumanosUseCase = recursosHumanosUseCase;
    }

    @GetMapping
    public ResponseEntity<List<RecursosHumanos>> listarRH() {
        return ResponseEntity.ok(recursosHumanosUseCase.listarRH());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecursosHumanos> buscarPorId(@PathVariable Long id) {
        return recursosHumanosUseCase.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RecursosHumanos> guardarRH(@RequestBody RecursosHumanos rh) {
        return ResponseEntity.ok(recursosHumanosUseCase.guardarRH(rh));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRH(@PathVariable Long id) {
        recursosHumanosUseCase.eliminarRH(id);
        return ResponseEntity.noContent().build();
    }
}