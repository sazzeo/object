package com.jy.object.chapter12.polymorphism;

import java.util.List;
import java.util.stream.Collectors;

public class GradeLecture extends Lecture {

    private List<Grade> grades;

    public GradeLecture(final int passScore, final String title, final List<Integer> scores , List<Grade> grades) {
        super(passScore, title, scores);
        this.grades = grades;
    }

    @Override
    public String evaluate() {
        return grades.stream().map(this::gradeEvaluate)
                .collect(Collectors.joining("\n"));
    }

    private String gradeEvaluate(Grade grade) {
        return String.format("%s 등급: %d명" , grade.getName() , gradeCount(grade));

    }

    private long gradeCount(Grade grade) {
        return getScores().stream()
                .filter(grade::includes)
                .count();
    }

}
