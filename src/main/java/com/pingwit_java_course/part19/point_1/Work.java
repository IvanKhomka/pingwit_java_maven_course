package com.pingwit_java_course.part19.point_1;

import java.io.Serializable;

public class Work implements Serializable {
    private String workName;

    public Work(String workName) {
        this.workName = workName;
    }

    @Override
    public String toString() {
        return "Work{" +
                "workName='" + workName + '\'' +
                '}';
    }
}