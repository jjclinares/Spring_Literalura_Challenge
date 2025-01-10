package com.jamerchallenge.literalura_challenge.controller;

import com.jamerchallenge.literalura_challenge.model.Libro;
import com.jamerchallenge.literalura_challenge.service.ApiClient;
import com.jamerchallenge.literalura_challenge.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private ApiClient apiClient;

    @Autowired
    private LibroService libroService;

    @GetMapping("/search")
    public ResponseEntity<?> searchBooks(@RequestParam String title) {
        try {
            List<Libro> libros = apiClient.searchBooksByTitle(title);
            libroService.saveBooks(libros);
            return ResponseEntity.ok(libros);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al buscar el libro: " + e.getMessage());
        }
    }


    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        try {
            List<Libro> libros = libroService.getAllBooks();
            return ResponseEntity.ok(libros);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al obtener los libros guardados: " + e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity<?> saveBooks(@RequestBody List<Libro> libros) {
        try {
            libroService.saveBooks(libros);
            return ResponseEntity.ok("Libros guardados exitosamente.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al guardar los libros: " + e.getMessage());
        }
    }
}

