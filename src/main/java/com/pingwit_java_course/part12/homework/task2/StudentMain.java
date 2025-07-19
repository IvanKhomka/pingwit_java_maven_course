package com.pingwit_java_course.part12.homework.task2;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) throws Exception {
        Student[] initialFreshman = new Student[]{
                createStudent("Alex", "Warren", 32),
                createStudent("Anna", "Cvirko", 22),
                createStudent("Piotr", "Sergeev", 29)
        };

        UniversityStudents university = new UniversityStudents(initialFreshman);

        System.out.println("-----Students before adding new student-----");
        printStudentList(university.getFreshmen());

        Student newStudent = createStudent("Ivan", "Khomich", 28);

        university.setFreshmen(addStudent(university.getFreshmen(), newStudent));

        System.out.println("-----Students after adding new student-----");
        printStudentList(university.getFreshmen());
    }

    private static Student createStudent(String name, String surname, int age) throws Exception {
        Class<Student> studentClass = Student.class;
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class, String.class, int.class);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(name, surname, age);
    }

    public static Student[] addStudent(Student[] students, Student newStudent) {
        Student[] updated = Arrays.copyOf(students, students.length + 1);
        updated[updated.length - 1] = newStudent;
        return updated;
    }

    public static void printStudentList(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}