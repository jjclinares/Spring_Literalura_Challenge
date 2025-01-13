package com.jamerchallenge.literalura_challenge;

import com.jamerchallenge.literalura_challenge.model.Libro;
import com.jamerchallenge.literalura_challenge.repository.LibroRepository;
import com.jamerchallenge.literalura_challenge.service.LibroService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class LibroServiceTest {

    @Mock
    private LibroRepository libroRepository;

    @InjectMocks
    private LibroService libroService;

    public LibroServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetLibrosByIdioma() {
        // Configurar datos simulados
        String idioma = "en";
        when(libroRepository.findByIdioma(idioma)).thenReturn(List.of(new Libro()));

        // Llamar al método
        var libros = libroService.getLibrosByIdioma(idioma);

        // Verificar resultados
        assertNotNull(libros);
        assertEquals(1, libros.size());
        verify(libroRepository, times(1)).findByIdioma(idioma);
    }
}


