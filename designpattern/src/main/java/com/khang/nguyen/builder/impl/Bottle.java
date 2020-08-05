package main.java.com.khang.nguyen.builder.impl;

import main.java.com.khang.nguyen.builder.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
