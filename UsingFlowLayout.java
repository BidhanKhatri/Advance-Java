import javax.swing.*;
import java.awt.*;

public class UsingFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(500,500);
        frame.setTitle("Flow Layout");

       // frame.setLayout(new FlowLayout()); //--> without parameter
        // frame.setLayout(new FlowLayout(FlowLayout.LEFT)); //--> with one parameter
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));

        frame.add(new JButton("one"));
        frame.add(new JButton("two"));
        frame.add(new JButton("three"));

        frame.setVisible(true);
    }
}
