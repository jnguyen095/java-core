package main.java.com.khang.nguyen.command;

/**
 * Concrete command
 */
public class Pizza implements Order {
    private PizzaChef chef;
    public Pizza(){
        chef = new PizzaChef();
    }
    @Override
    public void execute() {
        chef.makePizza();
    }

    @Override
    public String toString(){
        return "Pizza";
    }
}
