package main.java.com.khang.nguyen.command;

/**
 * Concrete command
 */
public class Steak implements Order {
    SteakChef chef;
    public Steak(){
        chef = new SteakChef();
    }

    @Override
    public void execute() {
        chef.makeSteak();
    }

    @Override
    public String toString(){
        return "Steak";
    }
}
