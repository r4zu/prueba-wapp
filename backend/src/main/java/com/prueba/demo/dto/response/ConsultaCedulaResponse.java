package com.prueba.demo.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsultaCedulaResponse {
    private String cedula;
    private String nombres;
    private String apellidos;
    private boolean esFuncionario;
    private String cargo;
    private String dependencia;
}
