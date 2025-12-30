package com.example.Spring.Boot.Basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringBootBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicsApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "index"; 
    }
}
