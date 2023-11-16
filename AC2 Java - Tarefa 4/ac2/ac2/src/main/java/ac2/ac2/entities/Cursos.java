package ac2.ac2.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity (name = "cursos")
@Table(name = "cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private double cargahoraria;
    private String objetivos;
    private String ementa;
    
    @ManyToMany (mappedBy = "cursos")
    private List <Professores> professores;

    @OneToMany (mappedBy = "cursos")
    private List <Agendas> agendas;

    public Cursos(Long id, String descricao, double cargahoraria, String objetivos, String ementa) {
        this.id = id;
        this.descricao = descricao;
        this.cargahoraria = cargahoraria;
        this.objetivos = objetivos;
        this.ementa = ementa;
    }

    public Cursos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(double cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    
}
