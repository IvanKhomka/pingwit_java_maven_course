package com.pingwit_java_course.part19.homework.task1and2;

import java.io.*;

public class MotorcycleApp {
    private static final String FILENAME = "moto.ser";

    public static void main(String[] args) {
        Motorcycle moto = new Motorcycle("Yamaha", "R1", new Engine(998, "RRR11111"));

        serializeMotorcycle(moto, FILENAME);
        Motorcycle deserializedMoto = deserializeMotorcycle(FILENAME);

        if (deserializedMoto != null) {
            System.out.println("Deserialized Motorcycle: " + deserializedMoto);
        }
    }

    private static void serializeMotorcycle(Motorcycle moto, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(moto);
            System.out.println("Motorcycle serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Motorcycle deserializeMotorcycle(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Motorcycle) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}