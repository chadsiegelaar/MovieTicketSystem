package za.ac.cput.userinterface;

import com.google.gson.Gson;
import okhttp3.*;
import za.ac.cput.factory.RegisterFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Register extends JFrame {
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    private  static OkHttpClient client = new OkHttpClient();
    private JTextField LNtxt;
    private JTextField FNtxt;
    private JTextField Emailtxt;
    private JTextField Celltxt;
    private JButton registerButton;
    private JButton clearButton;
    private JTextField Usertxt;
    private JTextField Passwordtxt;
    private JLabel Register;
    private JPanel registerPanel;
    private JButton nextButton;

    public Register(JFrame parent){
        setTitle("Create an Account");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(450,474));
        setLocationRelativeTo(parent);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FNtxt.setText("");
                LNtxt.setText("");
                Emailtxt.setText("");
                Celltxt.setText("");
                Usertxt.setText("");
                Passwordtxt.setText("");


            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save(FNtxt.getText(),LNtxt.getText(),Emailtxt.getText(),Celltxt.getText(),Usertxt.getText(),Passwordtxt.getText());
                System.out.printf(FNtxt.getText(),LNtxt.getText(),Emailtxt.getText(),Celltxt.getText(),Usertxt.getText() +Passwordtxt.getText());
            }
        });

        setVisible(true);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                UserLogin ul = new UserLogin();
                ul.setGUI();
            }
        });
    }

    public void save(String firstName, String lastName,String email, String cellNumber, String username, String password ) {
        try {
            final String url = "http://localhost:8080/movie-ticket/register/save";
            za.ac.cput.domain.Register register = RegisterFactory.build(firstName,lastName,email,cellNumber,username,password);
            Gson gson = new Gson();
            String JsonString = gson.toJson(register);
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


    public static void main(String[] args){
        Register run = new Register(null);
    }
}
