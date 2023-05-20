package com.portal.matricula.sistema.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.portal.matricula.sistema.model.enums.Curso;
import com.portal.matricula.sistema.model.enums.TipoPagamento;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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



    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Enumerated(EnumType.STRING)
    private TipoPagamento pagamento;

    public Aluno(String nome, Curso curso, String cpf, String matrícula, TipoPagamento pagamento) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
        this.matrícula = matrícula;
        this.pagamento = pagamento;
    }

    public Aluno() {
    }
}
