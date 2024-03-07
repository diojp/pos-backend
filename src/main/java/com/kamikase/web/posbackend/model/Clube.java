package com.kamikase.web.posbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.Date;

@Getter
@Setter
@Entity
public class Clube {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "O nome não pode ser em branco")
    private String nome;

    @NotEmpty(message = "O Estado não pode ser em branco")
    private String estado;

    @NotEmpty(message = "O enail não pode ser em branco")
    private String email;

    @CNPJ
    @NotEmpty(message = "O CNPJ não pode ser em branco")
    private String cnpj;

    @NotEmpty(message = "A Data da Criação não pode ser  em branco")
    private Date dataCriacao;
}
