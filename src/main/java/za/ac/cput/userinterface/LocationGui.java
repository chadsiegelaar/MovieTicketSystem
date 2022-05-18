package za.ac.cput.userinterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LocationGui extends JFrame {
    private JPanel Main;
    private JTextField textBldname;
    private JTextField textRmnum;
    private JTextField textStscn;
    private JTextField textStnum;
    private JButton previousButton;
    private JButton nextButton;

    public LocationGui() {

        setContentPane(Main);
        setTitle("Cinema");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MovieGui movieScreen = new MovieGui();
                movieScreen.setVisible(true);
            }
        });

    }



    public static void main(String[] args) {
        LocationGui run = new LocationGui();

    }
}
