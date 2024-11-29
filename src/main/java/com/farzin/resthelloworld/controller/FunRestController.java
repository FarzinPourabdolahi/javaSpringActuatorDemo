package com.farzin.resthelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
         return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Go to gym and do strength exercise!";

    }
}