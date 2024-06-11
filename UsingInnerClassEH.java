import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class UsingInnerClassEH{

    JFrame jf;
    JTextField t1;
    JButton btnAdd;

    UsingInnerClassEH(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setTitle("Using Inner Class Event Handling");
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(20);
        jf.add(t1);

        btnAdd = new JButton("Add");
        jf.add(btnAdd);

        btnAdd.addActionListener(new HandleEvent()); // inner class ko object pass garem instead od this


        jf.setVisible(true);

    }

    public static void main(String[] args) {
        UsingInnerClassEH obj  = new UsingInnerClassEH();
    }

    //creating inner class for adding event handling
    class HandleEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText("Inner class Event Handle");
        }
    }



}
