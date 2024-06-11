import javax.swing.*;
import java.awt.*;

public class UsingGridLayout {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setSize(500,500);
        jf.setTitle("Using GridLayout");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Constructors used in GridLayout.
        //jf.setLayout(new GridLayout()); //--> makes infinite columns.
        //jf.setLayout(new GridLayout(2,2)); // --> create specific rows and columns.
        jf.setLayout(new GridLayout(2,2,5,5)); // --> add horizontal and vertical gaps.

        jf.add(new JButton("1"));
        jf.add(new JButton("2"));
        jf.add(new JButton("3"));

        jf.setVisible(true);
    }
}
