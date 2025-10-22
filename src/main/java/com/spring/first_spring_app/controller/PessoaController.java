package com.spring.first_spring_app.controller;

import com.spring.first_spring_app.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public String criarPessoa(@RequestBody Map<String, Object> body) {
        String nome = (String) body.get("nome");
        Long cpf = Long.valueOf(body.get("cpf").toString());

        pessoaService.salvarPessoa(nome, cpf);

        return "Pessoa inserida com sucesso!";
    }
}