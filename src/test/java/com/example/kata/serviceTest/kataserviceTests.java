package com.example.kata.serviceTest;

import com.example.kata.repository.KataRepository;
import com.example.kata.service.Kataservice;
import com.example.kata.service.KataserviceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class kataserviceTests {
    @Autowired
    KataRepository kata;

    @Autowired
    Kataservice j;
    @Test
    void saveCarton(){
        assertEquals(1,j.save(7).getCartonId());
    }

    @Test
    void TestfindAll(){
            assertEquals(1,j.findAlll().get(0).getCartonId());
    }

    @Test
    void findById(){
        assertEquals(1,j.findById(4).get().getCartonId());
    }
}
