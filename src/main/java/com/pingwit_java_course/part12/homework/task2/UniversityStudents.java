package com.pingwit_java_course.part12.homework.task2;

import java.util.Arrays;

public class UniversityStudents {
    private Student[] freshmen;

    public UniversityStudents(Student[] freshmen) {
        this.freshmen = freshmen;
    }

    public Student[] getFreshmen() {
        return freshmen;
    }

    public void setFreshmen(Student[] freshmen) {
        this.freshmen = freshmen;
    }

    @Override
    public String toString() {
        return "UniversityStudents{" +
                "freshmen=" + Arrays.toString(freshmen) +
                '}';
    }
}