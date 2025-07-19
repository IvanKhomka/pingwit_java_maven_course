package com.pingwit_java_course.part14.homework.task4;

public class ContentOfWords {
    public static void main(String[] args) {
        String text = """
                While major gameplay components,
                are already in place and functioning, players help is needed to add some
                of the smaller features and content. Of course polishing the overall experience is important
                at the same time. Game has been extensively tested in closed group, but it is always important
                to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to
                make the game as good as possible but without compromising the core idea.
                """;

        int alertCount = countWordOccurrences(text, "alert");
        int addCount = countWordOccurrences(text, "add");
        int goodCount = countWordOccurrences(text, "good");
        int planCount = countWordOccurrences(text, "plan");

        System.out.println("The word 'alert' meets " + alertCount + " times");
        System.out.println("The word 'add' meets " + addCount + " times");
        System.out.println("The word 'good' meets " + goodCount + " times");
        System.out.println("The word 'plan' meets " + planCount + " times");
    }

    public static int countWordOccurrences(String text, String targetWord) {
        String[] words = text.toLowerCase().split(" ");
        targetWord = targetWord.toLowerCase();
        int count = 0;

        for (String word : words) {
            if (word.contains(targetWord)) {
                count++;
            }
        }
        return count;
    }
}