package com.jamerchallenge.literalura_challenge.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jamerchallenge.literalura_challenge.dto.LibroDto;
import com.jamerchallenge.literalura_challenge.mapper.LibroMapper;
import com.jamerchallenge.literalura_challenge.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class ApiClient {

    private static final String BASE_URL = "https://gutendex.com/books";

    @Autowired
    private LibroMapper libroMapper;

    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Libro> searchBooksByTitle(String title) throws Exception {
        String url = BASE_URL + "?search=" + title;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Failed to fetch books: " + response.body());
        }

        List<LibroDto> libroDtos = objectMapper.readValue(response.body(), objectMapper.getTypeFactory().constructCollectionType(List.class, LibroDto.class));
        return libroMapper.libroDtosToLibros(libroDtos);
    }
}


