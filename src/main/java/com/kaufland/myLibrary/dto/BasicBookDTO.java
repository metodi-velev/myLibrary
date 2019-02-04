package com.kaufland.myLibrary.dto;

import java.time.Instant;

public class BasicBookDTO {
    private String title;
    private AuthorDTO author;
    private Instant year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public Instant getYear() {
        return year;
    }

    public void setYear(Instant year) {
        this.year = year;
    }
}
