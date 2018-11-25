package com.hillel.task13;

public class Author {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public int getBirthYear(int i) {
        return birthYear;
    }

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
