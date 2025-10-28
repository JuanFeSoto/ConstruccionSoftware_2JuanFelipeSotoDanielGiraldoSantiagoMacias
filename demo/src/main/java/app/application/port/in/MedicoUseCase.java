package app.application.port.in;

import app.domain.model.Medico;
import java.util.List;
import java.util.Optional;

public interface MedicoUseCase {
    List<Medico> listarMedicos();
    Optional<Medico> buscarPorId(Long id);
    Medico guardarMedico(Medico medico);
    void eliminarMedico(Long id);
}