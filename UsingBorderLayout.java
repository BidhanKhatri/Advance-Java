import javax.swing.*;
import java.awt.*;

public class UsingBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(500,500);
        frame.setTitle("Flow Layout");

        frame.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("one"),BorderLayout.NORTH);
        frame.add(new JButton("two"),BorderLayout.WEST);
        frame.add(new JButton("three"),BorderLayout.EAST);
        frame.add(new JButton("four"),BorderLayout.SOUTH);
        frame.add(new JButton("five"),BorderLayout.CENTER);

        frame.setVisible(true);
    }
}