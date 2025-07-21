package com.pingwit_java_course.part24.homework.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UserListClean {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice"));
        users.add(new User("Bob"));
        users.add(new User("Eve"));
        users.add(new User("John"));
        users.add(new User("Peter"));
        users.add(new User("Anna"));

        System.out.println("Перед фильтрацией: " + users);

        Set<Character> lettersToRemove = Set.of('A', 'P', 'E');

        users.removeIf(user -> lettersToRemove.contains(user.getName().charAt(0)));

        System.out.println("Пользователи после фильтрации списка: " + users);
    }
}