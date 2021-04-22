package com.example.kata.service;

import com.example.kata.domain.Carton;
import com.example.kata.repository.KataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KataserviceImpl implements Kataservice {

    private KataRepository kataRepository;

    public KataserviceImpl(@Autowired KataRepository kataRepository) {
        this.kataRepository = kataRepository;
    }

    @Override
    public Carton save(Integer g){
        Carton carton1 = new Carton("blue","cube",true);
        return kataRepository.save(carton1);
    }
    @Override
    public List<Carton> findAlll() {
        save(2);
        return kataRepository.findAll();
    }

    @Override
    public List<Carton> findAll() {
        return kataRepository.findAll();
    }

    @Override
    public Optional<Carton> findById(int i) {
        save(2);
        return kataRepository.findById(1);
    }
}
