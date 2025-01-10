package com.jamerchallenge.literalura_challenge.mapper;

import com.jamerchallenge.literalura_challenge.dto.AutorDto;
import com.jamerchallenge.literalura_challenge.dto.LibroDto;
import com.jamerchallenge.literalura_challenge.model.Autor;
import com.jamerchallenge.literalura_challenge.model.Libro;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LibroMapper {

    Libro libroDtoToLibro(LibroDto libroDto);

    Autor autorDtoToAutor(AutorDto autorDto);

    List<Libro> libroDtosToLibros(List<LibroDto> libroDtos);
}

