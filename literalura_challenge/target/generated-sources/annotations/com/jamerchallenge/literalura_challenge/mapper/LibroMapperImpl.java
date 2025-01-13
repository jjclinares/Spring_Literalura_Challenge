package com.jamerchallenge.literalura_challenge.mapper;

import com.jamerchallenge.literalura_challenge.dto.AutorDto;
import com.jamerchallenge.literalura_challenge.dto.LibroDto;
import com.jamerchallenge.literalura_challenge.model.Autor;
import com.jamerchallenge.literalura_challenge.model.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-10T18:07:09-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class LibroMapperImpl implements LibroMapper {

    @Override
    public Libro libroDtoToLibro(LibroDto libroDto) {
        if ( libroDto == null ) {
            return null;
        }

        Libro libro = new Libro();

        return libro;
    }

    @Override
    public Autor autorDtoToAutor(AutorDto autorDto) {
        if ( autorDto == null ) {
            return null;
        }

        Autor autor = new Autor();

        return autor;
    }

    @Override
    public List<Libro> libroDtosToLibros(List<LibroDto> libroDtos) {
        if ( libroDtos == null ) {
            return null;
        }

        List<Libro> list = new ArrayList<Libro>( libroDtos.size() );
        for ( LibroDto libroDto : libroDtos ) {
            list.add( libroDtoToLibro( libroDto ) );
        }

        return list;
    }
}
