package ac2.ac2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ac2.ac2.entities.Agendas;

public interface AgendaRepository extends JpaRepository <Agendas, Long> {
    
}
