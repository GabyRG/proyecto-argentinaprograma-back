package com.portfoliogayol.grg.Interface;

import com.portfoliogayol.grg.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // Traer una persona
    public List<Persona> getPersona();
    
    // Guardar objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
