package com.jamerchallenge.literalura_challenge;

import com.jamerchallenge.literalura_challenge.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiteraluraChallengeApplication implements CommandLineRunner {

	@Autowired
	private LibroService libroService;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) {
		mostrarMenu();
	}

	private void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("\nBienvenido al sistema de gestión de libros");
			System.out.println("Seleccione una opción:");
			System.out.println("1. Insertar un nuevo libro");
			System.out.println("2. Consultar todos los libros");
			System.out.println("3. Buscar un libro por idioma");
			System.out.println("4. Salir");
			System.out.print("Opción: ");

			opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir la nueva línea

			switch (opcion) {
				case 1:
					insertarLibro(scanner);
					break;
				case 2:
					consultarTodosLosLibros();
					break;
				case 3:
					buscarLibroPorIdioma(scanner);
					break;
				case 4:
					System.out.println("¡Gracias por usar el sistema! Hasta pronto.");
					break;
				default:
					System.out.println("Opción no válida. Intente nuevamente.");
			}
		} while (opcion != 4);
	}

	private void insertarLibro(Scanner scanner) {
		try {
			System.out.print("Ingrese el título del libro: ");
			String titulo = scanner.nextLine();

			System.out.print("Ingrese el idioma del libro: ");
			String idioma = scanner.nextLine();

			System.out.print("Ingrese la cantidad de descargas: ");
			int descargas = scanner.nextInt();
			scanner.nextLine(); // Consumir la nueva línea

			libroService.insertarLibro(titulo, idioma, descargas);
			System.out.println("Libro agregado exitosamente.");
		} catch (Exception e) {
			System.out.println("Ocurrió un error al insertar el libro: " + e.getMessage());
		}
	}

	private void consultarTodosLosLibros() {
		try {
			var libros = libroService.obtenerTodosLosLibros();
			if (libros.isEmpty()) {
				System.out.println("No hay libros registrados.");
			} else {
				libros.forEach(libro -> System.out.println(libro.toString()));
			}
		} catch (Exception e) {
			System.out.println("Ocurrió un error al consultar los libros: " + e.getMessage());
		}
	}

	private void buscarLibroPorIdioma(Scanner scanner) {
		try {
			System.out.print("Ingrese el idioma para buscar: ");
			String idioma = scanner.nextLine();

			var libros = libroService.buscarLibrosPorIdioma(idioma);
			if (libros.isEmpty()) {
				System.out.println("No se encontraron libros en el idioma: " + idioma);
			} else {
				libros.forEach(libro -> System.out.println(libro.toString()));
			}
		} catch (Exception e) {
			System.out.println("Ocurrió un error al buscar libros: " + e.getMessage());
		}
	}
}

