package za.ac.cput.userinterface;

/**
 * Seat Selection
 * @author Brady Sheldon
 */

public class seatSelection extends javax.swing.JFrame {

    /**
     * Creates new form seatSelection
     */
    public seatSelection() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jGeneral = new javax.swing.JRadioButton();
        jKids = new javax.swing.JRadioButton();
        jPensioners = new javax.swing.JRadioButton();
        jVip = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeats = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCash = new javax.swing.JRadioButton();
        jDebit = new javax.swing.JRadioButton();
        jApple = new javax.swing.JRadioButton();
        jEft = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPayments = new javax.swing.JLabel();
        jPrice = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seat Selection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 36), new java.awt.Color(255, 255, 0))); // NOI18N

        jGeneral.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jGeneral);
        jGeneral.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jGeneral.setForeground(new java.awt.Color(255, 255, 0));
        jGeneral.setText("General");
        jGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGeneralActionPerformed(evt);
            }
        });

        jKids.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jKids);
        jKids.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jKids.setForeground(new java.awt.Color(255, 255, 0));
        jKids.setText("Kids");
        jKids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKidsActionPerformed(evt);
            }
        });

        jPensioners.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jPensioners);
        jPensioners.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jPensioners.setForeground(new java.awt.Color(255, 255, 0));
        jPensioners.setText("Pensioners");
        jPensioners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPensionersActionPerformed(evt);
            }
        });

        jVip.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jVip);
        jVip.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jVip.setForeground(new java.awt.Color(255, 255, 0));
        jVip.setText("ViP");
        jVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jVip)
                                        .addComponent(jPensioners)
                                        .addComponent(jKids)
                                        .addComponent(jGeneral))
                                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jGeneral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(jKids)
                                .addGap(51, 51, 51)
                                .addComponent(jPensioners)
                                .addGap(66, 66, 66)
                                .addComponent(jVip)
                                .addGap(35, 35, 35))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Price per Seat = R");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Number of tickets required");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Methods", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 36), new java.awt.Color(255, 255, 0))); // NOI18N

        jCash.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jCash);
        jCash.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jCash.setForeground(new java.awt.Color(255, 255, 0));
        jCash.setText("Cash");
        jCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCashActionPerformed(evt);
            }
        });

        jDebit.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jDebit);
        jDebit.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jDebit.setForeground(new java.awt.Color(255, 255, 0));
        jDebit.setText("Debit/Credit");

        jApple.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jApple);
        jApple.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jApple.setForeground(new java.awt.Color(255, 255, 0));
        jApple.setText("Apple Pay");

        jEft.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jEft);
        jEft.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jEft.setForeground(new java.awt.Color(255, 255, 0));
        jEft.setText("EFT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jEft)
                                        .addComponent(jApple)
                                        .addComponent(jDebit)
                                        .addComponent(jCash))
                                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jCash)
                                .addGap(57, 57, 57)
                                .addComponent(jDebit)
                                .addGap(65, 65, 65)
                                .addComponent(jApple)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jEft)
                                .addGap(39, 39, 39))
        );

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Clear");
        jButton2.setMaximumSize(new java.awt.Dimension(113, 29));
        jButton2.setMinimumSize(new java.awt.Dimension(113, 29));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Book Seats");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPayments.setForeground(new java.awt.Color(255, 255, 0));

        jPrice.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jPrice.setForeground(new java.awt.Color(255, 255, 0));

        jTextField1.setBackground(new java.awt.Color(255, 255, 0));
        jTextField1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jTextField1.setText("Cinema");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(58, 58, 58))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(29, 29, 29))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(38, 38, 38)))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void Clear(){

        jPrice.setText(null);
        jSeats.setText(null);
        jPayments.setText(null);
        jGeneral.setSelectedIcon(null);

    }



    private void jGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGeneralActionPerformed
        if(jGeneral.isSelected()==true)
            jPrice.setText("100");


// TODO add your handling code here:
    }//GEN-LAST:event_jGeneralActionPerformed

    private void jPensionersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPensionersActionPerformed
        if(jPensioners.isSelected()==true)
            jPrice.setText("90");

        // TODO add your handling code here:
    }//GEN-LAST:event_jPensionersActionPerformed

    private void jKidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKidsActionPerformed
        if(jKids.isSelected()==true)
            jPrice.setText("80");

        // TODO add your handling code here:
    }//GEN-LAST:event_jKidsActionPerformed

    private void jVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVipActionPerformed
        if(jVip.isSelected()==true)
            jPrice.setText("150");

        // TODO add your handling code here:
    }//GEN-LAST:event_jVipActionPerformed

    private void jCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCashActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int price=Integer.parseInt(jPrice.getText());
        int seats=Integer.parseInt(jSeats.getText());
        int amount=price*seats;
        if(jCash.isSelected()==true)
            jPayments.setText("Cash Payment of R."+amount);
        else
        if(jDebit.isSelected()==true)
            jPayments.setText("Debit/Credit Payment of R."+amount);
        else
        if(jApple.isSelected()==true)
            jPayments.setText("Apple Pay Payment of R."+amount);
        else
        if(jEft.isSelected()==true)
            jPayments.setText("EFT Payment of R."+amount);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clear();



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(seatSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seatSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seatSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seatSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seatSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton jApple;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton jCash;
    private javax.swing.JRadioButton jDebit;
    private javax.swing.JRadioButton jEft;
    private javax.swing.JRadioButton jGeneral;
    private javax.swing.JRadioButton jKids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jPayments;
    private javax.swing.JRadioButton jPensioners;
    private javax.swing.JLabel jPrice;
    private javax.swing.JTextField jSeats;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton jVip;

}
