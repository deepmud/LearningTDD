package com.example.kata.serviceTest;

import com.example.kata.domain.Carton;
import com.example.kata.repository.KataRepository;
import com.example.kata.service.Kataservice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.nio.channels.Pipe;

import static org.mockito.Mockito.when;

@SpringBootTest
public class serviceTests {
    @Autowired
    KataRepository kata;


    @Test
    void saveCarton(){
        Kataservice j = new Kataservice(kata);

        Assertions.assertEquals(1,j.save(7).getCartonId());

    }

    @Test
    void TestfindAll(){
         Kataservice j = new Kataservice(kata);
            Assertions.assertEquals(1,j.findAlll().get(0).getCartonId());
    }

}
