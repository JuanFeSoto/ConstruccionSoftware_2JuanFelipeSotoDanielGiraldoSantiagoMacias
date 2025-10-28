package app.application.port.in;

import app.domain.model.Paciente;
import java.util.List;
import java.util.Optional;

public interface PacienteUseCase {
    List<Paciente> getAllPacientes();
    Optional<Paciente> getPacienteById(Long id);
    Paciente savePaciente(Paciente paciente);
    void deletePaciente(Long id);
}