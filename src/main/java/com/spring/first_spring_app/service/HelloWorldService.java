package com.spring.first_spring_app.service;

import org.springframework.stereotype.Service;
// Dizendo para o spring que essa classe é uma service
@Service
public class HelloWorldService {
    public String helloWorld(String name){
        return  "Hello World!" + name;
    }
}
