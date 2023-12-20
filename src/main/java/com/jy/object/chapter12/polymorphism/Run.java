package com.jy.object.chapter12.polymorphism;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        Lecture lecture = new Lecture(70, "객체지향 프로그래밍", List.of(50, 60, 70, 80));
        System.out.println(lecture.evaluate());

        GradeLecture gradeLecture = new GradeLecture(70, "객체지향 프로그래밍", List.of(50, 60, 70, 80,91,100)
                , List.of(new Grade("A", 100, 91),
                new Grade("B", 90, 81),
                new Grade("C", 80, 71),
                new Grade("D", 70, 0))
        );

        System.out.println(gradeLecture.evaluate());
    }
}
