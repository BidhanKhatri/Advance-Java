import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;


public class EventHandling implements ActionListener {      //it is a interface, so implements use garera ActionListner use garem

    JFrame jf;
    JButton b1;
    JTextField t1;

    //creating constructor to design UI or frame and calling it in main method
    EventHandling(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        t1 = new JTextField(20);
        b1 = new JButton("Ok");
        jf.add(t1);
        jf.add(b1);

        b1.addActionListener(this); // yo last ma garem kun btn ma click gareko ho bhanera thapauna

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        EventHandling obj = new EventHandling();
    }

    //Action Listener kai default method ho so hamle yo ActionListener ko method lie override garem.
    public void actionPerformed(ActionEvent e){
        t1.setText("You clicked the button");
    }
}

