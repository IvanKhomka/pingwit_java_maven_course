package com.pingwit_java_course.part6.homework.task8;

public class Sequence {
    public static void main(String[] args) {

        int maxLength = 0;
        int maxStartIndex = 0;
        int currentLength = 1;
        int currentStartIndex = 0;

        int[] array = {0, 0, 1, 1, 1};

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStartIndex = currentStartIndex;
                }
                currentLength = 1;
                currentStartIndex = i;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStartIndex = currentStartIndex;
        }

        if (array.length == 0) {
            System.out.println("Ваш массив пустой");
        } else {
            System.out.println("Количество элементов самой длинной последовательности: " + maxLength);
            System.out.println("Начинается с " + (maxStartIndex + 1) + "-го элемента (индекс " + maxStartIndex + ")");
        }
    }
}

