package com.pingwit_java_course.part17.homework.task3;

public class DateParseApplication {
    private static final String DATA = """
    Fedor, Petrov, 197854, 1980-25-02;
    Peter, Parker, 254870, 1970-01-01;
    Inna, Filatova, 557504, 1994-02-10
    """;

    public static void main(String[] args) {

        PersonParser parser = new PersonParser();
        Person[] persons = parser.parsePersons(DATA);

        for (Person person : persons) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }
}