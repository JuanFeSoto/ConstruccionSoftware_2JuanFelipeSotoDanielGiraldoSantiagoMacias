package app.application.port.in;

import app.domain.model.RegistroHistoria;
import java.util.List;
import java.util.Optional;

public interface RegistroHistoriaUseCase {
    List<RegistroHistoria> getAllRegistros();
    Optional<RegistroHistoria> getRegistroById(Long id);
    RegistroHistoria saveRegistro(RegistroHistoria registro);
    void deleteRegistro(Long id);
}