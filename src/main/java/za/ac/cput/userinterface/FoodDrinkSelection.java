/*
 *Project 3
 *Movie Ticket System
 *Tasneem Jacobs (215030389)
 */
package za.ac.cput.userinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodDrinkSelection extends JFrame implements ActionListener {

    private JPanel panelCenter, panelNorth, panelSouth;
    private JLabel lblFandD, lblcomboNo, lblcomboSize, lblcomboPrice, lblcomboAvailability, lblcomboTotalprice, lblcomboLogo1, lblSmall, lblMedium, lblLarge, lblcNo, lblBlank1, lblBlank2, lblBlank3;
    private JTextField txtcPrice, txtAvailability, txtTotalPrice, txtAvaS, txtAvaM, txtAvaL;
    private JRadioButton radpriceSmall, radpriceMedium, radpriceLarge;
    private ButtonGroup sizesGroup;
    private JButton btnAdd, btnBack, btnExit;
    private Font ft1, ft2, ft3;
    int size;

    public FoodDrinkSelection() {

        super("Food and Drink");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        lblFandD = new JLabel("Food and Drink");
        lblcomboLogo1 = new JLabel(new ImageIcon("images.png"));

        lblcomboNo = new JLabel("Combo No:2500");
        lblBlank1 = new JLabel("");


        lblcomboSize = new JLabel("Combo Size");
        lblcomboPrice = new JLabel("Combo Price");
        lblcomboAvailability = new JLabel("Combo Availability");


        lblSmall = new JLabel("Small(Popcorn,Drink And Snack");
        radpriceSmall = new JRadioButton("R60");
        txtAvaS = new JTextField("390");

        lblMedium = new JLabel("Medium(Popcorn,Drink And Snack)");
        radpriceMedium = new JRadioButton("R80");
        txtAvaM = new JTextField("450");

        lblLarge = new JLabel("Large(Popcorn,Drink And Snack)");
        radpriceLarge = new JRadioButton("R95");
        txtAvaL = new JTextField("700");


        lblcomboTotalprice = new JLabel("Total Price:");
        lblBlank2 = new JLabel("");
        txtTotalPrice = new JTextField();


        sizesGroup = new ButtonGroup();

        btnAdd = new JButton("Add");
        btnBack = new JButton("Back");
        btnExit = new JButton("Exit");


        ft1 = new Font("Arial", Font.BOLD, 29);
        ft2 = new Font("Arial", Font.BOLD, 15);
        ft3 = new Font("Arial", Font.BOLD, 18);
    }

    public void setFoodDrinkGUI() {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(8, 3));
        panelSouth.setLayout(new GridLayout(1, 3));


        panelNorth.add(lblFandD);
        lblFandD.setFont(ft1);
        panelNorth.add(lblcomboLogo1);
        lblFandD.setForeground(new Color(255, 209, 204));
        panelNorth.setBackground(new Color(255, 102, 102));
        panelCenter.setBackground(new Color(255, 204, 153));


        lblcomboNo.setFont(ft2);
        panelCenter.add(lblcomboNo);
        lblcomboNo.setHorizontalAlignment(JLabel.LEFT);
        panelCenter.add(lblBlank1);
        panelCenter.add(lblBlank2);


        lblcomboSize.setFont(ft3);//Headings
        panelCenter.add(lblcomboSize);
        //lblcomboSize .setHorizontalAlignment(JLabel.LEFT);
        lblcomboSize.setForeground(new Color(153, 0, 0));
        lblcomboPrice.setFont(ft3);
        lblcomboPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblcomboPrice);
        lblcomboPrice.setForeground(new Color(153, 0, 0));
        lblcomboSize.setForeground(new Color(153, 0, 0));
        lblcomboAvailability.setFont(ft3);
        lblcomboAvailability.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblcomboAvailability);
        lblcomboAvailability.setForeground(new Color(153, 0, 0));


        panelCenter.add(lblSmall);
        lblSmall.setFont(ft2);
        panelCenter.add(radpriceSmall);
        radpriceSmall.setFont(ft2);
        radpriceSmall.setHorizontalAlignment(JRadioButton.CENTER);
        radpriceSmall.setBackground(new Color(255, 204, 153));
        txtAvaS.setFont(ft2);
        panelCenter.add(txtAvaS);
        txtAvaS.setHorizontalAlignment(JLabel.CENTER);
        txtAvaS.setBackground(new Color(255, 204, 153));
        //   radpriceSmall.setSelected(true);

        panelCenter.add(lblMedium);
        lblMedium.setFont(ft2);
        // lblMedium.setHorizontalAlignment(JRadioButton.CENTER);
        panelCenter.add(radpriceMedium);
        radpriceMedium.setFont(ft2);
        radpriceMedium.setHorizontalAlignment(JRadioButton.CENTER);
        radpriceMedium.setBackground(new Color(255, 204, 153));
        txtAvaM.setFont(ft2);
        panelCenter.add(txtAvaM);
        txtAvaM.setHorizontalAlignment(JLabel.CENTER);
        txtAvaM.setBackground(new Color(255, 204, 153));

        panelCenter.add(lblLarge);
        lblLarge.setFont(ft2);
        // lblLarge.setHorizontalAlignment(JRadioButton.CENTER);
        panelCenter.add(radpriceLarge);
        radpriceLarge.setFont(ft2);
        radpriceLarge.setHorizontalAlignment(JRadioButton.CENTER);
        radpriceLarge.setBackground(new Color(255, 204, 153));
        txtAvaL.setFont(ft2);
        panelCenter.add(txtAvaL);
        txtAvaL.setHorizontalAlignment(JLabel.CENTER);
        txtAvaL.setBackground(new Color(255, 204, 153));

        sizesGroup.add(radpriceSmall);
        sizesGroup.add(radpriceMedium);
        sizesGroup.add(radpriceLarge);


        panelCenter.add(lblcomboTotalprice);
        lblcomboTotalprice.setFont(ft2);
        lblcomboTotalprice.setHorizontalAlignment(JLabel.LEFT);
        panelCenter.add(txtTotalPrice);
        txtTotalPrice.setFont(ft2);
        txtTotalPrice.setHorizontalAlignment(JLabel.RIGHT);
        txtTotalPrice.setBackground(new Color(255, 204, 153));


        btnAdd.setFont(ft2);
        panelSouth.add(btnAdd);
        btnBack.setFont(ft2);
        panelSouth.add(btnBack);
        btnExit.setFont(ft2);
        panelSouth.add(btnExit);


        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnAdd.addActionListener(this);
        btnExit.addActionListener(this);
        btnBack.addActionListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            if (radpriceSmall.isSelected()) {
                txtTotalPrice.setText("R60");
            } else if (radpriceMedium.isSelected()) {
                txtTotalPrice.setText("R80");
            } else if (radpriceLarge.isSelected()) {
                txtTotalPrice.setText("R95");
            }
                JOptionPane.showMessageDialog(this, "Successfully added your Combo Selection  please PROCEED TO PAYMENT");

            } else if (e.getActionCommand().equals("Back")) {


            } else if (e.getActionCommand().equals("Exit")) {
                System.exit(0);
            }
        }

        public static void main (String[]args){
            new FoodDrinkSelection().setFoodDrinkGUI();

        }


}
