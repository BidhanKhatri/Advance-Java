import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class UsingCalculator implements ActionListener{

    JFrame jf;
    JTextField t1,t2,t3;
    JButton btnAdd, btnSub, btnMul, btnDiv;

    UsingCalculator(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);

        jf.add(t1);
        jf.add(t2);
        jf.add(t3);

        btnAdd = new JButton("Add");
        btnSub = new JButton("Sub");
        btnMul = new JButton("Mul");
        btnDiv = new JButton("Div");


        jf.add(btnAdd);
        jf.add(btnSub);
        jf.add(btnMul);
        jf.add(btnDiv);

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        jf.setVisible(true);

    }

    public static void main(String[] args) {
        UsingCalculator obj  = new UsingCalculator();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnAdd){
            //btnAdd.setBackground(Color.red); //--> use to set the background color of the butttons
            jf.getContentPane().setBackground(Color.green); // to make all background changed
        }
       else if(e.getSource() == btnSub){
            jf.getContentPane().setBackground(Color.red); // to make all background changed
        }
        else if(e.getSource() == btnMul){
            jf.getContentPane().setBackground(Color.blue); // to make all background changeg
        }


    }


}
