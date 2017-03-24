package test;

/**
 * A class dedicated to providing a function to print out Hello World.
 * Created by Jeremy on 3/5/2017.
 */
public class HelloWorldPrinter {

    private String helloWorldText;

    public HelloWorldPrinter(String helloWorldText) {
        this.helloWorldText = helloWorldText;
    }

    public String getHelloWorldText() {
        return helloWorldText;
    }

    public void printHello() {
        System.out.println("Hello World from Class");
    }

    public String getHello() {
        return ("Get Hello World from Class");
    }
}
