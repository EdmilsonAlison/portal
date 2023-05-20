package com.portal.matricula.sistema.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String endereco;

    private Integer numero;

    private String bairro;

    private String cep;

    private String cidade;

    private String uf;


}
