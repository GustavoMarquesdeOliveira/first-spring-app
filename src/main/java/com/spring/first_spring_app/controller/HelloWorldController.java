package com.spring.first_spring_app.controller;


import com.spring.first_spring_app.domain.User;
import com.spring.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    // Indica ao spring que essa dependencia precisa ser injetada
    @Autowired
    private HelloWorldService helloWorldService;

    //Get no endpoint hello-world
    // Seria possivel tbm passar outro endpoint como parametro
    // Utilizando o @GetMapping("/exemplo") assim o metodo iria dar um get no hello-world/exemplo
    @GetMapping
    public String helloWorld() {
        return  helloWorldService.helloWorld("Gustavo");
    }
    @PostMapping("/{id}")
    // Indica ao spring que será necessário injetar o que vier do RequestBody no parametro body
//    public String helloWorldpost(@RequestBody String body){
//        return "Hello World Post";
//    }
    // Vc pode mapear tbm essa resposta para uma classe
//    public String helloWorldpost(@RequestBody User body){
//        return "Hello World Post" + body.getName();
//    }
    // Indica ao Spring que ele tem que injectar o id que ele recebeu no parametro indicado
//    public String helloWorldpost(@PathVariable("id") String id, @RequestBody User body){
//        return "Hello World Post" + body.getName() + id;
//    }
    // Indica ao Spring que devemos injectar os valores recebidos no query parameters no parametro, nesse caso estamos definindo que apenas o query parameters filter, caso não for ele colocará nenhum
    public String helloWorldpost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){
        return "Hello World Post" + body.getName() + id + filter;
    }
}
