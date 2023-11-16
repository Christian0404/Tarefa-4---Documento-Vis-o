package ac2.ac2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ac2.ac2.entities.Professores;
@Repository
public interface ProfessorRepository extends JpaRepository <Professores, Long> {
    
}
