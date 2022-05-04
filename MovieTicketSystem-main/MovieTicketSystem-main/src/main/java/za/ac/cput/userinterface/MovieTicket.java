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
    private JPanel pNorth, pCenter, pSouth;
    private JLabel lblTitle, lblMovieName, lblCinema, lblDay, lblTime, lblVenue;
    private JComboBox cBoxMovie, cBoxCinema, cBoxDay, cBoxTime, cBoxVenue;
    private String[] movie = {"Spider-Man", "Toy Story", "Fast and Furious"};
    private String[] cinema = {"2D", "3D", "IMAX"};
    private String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private String[] time = {"9h15", "12h25", "15h35", "18h45"};
    private String[] venue = {"City", "Goodwood", "Claremont", "Muizenberg"};
    private JButton bBack, bNext, bExit;
    private Font ft1;

    public MovieTicket() {
        super("Movie Ticket");
        pNorth = new JPanel();
        pCenter = new JPanel();
        pSouth = new JPanel();

        lblTitle = new JLabel("Movie Ticket");
        lblCinema = new JLabel("Cinema");
        lblMovieName = new JLabel("Movie Name");
        lblDay = new JLabel("Day");
        lblTime = new JLabel("Time");
        lblVenue = new JLabel("Venue");

        cBoxMovie = new JComboBox(movie);
        cBoxCinema = new JComboBox(cinema);
        cBoxDay = new JComboBox(day);
        cBoxTime = new JComboBox(time);
        cBoxVenue = new JComboBox(venue);

        bBack = new JButton("Back");
        bNext = new JButton("Next");
        bExit = new JButton("Exit");

        ft1 = new Font("Arial", Font.BOLD, 25);
    }

    public void setMovieTicketGUI () {
        this.setVisible(true);
        this.setSize(900, 400);

        pNorth.setLayout(new FlowLayout());
        pCenter.setLayout(new GridLayout(5, 2));
        pSouth.setLayout(new GridLayout(1, 3));

        //panel North
        pNorth.add(lblTitle);
        lblTitle.setFont(ft1);

        //panel Center
        pCenter.add(lblMovieName);
        pCenter.add(cBoxMovie);
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

        this.add(pNorth, BorderLayout.NORTH);
        this.add(pCenter, BorderLayout.CENTER);
        this.add(pSouth, BorderLayout.SOUTH);

        bBack.addActionListener(this);
        bNext.addActionListener(this);
        bExit.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back")) {

        } else if (e.getActionCommand().equals("Next")) {


        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MovieTicket().setMovieTicketGUI();

    }


}