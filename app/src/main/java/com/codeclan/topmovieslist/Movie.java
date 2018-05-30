package com.codeclan.topmovieslist;


public class Movie {

    private Integer ranking;
    private String title;
    private Integer year;

    public Movie(Integer ranking, String title, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

}
