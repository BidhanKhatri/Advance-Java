import javax.swing.*;
import java.awt.*;

public class myFrame{
    public static void main(String[] args){
        JFrame  jf = new JFrame(); //making obj of JFrame

        jf.setVisible(true); //it helps to show the frame

        jf.setSize(500,500); // set width and height

        jf.setTitle("Java UI with swing"); // helps to add title

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       jf.setLayout(new FlowLayout(FlowLayout.CENTER,20,40));


    }
}
