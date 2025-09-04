package com.pingwit_java_course.part31.homework.task5;

public class Website {
    private String url;
    private WebsiteType type;

    public Website(String url, WebsiteType type) {
        this.url = url;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public WebsiteType getType() {
        return type;
    }
}