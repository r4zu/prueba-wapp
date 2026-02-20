package com.prueba.demo.controllers;

import com.prueba.demo.dto.response.ConsultaCedulaResponse;
import com.prueba.demo.services.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/consultas")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ConsultaController {

    private final ConsultaService consultaService;

    @GetMapping("/{cedula}")
    public ResponseEntity<ConsultaCedulaResponse> consultar(@PathVariable String cedula) {
        return ResponseEntity.ok(consultaService.consultarPorCedula(cedula));
    }
}
