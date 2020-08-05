package main.java.com.khang.nguyen.singleton;

public class SingleObject {
    // Create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // Make the constructor private so that this class can not be instantiated
    private SingleObject(){

    }

    // Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Single Object");
    }
}
