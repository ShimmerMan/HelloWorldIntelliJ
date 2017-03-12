package test;

/**
 * Main class to print out Hello World in a manner of ways.
 * Created by Jeremy on 3/5/2017.
 */



public class Main {

    public static HelloWorldPrinter printer;

    public static void main(String[] args) {
        printer = new HelloWorldPrinter();
        System.out.println("Hello World");
	    printer.printHello();
	    HelloWorldPrinterGuiForm printerGui = new HelloWorldPrinterGuiForm();
	    printerGui.main();
    }
}
