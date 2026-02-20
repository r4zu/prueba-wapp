package com.prueba.demo.services;

import com.prueba.demo.dto.response.ConsultaCedulaResponse;
import com.prueba.demo.models.Funcionario;
import com.prueba.demo.models.Persona;
import com.prueba.demo.repositories.FuncionarioRepository;
import com.prueba.demo.repositories.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConsultaService {

    private final PersonaRepository personaRepository;
    private final FuncionarioRepository funcionarioRepository;

    public ConsultaCedulaResponse consultarPorCedula(String cedula) {
        Persona persona = personaRepository.findByCedula(cedula)
                .orElseThrow(() -> new RuntimeException("Persona no encontrada"));

        Optional<Funcionario> funcionarioOpt = funcionarioRepository.findByPersonaId(persona.getId());

        return ConsultaCedulaResponse.builder()
                .cedula(persona.getCedula())
                .nombres(persona.getNombres())
                .apellidos(persona.getApellidos())
                .esFuncionario(funcionarioOpt.isPresent())
                .cargo(funcionarioOpt.map(Funcionario::getCargo).orElse(null))
                .dependencia(funcionarioOpt.map(Funcionario::getDependencia).orElse(null))
                .build();
    }
}
