package com.kaufland.myLibrary.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Entity
@DiscriminatorValue("Novel")
public class Novel extends Book implements BlackAndWhite {

    private boolean isBlackAndWhite;

    @Column(columnDefinition = "text")
    private String summary;
    private boolean series;

    public Novel(String title, long id, Instant year, Language language, Genre genre, String image, float rating, Author author, int pages, boolean isBlackAndWhite, String summary, boolean series) {
        super(title, id, year, language, genre, image, rating, author, pages);
        this.isBlackAndWhite = isBlackAndWhite;
        this.summary = summary;
        this.series = series;
    }

    public Novel() {
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isSeries() {
        return series;
    }

    public void setSeries(boolean series) {
        this.series = series;
    }

    public void setBlackAndWhite(boolean blackAndWhite) {
        isBlackAndWhite = blackAndWhite;
    }

    @Override
    public boolean isBlackAndWhite() {
        return isBlackAndWhite;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", summary='" + summary + '\'' +
                ", series='" + series + '\'' +
                ", is black and white='" + isBlackAndWhite + '\'' +
                 '\n';
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This novel will be printed black and white");
        System.out.println(toString());
    }
}