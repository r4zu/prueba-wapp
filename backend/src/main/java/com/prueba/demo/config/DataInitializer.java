package com.prueba.demo.config;

import com.prueba.demo.models.Funcionario;
import com.prueba.demo.models.Persona;
import com.prueba.demo.repositories.FuncionarioRepository;
import com.prueba.demo.repositories.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final PersonaRepository personaRepository;
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Persona p1 = personaRepository.save(new Persona(null, "12345", "Juan", "Pérez"));
        Persona p2 = personaRepository.save(new Persona(null, "67890", "María", "García"));
        Persona p3 = personaRepository.save(new Persona(null, "11223", "Carlos", "López"));
        Persona p4 = personaRepository.save(new Persona(null, "44556", "Ana", "Martínez"));
        Persona p5 = personaRepository.save(new Persona(null, "99887", "Luis", "Rodríguez"));

        funcionarioRepository.save(new Funcionario(null, p1, "Analista TI", "Sistemas"));
        funcionarioRepository.save(new Funcionario(null, p3, "Gerente", "Recursos Humanos"));
        System.out.println(">> Datos de prueba cargados correctamente.");
    }
}