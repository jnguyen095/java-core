package main.java.com.khang.nguyen.factory.impl;

import main.java.com.khang.nguyen.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw()");
    }
}
