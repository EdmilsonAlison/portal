package com.portal.matricula.sistema.repository;

import com.portal.matricula.sistema.model.Endereco;
import com.portal.matricula.sistema.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
}
