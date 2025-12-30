package com.example.Spring.Boot.Basics.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Submit {

    @PostMapping("/submit")
    public String output(
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam String lastname
    ){
        return "Submitted ➜ ID: " + id + "\n" + ", Name: " + name + ", Lastname: " + lastname;
    }
}
