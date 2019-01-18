package com.kaufland.myLibrary.dto;

import com.kaufland.myLibrary.domain.Author;

public class BasicBookDTO {
    private String title;
    private AuthorDTO author;


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
}
