package com.pingwit_java_course.part14.homework.task3;

public class DotsReplace {
    public static void main(String[] args) {
        String defaultText = "Green. red. blue. yellow";
        String modifiedStr = defaultText.replace('.', ',');

        System.out.println("Default string: " + defaultText);
        System.out.println("Modified string: " + modifiedStr);
    }
}