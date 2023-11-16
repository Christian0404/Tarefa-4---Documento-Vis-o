package ac2.ac2.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac2.ac2.entities.Professores;
import ac2.ac2.repositories.ProfessorRepository;



@Service
public class ProfessorService {
   @Autowired
   private ProfessorRepository professorRepository;

   public Professores criarProfessor (Professores professores){
    return professorRepository.save(professores);
   }

   public Professores obterprofessor (Long id){
    return professorRepository.findById(id)
     .orElse(null);
   }

   public List <Professores> listartodos (){
   return professorRepository.findAll();}

   public void excluir(Long id){
   }

    public void editar(Long id, Professores professores){
    }
   }



