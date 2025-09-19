package com.pingwit_java_course.part31.homework.task3;

import java.util.List;

public class Student {
    //по умолчанию в классе всегда есть геттеры/сеттеры на все поля (кроме статик).
    //иногда сеттеры убирают или не все геттеры присутствуют, но это больше про конкретный случай, а не стандарт
    private final String name;
    private final List<Book> books;

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }
}