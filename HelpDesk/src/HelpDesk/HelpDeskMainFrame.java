/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HelpDeskMainFrame.java
 *
 * Created on Jul 19, 2012, 1:16:55 PM
 */
package HelpDesk;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author lepolted
 */
public class HelpDeskMainFrame extends javax.swing.JFrame {

    /** Creates new form HelpDeskMainFrame */
    public HelpDeskMainFrame() {
        initComponents();
        landingPage.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
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
        landingPage = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submitQuestionButton = new javax.swing.JButton();
        seeAllQuestionsButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ReadForums = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        question1Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        question1Text = new javax.swing.JTextArea();
        readForumsHomeButton = new javax.swing.JButton();
        WriteForums = new javax.swing.JDialog();
        writeForumsSubmitQuestionButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        forumQuestionTextArea = new javax.swing.JTextArea();
        writeForumsVisibilityCheckBox = new javax.swing.JCheckBox();
        questionTitleTextBox = new javax.swing.JTextField();
        writeForumsCancelButton = new javax.swing.JButton();
        loginForm = new javax.swing.JLayeredPane();
        passwordText = new javax.swing.JPasswordField();
        loginSubmitButton = new javax.swing.JButton();
        loginResetButton = new javax.swing.JButton();
        userNameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        landingPage.setMinimumSize(new java.awt.Dimension(600, 600));

        jLabel1.setText("Logged In As:");

        jLabel2.setText("Student");

        submitQuestionButton.setText("Submit Question");
        submitQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitQuestionButtonActionPerformed(evt);
            }
        });

        seeAllQuestionsButton.setText("See All Questions");
        seeAllQuestionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeAllQuestionsButtonActionPerformed(evt);
            }
        });

        jButton3.setText("assistantPromotion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout landingPageLayout = new javax.swing.GroupLayout(landingPage.getContentPane());
        landingPage.getContentPane().setLayout(landingPageLayout);
        landingPageLayout.setHorizontalGroup(
            landingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landingPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(landingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landingPageLayout.createSequentialGroup()
                        .addGap(0, 238, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41))
                    .addGroup(landingPageLayout.createSequentialGroup()
                        .addGroup(landingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(seeAllQuestionsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitQuestionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(275, Short.MAX_VALUE))))
            .addGroup(landingPageLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        landingPageLayout.setVerticalGroup(
            landingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landingPageLayout.createSequentialGroup()
                .addGroup(landingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(submitQuestionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seeAllQuestionsButton)
                .addGap(59, 59, 59)
                .addComponent(jButton3)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        ReadForums.setMinimumSize(new java.awt.Dimension(600, 600));

        jLabel5.setText("Forums");

        question1Label.setText("jLabel8");

        question1Text.setColumns(20);
        question1Text.setEditable(false);
        question1Text.setRows(5);
        jScrollPane1.setViewportView(question1Text);

        readForumsHomeButton.setText("Home");
        readForumsHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readForumsHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReadForumsLayout = new javax.swing.GroupLayout(ReadForums.getContentPane());
        ReadForums.getContentPane().setLayout(ReadForumsLayout);
        ReadForumsLayout.setHorizontalGroup(
            ReadForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadForumsLayout.createSequentialGroup()
                .addGroup(ReadForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReadForumsLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel5))
                    .addGroup(ReadForumsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(question1Label, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                    .addGroup(ReadForumsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(ReadForumsLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(readForumsHomeButton)))
                .addContainerGap())
        );
        ReadForumsLayout.setVerticalGroup(
            ReadForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadForumsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(question1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(readForumsHomeButton)
                .addContainerGap())
        );

        WriteForums.setMinimumSize(new java.awt.Dimension(600, 600));

        writeForumsSubmitQuestionButton.setText("Submit");
        writeForumsSubmitQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeForumsSubmitQuestionButtonActionPerformed(evt);
            }
        });

        forumQuestionTextArea.setColumns(20);
        forumQuestionTextArea.setRows(5);
        jScrollPane2.setViewportView(forumQuestionTextArea);

        writeForumsVisibilityCheckBox.setSelected(true);
        writeForumsVisibilityCheckBox.setText("Visible to Public");

        questionTitleTextBox.setText("Insert Question Title");

        writeForumsCancelButton.setText("Cancel");
        writeForumsCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeForumsCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WriteForumsLayout = new javax.swing.GroupLayout(WriteForums.getContentPane());
        WriteForums.getContentPane().setLayout(WriteForumsLayout);
        WriteForumsLayout.setHorizontalGroup(
            WriteForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(WriteForumsLayout.createSequentialGroup()
                .addGroup(WriteForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WriteForumsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(questionTitleTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(writeForumsVisibilityCheckBox))
                    .addGroup(WriteForumsLayout.createSequentialGroup()
                        .addGroup(WriteForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WriteForumsLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(WriteForumsLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(writeForumsSubmitQuestionButton)
                                .addGap(91, 91, 91)
                                .addComponent(writeForumsCancelButton)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        WriteForumsLayout.setVerticalGroup(
            WriteForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(WriteForumsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WriteForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionTitleTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(writeForumsVisibilityCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(WriteForumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(writeForumsSubmitQuestionButton)
                    .addComponent(writeForumsCancelButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));

        loginForm.setMinimumSize(new java.awt.Dimension(600, 600));
        loginForm.setPreferredSize(new java.awt.Dimension(400, 400));

        passwordText.setText("password");
        passwordText.setBounds(130, 90, 80, 30);
        loginForm.add(passwordText, javax.swing.JLayeredPane.DEFAULT_LAYER);

        loginSubmitButton.setText("Submit");
        loginSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSubmitButtonActionPerformed(evt);
            }
        });
        loginSubmitButton.setBounds(60, 140, 80, 23);
        loginForm.add(loginSubmitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        loginResetButton.setText("Reset");
        loginResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginResetButtonActionPerformed(evt);
            }
        });
        loginResetButton.setBounds(160, 140, 80, 23);
        loginForm.add(loginResetButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        userNameText.setBounds(130, 50, 80, 30);
        loginForm.add(userNameText, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("Password");
        jLabel6.setBounds(70, 100, 120, 14);
        loginForm.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("UserName");
        jLabel7.setBounds(70, 60, 120, 14);
        loginForm.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        softFailureAlert.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

private void loginSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSubmitButtonActionPerformed
        // TODO add your handling code here:
        String userName = userNameText.getText();
        String password = passwordText.getText();
        Boolean accountAvailable = false;
        int accountID = 0;
        int permission = 0;
        String accountPassword = "";
        String firstName = "";
        String lastName = "";
        
        DatabaseConnection dbConnect = new DatabaseConnection();
        Connection conn = dbConnect.connectToDB();
        
        // Query to see if account exists
        String sql = "SELECT COUNT(Username) as accountAvailable FROM `HD_Accounts` WHERE Username = '"+userName+"'"; 
        ResultSet rs = dbConnect.getResults(conn, sql);
        try {
            if (rs.next())
            {
                if(rs.getInt("accountAvailable") == 1)
                { 
                    accountAvailable = true;

                    sql = "SELECT * FROM `HD_Accounts` where Username = '"+userName+"'";
                    rs = dbConnect.getResults(conn, sql);

                    while(rs.next()){
                    //Retrieve by column name
                        accountID  = rs.getInt("id");
                        accountPassword = rs.getString("Password");
                        firstName = rs.getString("FirstName");
                        lastName = rs.getString("LastName");
                        permission = rs.getInt("Permission") + 1;
                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            loginForm.setVisible(false);
            new LandingForm(permission, accountID).setVisible(true);
        }
}//GEN-LAST:event_loginSubmitButtonActionPerformed

private void loginResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginResetButtonActionPerformed
        userNameText.setText("");
        passwordText.setText("");
}//GEN-LAST:event_loginResetButtonActionPerformed

private void submitQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitQuestionButtonActionPerformed
    landingPage.setVisible(false);
    WriteForums.setVisible(true);
}//GEN-LAST:event_submitQuestionButtonActionPerformed

private void seeAllQuestionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeAllQuestionsButtonActionPerformed
    landingPage.setVisible(false);
    //Query here to show all questions?
    String questionText;
    String questionTitle;
    
    DatabaseConnection dbConn = new DatabaseConnection();
    Connection conn = dbConn.connectToDB();
    
    String sql = "SELECT * FROM `Forums` order by `QuestionID` desc";
    
    dbConn.getResults(conn, sql);
    ResultSet rs = dbConn.getResults(conn, sql);
        try {
            /*
             * string.concat("question", i,"Title");
            while(rs.next()){
                //Retrieve by column name
                    accountID  = rs.getInt("id");
                    accountPassword = rs.getString("Password");
                    firstName = rs.getString("FirstName");
                    lastName = rs.getString("LastName");
                    question1Label.setText(questionTitle);
                    question1Text.setText(questionText);
             * i++;
                }
            */
            if (rs.next())
            {
                questionTitle = rs.getString("QuestionTitle");
                questionText = rs.getString("Question");
                
                question1Label.setText(questionTitle);
                question1Text.setText(questionText);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HelpDeskMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    ReadForums.setVisible(true);
}//GEN-LAST:event_seeAllQuestionsButtonActionPerformed

private void writeForumsSubmitQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeForumsSubmitQuestionButtonActionPerformed
        DatabaseConnection dbConn = new DatabaseConnection();
        Connection conn = dbConn.connectToDB();
        int visibility = writeForumsVisibilityCheckBox.isEnabled() ? 0 : 1;
        int visibleTo = 0; //need to set visibleTo to be userID if invisible to public
        //UserID!

        String sql = "INSERT INTO  `lepolted`.`Forums` ("
                + "`QuestionID` ,"
                + "`QuestionTitle` ,"
                + "`Question` ,"
                + "`Visibility` ,"
                + "`VisibleTo` ,"
                + "`Creator`"
                + ")"
                + "VALUES ("
                + "NULL , " //Auto Incremented QuestionID
                + "'" + questionTitleTextBox.getText() + "', "
                + "'" + forumQuestionTextArea.getText() + "',  " //Question Text
                + "'" + visibility + "', " // Visibility
                + "'" + visibleTo + "', " //Visible to
                + "'1')"; //Creator
        dbConn.updateDatabase(conn, sql);
        dbConn.cleanUp(conn);
        
        WriteForums.dispose();
        landingPage.setVisible(true);
}//GEN-LAST:event_writeForumsSubmitQuestionButtonActionPerformed

private void writeForumsCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeForumsCancelButtonActionPerformed
        WriteForums.dispose();
        landingPage.setVisible(true);
}//GEN-LAST:event_writeForumsCancelButtonActionPerformed

private void readForumsHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readForumsHomeButtonActionPerformed
        ReadForums.dispose();
        landingPage.setVisible(true);
}//GEN-LAST:event_readForumsHomeButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DatabaseConnection db = new DatabaseConnection();
        Connection conn = db.connectToDB();
        
        String sql = "Select * From `HD_Accounts` where 'Permissions' != 2";
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(HelpDeskMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpDeskMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpDeskMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpDeskMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HelpDeskMainFrame().setVisible(true);
            }
        });
    }
    int failure = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ReadForums;
    private javax.swing.JDialog WriteForums;
    private javax.swing.JDialog failureAlert;
    private javax.swing.JTextArea forumQuestionTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog landingPage;
    private javax.swing.JLayeredPane loginForm;
    private javax.swing.JButton loginResetButton;
    private javax.swing.JButton loginSubmitButton;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel question1Label;
    private javax.swing.JTextArea question1Text;
    private javax.swing.JTextField questionTitleTextBox;
    private javax.swing.JButton readForumsHomeButton;
    private javax.swing.JButton seeAllQuestionsButton;
    private javax.swing.JDialog softFailureAlert;
    private javax.swing.JButton submitQuestionButton;
    private javax.swing.JTextField userNameText;
    private javax.swing.JButton writeForumsCancelButton;
    private javax.swing.JButton writeForumsSubmitQuestionButton;
    private javax.swing.JCheckBox writeForumsVisibilityCheckBox;
    // End of variables declaration//GEN-END:variables
}
