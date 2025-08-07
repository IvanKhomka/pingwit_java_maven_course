package com.pingwit_java_course.part29.homework.task1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

public class AtmObjectsDeserialization {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Optional<InputStream> inputStreamOptional = Optional.ofNullable(ClassLoader.getSystemResourceAsStream("part29/homework/task_1/atms.json"));

        List<Atm> atms = inputStreamOptional
                .map(is -> { // из минусов Optional - это checked исключения, которые вот так приходится обрабатывать. НО обычно такую конструкцию просто выносят в приватный метод и получается красивенько
                    try {
                        return mapper.readValue(is, new TypeReference<List<Atm>>() {
                        });
                    } catch (IOException e) {
                        throw new RuntimeException("Error reading JSON", e);
                    }
                })
                .orElseThrow(() -> new RuntimeException("File atms.json not found"));

        atms.forEach(System.out::println);
        /*InputStream inputStream = ClassLoader.getSystemResourceAsStream("part29/homework/task_1/atms.json");
        if (inputStream == null) {
            System.err.println("File atms.json not found.");
            return;
        }
        List<Atm> atms = mapper.readValue(inputStream, new TypeReference<>() {
        });
        for (Atm atm : atms) {
            System.out.println(atm);
        }*/
    }
}