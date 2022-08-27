
package com.portfolioEapm.ArgentinaPrograma.Repository;

import com.portfolioEapm.ArgentinaPrograma.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
