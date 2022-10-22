package za.ac.cput.userinterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LocationGui extends JFrame {
    private JPanel Main;
    private JTextField textBldname;
    private JTextField textRmnum;
    private JTextField textStscn;
    private JTextField textStnum;
    private JButton previousButton;
    private JButton nextButton;
    private JComboBox comboBox1;
    String[] Titles={};
    public void populateTitle() {
        List<String> ttl = new ArrayList<>();
        ttl.add("");
        ttl.add("2D");
        ttl.add("3D");
        ttl.add("IMAX");

        for (int i = 0; i < ttl.size(); i++) {

            comboBox1.addItem(ttl.get(i));
        }
    }
    public void selected() {
     if(comboBox1.getSelectedItem() =="2D"){
         textBldname.setText("Motion");
         textRmnum.setText("02");
         textStscn.setText("1stRow,Left ");
         textStnum.setText("M12");
     }
        if(comboBox1.getSelectedItem() =="3D"){
            textBldname.setText("Movie Zone");
            textRmnum.setText("12");
            textStscn.setText("2ndRow,Center ");
            textStnum.setText("MZ4");
        }
        if(comboBox1.getSelectedItem() =="IMAX"){
            textBldname.setText("Star City");
            textRmnum.setText("01");
            textStscn.setText("3rdRow,Right");
            textStnum.setText("SC2");
        }
        if(comboBox1.getSelectedItem() ==""){
            textBldname.setText("");
            textRmnum.setText("");
            textStscn.setText("");
            textStnum.setText("");
        }

    }
    public  void clear(){
        comboBox1.setSelectedItem("") ;
            textBldname.setText("");
            textRmnum.setText("");
            textStscn.setText("");
            textStnum.setText("");
    }

    public LocationGui() {
        populateTitle();
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

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                selected();
            }
        });
    }



    public static void main(String[] args) {
        LocationGui run = new LocationGui();

    }
}
