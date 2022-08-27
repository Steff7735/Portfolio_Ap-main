package com.portfolioEapm.ArgentinaPrograma.Controller;

import com.portfolioEapm.ArgentinaPrograma.Entity.Persona;
import com.portfolioEapm.ArgentinaPrograma.Interface.PersonaServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    PersonaServiceInterface personaServiceInterface;

    @GetMapping("persona/traer")
    public List<Persona> getPersona() {
        return personaServiceInterface.getPersona();

    }

    @PostMapping("/persona/crear")
    public String createPersona(@RequestBody Persona persona) {
        personaServiceInterface.savePersona(persona);
        return "El registro fué creado exitosamente";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaServiceInterface.deletePersona(id);
        return "El registro de datos personales fué eliminado";

    }

    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("imagen") String nuevaImagen) {
        Persona persona = personaServiceInterface.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImagen(nuevaImagen);
        personaServiceInterface.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/persona/traer/perfil")
    public Persona findPersona(){
        return personaServiceInterface.findPersona((long)1);
    }
}
