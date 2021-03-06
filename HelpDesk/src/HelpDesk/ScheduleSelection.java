/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HelpDesk;



import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;


/**
 *
 * @author scheetaa
 */
public class ScheduleSelection extends javax.swing.JFrame {
    private int userID;
    private boolean editable;
    /**
     * Creates new form ScheduleSelection
     */
    public ScheduleSelection() {
        initComponents();
    }
    public ScheduleSelection(int userID, boolean editable) {
        this.userID = userID;
        this.editable = editable;
        initComponents();
        setSchedule(userID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitSchedulePane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scheduleSelectEndDate = new javax.swing.JTextField();
        scheduleSelectStartDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        timeTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        submitSchedule = new javax.swing.JButton();
        clearTimes = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        submitSchedulePane.setBorder(javax.swing.BorderFactory.createTitledBorder("Submit Schedule"));

        jLabel1.setText("Schedule Effective Start Date: ");

        jLabel2.setText("Schedule Effective End Date: ");

        scheduleSelectEndDate.setText("MM/DD/YYYY");
        scheduleSelectEndDate.setToolTipText("Enter the date in which your submitted schedule will end.");

        scheduleSelectStartDate.setText("MM/DD/YYYY");
        scheduleSelectStartDate.setToolTipText("Enter the date in which your submitted schedule will begin.");

        timeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Start Time", null, null, null, null, null, null, null},
                {"End Time", null, null, null, null, null, null, null}
            },
            new String [] {
                "Times", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(timeTable);

        jLabel3.setText("Please enter times in the form X:XX AM or X:XX PM");

        if(!editable)
        {
            submitSchedule.setVisible(false);
        }
        submitSchedule.setText("Submit");
        submitSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitScheduleActionPerformed(evt);
            }
        });

        if(!editable)
        {
            clearTimes.setVisible(false);
        }
        clearTimes.setText("Clear Times");
        clearTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTimesActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout submitSchedulePaneLayout = new javax.swing.GroupLayout(submitSchedulePane);
        submitSchedulePane.setLayout(submitSchedulePaneLayout);
        submitSchedulePaneLayout.setHorizontalGroup(
            submitSchedulePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitSchedulePaneLayout.createSequentialGroup()
                .addGroup(submitSchedulePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(submitSchedulePaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(submitSchedulePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addGroup(submitSchedulePaneLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(scheduleSelectStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(scheduleSelectEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(submitSchedulePaneLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel3)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addGroup(submitSchedulePaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submitSchedule)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(clearTimes)))
                .addContainerGap())
        );
        submitSchedulePaneLayout.setVerticalGroup(
            submitSchedulePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitSchedulePaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(submitSchedulePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(scheduleSelectStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scheduleSelectEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(submitSchedulePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitSchedule)
                    .addComponent(clearTimes)
                    .addComponent(ExitButton))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitSchedulePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitSchedulePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setSchedule(int userID)
    {
        String[] startTimes = new String[7];
        String[] endTimes = new String[7];
        String startDate = "";
        String endDate = "";
        int k = 0;
        
        DatabaseConnection db = new DatabaseConnection();
        Connection conn = db.connectToDB();
        String sql = "SELECT * FROM  `TASchedule` WHERE AssistantID = '" + userID + "' order by DayOfWeek asc";
        ResultSet rs = db.getResults(conn, sql);
        try {
            while(rs.next())
            {
                startTimes[k] = rs.getString("StartTime");
                endTimes[k] = rs.getString("EndTime");
                
                startDate = rs.getString("StartDate");
                endDate = rs.getString("EndDate");
                k++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        scheduleSelectStartDate.setText(startDate);
        scheduleSelectEndDate.setText(endDate);
        
        for(int j = 0; j < 1; j++)
        {
            for (int i =  1; i < 8; i++)
            {
                timeTable.setValueAt(startTimes[i-1], j, i);
            }
        }
        for(int j = 1; j < 2; j++)
        {
            for (int i =  1; i < 8; i++)
            {
                timeTable.setValueAt(endTimes[i-1], j, i);
            }
        }
        
    }
    private void submitScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitScheduleActionPerformed

        int[] daysOfWeek = {0,1,2,3,4,5,6};
        String[] startTimes = new String[7];
        String[] endTimes = new String[7];
        String startDate;
        String endDate;
        boolean assistantExists = false;
        int sqlID = 0;
        
        for(int j = 0; j < 2; j++)
        {
            for (int i =  1; i < 8; i++)
            {
                switch (j)
                {
                    case 0:
                        if (timeTable.getValueAt(j, i) == null)
                        {
                            startTimes[i-1] = "";
                        }
                        else
                        {
                            startTimes[i-1] = (String) timeTable.getValueAt(j, i);
                        }
                        break;
                    case 1:
                        if (timeTable.getValueAt(j, i) == null)
                        {
                            endTimes[i-1] = "";
                        }
                        else
                        {
                            endTimes[i-1] = (String) timeTable.getValueAt(j, i);
                        }
                        break;
                }
            }
        }
        
        //Database
        DatabaseConnection dbConnect = new DatabaseConnection();
        Connection conn = dbConnect.connectToDB();
        //String sql = "SELECT COUNT(Username) as accountAvailable FROM `HD_Accounts` WHERE Username = '"+userName+"'"; 
        //ResultSet rs = dbConnect.getResults(conn, sql);
        
        startDate = scheduleSelectStartDate.getText();
        endDate = scheduleSelectEndDate.getText();
        String checkSQL = "Select * FROM TASchedule where AssistantID = "
                + "'"+userID+"' order by ID asc";
        ResultSet rs = dbConnect.getResults(conn, checkSQL);
        String preSQL = "";
        try {
            if(rs.next())
            {
                sqlID = rs.getInt("ID");
                preSQL = "UPDATE  `lepolted`.`TASchedule` SET ";
                //preSQL = "Update"
                assistantExists = true;      
            }
            else
            {
                preSQL = "INSERT INTO  `lepolted`.`TASchedule` ("
                            + "`StartDate` ,"
                            + "`EndDate` ,"
                            + "`DayOfWeek` ,"
                            + "`StartTime` ,"
                            + "`EndTime` ,"
                            + "`AssistantID`)"
                            + "VALUES ("
                            + "'"+startDate+"',"
                            + "'"+endDate+"',";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String postSQL = "";
        String sql = "";
        if (assistantExists)
        {
            for(int i=0; i<=6; i++)
            {
                postSQL = "";
                postSQL += "`StartDate` = '" + startDate + "', ";
                postSQL += "`EndDate` = '" + endDate + "', ";
                postSQL += "`StartTime` = '" + startTimes[i] + "', ";
                postSQL += "`EndTime` = '" + endTimes[i] + "' ";
                postSQL += "where `TASchedule`.`ID` = "+ sqlID;
                sql = preSQL + postSQL;
                dbConnect.updateDatabase(conn, sql);
                sqlID++;
            }
            
        }
        else
        {
            for(int i=0; i<=6; i++)
            {
                postSQL = "'" + daysOfWeek[i]+"', ";
                postSQL += "'" + startTimes[i] + "', ";
                postSQL += "'" + endTimes[i] + "', ";
                postSQL += "'" + userID + "'";
                sql = preSQL + postSQL + ")";
                dbConnect.updateDatabase(conn, sql);
            }
        }
        this.dispose();
    }//GEN-LAST:event_submitScheduleActionPerformed

    private void clearTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTimesActionPerformed
        // TODO add your handling code here:
        for(int j = 0; j < 2; j++)
        {
            for (int i =  1; i < 8; i++)
            {
                timeTable.setValueAt("", j, i);
            }
        }
    }//GEN-LAST:event_clearTimesActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ScheduleSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ScheduleSelection().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton clearTimes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField scheduleSelectEndDate;
    private javax.swing.JTextField scheduleSelectStartDate;
    private javax.swing.JButton submitSchedule;
    private javax.swing.JPanel submitSchedulePane;
    private javax.swing.JTable timeTable;
    // End of variables declaration//GEN-END:variables
}
