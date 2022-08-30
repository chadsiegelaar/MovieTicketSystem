package za.ac.cput.userinterface;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MovieGui extends JFrame{
    private JPanel Main;
    private JLabel Movie;
    private JComboBox MovieTitle;
    private JLabel Title;
    private JLabel Ratings;
    private JTextField textRatings;
    private JLabel Genre;
    private JTextField textGenre;
    private JLabel RYear;
    private JTextField textReleaseYear;
    private JLabel RunningTime;
    private JTextField textRunTime;
    private JLabel Director;
    private JTextField textDirector;
    private JLabel Description;
    private JTextArea MovieDescription;
    private JButton selectButton;
    private JButton nextButton;
    private JButton previousButton;
 //   LocationGui locationScreen = new LocationGui();
    ////////////////////////////////////////////////////////
    //Creating Movie titles
    String[] Titles={};
public void populateTitle() {
    List<String> ttl = new ArrayList<>();
    ttl.add("");
    ttl.add("Morbius");
    ttl.add("The Lost City");
    ttl.add("The NorthMan");
    for (int i = 0; i < ttl.size(); i++) {
        MovieTitle.addItem(ttl.get(i));
    }
}
///////////////////////////////////////////
    //Clearing fields
    public void ClearFields() {
        if (MovieTitle.getSelectedItem() == "") {
            textDirector.setText("");
            textRatings.setText("");
            textGenre.setText("");
            textRunTime.setText("");
            textReleaseYear.setText("");
            MovieDescription.setText("");
        }
    }
////////////////////////////////////
    //Movie Information
  public void Movieinfo() {
      if (MovieTitle.getSelectedItem() == "Morbius") {
          textDirector.setText(" Daniel Espinosa");
          textRatings.setText("7.1");
          textGenre.setText("Sci-Fi");
          textRunTime.setText("2h 25mn");
          textReleaseYear.setText("2022");
          MovieDescription.setText("Biochemist Michael Morbius" + "n/tries to cure himself of a rare blood disease, " +
                  "but he inadvertently infects himself with a form of vampirism instead.");
      }

      if (MovieTitle.getSelectedItem() == "The Lost City") {
          textDirector.setText(" Aaron Nee");
          textRatings.setText("6.3");
          textGenre.setText("Advanture");
          textRunTime.setText("1h 52mn");
          textReleaseYear.setText("2022");
          MovieDescription.setText("A reclusive romance novelist on a book tour with her cover model gets" +
                  " swept up in a kidnapping attempt that lands them both in a cutthroat jungle adventure.");
      }
      if (MovieTitle.getSelectedItem() == "The NorthMan") {
          textDirector.setText("Robert Eggers");
          textRatings.setText("7.5");
          textGenre.setText("Fantasy");
          textRunTime.setText("2h 17min");
          textReleaseYear.setText("2022");
          MovieDescription.setText("Prince Amleth is on the verge of becoming a man when his father " +
                  "is brutally murdered by his uncle, who kidnaps the boy's mother. Two decades later," +
                  " Amleth is now a Viking " +
                  "who's on a mission to save his mother, kill his uncle and avenge his father");
      }






}
    public MovieGui() {
//////////////////////////////////////////////////////
        setContentPane(Main);
        setTitle("Movie Selection");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


/////////////////////////////////////////////////////////
         //Calling populateMethod
        ClearFields();
        populateTitle();
       // MovieTitle = new JComboBox(Titles);


////////////////////////////////////////////////////////
        selectButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(MovieTitle.getSelectedItem()== ""){
                    JOptionPane.showMessageDialog(null,"Movie Not selected Please Select Movie");
                }
                else
                    JOptionPane.showMessageDialog(null,"Movie Selected");
            }


        });

 /////////////////////////////////////////////////////////////
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocationGui locationScreen = new LocationGui();

            }
        });

        MovieTitle.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                ClearFields();
               Movieinfo();
              MovieTitle.getAction();

            }

        });
    }

    public static void main(String[] args) {
        MovieGui run = new MovieGui();
    }
}
