package com.pingwit_java_course.part12.homework.task1;

public class SecretLocker {
    private final String password;

    public SecretLocker(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "SecretLocker{" +
                "password='" + password + '\'' +
                '}';
    }
}