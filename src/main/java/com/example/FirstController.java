package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class FirstController {

    @Get
    public String hello(){
        return "HELLLLLLLLLOOO";
    }
}
