package com.spring.first_spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    // Indica ao spring que ele deve gerenciar o retorno desse metodo como um Bean no contexto da aplicação
//    @Bean
//    public SDKAWS sdkaws(){
//        return new SDKAWS();
//    }
//    // Uma vez que o Bean gerou instancia do Car, ele vai injetar amesma instancia do car para todas as classes que pedirem o car
//    @Bean
//    public Transporte myService(){
//        return new Car();
//    }
}

// Transport interface
// Car -> Implementação da classe transport