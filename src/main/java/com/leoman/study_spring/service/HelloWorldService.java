package com.leoman.study_spring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService { //Regras de negocio

    public String helloWorld(String name) {
        return "Hello World "+name;
    }

}
