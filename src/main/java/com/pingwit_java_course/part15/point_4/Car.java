package com.pingwit_java_course.part15.point_4;

import java.io.IOException;

public interface Car {
    boolean start() throws MyCustomException, IOException;
    boolean stop() throws RuntimeException;
}
