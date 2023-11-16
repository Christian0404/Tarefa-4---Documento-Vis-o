package ac2.ac2.entities;

import jakarta.persistence.OneToMany;

public class Especializacao {
    private Long id;
    private String especilizacao;
    
    @OneToMany
    private Professores professores;
    
    public Especializacao(Long id, String especilizacao) {
        this.id = id;
        this.especilizacao = especilizacao;
    }

    public Especializacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecilizacao() {
        return especilizacao;
    }

    public void setEspecilizacao(String especilizacao) {
        this.especilizacao = especilizacao;
    }

    
}
