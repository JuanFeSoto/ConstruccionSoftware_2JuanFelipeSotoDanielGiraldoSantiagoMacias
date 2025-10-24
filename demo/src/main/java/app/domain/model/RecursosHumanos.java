package app.domain.model;

import jakarta.persistence.*;

@Entity
public class RecursosHumanos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String responsable;
    private String proceso;

    public RecursosHumanos() {}

    public RecursosHumanos(String responsable, String proceso) {
        this.responsable = responsable;
        this.proceso = proceso;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }

    public String getProceso() { return proceso; }
    public void setProceso(String proceso) { this.proceso = proceso; }
}
