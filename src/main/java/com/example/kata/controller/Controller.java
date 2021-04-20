package com.example.kata.controller;

import com.example.kata.domain.Carton;
import com.example.kata.service.Kataservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Kataservice kataservice;

    @GetMapping("/")
    public String j(){
        return "dd";
    }

    @GetMapping("/b")
    public List<Carton> jj(){
        return kataservice.findAll();
    }


    @PostMapping("/a")
    public Carton gg(){return kataservice.save(5);}

}
