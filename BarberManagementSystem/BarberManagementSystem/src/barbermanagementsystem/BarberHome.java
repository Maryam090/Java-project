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
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author SSC
 */
public class BarberHome extends JFrame
        implements ActionListener {
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private final JButton barberSearch;
    private final JButton viewBooking;
    private final JButton makeComplain;
    private final JButton logout;

    private Container c;
    private JLabel title;
    private JLabel barberName;
    private JTextField tbarberName;
    private JLabel barberLocation;
    private JTextField tBarberLocation;
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

    public BarberHome()
    {
                setTitle("Barber Home");
        setBounds(300, 90, 500, 290);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Barber Home");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(140, 30);
        c.add(title);



        barberSearch = new JButton("View Appoiyments");
        barberSearch.setFont(new Font("Arial", Font.PLAIN, 15));
        barberSearch.setSize(200, 20);
        barberSearch.setLocation(150, 90);
        barberSearch.addActionListener(this);
        c.add(barberSearch);

        viewBooking = new JButton("Set Status");
        viewBooking.setFont(new Font("Arial", Font.PLAIN, 15));
        viewBooking.setSize(200, 20);
        viewBooking.setLocation(150, 120);
        viewBooking.addActionListener(this);
        c.add(viewBooking);

        makeComplain = new JButton("Set Availabilty");
        makeComplain.setFont(new Font("Arial", Font.PLAIN, 15));
        makeComplain.setSize(200, 20);
        makeComplain.setLocation(150, 150);
        makeComplain.addActionListener(this);
        c.add(makeComplain);
        
                logout = new JButton("Logout");
        logout.setFont(new Font("Arial", Font.PLAIN, 15));
        logout.setSize(200, 20);
        logout.setLocation(150, 180);
        logout.addActionListener(this);
        c.add(logout);

        


        setVisible(true);


    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
