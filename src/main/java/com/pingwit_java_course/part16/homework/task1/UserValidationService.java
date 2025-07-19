package com.pingwit_java_course.part16.homework.task1;

public class UserValidationService {

    private static final String INPUT_LETTERS = "[a-zA-Zа-яА-Я]+";
    private static final String INPUT_EMAIL = "^[\\w._%+-]+@[\\w.-]+\\.(com|pl)$";
    private static final String INPUT_PHONE = "\\d+";

    public boolean validate(User user) {

        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            System.out.println("Username can't be empty.");
            return false;
        }

        if (!user.getFirstName().matches(INPUT_LETTERS)) {
            System.out.printf("Name can contain only letters, you entered invalid name: %s%n", user.getFirstName());
            return false;
        }

        if (!user.getLastName().matches(INPUT_LETTERS)) {
            System.out.printf("Surname can contain only letters, you entered invalid surname: %s%n", user.getLastName());
            return false;
        }

        if (!user.getEmail().matches(INPUT_EMAIL)) {
            System.out.printf("Email must contain @ and have a valid domain (.com, .pl ), you entered invalid email: %s%n", user.getEmail());
            return false;
        }

        if (!user.getPhone().matches(INPUT_PHONE)) {
            System.out.printf("Phone num can contain only numbers, you entered invalid phone num: %s%n", user.getPhone());
            return false;
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            System.out.println("Password can't be empty.");
            return false;
        }
        return true;
    }
}
