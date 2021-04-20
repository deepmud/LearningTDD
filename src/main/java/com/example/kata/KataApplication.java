package com.example.kata;

import com.example.kata.domain.Carton;
import com.example.kata.service.Kataservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@SpringBootApplication
public class KataApplication {


	public static void main(String[] args) {
		SpringApplication.run(KataApplication.class, args);
	}

}
