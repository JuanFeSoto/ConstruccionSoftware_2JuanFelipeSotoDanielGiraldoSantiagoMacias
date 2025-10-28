package app.application.port.in;

import app.domain.model.Enfermera;
import java.util.List;
import java.util.Optional;

public interface EnfermeraUseCase {
    Enfermera guardar(Enfermera enfermera);
    List<Enfermera> listar();
    Optional<Enfermera> buscarPorId(Long id);
    void eliminar(Long id);
}