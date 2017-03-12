package test;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jeremy on 3/12/2017.
 */
public class HelloWorldPrinterGuiForm {
    private JButton buttonPrinter;
    private JPanel panelMain;

    private HelloWorldPrinter printer = new HelloWorldPrinter();

    public HelloWorldPrinterGuiForm() {
        buttonPrinter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, printer.getHello());
            }
        });
    }

    public static void main() {
        JFrame frame = new JFrame("HelloWorldPrinterFrame");
        frame.setContentPane(new HelloWorldPrinterGuiForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
