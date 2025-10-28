package app.application.port.in;

import app.domain.model.Orden;
import java.util.List;
import java.util.Optional;

public interface OrdenUseCase {
    List<Orden> getAllOrdenes();
    Optional<Orden> getOrdenById(Long id);
    Orden saveOrden(Orden orden);
    void deleteOrden(Long id);
}