
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.util.Optional.empty;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aaron - Code 4 Rookies
 */
public class Main extends javax.swing.JFrame {

    FileWriter filewriter = null;
    PrintWriter pw = null;

    /**
     * Creates new form Principal
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        GroupWep.add(Radio10char);
        GroupWep.add(Radio26char);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupWep = new javax.swing.ButtonGroup();
        exit = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        generateWPAWPA2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        charactersField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lengthwordsList = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        generateWEP = new javax.swing.JButton();
        Radio10char = new javax.swing.JRadioButton();
        Radio26char = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        NumbersCheck = new javax.swing.JCheckBox();
        LettersCheck = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gpasslenght = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        gpasscField = new javax.swing.JTextField();
        generatepassword = new javax.swing.JButton();
        resultpass = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generate Passwords - Code 4 Rookies");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setText("Length of words:");

        generateWPAWPA2.setText("Generate");
        generateWPAWPA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateWPAWPA2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Characters:");

        charactersField.setText("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");

        jLabel4.setText("<html><body>By default we use only numbers and uppercase and lowercase <br>letters, but you can add or remove carateres you need.</body></html>");

        lengthwordsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generateWPAWPA2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lengthwordsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(charactersField, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(charactersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthwordsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(generateWPAWPA2)
                .addGap(65, 65, 65))
        );

        jTabbedPane1.addTab("WPA2 & WPA", jPanel1);

        generateWEP.setText("Generate");
        generateWEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateWEPActionPerformed(evt);
            }
        });

        Radio10char.setText("10 characters");

        Radio26char.setText("26 characters");

        jLabel7.setText("<html><body>WEP encryption in the default use capital letters and numbers,<br> if you want to use letters or numbers only unchecking not want to use.</body></html>");

        NumbersCheck.setSelected(true);
        NumbersCheck.setText("Numbers");

        LettersCheck.setSelected(true);
        LettersCheck.setText("Letters");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(generateWEP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Radio26char)
                            .addComponent(Radio10char))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumbersCheck)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LettersCheck))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Radio10char)
                    .addComponent(NumbersCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Radio26char)
                    .addComponent(LettersCheck))
                .addGap(19, 19, 19)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(generateWEP)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("WEP", jPanel2);

        jLabel2.setText("You can generate your own strong password here");

        jLabel5.setText("Number os characters:");

        gpasslenght.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63" }));

        jLabel6.setText("Characters contained: (You can add or delete some characters)");

        gpasscField.setText("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");

        generatepassword.setText("Generate");
        generatepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatepasswordActionPerformed(evt);
            }
        });

        resultpass.setText("Your new password is...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultpass, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(generatepassword)
                        .addComponent(jLabel6)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(gpasslenght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addComponent(gpasscField, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gpasslenght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gpasscField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generatepassword)
                .addGap(18, 18, 18)
                .addComponent(resultpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Generate Password", jPanel3);

        jLabel8.setText("<html><body>This program is thinking for safety testing and more things to learn programming by its author,<br> I mean me. I am not responsible for any use that is given to the program, <br>since dictionaries that can be created are designed for safety tests and nothing else. <br>Thank you for using it and wish that you spend good day.</body></html>");

        jLabel9.setText("Contact info:");

        jLabel10.setText("Github: http://www.github.com/code4rookies");

        jLabel11.setText("E-mail: webmaster@code4rookies.com");

        jLabel12.setText("Web: http://www.code4rookies.com");

        jLabel13.setText("<html><body>This program is free software: you can redistribute it and/or modify it under the terms of the GNU <br>General Public License as published by the Free Software Foundation, either version 3 of the License,<br> or (at your option) any later version.  This program is distributed in the hope that it will be useful,<br>  but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS<br> FOR A PARTICULAR PURPOSE. <br> See the GNU General Public License for more details.</body></html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // Code for ecit button
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void generateWPAWPA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateWPAWPA2ActionPerformed
        // Code for generate WPA+WPA2
        String characters = charactersField.getText();
        if ((charactersField.getText() == null) || charactersField.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "There are no one characters to generate password, please fill it", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                int numberr = Integer.parseInt(lengthwordsList.getSelectedItem().toString());
                String passwordsfile = "WPA2.txt";
                filewriter = new FileWriter(passwordsfile);
                pw = new PrintWriter(filewriter);

                permutation(characters, "", numberr);

                JOptionPane.showMessageDialog(null, "File created correctly", "Finish", JOptionPane.PLAIN_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (null != filewriter) {
                        filewriter.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_generateWPAWPA2ActionPerformed

    private void permutation(String characters, String prefix, int length) {
        if (prefix.length() == length) {
            pw.println(prefix);
        } else {
            for (int i = 0; i < characters.length(); i++) {
                permutation(characters, prefix + characters.charAt(i), length);
            }
        }
    }

    private void generateWEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateWEPActionPerformed
        // Code for generateWEP
        String lettersWEP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbersWEP = "1234567890";
        String check = null;
        if ((NumbersCheck.isSelected() == true) && (LettersCheck.isSelected() == true)) {
            check = lettersWEP + numbersWEP;
        } else if (NumbersCheck.isSelected() == true) {
            check = numbersWEP;
        } else if (LettersCheck.isSelected() == true) {
            check = lettersWEP;
        } else {
            JOptionPane.showMessageDialog(null, "You have not selected or letters or numbers, please select one or both options.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int WepChar = 0;
        if (Radio10char.isSelected() == true) {
            WepChar = 10;
        } else if ((Radio26char.isSelected() == true)) {
            WepChar = 26;
        } else {
            JOptionPane.showMessageDialog(null, "You have not selected 10 or 26 characters for WEP password, please select one option.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if ((check == null) || (WepChar == 0)) {
        } else if (WepChar == 10) {
            //Code for 10 char

            try {
                String passwordsfile = "WEP.txt";
                filewriter = new FileWriter(passwordsfile);
                pw = new PrintWriter(filewriter);
                permutation(check, "", WepChar);

                JOptionPane.showMessageDialog(null, "File created correctly", "Finish", JOptionPane.PLAIN_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (null != filewriter) {
                        filewriter.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else {
            //Code for 26 char
            try {
                String passwordsfile = "WEP.txt";
                filewriter = new FileWriter(passwordsfile);
                pw = new PrintWriter(filewriter);
                permutation(check, "", WepChar);

                JOptionPane.showMessageDialog(null, "File created correctly", "Finish", JOptionPane.PLAIN_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (null != filewriter) {
                        filewriter.close();
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


    }//GEN-LAST:event_generateWEPActionPerformed

    private void generatepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatepasswordActionPerformed
        // Code for generate password
        int passlenght = Integer.parseInt(gpasslenght.getSelectedItem().toString());
        String passcharacters = gpasscField.getText();
        if ((passcharacters.length() == 0) || (passcharacters == null)){ 
          JOptionPane.showMessageDialog(null,"You have to write some charecters for generate password" ,"Error", JOptionPane.ERROR_MESSAGE);
        } else {
        String pass = "";
        for (int i = 0; i < passlenght; i++) {
            double a = Math.random() * passcharacters.length();
            int b = (int) a;
            pass = pass + passcharacters.charAt(b);
        }
        resultpass.setText(pass);
        }

    }//GEN-LAST:event_generatepasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupWep;
    private javax.swing.JCheckBox LettersCheck;
    private javax.swing.JCheckBox NumbersCheck;
    private javax.swing.JRadioButton Radio10char;
    private javax.swing.JRadioButton Radio26char;
    private javax.swing.JTextField charactersField;
    private javax.swing.JButton exit;
    private javax.swing.JButton generateWEP;
    private javax.swing.JButton generateWPAWPA2;
    private javax.swing.JButton generatepassword;
    private javax.swing.JTextField gpasscField;
    private javax.swing.JComboBox<String> gpasslenght;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> lengthwordsList;
    private javax.swing.JTextField resultpass;
    // End of variables declaration//GEN-END:variables
}
