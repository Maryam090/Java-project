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
public class CustomerHome extends JFrame
        implements ActionListener {

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
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private final JButton barberSearch;
    private final JButton viewBooking;
    private final JButton makeComplain;
    private final JButton logout;

    public CustomerHome() {
        setTitle("Cutomer Home");
        setBounds(300, 90, 500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Cutomer Home");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(140, 30);
        c.add(title);

        barberName = new JLabel("Barber Name:");
        barberName.setFont(new Font("Arial", Font.PLAIN, 20));
        barberName.setSize(300, 20);
        barberName.setLocation(100, 100);
        c.add(barberName);

        tbarberName = new JTextField();
        tbarberName.setFont(new Font("Arial", Font.PLAIN, 15));
        tbarberName.setSize(190, 20);
        tbarberName.setLocation(250, 100);
        c.add(tbarberName);

        barberLocation = new JLabel("Barber Location:");
        barberLocation.setFont(new Font("Arial", Font.PLAIN, 20));
        barberLocation.setSize(300, 20);
        barberLocation.setLocation(100, 150);
        c.add(barberLocation);

        tBarberLocation = new JTextField();
        tBarberLocation.setFont(new Font("Arial", Font.PLAIN, 15));
        tBarberLocation.setSize(190, 20);
        tBarberLocation.setLocation(250, 150);
        c.add(tBarberLocation);


        barberSearch = new JButton("Search");
        barberSearch.setFont(new Font("Arial", Font.PLAIN, 15));
        barberSearch.setSize(200, 20);
        barberSearch.setLocation(150, 200);
        barberSearch.addActionListener(this);
        c.add(barberSearch);

        viewBooking = new JButton("View Booking");
        viewBooking.setFont(new Font("Arial", Font.PLAIN, 15));
        viewBooking.setSize(200, 20);
        viewBooking.setLocation(150, 230);
        viewBooking.addActionListener(this);
        c.add(viewBooking);

        makeComplain = new JButton("Make Complaint");
        makeComplain.setFont(new Font("Arial", Font.PLAIN, 15));
        makeComplain.setSize(200, 20);
        makeComplain.setLocation(150, 260);
        makeComplain.addActionListener(this);
        c.add(makeComplain);
        
                logout = new JButton("Logout");
        logout.setFont(new Font("Arial", Font.PLAIN, 15));
        logout.setSize(100, 20);
        logout.setLocation(180, 260);
        logout.addActionListener(this);
        c.add(logout);

        


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
