package com.jamerchallenge.literalura_challenge;


import com.jamerchallenge.literalura_challenge.model.Libro;
import com.jamerchallenge.literalura_challenge.service.ApiClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Principal implements CommandLineRunner {

    private final ApiClient bookApiClient;

    public LiteraluraChallengeApplication() {
        this.bookApiClient = new ApiClient();
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Buscar libros por título");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa el título del libro: ");
                    String title = scanner.nextLine();
                    try {
                        List<Libro> libros = bookApiClient.searchBooksByTitle(title);
                        libros.forEach(libro -> System.out.println("Título: " + libro.getTitulo() + ", Idioma: " + libro.getIdioma()));
                    } catch (Exception e) {
                        System.out.println("Error al buscar libros: " + e.getMessage());
                    }
                }
                case 2 -> running = false;
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}
