
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
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
 * @author csea4015
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    private Connection conn; 
    private ArrayList<String> logs = new ArrayList<String>();  
    public admin() {
        initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            // The credentials for the mysql account will differ
            this.conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ssncoe","root","Thewilltoact");
            //JOptionPane.showMessageDialog(this,"Connected to database!");
            
            String query = "select * from logs"; 
            PreparedStatement ps = this.conn.prepareStatement(query); 
            ResultSet rs = ps.executeQuery(); 
            
            while (rs.next()) { 
                this.logs.add(rs.getString("logMessage"));  
            }
        }
        catch(ClassNotFoundException | SQLException e){System.out.println(e);} 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADMIN DASHBOARD");

        jToggleButton4.setText("LOG OUT");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("GENERATE HALL TICKET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PUBLISH RESULTS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VIEW LOGS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("NEW SEMESTER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        try{ 
            login Login = new login(); 
            Login.setVisible(true); 
            this.dispose();
        } 
        catch (SQLException e){JOptionPane.showMessageDialog(this, e);}
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (!this.logs.contains("Halltickets generated")) {  
        
            String query = "select studentID,Attendance from studentDetails";          
            String studentID, updateQuery; 
            float att; 
            try { 
                PreparedStatement st = conn.prepareStatement(query); 
                ResultSet rs = st.executeQuery();      
                
                while (rs.next()){
                    studentID = rs.getString("studentID");
                    att = rs.getFloat("Attendance");  
                    
                    if (att>=75){ 
                        updateQuery = "update studentDetails set updates='Hallticket ready' where studentID = " + "'" + studentID +"'";
                        try{
                            PreparedStatement innerSt = conn.prepareStatement(updateQuery); 
                            innerSt.executeUpdate(); 
                        }
                       
                        catch (SQLException e) {
                            System.out.println(e); 
                        }
                    } 
                    else {
                        updateQuery = "update studentDetails set updates='Hallticket NOT generated. Meet concerned faculty' where studentID = " + "'" + studentID +"'";
                        try{
                            PreparedStatement innerSt = conn.prepareStatement(updateQuery); 
                            innerSt.executeUpdate(); 
                        }
                        catch (SQLException e) {
                            System.out.println(e); 
                        }
                    }
                }
            }
            catch(Exception e) { 
                JOptionPane.showMessageDialog(this, e); 
            }
            JOptionPane.showMessageDialog(this, "Generated halltickets!"); 
            String updateLogs = "insert into logs values (\"Halltickets generated\")"; 
            try{ 
                PreparedStatement addLog = conn.prepareStatement(updateLogs); 
                addLog.execute();    
            }
            catch(SQLException e){JOptionPane.showMessageDialog(this,e);} 
        }  
        else 
            JOptionPane.showMessageDialog(this,"Already generated halltickets!");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String query = "select * from studentDetails"; 
        String studentID,remarks; 
        String updateQuery = null; 
        
        if (this.logs.contains("Halltickets generated") && !this.logs.contains("Results published")){ 
        
            try{ 
                PreparedStatement st = conn.prepareStatement(query); 
                ResultSet rs = st.executeQuery();
            
                while (rs.next()){ 
                    studentID = rs.getString("studentID");
                    remarks = rs.getString("RESULT_REMARKS");  
                    
                    System.out.println(remarks);
                
                    try{ 
                    if (!remarks.equals("All OK")) 
                        updateQuery = "update studentDetails set updates = 'results withheld' where studentID = " + "'" + studentID + "'";
                    else
                        updateQuery = "update studentDetails set updates = 'results published' where studentID = " + "'" + studentID + "'";
                    } 
                    catch(NullPointerException e){
                        updateQuery = "update studentDetails set updates = 'results withheld' where studentID = " + "'" + studentID + "'";
                    }  
                    try{ 
                        PreparedStatement innerSt = conn.prepareStatement(updateQuery);
                        innerSt.executeUpdate();
                    }
                    catch(SQLException e){JOptionPane.showMessageDialog(this, e);} 
                    
                }
            }
            catch (SQLException e){JOptionPane.showMessageDialog(this,e);}
            
            String updateLogs = "insert into logs values (\"Results published\")"; 
            try{ 
                PreparedStatement addLog = conn.prepareStatement(updateLogs); 
                addLog.execute(); 
            }
            catch(SQLException e){JOptionPane.showMessageDialog(this,e);}  
            JOptionPane.showMessageDialog(this,"Results published!"); 
        } 
        else 
            JOptionPane.showMessageDialog(this, "Cannot publish!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private String getLogString(){                
        Object[] array = this.logs.toArray();
        StringBuilder str = new StringBuilder(); 
        int i = 1; 
        
        for (Object o:array) { 
            String s = (String) o; 
            str.append(String.valueOf(i) + ". " + s + "\n");
            i++;
        }        
        
        return str.toString();  
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: 
        String logString = this.getLogString();
        //System.out.println(logString);  
        JOptionPane.showMessageDialog(null, logString);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int response = JOptionPane.showConfirmDialog(this, "Do you want to reset?");
        //System.out.print(response);
        
        if (response == 0) { 
        
            String query = "TRUNCATE TABLE logs";
            PreparedStatement ps;
            try{ 
                ps = this.conn.prepareStatement(query);  
                ps.execute(); 
            } catch (SQLException e){JOptionPane.showMessageDialog(this,e);} 
        
            try{ 
                query = "update studentDetails set Updates = null, Attendance=null, subject_1_score = null, subject_2_score = null";     
                ps = this.conn.prepareStatement(query); 
                ps.executeUpdate(); 
            } catch(SQLException e){JOptionPane.showMessageDialog(this, e);}  
            
            JOptionPane.showMessageDialog(this,"RESET. Cannot undo."); 
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
