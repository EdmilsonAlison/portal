package com.portal.matricula.sistema.model.dto;

import com.portal.matricula.sistema.model.enums.Curso;
import com.portal.matricula.sistema.model.enums.TipoPagamento;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class AlunoDto {

    private Integer id;
    @NonNull
    private String nome;
    @NotNull
    private Curso curso;
    @NotNull
    private String cpf;
    @NotNull
    private String matrícula;
    @NotNull
    private TipoPagamento pagamento;
    private Integer codPagamento;
}
