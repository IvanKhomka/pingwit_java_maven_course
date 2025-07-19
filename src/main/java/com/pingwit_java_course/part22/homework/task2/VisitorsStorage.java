package com.pingwit_java_course.part22.homework.task2;

import java.time.LocalDate;

public class VisitorsStorage {
    private String visitorName;
    private String websiteName;
    private LocalDate date;

    public VisitorsStorage(String visitorName, String websiteName, LocalDate date) {
        this.visitorName = visitorName;
        this.websiteName = websiteName;
        this.date = date;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public LocalDate getDate() {
        return date;
    }
}