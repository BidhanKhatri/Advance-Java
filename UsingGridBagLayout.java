import javax.swing.*;
import java.awt.*;

public class UsingGridBagLayout {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout gl = new GridBagLayout(); //creating GridBagLayout obj
        jf.setLayout(gl);                       //setting layout to jf (frame)

        GridBagConstraints gbc = new GridBagConstraints(); //making helper obj for adding gridx, gridy

        gbc.gridx = 0;
        gbc.gridy = 0;
        jf.add(new JButton("1"),gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        jf.add(new JButton("2"),gbc);


        gbc.gridx=0;
        gbc.gridy=2;
        gbc.ipadx=6;                            //use to fill space in X-axis
        gbc.ipady=6;                            //use to fill space in Y-axis
        gbc.gridwidth=2;
        gbc.gridheight=2;
        gbc.fill=GridBagConstraints.BOTH;       //It should be added compulsory
        jf.add(new JButton("3"),gbc);

        gbc.gridx=0;
        gbc.gridy=4;
        gbc.ipadx=0;
        gbc.ipady=0;
        jf.add(new JButton("4"),gbc);


        jf.setVisible(true);
    }
}
