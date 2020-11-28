/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbermanagementsystem;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author SSC
 */
public class SignUp extends JFrame
        implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel fullName;
    private JTextField tfullName;
    private JLabel phoneNumber;
    private JTextField tphoneNumber;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox signupcategory;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String signUpOptions[]
            = {"As Barber", "As Customer"};
    private String months[]
            = {"Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec"};
    private String years[]
            = {"1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019"};
    private final JButton login;
    private final JButton signUp;
    private final JTextField tlocation;
    private final JLabel location;
    private JLabel password;
    private final JTextField tPassword;
    private final JLabel email;
    private final JTextField temail;

    public SignUp() {

        setTitle("Registration Form");
        setBounds(300, 90, 900, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Sign Up Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(330, 30);
        c.add(title);

        dob = new JLabel("Sign Up As ");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(200, 20);
        dob.setLocation(280, 100);
        c.add(dob);

        signupcategory = new JComboBox(signUpOptions);
        signupcategory.setFont(new Font("Arial", Font.PLAIN, 15));
        signupcategory.setSize(250, 20);
        signupcategory.setLocation(420, 100);
        signupcategory.addActionListener(this);
        c.add(signupcategory);

        fullName = new JLabel("Full Name");
        fullName.setFont(new Font("Arial", Font.PLAIN, 20));
        fullName.setSize(100, 20);
        fullName.setLocation(100, 150);
        c.add(fullName);

        tfullName = new JTextField();
        tfullName.setFont(new Font("Arial", Font.PLAIN, 15));
        tfullName.setSize(190, 20);
        tfullName.setLocation(200, 150);
        c.add(tfullName);

        phoneNumber = new JLabel("Phone Number");
        phoneNumber.setFont(new Font("Arial", Font.PLAIN, 20));
        phoneNumber.setSize(250, 20);
        phoneNumber.setLocation(410, 150);
        c.add(phoneNumber);

        tphoneNumber = new JTextField();
        tphoneNumber.setFont(new Font("Arial", Font.PLAIN, 15));
        tphoneNumber.setSize(190, 20);
        tphoneNumber.setLocation(600, 150);
        c.add(tphoneNumber);

        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(100, 20);
        email.setLocation(100, 200);
        c.add(email);

        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 20);
        temail.setLocation(200, 200);
        c.add(temail);

        password = new JLabel("Password ");
        password.setFont(new Font("Aria", Font.PLAIN, 20));
        password.setSize(100, 20);
        password.setLocation(410, 200);
        c.add(password);

        tPassword = new JTextField();
        tPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tPassword.setSize(190, 20);
        tPassword.setLocation(600, 200);
        c.add(tPassword);

        location = new JLabel("Location ");
        location.setFont(new Font("Aria", Font.PLAIN, 20));
        location.setSize(100, 20);
        location.setLocation(300, 250);
        c.add(location);

        tlocation = new JTextField();
        tlocation.setFont(new Font("Arial", Font.PLAIN, 15));
        tlocation.setSize(250, 20);
        tlocation.setLocation(450, 250);
        c.add(tlocation);

        signUp = new JButton("Sign Up");
        signUp.setFont(new Font("Arial", Font.PLAIN, 15));
        signUp.setSize(160, 20);
        signUp.setLocation(250, 300);
        signUp.addActionListener(this);
        c.add(signUp);

        login = new JButton("Login");
        login.setFont(new Font("Arial", Font.PLAIN, 15));
        login.setSize(160, 20);
        login.setLocation(470, 300);
        login.addActionListener(this);
        c.add(login);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.signupcategory) {
            if (this.signupcategory.getSelectedIndex() == 0) {
                this.location.show();
                this.tlocation.show();

            } else {
                this.location.hide();
                this.tlocation.hide();
            }
        } else if (e.getSource() == login) {
            this.hide();
            new Login();
        }
        else if(e.getSource()==signUp)
        {
        }

    }

}
