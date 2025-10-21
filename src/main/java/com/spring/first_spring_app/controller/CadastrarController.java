package com.spring.first_spring_app.controller;

import com.spring.first_spring_app.domain.User;
import com.spring.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastrar")
public class CadastrarController {

    @Autowired
    private HelloWorldService helloWorldService;

    @PostMapping()
    public String helloWorldpost(@RequestBody User body){
        return body.getName();
    }
}
