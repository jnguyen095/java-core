package main.java.com.khang.nguyen;

import main.java.com.khang.nguyen.builder.impl.Burger;
import main.java.com.khang.nguyen.builder.impl.Coke;
import main.java.com.khang.nguyen.command.Customer;
import main.java.com.khang.nguyen.command.Waiter;
import main.java.com.khang.nguyen.commandbus.CommandBusInterface;
import main.java.com.khang.nguyen.commandbus.RegisterUser;
import main.java.com.khang.nguyen.prototype.Rectangle;
import main.java.com.khang.nguyen.prototype.Square;
import main.java.com.khang.nguyen.singleton.SingleObject;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
    public static void main(String[] args){
        //testSingleton();
        //testBuilder();
        //testPrototype();
        //testFactory();
        testCommand();
    }

    private static void testSingleton(){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }

    private static void testFactory(){
        main.java.com.khang.nguyen.factory.impl.Rectangle rectangle = new main.java.com.khang.nguyen.factory.impl.Rectangle();
        rectangle.draw();
        main.java.com.khang.nguyen.factory.impl.Square square = new main.java.com.khang.nguyen.factory.impl.Square();
        square.draw();
    }

    private static void testPrototype(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");

        Square square = new Square();
        rectangle.setId("2");

        System.out.println(rectangle.getType());
        rectangle.draw();
        System.out.println(square.getType());
        square.draw();
    }

    private static void testBuilder(){
        Burger burger = new Burger();
        Coke coke = new Coke();

        System.out.println(burger.toString());
        System.out.println(coke.toString());
    }

    private static void testCommand(){
        Waiter waiter = new Waiter();
        Customer customer = new Customer(waiter);
        customer.request("pizza");
        customer.request("steak");
    }

    private static void testCommandBus(){
        RegisterUser command = new RegisterUser("Khang", "123456");

    }

}
