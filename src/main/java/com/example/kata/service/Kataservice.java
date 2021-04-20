package com.example.kata.service;

import com.example.kata.domain.Carton;
import com.example.kata.repository.KataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Kataservice {

    private KataRepository kataRepository;


    public Kataservice(@Autowired KataRepository kataRepository) {
        this.kataRepository = kataRepository;
    }

    public Carton save(Integer g){
        Carton carton1 = new Carton(1,"blue","cube",true);
        return kataRepository.save(carton1);
    }

    public List<Carton> findAlll() {

        Carton carton1 = new Carton(1,"blue","cube",true);
        kataRepository.save(carton1);

       return kataRepository.findAll();
    }

    public List<Carton> findAll() {
        return kataRepository.findAll();
    }
}
