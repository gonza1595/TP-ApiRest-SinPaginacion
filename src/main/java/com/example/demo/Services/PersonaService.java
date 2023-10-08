package com.example.demo.Services;

import com.example.demo.Entidades.Persona;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends BaseServiceImpl<Persona, Long>{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
