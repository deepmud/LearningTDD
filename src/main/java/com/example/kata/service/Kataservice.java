package com.example.kata.service;

import com.example.kata.domain.Carton;

import java.util.List;
import java.util.Optional;

public interface Kataservice {

    public Carton save(Integer g);

    public List<Carton> findAlll();

    public List<Carton> findAll();

    Optional<Carton> findById(int i);

}
