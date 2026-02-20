package com.prueba.demo.repositories;

import com.prueba.demo.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Optional<Persona> findByCedula(String cedula);
}
