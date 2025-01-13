package com.jamerchallenge.literalura_challenge.service;

import com.jamerchallenge.literalura_challenge.model.Libro;
import com.jamerchallenge.literalura_challenge.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    
    public void insertarLibro(String titulo, String idioma, int descargas) {
        Libro nuevoLibro = new Libro();
        nuevoLibro.setTitulo(titulo);
        nuevoLibro.setIdioma(idioma);
        nuevoLibro.setDescargas(descargas);
        libroRepository.save(nuevoLibro);
    }


    public List<Libro> obtenerTodosLosLibros() {
        return null;
    }

    
    public List<Libro> buscarLibrosPorIdioma(String idioma) {
        return libroRepository.findByIdioma(idioma);
    }

    public Optional<Libro> buscarLibroPorId(Long id) {
        return libroRepository.findById(id);
    }

    public void saveBooks(List<Libro> libros) {
    }
}

