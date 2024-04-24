package com.example.springfun.fun;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FunService {

    public String funString() {
        return "This is fun!";
    }


    @Bean("firstImpl")
    public AwesomeInterface getInterface() {
        System.out.println("SOME CHANGES");
        System.out.println("TESTING IMPLEMENTED");
        System.out.println("Conflict line");
        System.out.println("This is important change");
        return new AwesomeInterfaceImpl();
    }

    @Bean("secondImplementation")
    public AwesomeInterface getInterface() {
        return new AwesomeInterfaceImpl2();
    }
}
