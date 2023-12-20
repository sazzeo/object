package com.jy.object.chapter12.polymorphism;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture {

    private final int passScore;
    private final String title;
    private final List<Integer> scores;

    public Lecture(final int passScore, final String title, final List<Integer> scores) {
        this.passScore = passScore;
        this.title = title;
        this.scores = scores;
    }

    public double average() {
        return scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public String evaluate() {
        return String.format("pass:%d fail:%d", getPassCount(), getFailCount());
    }

    private Long getPassCount() {
        return scores.stream()
                .filter(scores -> scores >= passScore)
                .count();
    }

    private Long getFailCount() {
        return scores.size() - getPassCount();
    }

    public int getPassScore() {
        return passScore;
    }

    public String getTitle() {
        return title;
    }

    public List<Integer> getScores() {
        return scores;
    }
}
