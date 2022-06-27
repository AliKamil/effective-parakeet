package com.example.springboot;

import com.example.springboot.service.HelloService;
import com.example.springfun.fun.FunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    HelloService helloService;

    FunService funService;

    public HelloController(HelloService helloService, FunService funService) {
        this.helloService = helloService;
        this.funService = funService;
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!" + helloService.randomNumber();
    }
    @GetMapping("/fun")
    public String fun() {
        return funService.funString();
    }

    @GetMapping("/director")
    public String getDirectors() {
        return funService.funString() + "directors";
    }

}