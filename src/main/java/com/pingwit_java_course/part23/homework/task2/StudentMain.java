package com.pingwit_java_course.part23.homework.task2;

import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Egorka", 20));
        students.add(new Student("Alexander", 23));
        students.add(new Student("Ivan", 18));
        students.add(new Student("Egorka", 20));

        System.out.println("List of students: " + students);
    }
}