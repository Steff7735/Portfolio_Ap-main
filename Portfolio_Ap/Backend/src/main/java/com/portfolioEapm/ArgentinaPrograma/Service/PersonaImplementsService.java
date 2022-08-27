package com.portfolioEapm.ArgentinaPrograma.Service;

import com.portfolioEapm.ArgentinaPrograma.Entity.Persona;
import com.portfolioEapm.ArgentinaPrograma.Interface.PersonaServiceInterface;
import com.portfolioEapm.ArgentinaPrograma.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaImplementsService implements PersonaServiceInterface {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = personaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);

    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);

        return persona;

    }

}
