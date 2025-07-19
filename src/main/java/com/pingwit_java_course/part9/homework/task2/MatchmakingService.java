package com.pingwit_java_course.part9.homework.task2;

public class MatchmakingService {
    private static final int LEGAL_AGE = 18;

    public void askForDating(Person person) {
        if (person.getAge() > LEGAL_AGE && MaritalStatus.SINGLE == person.getMaritalStatus()) {
            if (Gender.MALE == person.getGender()) {
                System.out.println("Уважаемый " + person.getFirstName() + ", желаете ли познакомиться с девушкой?");
            } else if (Gender.FEMALE == person.getGender()) {
                System.out.println("Уважаемая " + person.getFirstName() + ", мы поможем вам найти мужчину мечты!");
            }
        }
    }
}
