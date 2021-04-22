package com.example.kata.controller;


import com.example.kata.domain.Carton;
import com.example.kata.service.KataserviceImpl;
import org.h2.command.dml.MergeUsing;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class ControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    KataserviceImpl k;

    @Test
    void contr() throws Exception {

        mockMvc.perform(get("/").contentType(MediaType.APPLICATION_JSON)).
                andExpect(jsonPath("$", containsString("dd"))).andDo(print());
    }

    @Test
    void jj() throws Exception {
         List<Carton> l = new ArrayList<>();
        l.add(new Carton("df","jdj",true));
        l.add(new Carton("ddf","jdj",true));

        when(k.findAlll()).thenReturn(l);

        mockMvc.perform(get("/b").contentType(MediaType.APPLICATION_JSON)).
                andExpect(jsonPath("$", hasSize(2))).andDo(print());

    }
}
