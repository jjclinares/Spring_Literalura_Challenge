package com.jamerchallenge.literalura_challenge;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
class ApiLibro {
    private String title;
    private List<ApiAutor> authors;
    private List<String> languages;
    @JsonProperty("download_count")
    private int downloadCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ApiAutor> getAuthors() {
        return authors;
    }

    public void setAuthors(List<ApiAutor> authors) {
        this.authors = authors;
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

    // Getters y setters
}
