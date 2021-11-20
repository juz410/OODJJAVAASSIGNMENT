/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UserAppointmentMainPage extends javax.swing.JFrame {

    /**
     * Creates new form UserAppointmentMainPage
     */
    private String userID;
    private CurrentDateTime currentDateTime = new CurrentDateTime();
    public UserAppointmentMainPage(String userID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.userID = userID;
        
        lblTime.setText("<html>" + currentDateTime.currentDate() + " <br> " +
                currentDateTime.currentWeek() + "<br>" +
                currentDateTime.currentTime() + "<html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        btnRegister.setBackground(new java.awt.Color(102, 102, 102));
        btnRegister.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister);
        btnRegister.setBounds(110, 150, 106, 48);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Appointment");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 290, 100, 17);

        btnView.setBackground(new java.awt.Color(102, 102, 102));
        btnView.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView);
        btnView.setBounds(110, 240, 106, 48);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add Appointment");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 200, 100, 17);

        lblTitle.setBackground(new java.awt.Color(102, 102, 102));
        lblTitle.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Appoinment");
        jPanel1.add(lblTitle);
        lblTitle.setBounds(70, 50, 210, 70);

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(250, 360, 90, 20);

        lblTime.setBackground(new java.awt.Color(102, 102, 102));
        lblTime.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("jLabel2");
        jPanel1.add(lblTime);
        lblTime.setBounds(300, 0, 70, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UserMainPage userMainPage = new UserMainPage(this.userID);
        userMainPage.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        Appointment appointment = new Appointment();
        Validation validation = new Validation();
        boolean pass = false;
        
        if (appointment.firstDoseDone(userID))//checking first dose done or not
        {
            String[] bookDate = appointment.getDate().split("/");
            System.out.print(bookDate[0]+"/"+bookDate[1]+"/"+bookDate[2]);
            if (validation.validationDate(Integer.valueOf(bookDate[2]), Integer.valueOf(bookDate[1]),
                    Integer.valueOf(bookDate[0]), "30M")) //Check if the first dose has been 1 month later
            {
                if (appointment.viewAppointment(userID))//Check if the user has an appointment before
                {
                    if ( ("FirstDose".equals(appointment.getVacDose()) || "SecondDose".equals(appointment.getVacDose())) && 
                            ("Requesting".equals(appointment.getAptStatus()) || "Approved".equals(appointment.getAptStatus()) ||
                            "Request Cancellation".equals(appointment.getAptStatus()))) //Check if the user has an appointment
                    {
                        JOptionPane.showMessageDialog(null, "You already have an appointment!");
                    }
                    else
                    {
                        pass = true;
                    }
                }
                else
                {
                    pass = true;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "<html>Your 1st Dose is at: " + appointment.getDate() +
                        "<br> Please make appointment after <b>1</b> month! <html>");
            }
        }
        else
        {
            if (appointment.viewAppointment(userID))//Check if the user has an appointment before
            {
                if ( ("FirstDose".equals(appointment.getVacDose()) || "SecondDose".equals(appointment.getVacDose())) && 
                        ("Requesting".equals(appointment.getAptStatus()) || "Approved".equals(appointment.getAptStatus()) ||
                        "Request Cancellation".equals(appointment.getAptStatus()))) //Check if the user has an appointment
                {
                    JOptionPane.showMessageDialog(null, "You already have an appointment!");
                }
                else
                {
                    pass = true;
                }
            }
            else
            {
                pass = true;
            }
        }
        
        if (pass)
        {
            UserAppointmentRegisterPage userAppointmentRegisterPage = new UserAppointmentRegisterPage(this.userID);
            userAppointmentRegisterPage.setVisible(true);
            this.setVisible(false);
            this.dispose();   
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        UserAppointmentViewPage userAppointmentViewPage = new UserAppointmentViewPage(this.userID);
        userAppointmentViewPage.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnViewActionPerformed

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
            java.util.logging.Logger.getLogger(UserAppointmentMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAppointmentMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAppointmentMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAppointmentMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAppointmentMainPage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
