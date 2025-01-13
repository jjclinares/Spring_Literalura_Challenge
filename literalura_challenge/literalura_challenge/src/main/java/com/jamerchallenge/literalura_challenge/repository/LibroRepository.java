package com.jamerchallenge.literalura_challenge.repository;

import com.jamerchallenge.literalura_challenge.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    List<Libro> findByIdioma(String idioma);
}

