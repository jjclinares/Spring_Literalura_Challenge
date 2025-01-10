package com.jamerchallenge.literalura_challenge.service;

import com.jamerchallenge.literalura_challenge.model.Libro;
import com.jamerchallenge.literalura_challenge.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public void saveBooks(List<Libro> libros) {
        libroRepository.saveAll(libros);
    }

    public List<Libro> getAllBooks() {
        return libroRepository.findAll();
    }
}

