package com.portal.matricula.sistema.repository;

import com.portal.matricula.sistema.model.Arquivo;
import com.portal.matricula.sistema.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
