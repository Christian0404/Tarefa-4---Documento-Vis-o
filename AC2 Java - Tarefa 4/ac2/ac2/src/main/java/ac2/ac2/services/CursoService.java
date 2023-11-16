package ac2.ac2.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac2.ac2.entities.Cursos;

import ac2.ac2.repositories.CursoRepository;


@Service
public class CursoService {
  @Autowired
   private CursoRepository cursoRepository;

   public Cursos criarCursos (Cursos cursos){
    return cursoRepository.save(cursos);
   }

   public Cursos obterCursos (Long id){
    return cursoRepository.findById(id)
     .orElse(null);
   }

   public List <Cursos> listartodos (){
   return cursoRepository.findAll();
  }

   public void excluir(Long id){
   }

    public void editar(Long id, Cursos cursos){
    }
}
