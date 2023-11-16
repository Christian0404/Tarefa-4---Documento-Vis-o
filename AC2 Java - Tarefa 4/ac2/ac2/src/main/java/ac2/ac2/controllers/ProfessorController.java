package ac2.ac2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ac2.ac2.entities.Professores;
import ac2.ac2.services.ProfessorService;


@RestController
@RequestMapping ("/professor")
  
public class ProfessorController {
@Autowired
private ProfessorService professorService;

  public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

@PostMapping
public Professores criarProfessor(@RequestBody Professores professores){
    return professorService.criarProfessor(professores);
}

@GetMapping
    public List<Professores> listarTodos() {
        return professorService.listartodos();
    }


@GetMapping("/{id}")
public Professores obterprofessor (@PathVariable Long id) {
return professorService.obterprofessor(id);
}

@DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        professorService.excluir(id);
    }

    @PutMapping("{id}")
    public void edit(@PathVariable Long id, @RequestBody Professores professores) {
        professorService.editar(id, professores);
    }
}
