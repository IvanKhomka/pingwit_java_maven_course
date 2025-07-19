package com.pingwit_java_course.part16.homework.task1;

import java.util.Scanner;

public class UserAccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your Surname: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = new User(username, firstName, lastName, email, phone, password);
        UserValidationService validator = new UserValidationService();

        boolean isValid = validator.validate(user);

        if (isValid) {
            System.out.println("All data is valid. Account created successfully.");
        } else {
            System.out.println("Your data is not valid. Account can't be created.");
        }
    }
}
