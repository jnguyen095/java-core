package main.java.com.khang.nguyen.factory.impl;

import main.java.com.khang.nguyen.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle draw()");
    }
}
