package za.ac.cput.userinterface;

import com.google.gson.Gson;
import okhttp3.*;
import za.ac.cput.domain.Location;
import za.ac.cput.factory.LocationFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LocationGui extends JFrame {
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    private  static OkHttpClient client = new OkHttpClient();
    private JPanel Main;
    private JTextField textBldname;
    private JTextField textRmnum;
    private JTextField textStscn;
    private JTextField textStnum;
    private JButton previousButton;
    private JButton nextButton;

    private JButton saveButton;
    String[] Titles={};


    public  void clear(){

            textBldname.setText("");
            textRmnum.setText("");
            textStscn.setText("");
            textStnum.setText("");
    }

    public void save(String nameOfCinema, String seatName, String seatSection, boolean seatAvailability) {
        try {
            final String url = "http://localhost:8080/movie-ticket/location/save";
            Location location = LocationFactory.build(nameOfCinema,seatName,seatSection,seatAvailability);
            Gson gson = new Gson();
            String JsonString = gson.toJson(location);
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
        RequestBody requestBody = RequestBody.create(json,JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }


    }

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


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save(textBldname.getText(),textStnum.getText(),textStscn.getText(),true);
                System.out.printf(textBldname.getText() +textStnum.getText()+textStscn.getText()+true);
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MovieTicket mv = new MovieTicket();
                 mv.setMovieTicketGUI();
            }
        });
    }



    public static void main(String[] args) {
        LocationGui run = new LocationGui();

    }
}
