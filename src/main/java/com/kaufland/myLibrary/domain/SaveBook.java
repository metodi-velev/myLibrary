package com.kaufland.myLibrary.domain;

import org.springframework.web.bind.annotation.GetMapping;

public class SaveBook {

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
