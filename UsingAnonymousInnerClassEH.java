import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class UsingAnonymousInnerClassEH{

    JFrame jf;
    JTextField t1;
    JButton btnAdd;

    UsingAnonymousInnerClassEH(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setTitle("Anonymous Inner Class");
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(20);
        jf.add(t1);

        btnAdd = new JButton("Add");
        jf.add(btnAdd);


        //Event register garda nai event handle garni lie anonymous inner class vanincha
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              t1.setText("Anonymous Inner class EventHandel");
            }
        });


        jf.setVisible(true);

    }

    public static void main(String[] args) {
        UsingAnonymousInnerClassEH obj  = new UsingAnonymousInnerClassEH();
    }




}
