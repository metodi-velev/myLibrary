package com.kaufland.myLibrary.domain;

import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SaveBook {

    @NotNull
    @Size(min=2, max = 50)
    private String title;

    public SaveBook(){
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
