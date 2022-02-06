package com.example.springtdd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void showResponseHelloOla_WhenNameUrlParamIsOla() throws Exception {
        //given
        String name = "Ola";

        //when //expect ale bez //when i //then
        mockMvc.perform(MockMvcRequestBuilders.get("/user?name=" + name))
                //then
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Cześć " + name));
    }

    @Test
    void showResponseHelloEwa_WhenNameUrlParamIsEwa() throws Exception {
        //given
        String name = "Ewa";

        //when //expect ale bez //when i //then
        mockMvc.perform(MockMvcRequestBuilders.get("/user?name=" + name))
                //then
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Cześć Ewa"));
       //fail();
    }

    @Test
    void showResponseHttpBadRequest_WhenParamIsMissing() throws Exception {
        //given

        //when //expect ale bez //when i //then
        mockMvc.perform(MockMvcRequestBuilders.get("/user"))
                //then
                .andExpect(MockMvcResultMatchers.status().isBadRequest());

        //assertTrue(false);
    }
}