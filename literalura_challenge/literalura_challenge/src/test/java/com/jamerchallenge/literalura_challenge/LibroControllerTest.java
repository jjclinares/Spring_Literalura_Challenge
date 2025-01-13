package com.jamerchallenge.literalura_challenge;

import com.jamerchallenge.literalura_challenge.service.LibroService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest
class LibroControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private LibroService libroService;

    @Test
    void testGetLibros() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/libros"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

