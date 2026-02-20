package com.prueba.demo.repositories;

import com.prueba.demo.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Optional<Funcionario> findByPersonaId(Long personaId);
}
