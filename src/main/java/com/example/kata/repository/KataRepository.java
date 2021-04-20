package com.example.kata.repository;

import com.example.kata.domain.Carton;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KataRepository extends JpaRepository<Carton,Integer> {

}
