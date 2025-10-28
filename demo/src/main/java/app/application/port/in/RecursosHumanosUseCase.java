package app.application.port.in;

import app.domain.model.RecursosHumanos;
import java.util.List;
import java.util.Optional;

public interface RecursosHumanosUseCase {
    List<RecursosHumanos> listarRH();
    Optional<RecursosHumanos> buscarPorId(Long id);
    RecursosHumanos guardarRH(RecursosHumanos rh);
    void eliminarRH(Long id);
}