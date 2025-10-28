package app.infrastructure.controllers;

import app.application.port.in.AdministrativoUseCase;
import app.domain.model.Administrativo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrativos")
public class AdministrativoController {

    private final AdministrativoUseCase administrativoUseCase;

    public AdministrativoController(AdministrativoUseCase administrativoUseCase) {
        this.administrativoUseCase = administrativoUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Administrativo>> findAll() {
        return ResponseEntity.ok(administrativoUseCase.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Administrativo> findById(@PathVariable Long id) {
        return administrativoUseCase.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Administrativo> save(@RequestBody Administrativo administrativo) {
        return ResponseEntity.ok(administrativoUseCase.save(administrativo));
    }
}