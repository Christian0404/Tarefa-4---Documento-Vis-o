package ac2.ac2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ac2.ac2.entities.Cursos;
@Repository
public interface CursoRepository extends JpaRepository <Cursos, Long> {
    
}
