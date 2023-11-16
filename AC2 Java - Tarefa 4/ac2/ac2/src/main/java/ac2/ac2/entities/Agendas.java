package ac2.ac2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity (name = "agendas")
@Table(name = "agendas")
public class Agendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int datainicio;
    private int datafim;
    private int horarioinicio;
    private int horariofim;
    private String professor;
    private String curso;
    private String cidade;
    private String estado;
    private int cep;
    private String status;

    @ManyToOne
    private Cursos cursos;

    @ManyToOne
    private Professores professores;

    public Agendas(Long id,int datainicio, int datafim, int horarioinicio, int horariofim, String professor, String curso,
            String cidade, String estado, int cep, String status) {
                this.id = id;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.horarioinicio = horarioinicio;
        this.horariofim = horariofim;
        this.professor = professor;
        this.curso = curso;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.status = status;
    }
    public Agendas() {
        
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public int getDatainicio() {
        return datainicio;
    }
    public void setDatainicio(int datainicio) {
        this.datainicio = datainicio;
    }
    public int getDatafim() {
        return datafim;
    }
    public void setDatafim(int datafim) {
        this.datafim = datafim;
    }
    public int getHorarioinicio() {
        return horarioinicio;
    }
    public void setHorarioinicio(int horarioinicio) {
        this.horarioinicio = horarioinicio;
    }
    public int getHorariofim() {
        return horariofim;
    }
    public void setHorariofim(int horariofim) {
        this.horariofim = horariofim;
    }
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    

}
