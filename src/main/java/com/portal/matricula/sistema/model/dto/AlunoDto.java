package com.portal.matricula.sistema.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.portal.matricula.sistema.model.Endereco;
import com.portal.matricula.sistema.model.enums.Curso;
import com.portal.matricula.sistema.model.enums.TipoPagamento;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Getter
@Setter
public class AlunoDto {

    private Integer id;
    private String nome;

    private String sobreNome;

    private String cpf;

    private String rg;


    private String telefone;

    private String email;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    private String nacionalidade;

    private String matrícula;


    private Integer codPagamento;


    private Endereco endereco;


    private Curso curso;


    private TipoPagamento pagamento;
}