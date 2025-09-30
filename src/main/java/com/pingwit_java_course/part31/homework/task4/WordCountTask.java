package com.pingwit_java_course.part31.homework.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountTask implements Runnable {
    private final String filePath;

    public WordCountTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        int count = countWords(filePath);
        System.out.println("File: " + filePath + " — words: " + count);
    }

    private int countWords(String path) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+"); // trim() перед split() не обязателен - split("\\s+") и так уберет лишние пробелы.
                /*
                1. Всегда используем {} даже для однострочных блоков if, for, while и т.д.
                2. continue - это зло. Лучше не использовать
                3. words[0].isEmpty() - попробуй протестировать вариант с пустой строкой внутри файла, split("\\s+") должен убрать пробелы, поэтому words[0].isEmpty() лишняя
                 */
                if (words.length == 1 && words[0].isEmpty()) continue;
                count += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + path); // попробуй передать путь несуществующего файла в аргументах, чтобы увидеть ошибку, e.printStackTrace() покажется лишним
            e.printStackTrace();
        }
        return count;
    }
}