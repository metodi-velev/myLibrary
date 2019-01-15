package com.kaufland.myLibrary.dto;

import com.kaufland.myLibrary.domain.Author;

public class BasicBookDTO {
    private String title;
    private AuthorDTO authorDTO;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorDTO getAuthorDTO() {
        return authorDTO;
    }

    public void setAuthorDTO(AuthorDTO authorDTO) {
        this.authorDTO = authorDTO;
    }
}
