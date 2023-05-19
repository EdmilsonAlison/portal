package com.portal.matricula.sistema.repository;

import com.portal.matricula.sistema.model.Aluno;
import com.portal.matricula.sistema.model.Arquivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArquivoRepository extends JpaRepository<Arquivo, Integer> {
}
