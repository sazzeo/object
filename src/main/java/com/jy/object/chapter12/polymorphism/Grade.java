package com.jy.object.chapter12.polymorphism;

//등급
public class Grade {

    private String name;
    private int upper; //등급 최고점
    private int lower; //등급 최저점

    public Grade(final String name, final int upper, final int lower) {
        this.name = name;
        this.upper = upper;
        this.lower = lower;
    }

    public boolean includes(int score) {
        return lower <= score && score <= upper;
    }

    public String getName() {
        return name;
    }
}
