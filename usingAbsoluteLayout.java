
import javax.swing.*;
import java.awt.*;

public class usingAbsoluteLayout {

    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setSize(500,500);
        jf.setTitle("Using Absolute Layout");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(null); //this is mandatory otherwise it uses border layout as default layout

        //main concept starts from here
        JLabel L1 = new JLabel("Name");
        L1.setBounds(20,20,80,25);
        jf.add(L1);

        JTextField t1= new JTextField();
        t1.setBounds(110,20,160,25);
        jf.add(t1);
        //main concept ends here, repeat for all

        JLabel L2 = new JLabel("Age");
        L2.setBounds(20,55,80,25);
        jf.add(L2);

        JTextField t2= new JTextField();
        t2.setBounds(110,55,100,25);
        jf.add(t2);

        JLabel L3 = new JLabel("Address");
        L3.setBounds(20,95,80,25);
        jf.add(L3);

        JTextField t3= new JTextField();
        t3.setBounds(110,95,160,25);
        jf.add(t3);

        jf.add(new JButton("submit")).setBounds(110,150,80,25);

        jf.setVisible(true);
    }
}
