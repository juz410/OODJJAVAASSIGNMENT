/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UserMainPage extends javax.swing.JFrame 
{
    private String userID;
    Users user = new Users();
    CurrentDateTime currentDateTime = new CurrentDateTime();
    public UserMainPage(String userID) 
    {
        initComponents();
        this.userID = userID;
        this.userID = userID;
        Appointment appointment = new Appointment();
        user.userProfile(this.userID);
        lblTitle.setText(user.getName());
        lblVacStatus.setText("<html><b><u>Vaccination Status</u><b><html>");
        lblTime.setText("<html>" + currentDateTime.currentDate() + " <br> " +
                currentDateTime.currentWeek() + "<br>" +
                currentDateTime.currentTime() + "<html>");
        
        //Dialog disign
        lblUsernameDG.setText(user.getName());
        lblIC.setText(user.getIC());

        appointment.digitalCertificate(this.userID,"FirstDose");
        lblDate1.setText(appointment.getDate());
        lblCenterID1.setText(appointment.getCenterID());
        lblVaccineID1.setText(appointment.getVacID());
        lblVaccineType1.setText(appointment.getVacType());
        ////////////////////////////////////////////////////////
        appointment.digitalCertificate(this.userID,"SecondDose");
        lblDate2.setText(appointment.getDate());
        lblCenterID2.setText(appointment.getCenterID());
        lblVaccineID2.setText(appointment.getVacID());
        lblVaccineType2.setText(appointment.getVacType());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgDoseStatus = new javax.swing.JDialog();
        plDoseStatus = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblTITLE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIC = new javax.swing.JLabel();
        lblUsernameDG = new javax.swing.JLabel();
        plDose1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblVaccineID1 = new javax.swing.JLabel();
        lblDate1 = new javax.swing.JLabel();
        lblCenterID1 = new javax.swing.JLabel();
        lblVaccineType1 = new javax.swing.JLabel();
        plDose2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblVaccineID2 = new javax.swing.JLabel();
        lblDate2 = new javax.swing.JLabel();
        lblCenterID2 = new javax.swing.JLabel();
        lblVaccineType2 = new javax.swing.JLabel();
        plUserMain = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnProfile = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        lblVacStatus = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        dlgDoseStatus.setMinimumSize(new java.awt.Dimension(665, 580));

        plDoseStatus.setBackground(new java.awt.Color(255, 204, 102));

        lblTitle2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Digital Certificate");

        lblTITLE.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTITLE.setText("Covid-19 Vaccination");

        jLabel3.setText("———————————————————————————————————————————————————————————————");

        lblIC.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        lblIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIC.setText("IC");

        lblUsernameDG.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblUsernameDG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsernameDG.setText("UserName");

        plDose1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Dose 1:");

        jLabel9.setText("Date:");

        jLabel10.setText("CenterID:");

        jLabel11.setText("Vaccine Type:");

        jLabel12.setText("Vaccine ID:");

        lblVaccineID1.setText("                                      ");

        lblDate1.setText("                                      ");

        lblCenterID1.setText("                                      ");

        lblVaccineType1.setText("                                  ");

        javax.swing.GroupLayout plDose1Layout = new javax.swing.GroupLayout(plDose1);
        plDose1.setLayout(plDose1Layout);
        plDose1Layout.setHorizontalGroup(
            plDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDose1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(plDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(plDose1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(plDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCenterID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVaccineType1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVaccineID1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plDose1Layout.setVerticalGroup(
            plDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDose1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(plDose1Layout.createSequentialGroup()
                        .addComponent(lblDate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCenterID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVaccineID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVaccineType1))
                    .addGroup(plDose1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        plDose2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Dose 2:");

        jLabel13.setText("Date:");

        jLabel14.setText("CenterID:");

        jLabel15.setText("Vaccine Type:");

        jLabel16.setText("Vaccine ID:");

        lblVaccineID2.setText("                                            ");

        lblDate2.setText("                                     ");

        lblCenterID2.setText("                                           ");

        lblVaccineType2.setText("                                             ");

        javax.swing.GroupLayout plDose2Layout = new javax.swing.GroupLayout(plDose2);
        plDose2.setLayout(plDose2Layout);
        plDose2Layout.setHorizontalGroup(
            plDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDose2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(plDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addGroup(plDose2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel15)))
                .addGap(18, 18, 18)
                .addGroup(plDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCenterID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVaccineType2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDate2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVaccineID2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plDose2Layout.setVerticalGroup(
            plDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDose2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(plDose2Layout.createSequentialGroup()
                        .addComponent(lblDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCenterID2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVaccineID2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVaccineType2))
                    .addGroup(plDose2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout plDoseStatusLayout = new javax.swing.GroupLayout(plDoseStatus);
        plDoseStatus.setLayout(plDoseStatusLayout);
        plDoseStatusLayout.setHorizontalGroup(
            plDoseStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDoseStatusLayout.createSequentialGroup()
                .addGroup(plDoseStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plDoseStatusLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(plDoseStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(plDose1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(plDose2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(plDoseStatusLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(plDoseStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTITLE)
                            .addGroup(plDoseStatusLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblTitle2))))
                    .addGroup(plDoseStatusLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblUsernameDG, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plDoseStatusLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(lblIC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        plDoseStatusLayout.setVerticalGroup(
            plDoseStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDoseStatusLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTITLE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(lblUsernameDG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plDose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plDose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgDoseStatusLayout = new javax.swing.GroupLayout(dlgDoseStatus.getContentPane());
        dlgDoseStatus.getContentPane().setLayout(dlgDoseStatusLayout);
        dlgDoseStatusLayout.setHorizontalGroup(
            dlgDoseStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDoseStatusLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(plDoseStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        dlgDoseStatusLayout.setVerticalGroup(
            dlgDoseStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgDoseStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plDoseStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plUserMain.setBackground(new java.awt.Color(102, 102, 102));
        plUserMain.setLayout(null);

        lblTitle1.setBackground(new java.awt.Color(102, 102, 102));
        lblTitle1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Welcome Back");
        plUserMain.add(lblTitle1);
        lblTitle1.setBounds(50, 40, 260, 50);

        lblTitle.setBackground(new java.awt.Color(102, 102, 102));
        lblTitle.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("User Name");
        plUserMain.add(lblTitle);
        lblTitle.setBounds(30, 70, 300, 50);

        btnProfile.setBackground(new java.awt.Color(51, 51, 51));
        btnProfile.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        plUserMain.add(btnProfile);
        btnProfile.setBounds(110, 130, 120, 48);

        btnAppointment.setBackground(new java.awt.Color(51, 51, 51));
        btnAppointment.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnAppointment.setText("Appointment");
        btnAppointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });
        plUserMain.add(btnAppointment);
        btnAppointment.setBounds(110, 300, 120, 48);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Profile");
        plUserMain.add(jLabel1);
        jLabel1.setBounds(200, 180, 69, 14);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Appointment");
        plUserMain.add(jLabel2);
        jLabel2.setBounds(190, 350, 100, 15);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ModifyProfile");
        plUserMain.add(jLabel4);
        jLabel4.setBounds(200, 260, 69, 15);

        btnModify.setBackground(new java.awt.Color(51, 51, 51));
        btnModify.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnModify.setText("Modify");
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        plUserMain.add(btnModify);
        btnModify.setBounds(110, 210, 120, 48);

        lblVacStatus.setBackground(new java.awt.Color(102, 102, 102));
        lblVacStatus.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        lblVacStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblVacStatus.setText("Vaccination Status:");
        lblVacStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVacStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVacStatusMouseClicked(evt);
            }
        });
        plUserMain.add(lblVacStatus);
        lblVacStatus.setBounds(10, 390, 202, 15);

        lblTime.setBackground(new java.awt.Color(102, 102, 102));
        lblTime.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("jLabel5");
        plUserMain.add(lblTime);
        lblTime.setBounds(310, 0, 70, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plUserMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plUserMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        UserProfilePage userProfilePage = new UserProfilePage(this.userID);
        this.setVisible(false);
        userProfilePage.setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        Validation validation = new Validation();
        if (validation.validationUserModify(this.userID))
        {
            UserModifyProfilePage userModifyProfilePage = new UserModifyProfilePage(this.userID);
            this.setVisible(false);
            this.dispose();
            userModifyProfilePage.setVisible(true);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        // TODO add your handling code here:
        user.userProfile(this.userID);
        if ("SecondDose".equals(user.getVacStatus()))
        {
            JOptionPane.showMessageDialog(null, "<html> Congratulation! You have been vaccinated!"
                    + " <br> No appointment required! <html>");
        }
        else
        {
            UserAppointmentMainPage userAppointment = new UserAppointmentMainPage(this.userID);
            this.setVisible(false);
            userAppointment.setVisible(true);
        }
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void lblVacStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVacStatusMouseClicked
        // TODO add your handling code here:
        lblVacStatus.addMouseListener(new MouseAdapter()  
        {  
            public void mouseClicked(MouseEvent e)  
            {  
                dlgDoseStatus.setVisible(true);
            }  
        }); 
    }//GEN-LAST:event_lblVacStatusMouseClicked

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
            java.util.logging.Logger.getLogger(UserMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMainPage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnProfile;
    private javax.swing.JDialog dlgDoseStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCenterID1;
    private javax.swing.JLabel lblCenterID2;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblDate2;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblTITLE;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblUsernameDG;
    private javax.swing.JLabel lblVacStatus;
    private javax.swing.JLabel lblVaccineID1;
    private javax.swing.JLabel lblVaccineID2;
    private javax.swing.JLabel lblVaccineType1;
    private javax.swing.JLabel lblVaccineType2;
    private javax.swing.JPanel plDose1;
    private javax.swing.JPanel plDose2;
    private javax.swing.JPanel plDoseStatus;
    private javax.swing.JPanel plUserMain;
    // End of variables declaration//GEN-END:variables
}
