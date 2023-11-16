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

import ac2.ac2.entities.Cursos;

import ac2.ac2.services.CursoService;


@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
private CursoService cursoService;

@PostMapping
public Cursos criarCursos(@RequestBody Cursos cursos){
    return cursoService.criarCursos(cursos);
}

@GetMapping
    public List<Cursos> listarTodos() {
        return cursoService.listartodos();
    }

@GetMapping("/{id}")
public Cursos obterCursos (@PathVariable Long id) {
return cursoService.obterCursos(id);
}

@DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        cursoService.excluir(id);
    }

    @PutMapping("{id}")
    public void edit(@PathVariable Long id, @RequestBody Cursos cursos) {
        cursoService.editar(id, cursos);
    }
}
