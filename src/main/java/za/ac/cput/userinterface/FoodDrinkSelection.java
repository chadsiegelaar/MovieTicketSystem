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
    private JLabel lblFandD,lblcomboNo, lblcomboSize, lblcomboPrice, lblcomboAvailability, lblcomboTotalprice,lblcomboLogo1,lblSmall,lblMedium,lblLarge;
    private JTextField txtcNo, txtcPrice,txtAvailability,txtTotalPrice;
    private JRadioButton radpriceSmall,radpriceMedium,radpriceLarge;
    private ButtonGroup sizesGroup;
    private JButton btnNext,  btnBack, btnExit;
    private Font ft1, ft2;
    int size;

    public FoodDrinkSelection() {

        super("Food and Drink");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        lblFandD = new JLabel("Food and Drink");
        lblcomboLogo1 = new JLabel(new ImageIcon("images 1.jpg"));

        lblcomboNo = new JLabel("Combo No:");
        txtcNo = new JTextField();

        lblcomboSize = new JLabel("Combo Size:");


        lblSmall = new JLabel("Small(Popcorn,Drink And Snack");
        radpriceSmall= new JRadioButton( "R60");

        lblMedium = new JLabel("Medium(Popcorn,Drink And Snack)");
        radpriceMedium= new JRadioButton("R80");

        lblLarge = new JLabel("Large(Popcorn,Drink And Snack)");
        radpriceLarge= new JRadioButton("R95");


        lblcomboAvailability= new JLabel("Combo Availability:");
        txtAvailability = new JTextField();

        lblcomboPrice = new JLabel("Price:");
        txtcPrice = new JTextField();


        lblcomboTotalprice= new JLabel("Total Price:");
        txtTotalPrice = new JTextField();


        sizesGroup = new ButtonGroup();

        btnNext = new JButton("Next");
        btnBack = new JButton("Back");
        btnExit = new JButton("Exit");



        ft1 = new Font("Arial", Font.BOLD, 29);
        ft2 = new Font("Arial", Font.BOLD, 15);
    }

    public void setFoodDrinkGUI() {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(16, 2));
        panelSouth.setLayout(new GridLayout(1, 3));


        panelNorth.add(lblFandD);
        lblFandD.setFont(ft1);
        panelNorth.add(lblcomboLogo1);
        lblFandD.setForeground(new Color(255, 209, 204));
        panelNorth.setBackground(new Color(255, 102, 102));
        panelCenter.setBackground(new Color(255, 204, 153));


        lblcomboNo .setFont(ft2);
        lblcomboNo .setHorizontalAlignment(JLabel.LEFT);
        txtcNo.setFont(ft2);
        panelCenter.add( lblcomboNo);
        panelCenter.add(txtcNo);
        txtcNo.setBackground(new Color(255, 204, 153));

        panelCenter.add( lblcomboSize);
        lblcomboSize.setFont(ft2);
        lblcomboSize .setHorizontalAlignment(JLabel.LEFT);


        panelCenter.add( lblSmall);
        lblSmall.setFont(ft2);
        lblSmall.setHorizontalAlignment(JRadioButton.LEFT);
        panelCenter.add( radpriceSmall);
        radpriceSmall.setFont(ft2);
        radpriceSmall.setHorizontalAlignment(JRadioButton.LEFT);
        radpriceSmall.setBackground(new Color(255, 204, 153));
        radpriceSmall.setSelected(true);

        panelCenter.add( lblMedium);
        lblMedium.setFont(ft2);
        lblMedium.setHorizontalAlignment(JRadioButton.LEFT);
        panelCenter.add( radpriceMedium);
        radpriceMedium.setFont(ft2);
        radpriceMedium.setHorizontalAlignment(JRadioButton.LEFT);
        radpriceMedium.setBackground(new Color(255, 204, 153));

        panelCenter.add( lblLarge);
        lblLarge.setFont(ft2);
        lblLarge.setHorizontalAlignment(JRadioButton.LEFT);
        panelCenter.add( radpriceLarge);
        radpriceLarge.setFont(ft2);
        radpriceLarge.setHorizontalAlignment(JRadioButton.LEFT);
        radpriceLarge.setBackground(new Color(255, 204, 153));


        sizesGroup.add(radpriceSmall);
        sizesGroup.add(radpriceMedium);
        sizesGroup.add(radpriceLarge);

        lblcomboAvailability.setFont(ft2);
        lblcomboAvailability.setHorizontalAlignment(JLabel.LEFT);
        txtAvailability.setFont(ft2);
        panelCenter.add( lblcomboAvailability);
        panelCenter.add( txtAvailability);
        txtAvailability.setBackground(new Color(255, 204, 153));


        lblcomboPrice.setFont(ft2);
        lblcomboPrice.setHorizontalAlignment(JLabel.LEFT);
        txtcPrice .setFont(ft2);
        panelCenter.add( lblcomboPrice);
        panelCenter.add(txtcPrice );
        txtcPrice.setBackground(new Color(255, 204, 153));

        lblcomboTotalprice.setFont(ft2);
        lblcomboTotalprice.setHorizontalAlignment(JLabel.LEFT);
        txtTotalPrice .setFont(ft2);
        panelCenter.add( lblcomboTotalprice);
        panelCenter.add(txtTotalPrice );
        txtTotalPrice.setBackground(new Color(255, 204, 153));


        btnNext.setFont(ft2);
        panelSouth.add(btnNext);
        btnBack.setFont(ft2);
        panelSouth.add(btnBack);
        btnExit.setFont(ft2);
        panelSouth.add(btnExit);


        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnNext.addActionListener(this);
        btnExit.addActionListener(this);
        btnBack.addActionListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500, 500);
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
        new FoodDrinkSelection().setFoodDrinkGUI();

    }


}
