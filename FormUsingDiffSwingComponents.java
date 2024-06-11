import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormUsingDiffSwingComponents implements ActionListener {
    JFrame jf;
    JLabel L1, L2,L3,L4,L5;
    JTextField tf;
    JComboBox cb;
    JRadioButton r1, r2;
    JCheckBox cb1, cb2;
    JList myList;
    JButton b1;

    FormUsingDiffSwingComponents(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setTitle("Form UI");
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //code for JLabel and JTextField
        L1 = new JLabel("Name");
        jf.add(L1);
        tf = new JTextField(30);
        jf.add(tf);

        //code for JComboBox
        L2 = new JLabel("Faculty");
        jf.add(L2);
        String[] facultyNames = {"BCA","CSIT","BBM"}; // using array to store the multipe options name in JComboBox
        cb = new JComboBox(facultyNames);
        jf.add(cb);

        //code for JRadioButton
        L3 = new JLabel("Gender");
        jf.add(L3);
        r1= new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        jf.add(r1);
        jf.add(r2);

        //code for JCheckBox
        L4 = new JLabel("Hobbies");
        jf.add(L4);
        cb1 = new JCheckBox("Reading");
        cb2 = new JCheckBox("Travelling");
        jf.add(cb1);
        jf.add(cb2);

        //code for JList
        L5 = new JLabel("Languages");
        jf.add(L5);
        String[] addLanguage = {"English","Nepali","Java","JavaScript"};
        myList = new JList(addLanguage);
        jf.add(myList);

        b1 = new JButton("Add Information");
        jf.add(b1);
        b1.addActionListener(this);



        jf.setVisible(true);

    }

    public static void main(String[] args) {
        FormUsingDiffSwingComponents obj = new FormUsingDiffSwingComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = tf.getText();
        String faculty = cb.getSelectedItem().toString();

        String gender = "";
        if(r1.isSelected())
            gender = "Male";
        else
            gender = "Female";

        String hobbies = "";                    //checkbox ko value over ride huncha tei vayera use if if block
                if(cb1.isSelected())
                    hobbies = "Reading";
                if(cb2.isSelected())
                    hobbies += "Travelling";     // using += operator to concat the previous checkbox value.


        String langauge = myList.getSelectedValuesList().toString();

        System.out.println("Your name is " + name);
        System.out.println("Your faculty is " + faculty);
        System.out.println("Your gender is " + gender);
        System.out.println("Your langauge is " +langauge);
    }
}
