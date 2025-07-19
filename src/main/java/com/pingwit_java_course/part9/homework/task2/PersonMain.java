package com.pingwit_java_course.part9.homework.task2;

public class PersonMain {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Савелий", "Иванов", 2000, Gender.MALE, MaritalStatus.SINGLE),
                new Person("Виолетта", "Петрова", 1995, Gender.FEMALE, MaritalStatus.SINGLE),
                new Person("Андрей", "Сидоров", 1985, Gender.MALE, MaritalStatus.MARRIED),
                new Person("Мария", "Кузнецова", 2003, Gender.FEMALE, MaritalStatus.SINGLE)
        };

        MatchmakingService service = new MatchmakingService();
        for (Person person : people) {
            service.askForDating(person);
        }
    }
}
