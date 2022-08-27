
package com.portfolioEapm.ArgentinaPrograma.Interface;

import com.portfolioEapm.ArgentinaPrograma.Entity.Persona;
import java.util.List;

public interface PersonaServiceInterface {
    
    //Traer una lista de objetos persona
    public List<Persona> getPersona();
    //Guardar un objeto persona
    public void savePersona(Persona persona);
    //Borrar un objeto persona
    public void deletePersona(Long id);
    //Buscar un objeto persona por id
    public Persona findPersona(Long id);
    
    
    
    
}
