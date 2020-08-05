package main.java.com.khang.nguyen.builder.impl;

import main.java.com.khang.nguyen.builder.Item;
import main.java.com.khang.nguyen.builder.Packing;

public class Burger implements Item {
    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 12f;
    }

    @Override
    public String toString(){
        return "Name: " + this.name() + ", price: " + this.price() + ", packing: " + this.packing().pack();
    }
}
