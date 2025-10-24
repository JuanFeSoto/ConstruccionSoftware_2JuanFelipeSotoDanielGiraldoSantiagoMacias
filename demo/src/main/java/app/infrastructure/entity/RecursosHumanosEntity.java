package app.infrastructure.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recursos_humanos")
public class RecursosHumanosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String responsable;
    private String proceso;

    public RecursosHumanosEntity() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }

    public String getProceso() { return proceso; }
    public void setProceso(String proceso) { this.proceso = proceso; }
}
