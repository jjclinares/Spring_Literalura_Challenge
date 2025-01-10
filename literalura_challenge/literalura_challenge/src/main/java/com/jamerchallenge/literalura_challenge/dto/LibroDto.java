package com.jamerchallenge.literalura_challenge.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LibroDto {

    private String title;

    private List<String> languages;

    @JsonAlias("download_count")
    private int downloadCount;

    private List<AutorDto> authors;

    // Getters y Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public List<AutorDto> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AutorDto> authors) {
        this.authors = authors;
    }
}

