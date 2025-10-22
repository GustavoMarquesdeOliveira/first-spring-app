package com.spring.first_spring_app.service;

import com.spring.first_spring_app.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void salvarPessoa(String nome, Long cpf) {
        pessoaRepository.inserirPessoa(nome, cpf);
    }
}