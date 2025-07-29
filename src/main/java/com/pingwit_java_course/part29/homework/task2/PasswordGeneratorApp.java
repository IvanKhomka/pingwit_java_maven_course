package com.pingwit_java_course.part29.homework.task2;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import java.util.Scanner;

public class PasswordGeneratorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        System.out.println("Enter password length: ");
        int length = scanner.nextInt();
        System.out.println("Enter how many password to generate: ");
        int count = scanner.nextInt();

        CharacterData allowedSpecialChars = new CharacterData() {
            @Override
            public String getErrorCode() {
                return "Prohibited special characters were used";
            }

            @Override
            public String getCharacters() {
                return "!@#$%^&*";
            }
        };

        CharacterRule upperCase = new CharacterRule(EnglishCharacterData.UpperCase, 2);
        CharacterRule lowerCase = new CharacterRule(EnglishCharacterData.LowerCase, 2);
        CharacterRule digitCase = new CharacterRule(EnglishCharacterData.Digit, 2);
        CharacterRule specialCase = new CharacterRule(allowedSpecialChars, 2);

        System.out.println("Generated passwords: ");
        for (int i = 0; i < count; i++) {
            String password = passwordGenerator.generatePassword(length, upperCase, lowerCase, digitCase, specialCase);
            System.out.println((i + 1) + ": " + password);
        }
    }
}