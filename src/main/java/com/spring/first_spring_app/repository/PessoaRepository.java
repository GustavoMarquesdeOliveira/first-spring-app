package com.spring.first_spring_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.first_spring_app.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
