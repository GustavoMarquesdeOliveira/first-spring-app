package com.spring.first_spring_app.repository;

import com.spring.first_spring_app.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Procedure(procedureName = "insert_pessoa")
    void inserirPessoa(@Param("p_nome") String nome, @Param("p_cpf") Long cpf);

}
