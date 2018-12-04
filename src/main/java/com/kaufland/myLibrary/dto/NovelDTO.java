package com.kaufland.myLibrary.dto;

import com.kaufland.myLibrary.domain.Novel;

import javax.persistence.Entity;

@Entity
public class NovelDTO {
    private long id;
    private String title;
    private String summary;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
