/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SWE_LoginForm;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
/**
 *
 * @author lepolted
 */
public class LabUI extends javax.swing.JFrame {

    /**
     * Creates new form LabUI
     */
    public LabUI() {
        initComponents();
    }

    //  Database credentials
    static final String USER = "lepolted";
    static final String PASS = "password";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        failureAlert = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        softFailureAlert = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        success = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Too many failures");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout failureAlertLayout = new javax.swing.GroupLayout(failureAlert.getContentPane());
        failureAlert.getContentPane().setLayout(failureAlertLayout);
        failureAlertLayout.setHorizontalGroup(
            failureAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, failureAlertLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(failureAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addGap(101, 101, 101))
        );
        failureAlertLayout.setVerticalGroup(
            failureAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(failureAlertLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        softFailureAlert.setMinimumSize(new java.awt.Dimension(331, 174));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Incorrect password");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout softFailureAlertLayout = new javax.swing.GroupLayout(softFailureAlert.getContentPane());
        softFailureAlert.getContentPane().setLayout(softFailureAlertLayout);
        softFailureAlertLayout.setHorizontalGroup(
            softFailureAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(softFailureAlertLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(softFailureAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        softFailureAlertLayout.setVerticalGroup(
            softFailureAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, softFailureAlertLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(49, 49, 49))
        );

        success.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Success");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout successLayout = new javax.swing.GroupLayout(success.getContentPane());
        success.getContentPane().setLayout(successLayout);
        successLayout.setHorizontalGroup(
            successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3)
                    .addComponent(jLabel5))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        successLayout.setVerticalGroup(
            successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login Form"));

        jLabel1.setText("UserName");

        jLabel2.setText("Password");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        passwordText.setText("password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameText)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(resetButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String userName = userNameText.getText();
        String password = passwordText.getText();
        Boolean accountAvailable = false;
        int accountID = 0;
        String accountPassword = "";
        String firstName = "";
        String lastName = "";
        
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://ucfilespace.uc.edu","lepolted","password");
        } catch (SQLException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "";
        /*
         * Query to see if account exists
        sql = "SELECT COUNT(Username) as accountAvailable FROM `HD_Accounts` WHERE Username = '"+userName+"'"; 
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rs.getInt("accountAvailable") == 1)
        { 
         * accountAvailable = true;
         */
        
        sql = "SELECT * FROM `lepolted.HD_Accounts` where Username = '"+userName+"'";
        
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            while(rs.next()){
            //Retrieve by column name
            accountID  = rs.getInt("id");
            accountPassword = rs.getString("Password");
            firstName = rs.getString("FirstName");
            lastName = rs.getString("LastName");
        }
        } catch (SQLException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //}
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LabUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (!accountAvailable && !accountPassword.equals(password))
        {
            failure++;
            if (failure == 3)
            {
                this.dispose();
                failureAlert.setVisible(true);
            }
            else
            {
                softFailureAlert.setVisible(true);
                userNameText.setText("");
                passwordText.setText("");
            }
        }
        else
        {
            success.setVisible(true);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        userNameText.setText("");
        passwordText.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        softFailureAlert.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        success.dispose();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LabUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LabUI().setVisible(true);
            }
        });
    }
    int failure = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog failureAlert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton resetButton;
    private javax.swing.JDialog softFailureAlert;
    private javax.swing.JButton submitButton;
    private javax.swing.JDialog success;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}