package za.ac.cput.userinterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MovieGui extends JFrame {
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
    private JTextField searchField;
    private JButton searchButton;
    private JComboBox ReleaseYBox;
    private JComboBox GenreBox;
    private JButton Clearbutton;
    //   LocationGui locationScreen = new LocationGui();
    ////////////////////////////////////////////////////////
    //Creating Movie titles
    String[] Titles = {};

    public void populateTitle() {
        List<String> ttl = new ArrayList<>();
        ttl.add("");
        ttl.add("Morbius");
        ttl.add("The Lost City");
        ttl.add("The NorthMan");
        ttl.add("Watcher");
        ttl.add("The Man from Toronto");
        ttl.add("Brian and Charles");
        ttl.add("Row 19");
        for (int i = 0; i < ttl.size(); i++) {

            MovieTitle.addItem(ttl.get(i));
        }
    }

    public void gensect() {
        if (GenreBox.getSelectedItem() == "Action") {
            MovieTitle.removeAllItems();
            MovieTitle.addItem("");
            MovieTitle.addItem("The NorthMan");
            MovieTitle.addItem("The Man from Toronto");
            MovieTitle.addItem("The Lost City");
        }
        if (GenreBox.getSelectedItem() == "Comedy") {
            MovieTitle.removeAllItems();
            MovieTitle.addItem("");
            MovieTitle.addItem("Brian and Charles");
            MovieTitle.addItem("The Man from Toronto");

        }
        if (GenreBox.getSelectedItem() == "Horror") {
            MovieTitle.removeAllItems();
            MovieTitle.addItem("");
            MovieTitle.addItem("Row 19");
            MovieTitle.addItem("Watcher");
            MovieTitle.addItem("Morbius");

        }
    }

    public void yearselect() {
        if (ReleaseYBox.getSelectedItem() == "2022") {
            MovieTitle.removeAllItems();
            MovieTitle.addItem("");
            MovieTitle.addItem("The NorthMan");
            MovieTitle.addItem("The Man from Toronto");
            MovieTitle.addItem("The Lost City");
            MovieTitle.addItem("Watcher");
            MovieTitle.addItem("Morbius");
            MovieTitle.addItem("Brian and Charles");
            MovieTitle.addItem("The Man from Toronto");
        }
        if (ReleaseYBox.getSelectedItem() == "2021") {
            MovieTitle.removeAllItems();
            MovieTitle.addItem("");
            MovieTitle.addItem("Row 19");
        }
    }

    public void populateGenreBox() {
        List<String> gen = new ArrayList<>();
        gen.add("");
        gen.add("Action");
        gen.add("Comedy");
        gen.add("Horror");
        for (int i = 0; i < gen.size(); i++) {
            GenreBox.addItem(gen.get(i));

        }

    }

    public void populateyear() {
        List<String> year = new ArrayList<>();
        year.add("");
        year.add("2021");
        year.add("2022");
        for (int i = 0; i < year.size(); i++) {
            ReleaseYBox.addItem(year.get(i));
        }
    }

    ///////////////////////////////////////////
    //Clearing fields
    public void ClearFields() {
        if (MovieTitle.getSelectedItem() == "") {
            textDirector.setText("");
            searchField.setText("");
            textRatings.setText("");
            textGenre.setText("");
            textRunTime.setText("");
            textReleaseYear.setText("");
            MovieDescription.setText("");
        }
    }

    public void ClearField() {
        MovieTitle.setSelectedItem("");
        ReleaseYBox.setSelectedItem("");
        GenreBox.setSelectedItem("");
        textDirector.setText("");
        searchField.setText("");
        textRatings.setText("");
        textGenre.setText("");
        textRunTime.setText("");
        textReleaseYear.setText("");
        MovieDescription.setText("");

    }

    ////////////////////////////////////
    //Movie Information
    public void Movieinfo() {
        if (MovieTitle.getSelectedItem() == "Morbius") {
            textDirector.setText(" Daniel Espinosa");
            textRatings.setText("7.1");
            textGenre.setText("Sci-Fi,Horror");
            textRunTime.setText("2h 25mn");
            textReleaseYear.setText("2022");
            MovieDescription.setText("Biochemist Michael Morbius" + "n/tries to cure himself of a rare blood disease, " +
                    "but he inadvertently infects himself with a form of vampirism instead.");
        }

        if (MovieTitle.getSelectedItem() == "The Lost City") {
            textDirector.setText(" Aaron Nee");
            textRatings.setText("6.3");
            textGenre.setText("Advanture,Action");
            textRunTime.setText("1h 52mn");
            textReleaseYear.setText("2022");
            MovieDescription.setText("A reclusive romance novelist on a book tour with her cover model gets" +
                    " swept up in a kidnapping attempt that lands them both in a cutthroat jungle adventure.");
        }
        if (MovieTitle.getSelectedItem() == "The NorthMan") {
            textDirector.setText("Robert Eggers");
            textRatings.setText("7.5");
            textGenre.setText("Action");
            textRunTime.setText("2h 17min");
            textReleaseYear.setText("2022");
            MovieDescription.setText("Prince Amleth is on the verge of becoming a man when his father " +
                    "is brutally murdered by his uncle, who kidnaps the boy's mother. Two decades later," +
                    " Amleth is now a Viking " +
                    "who's on a mission to save his mother, kill his uncle and avenge his father");

        }
        if (MovieTitle.getSelectedItem() == "Brian and Charles") {
            textDirector.setText("Jim Archer");
            textRatings.setText("6.7");
            textGenre.setText("Comedy");
            textRunTime.setText("1h 30m");
            textReleaseYear.setText("2022");
            MovieDescription.setText("After a particularly harsh winter Brian goes into a deep depression;" +
                    " completely isolated and with no one to talk to, Brian does what any sane person would do" +
                    " when faced with such a melancholic situation. He builds a robot.");
        }
        if (MovieTitle.getSelectedItem() == "The Man from Toronto") {
            textDirector.setText(" Patrick Hughes");
            textRatings.setText("5.8");
            textGenre.setText("Action,Comedy");
            textRunTime.setText("1h 52m");
            textReleaseYear.setText("2022");
            MovieDescription.setText("The world's deadliest assassin and New York's" +
                    " biggest screw-up are mistaken for each other at an Airbnb rental.");
        }
        if (MovieTitle.getSelectedItem() == "Watcher") {
            textDirector.setText(" Chloe Okuno");
            textRatings.setText("6.3");
            textGenre.setText("Horror");
            textRunTime.setText("1h 35m");
            textReleaseYear.setText("2022");
            MovieDescription.setText("A young American woman moves with her husband to Bucharest," +
                    " and begins to suspect that a stranger who watches" +
                    " her from the apartment building across the street may be a local serial killer " +
                    "decapitating women");
        }
        if (MovieTitle.getSelectedItem() == "Row 19") {
            textDirector.setText("Alexander Babaev");
            textRatings.setText("4.4");
            textGenre.setText("Horror");
            textRunTime.setText("1h 18m");
            textReleaseYear.setText("2021");
            MovieDescription.setText("A young female doctor with a 6-year-old daughter" +
                    " is on a night flight caught in a terrible storm. In a half-empty cabin, " +
                    "she faces unexplained deaths of her fellow passengers," +
                    " loses her grip on reality and relives the worst nightmare from her childhood.");
        }
    }
        public void searchf() {

            if (searchField.getText().toLowerCase() == "The NorthMan")

                textGenre.setText("Action");
                textRunTime.setText("2h 17min");
                textDirector.setText("Robert Eggers");
                textRatings.setText("7.5");
                textReleaseYear.setText("2022");
                MovieDescription.setText("Prince Amleth is on the verge of becoming a man when his father " +
                        "is brutally murdered by his uncle, who kidnaps the boy's mother. Two decades later," +
                        " Amleth is now a Viking " +
                        "who's on a mission to save his mother, kill his uncle and avenge his father");

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
        populateyear();
        populateGenreBox();
        gensect();
        // MovieTitle = new JComboBox(Titles);


////////////////////////////////////////////////////////
        selectButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (MovieTitle.getSelectedItem() == "") {
                    JOptionPane.showMessageDialog(null, "Movie Not selected Please Select Movie");
                } else
                    JOptionPane.showMessageDialog(null, "Movie Selected");
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
        GenreBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClearFields();
                gensect();
            }
        });
        ReleaseYBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClearFields();
                yearselect();
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           searchf();
            }
        });


        Clearbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClearField();
            }
        });
    }

    public static void main(String[] args) {
        MovieGui run = new MovieGui();
    }
}

