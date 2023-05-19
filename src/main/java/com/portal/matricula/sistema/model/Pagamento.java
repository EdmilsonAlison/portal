package com.portal.matricula.sistema.model;

import javax.persistence.*;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public static Integer gerarCod(){
        int cod = Math.toIntExact(Math.round(Math.random() * 10000000));
        return cod;
    }
}
