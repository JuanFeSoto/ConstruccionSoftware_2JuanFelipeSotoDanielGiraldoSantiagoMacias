package app.infrastructure.controllers;

import app.application.port.in.OrdenUseCase;
import app.domain.model.Orden;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {

    private final OrdenUseCase ordenUseCase;

    public OrdenController(OrdenUseCase ordenUseCase) {
        this.ordenUseCase = ordenUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Orden>> getAllOrdenes() {
        return ResponseEntity.ok(ordenUseCase.getAllOrdenes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orden> getOrdenById(@PathVariable Long id) {
        return ordenUseCase.getOrdenById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Orden> saveOrden(@RequestBody Orden orden) {
        return ResponseEntity.ok(ordenUseCase.saveOrden(orden));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrden(@PathVariable Long id) {
        ordenUseCase.deleteOrden(id);
        return ResponseEntity.noContent().build();
    }
}