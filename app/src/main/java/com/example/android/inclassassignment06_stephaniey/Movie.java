package com.example.android.inclassassignment06_stephaniey;

import android.widget.Spinner;

import java.io.Serializable;

/**
 * Created by Stephanie on 2/27/2018.
 */

public class Movie implements Serializable {
    private String title;
    private int releaseYear;
    private String genre;
    private boolean isAvailableInEnglish;

    public Movie(String title, int releaseYear, String genre, boolean isAvailableInEnglish) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.isAvailableInEnglish = isAvailableInEnglish;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.title = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isAvailableInEnglish() {
        return isAvailableInEnglish;
    }

    public void setInEnglish(boolean availableInEnglish) {
        isAvailableInEnglish = availableInEnglish;
    }

    @Override
    public String toString() {
        return (title + "(" + releaseYear + "), " + (this.isAvailableInEnglish ? "" : "not") + " available in English");
    }
}
