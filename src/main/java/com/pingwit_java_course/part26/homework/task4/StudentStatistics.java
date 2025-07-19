package com.pingwit_java_course.part26.homework.task4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStatistics {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", "Ivanych", 7.2),
                new Student("Ivan", "Khomich", 8.5),
                new Student("Egorka", "Pingwit", 9.1),
                new Student("Egorka", "Zaharov", 8.3),
                new Student("Artem", "Sidarenko", 6.4)
        );
        Map<String, Double> averageScores = students.stream()
                .collect(Collectors.groupingBy(
                        Student::firstName,
                        Collectors.averagingDouble(Student::averageScore)
                ));
        System.out.println(averageScores);
    }
}