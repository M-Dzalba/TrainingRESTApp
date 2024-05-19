package ru.dzalba.FirstRESTApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//= @Controller+@ResposeBody над каждым методом
@RequestMapping("/api")
public class FirstRESTController {

    //@ResponseBody //значит возвращаем не представление, а данные
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello world!";
    }
}
