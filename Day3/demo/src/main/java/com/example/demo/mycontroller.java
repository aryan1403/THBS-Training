package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
    List<Participants> list = new ArrayList<>();

    @GetMapping("/hello")
    public String hello() {
        return "Hello Abhay";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to my site!";
    }

    @GetMapping("/add/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b) {
        return (a+b);
    }

    @PostMapping("/addParticipants")
    public response addP(@RequestBody Participants p) {
        list.add(p);
        return new response("200", "Praticipant Added Successfully", p);
    }

    @GetMapping("/getParticipants")
    public response getParticipants() {
        return new response("200", "Participants Fetched successfully", list);
    }
}