package test;

/**
 * Main class to print out Hello World in a manner of ways.
 * Created by Jeremy on 3/5/2017.
 */



public class Main {

    private static HelloWorldPrinter printer = new HelloWorldPrinter("I am Hello World");
    private static HelloWorldPrinterGuiForm printerGui = new HelloWorldPrinterGuiForm();

    public static void main(String[] args) {
        System.out.println("Hello World");

	    printer.printHello();
	    System.out.println(printer.getHelloWorldText());

	    printerGui.main();
    }
}
