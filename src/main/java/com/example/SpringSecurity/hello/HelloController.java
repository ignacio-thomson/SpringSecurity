package com.example.SpringSecurity.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String helloWorld(){
        return "Hola mundo desde Spring security!";
    }

    @GetMapping("/adios")
    public String byeWorld(){
        return "Adios!";
    }

}
