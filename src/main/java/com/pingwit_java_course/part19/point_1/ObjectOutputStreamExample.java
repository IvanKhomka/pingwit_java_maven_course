package com.pingwit_java_course.part19.point_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/com/pingwit_java_course/part19/person");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            Work developer = new Work("Developer");
            Person person = new Person("Egorka", "Pingwit", 27, developer, "admin");
            oos.writeObject(person);

            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}