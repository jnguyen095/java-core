package main.java.com.khang.nguyen.builder.impl;

import main.java.com.khang.nguyen.builder.Item;
import main.java.com.khang.nguyen.builder.Packing;

public class Coke implements Item {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 15f;
    }

    @Override
    public String toString(){
        return "Name: " + this.name() + ", price: " + this.price() + ", packing: " + this.packing().pack();
    }
}
