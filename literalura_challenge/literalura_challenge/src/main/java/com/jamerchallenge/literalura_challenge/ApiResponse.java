package com.jamerchallenge.literalura_challenge;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
    private List<ApiLibro> results;

    public List<ApiLibro> getResults() {
        return results;
    }

    public void setResults(List<ApiLibro> results) {
        this.results = results;
    }
}

