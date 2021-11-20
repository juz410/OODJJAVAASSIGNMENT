/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AdminModifyUserAccountPage extends javax.swing.JFrame {

    public static Users user = new Users();
    Users admin = new Users();
    public AdminModifyUserAccountPage(Users u,String adminID) {
        initComponents();
        this.setLocationRelativeTo(null);
        admin.setUserID(adminID);
        user = u;
        txtName.setEditable(false);
        txtPassword.setEditable(false);
        cbGender.setEnabled(false);
        txtPhone.setEditable(false);
        txtEmail.setEditable(false);
        txtAddress.setEditable(false);
        txtIC.setEditable(false);
        cbState.setEnabled(false);
        cbCountry.setEnabled(false);
        cbVaccine.setEnabled(false);
        btnSave.setEnabled(false);
        lblUID.setText(user.getUserID());
        txtName.setText(user.getName());
        txtPassword.setText(user.getPassword());
        cbGender.setSelectedItem(user.getGender());
        txtPhone.setText(user.getPhoneNo());
        txtEmail.setText(user.getEmail());
        txtAddress.setText(user.getAddress());
        txtIC.setText(user.getIC());
        cbState.setSelectedItem(user.getState());
        cbCountry.setSelectedItem(user.getCountry());
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
        lblCountry = new javax.swing.JLabel();
        cbState = new javax.swing.JComboBox<>();
        cbCountry = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        lblIC = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        txtPhone = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblEmail = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUID = new javax.swing.JLabel();
        chkModify = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbVaccine = new javax.swing.JComboBox<>();
        lblAddress1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        lblCountry.setBackground(new java.awt.Color(102, 102, 102));
        lblCountry.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblCountry.setForeground(new java.awt.Color(255, 255, 255));
        lblCountry.setText("Country:");
        jPanel1.add(lblCountry);
        lblCountry.setBounds(50, 320, 50, 17);

        cbState.setBackground(new java.awt.Color(102, 102, 102));
        cbState.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Kuala Lumpur", "Kedah", "Kelantan", "Labuan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Putrajaya", "Sabah", "Sarawak", "Selangor", "Terengganu" }));
        jPanel1.add(cbState);
        cbState.setBounds(120, 290, 176, 23);

        cbCountry.setBackground(new java.awt.Color(102, 102, 102));
        cbCountry.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        jPanel1.add(cbCountry);
        cbCountry.setBounds(120, 320, 174, 23);

        txtEmail.setBackground(new java.awt.Color(102, 102, 102));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(119, 206, 180, 15);

        lblIC.setBackground(new java.awt.Color(102, 102, 102));
        lblIC.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblIC.setForeground(new java.awt.Color(255, 255, 255));
        lblIC.setText("IC/Passport:");
        jPanel1.add(lblIC);
        lblIC.setBounds(38, 260, 70, 17);

        txtAddress.setBackground(new java.awt.Color(102, 102, 102));
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setBorder(null);
        txtAddress.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtAddress);
        txtAddress.setBounds(120, 230, 180, 15);

        lblPassword.setBackground(new java.awt.Color(102, 102, 102));
        lblPassword.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(47, 125, 50, 17);

        lblAddress.setBackground(new java.awt.Color(102, 102, 102));
        lblAddress.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Current Address:");
        jPanel1.add(lblAddress);
        lblAddress.setBounds(20, 230, 90, 17);

        txtIC.setBackground(new java.awt.Color(102, 102, 102));
        txtIC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIC.setForeground(new java.awt.Color(255, 255, 255));
        txtIC.setBorder(null);
        txtIC.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtIC);
        txtIC.setBounds(120, 260, 180, 15);

        lblName.setBackground(new java.awt.Color(102, 102, 102));
        lblName.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        jPanel1.add(lblName);
        lblName.setBounds(64, 100, 40, 17);

        lblGender.setBackground(new java.awt.Color(102, 102, 102));
        lblGender.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender:");
        jPanel1.add(lblGender);
        lblGender.setBounds(57, 153, 40, 17);

        lblPhone.setBackground(new java.awt.Color(102, 102, 102));
        lblPhone.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Phone:");
        jPanel1.add(lblPhone);
        lblPhone.setBounds(60, 181, 40, 17);

        cbGender.setBackground(new java.awt.Color(102, 102, 102));
        cbGender.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jPanel1.add(cbGender);
        cbGender.setBounds(119, 150, 180, 23);

        txtPhone.setBackground(new java.awt.Color(102, 102, 102));
        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(255, 255, 255));
        txtPhone.setBorder(null);
        txtPhone.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPhone);
        txtPhone.setBounds(119, 181, 180, 15);

        lblTitle.setBackground(new java.awt.Color(102, 102, 102));
        lblTitle.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Admin Modifiy User");
        jPanel1.add(lblTitle);
        lblTitle.setBounds(30, 0, 330, 70);

        txtName.setBackground(new java.awt.Color(102, 102, 102));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(123, 100, 180, 15);

        txtPassword.setBackground(new java.awt.Color(102, 102, 102));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPassword);
        txtPassword.setBounds(123, 125, 180, 15);

        lblEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(161, 206, 33, 14);

        lblState.setBackground(new java.awt.Color(102, 102, 102));
        lblState.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblState.setForeground(new java.awt.Color(255, 255, 255));
        lblState.setText("Current State:");
        jPanel1.add(lblState);
        lblState.setBounds(30, 290, 75, 17);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 80, 40, 17);
        jPanel1.add(lblUID);
        lblUID.setBounds(123, 80, 0, 0);

        chkModify.setBackground(new java.awt.Color(102, 102, 102));
        chkModify.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        chkModify.setForeground(new java.awt.Color(255, 255, 255));
        chkModify.setText("Modify Mode");
        chkModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkModifyActionPerformed(evt);
            }
        });
        jPanel1.add(chkModify);
        chkModify.setBounds(250, 370, 100, 23);

        btnSave.setBackground(new java.awt.Color(102, 102, 102));
        btnSave.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(130, 410, 100, 40);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vaccine Status:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 350, 80, 17);

        cbVaccine.setBackground(new java.awt.Color(102, 102, 102));
        cbVaccine.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbVaccine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NoDose", "FirstDose", "SecondDose" }));
        jPanel1.add(cbVaccine);
        cbVaccine.setBounds(120, 350, 85, 23);

        lblAddress1.setBackground(new java.awt.Color(102, 102, 102));
        lblAddress1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblAddress1.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress1.setText("Email:");
        jPanel1.add(lblAddress1);
        lblAddress1.setBounds(60, 197, 40, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("——————————————————");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 130, 230, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("——————————————————");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 110, 230, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("——————————————————");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 190, 230, 10);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("——————————————————");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 216, 230, 14);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("——————————————————");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 240, 230, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("——————————————————");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 270, 230, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkModifyActionPerformed
       if(chkModify.isSelected())
        {
            txtName.setEditable(true);
            txtPassword.setEditable(true);
            cbGender.setEnabled(true);
            txtPhone.setEditable(true);
            txtEmail.setEditable(true);
            txtAddress.setEditable(true);
            txtIC.setEditable(true);
            cbState.setEnabled(true);
            cbCountry.setEnabled(true);
            cbVaccine.setEnabled(true);
            btnSave.setEnabled(true);
        }else
        {
            txtName.setEditable(false);
            txtPassword.setEditable(false);
            cbGender.setEnabled(false);
            txtPhone.setEditable(false);
            txtEmail.setEditable(false);
            txtAddress.setEditable(false);
            txtIC.setEditable(false);
            cbState.setEnabled(false);
            cbCountry.setEnabled(false);
            cbVaccine.setEnabled(false);
            btnSave.setEnabled(false);
        }
    }//GEN-LAST:event_chkModifyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        user.setName(txtName.getText());
        user.setPassword(txtPassword.getText());
        user.setGender(cbGender.getSelectedItem().toString());
        user.setPhoneNo(txtPhone.getText());
        user.setEmail(txtEmail.getText());
        user.setAddress(txtAddress.getText());
        user.setIC(txtIC.getText());
        user.setState(cbState.getSelectedItem().toString());
        user.setCountry(cbCountry.getSelectedItem().toString());
        user.setVacStatus(cbVaccine.getSelectedItem().toString());
        user.AdminUserModify(admin.getUserID());

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(AdminModifyUserAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminModifyUserAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminModifyUserAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminModifyUserAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminModifyUserAccountPage(user,"").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbCountry;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbState;
    private javax.swing.JComboBox<String> cbVaccine;
    private javax.swing.JCheckBox chkModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUID;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
