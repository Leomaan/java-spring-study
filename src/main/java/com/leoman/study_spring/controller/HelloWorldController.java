package com.leoman.study_spring.controller;

import com.leoman.study_spring.domain.User;
import com.leoman.study_spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController //Indica que essa clase é um Controller Rest
@RequestMapping("/hello-world")

//Stateless -> A cada nova requisição eu recebo todas as informações necessárias
//Stateful -> Segura o estado de cada cliente no servidor



public class HelloWorldController {

    @Autowired //Injeção de dependência automática
    private HelloWorldService helloWorldService;


    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping //Esse metodo responde as requisições do tipo GET
    public String helloWorld() {
        return helloWorldService.helloWorld("Leoman");
    }
    @PostMapping("/{ìd}")
        public String helloWorldPost(@PathVariable("id") String id, @RequestParam String filter, @RequestHeader(value = "filter", defaultValue = "empty") @RequestBody User body) {
            return "Hello World" + filter;
    }
}
