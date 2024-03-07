package com.kamikase.web.posbackend.model.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ClubeDTO {
    private String nome;
    private String estado;
    private String email;
    private String cnpj;
    private String dataCriacao;
}
