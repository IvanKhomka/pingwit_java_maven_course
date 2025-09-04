package com.pingwit_java_course.part31.homework.task5;

public class CodeRefactor {
    public static void main(String[] args) {
        Website website = new Website("https://www.uefa.com", WebsiteType.NEWS);

        String url = website.getUrl();
        WebsiteType type = website.getType();

        System.out.println(url);
        System.out.println(type);
    }
}