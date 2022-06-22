package com.example.herokutest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    
    @GetMapping("/{name}")
    String greeting(@PathVariable String name){
        return "Hallo " + name + "!";
    }
}