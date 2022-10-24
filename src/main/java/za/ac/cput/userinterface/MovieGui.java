package za.ac.cput.userinterface;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import za.ac.cput.domain.Location;
import za.ac.cput.domain.Movie;
import za.ac.cput.factory.MovieFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class MovieGui extends JFrame {
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");


    private  static final OkHttpClient client = new OkHttpClient();
    private JPanel Main;
    private JLabel Movie;

    private JLabel Title;
    private JLabel Ratings;
    private JTextField textRatings;
    private JLabel Genre;
    private JTextField textGenre;

    private JLabel RunningTime;
    private JTextField textRunTime;


    private JButton selectButton;
    private JButton nextButton;
    private JButton previousButton;
    private JButton searchButton;
    private JButton Clearbutton;
    private JTextField movietextfield;
    private JTextField Idtext;
    private JTextArea textAreagetall;
    private JButton GeAllbtn;
    private static String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

    public  void  getAll(){
        try {
            final String url ="http://localhost:8080/movie-ticket/location/all/";
            String responseBody = run(url);
            JSONArray locations = new JSONArray(responseBody);

            for(int i =0; i<locations.length();i++){
                JSONObject location = locations.getJSONObject(i);
                Gson gson = new Gson();
                Location loc = gson.fromJson(location.toString(),Location.class);
                System.out.println(loc.toString());
                textAreagetall.setText(location.toString()+"\n");

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(String MovieID, String Title, String Rating, String MovieType, String RunningTime) {
        try {
            final String url = "http://localhost:8080/movie-ticket/movie/save/";
            Movie movie = MovieFactory.build(MovieID,Title, Rating, MovieType,RunningTime);
            Gson gson = new Gson();
            assert movie != null;
            String JsonString = gson.toJson(movie);
            String post = post(url, JsonString);

            if (post != null)
                JOptionPane.showMessageDialog(null, "Saved successfully");
            else
                JOptionPane.showMessageDialog(null, "ERROR!! Not Saved successfully!");
        } catch (HeadlessException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  String post(final  String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json,JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.printf(request.toString());
            System.out.printf(response.message());
            return response.body().string();
        }


    }



    ///////////////////////////////////////////
    //Clearing fields
    public void ClearField() {
        textRatings.setText("");
        textGenre.setText("");
        textRunTime.setText("");
        movietextfield.setText("");
        Idtext.setText("");
        textAreagetall.setText("");
    }
    ////////////////////////////////////
    //Movie Information
    public MovieGui() {
//////////////////////////////////////////////////////
        setContentPane(Main);
        setTitle("Movie Selection");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
/////////////////////////////////////////////////////////
        //Calling populateMethod
        // MovieTitle = new JComboBox(Titles);
////////////////////////////////////////////////////////
        selectButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (Idtext.getText().isEmpty() || movietextfield.getText().isEmpty()
                        || textGenre.getText().isEmpty() || textRatings.getText().isEmpty() ||
                        textRunTime.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Missing input from feild: " +
                            "Please populate all fields");

                } else
                    save(Idtext.getText(), movietextfield.getText()
                            , textRatings.getText(), textGenre.getText()
                            , textRunTime.getText());
//
//                System.out.printf((Idtext.getText()+ movietextfield.getText()
//                        + textRatings.getText()+ textGenre.getText()
//                        + textRunTime.getText()));


            }

        });

        /////////////////////////////////////////////////////////////
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocationGui locationScreen = new LocationGui();


            }
        });


        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        Clearbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClearField();
            }
        });
        GeAllbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getAll();
            }
        });
    }

    public static void main(String[] args) {
        MovieGui run = new MovieGui();


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

