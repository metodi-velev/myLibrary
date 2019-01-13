package com.kaufland.myLibrary.dto;

import com.kaufland.myLibrary.domain.Author;

public class BasicBookDTO {
    private String title;
    private Author author;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
