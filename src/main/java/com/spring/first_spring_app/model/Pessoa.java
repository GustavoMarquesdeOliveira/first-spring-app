package com.spring.first_spring_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // diz que essa classe é uma tabela no banco
public class Pessoa {

    @Id // identifica a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // construtor vazio é obrigatório para o JPA
    public Pessoa() {}

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // getters e setters (importante pro JPA funcionar)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
