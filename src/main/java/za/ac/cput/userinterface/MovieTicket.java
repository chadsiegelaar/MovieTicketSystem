/* MovieTicket.java
 User Interface for the MovieTicket
 Author: Chad Siegelaar (218340982)
 Date: 16 April 2022
*/

package za.ac.cput.userinterface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class MovieTicket extends JFrame implements ActionListener {
    private JPanel pNorth, pCenter, pSouth, pEast;
    private JTextField txtFirst, txtLast;
    private JLabel lblLogo, lblFirst, lblLast, lblTitle, lblMovieName, lblCinema, lblDay, lblTime, lblVenue;
    private JComboBox cBoxMovie, cBoxCinema, cBoxDay, cBoxTime, cBoxVenue;
    private String[] movie = {"", "Spider-Man", "Toy Story", "Fast and Furious"};

    private String[] cinema = {"", "2D", "3D", "IMAX"};

    private String[] day = {"","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private String[] time = {"", "9h15", "12h25", "15h35", "18h45"};
    private String[] venue = {"", "City", "Goodwood", "Claremont", "Muizenberg"};
    private JButton bBack, bNext, bExit;

    private JTextArea  receipt;
    private Font ft1, ft2;

    public MovieTicket() {
        super("Movie Ticket");
        pNorth = new JPanel();
        pCenter = new JPanel();
        pSouth = new JPanel();
        pEast = new JPanel();
        lblLogo =  new JLabel(new ImageIcon("film.png"));

        lblTitle = new JLabel("Movie Ticket");
        lblFirst = new JLabel("First Name");
        lblLast = new JLabel("Last Name");
        lblCinema = new JLabel("Cinema");
        lblMovieName = new JLabel("Movie Name");
        lblDay = new JLabel("Day");
        lblTime = new JLabel("Time");
        lblVenue = new JLabel("Venue");

        txtFirst = new JTextField();
        txtLast = new JTextField();

        cBoxMovie = new JComboBox(movie);
        cBoxCinema = new JComboBox(cinema);
        cBoxDay = new JComboBox(day);
        cBoxTime = new JComboBox(time);
        cBoxVenue = new JComboBox(venue);

        bBack = new JButton("Back");
        bNext = new JButton("Print");
        bExit = new JButton("Exit");

        receipt = new JTextArea();
        receipt.setText( "-- RECEIPT --\n\n" +
                "MOVIE:\n\n" +
                "FIRST NAME:\n\n" +
                "LAST NAME:\n\n" +
                "CINEMA:\n\n" +
                "DAY:\n\n" +
                "TIME:\n\n" +
                "VENUE:\n\n" +
                "-- THANK YOU! --" );

        ft1 = new Font("Monospaced", Font.BOLD, 36);
        ft2 = new Font("Monospaced", Font.BOLD, 16);
    }

    public void setMovieTicketGUI() {
        this.setVisible(true);
        this.setSize(900, 510);

        pNorth.setLayout(new FlowLayout());
        pCenter.setLayout(new GridLayout(7, 2));
        pSouth.setLayout(new GridLayout(1, 3));
        pEast.setLayout(new FlowLayout());


        //panel North
        pNorth.setBackground(new Color (242, 231, 29));
        pNorth.add(lblTitle);
        pNorth.add(lblLogo);
        lblTitle.setFont(ft1);
        lblTitle.setForeground(Color.black);

        //panel Center
        pCenter.setBackground(new Color (242, 231, 29));
        pCenter.add(lblMovieName);
        pCenter.add(cBoxMovie);
        pCenter.add(lblFirst);
        pCenter.add(txtFirst);
        pCenter.add(lblLast);
        pCenter.add(txtLast);
        pCenter.add(lblCinema);
        pCenter.add(cBoxCinema);
        pCenter.add(lblDay);
        pCenter.add(cBoxDay);
        pCenter.add(lblTime);
        pCenter.add(cBoxTime);
        pCenter.add(lblVenue);
        pCenter.add(cBoxVenue);

        //panelSouth
        pSouth.add(bBack);
        pSouth.add(bNext);
        pSouth.add(bExit);
        pEast.add(receipt);
        bBack.setForeground(new Color (242, 231, 29));
        bBack.setBackground(new Color (0, 0, 0));
        bNext.setForeground(new Color (242, 231, 29));
        bNext.setBackground(new Color (0, 0, 0));
        bExit.setForeground(new Color (242, 231, 29));
        bExit.setBackground(new Color (0, 0, 0));


        lblMovieName.setFont(ft2);
        lblCinema.setFont(ft2);
        lblFirst.setFont(ft2);
        lblLast.setFont(ft2);
        lblDay.setFont(ft2);
        lblTime.setFont(ft2);
        lblVenue.setFont(ft2);

        this.add(pNorth, BorderLayout.NORTH);
        this.add(pCenter, BorderLayout.CENTER);
        this.add(pSouth, BorderLayout.SOUTH);
        this.add(pEast, BorderLayout.EAST);

        bBack.addActionListener(this);
        bNext.addActionListener(this);
        bExit.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    //Methods for Receipt
    public String getTxtFirst() {
        return txtFirst.getText();
    }

    public String getTxtLast() {
        return txtLast.getText();
    }

    public String getMovie() {
        return cBoxMovie.getEditor().getItem().toString();
    }

    public String getCinema() { return cBoxCinema.getEditor().getItem().toString();
    }

    public String getDay() {
        return cBoxDay.getEditor().getItem().toString();
    }

    public String getTime() {
        return cBoxTime.getEditor().getItem().toString();
    }

    public String getVenue() {
        return cBoxVenue.getEditor().getItem().toString();
    }

    public void setTxtFirst( String s ) {
        receipt.setText( s );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back")) {


        } else if (e.getActionCommand().equals("Print")) {

            String name = getTxtFirst();
            String movie = getMovie();
            String lname = getTxtLast();
            String cinema = getCinema();
            String day = getDay();
            String time = getTime();
            String venue = getVenue();
            setTxtFirst( "-- RECEIPT --\n\n" +
                    "MOVIE: " + movie + "\n\n" +
                    "FIRST NAME: " + name + "\n\n" +
                    "LAST NAME: " + lname + "\n\n" +
                    "CINEMA: " + cinema + "\n\n" +
                    "DAY: " + day + "\n\n" +
                    "TIME: " + time + "\n\n" +
                    "VENUE: " + venue + "\n\n" +
                    "-- THANK YOU! --" );
            JOptionPane.showMessageDialog(this, "Processing receipt");

        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MovieTicket().setMovieTicketGUI();
    }
}