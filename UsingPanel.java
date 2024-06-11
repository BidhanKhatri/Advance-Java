import javax.swing.*;
import java.awt.*;

public class UsingPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(500,500);
        frame.setTitle("Flow Layout");

//        frame.setLayout(new FlowLayout(FlowLayout.CENTER,15,15)); //default layout of panel is FlowLayout
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();

        panel.add(new JButton("one"));
        panel.add(new JButton("two"));
        panel.add(new JButton("three"));
        panel.add(new JButton("four"));
        frame.add(panel,BorderLayout.SOUTH);
        frame.add(new JButton("five"),BorderLayout.CENTER);


        frame.setVisible(true);
    }
}