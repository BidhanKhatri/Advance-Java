import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;


public class MultipleEventHandling implements ActionListener {      //it is a interface, so implements use garera ActionListner use garem

    JFrame jf;
    JButton b1;
    JButton b2;
    JTextField t1;

    //creating constructor to design UI or frame and calling it in main method
    MultipleEventHandling(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("Multiple Event Handling");
        jf.setLayout(new FlowLayout());

        t1 = new JTextField(20);
        b1 = new JButton("Ok");
        b2 = new JButton("Clear");
        jf.add(t1);
        jf.add(b1);
        jf.add(b2);

        b1.addActionListener(this); // yo last ma garem kun btn ma click gareko ho bhanera thapauna
        b2.addActionListener(this);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        MultipleEventHandling obj = new MultipleEventHandling();
    }

    //Action Listener kai default method ho so hamle yo ActionListener ko method lie override garem.
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            t1.setText("Hello");
        }else{
            t1.setText("");
        }
    }
}

