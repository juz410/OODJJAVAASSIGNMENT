/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;



/**
 *
 * @author user
 */
public class RegisterPage extends javax.swing.JFrame {
    private String role;
    /**
     * Creates new form RegisterPage
     */
    
    public RegisterPage(String R) 
    {
        
        initComponents();
        role = R;
        if (role.equals("Admin"))
        {
            btnBack.setText("Back to User Main Page");
        }else
        {
            btnBack.setText("Back to Login");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plUserRegister = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        cbRegisterAdmin = new javax.swing.JCheckBox();
        lblEmail = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
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
        lblCPassword = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        txtPhone = new javax.swing.JTextField();
        cbShowPassword = new javax.swing.JCheckBox();
        txtCPassword = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblRole = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Register");

        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        cbRegisterAdmin.setText("Register Admin");
        cbRegisterAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbRegisterAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRegisterAdminActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEmail.setText("Email:");

        lblState.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblState.setText("Current State:");

        lblCountry.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCountry.setText("Country:");

        cbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Kuala Lumpur", "Kedah", "Kelantan", "Labuan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Putrajaya", "Sabah", "Sarawak", "Selangor", "Terengganu" }));

        cbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        txtEmail.setBorder(null);
        txtEmail.setCaretColor(java.awt.Color.darkGray);

        lblIC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIC.setText("IC/Passport:");

        txtAddress.setBorder(null);
        txtAddress.setCaretColor(java.awt.Color.darkGray);

        lblPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPassword.setText("Password:");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAddress.setText("Current Address:");

        txtIC.setBorder(null);
        txtIC.setCaretColor(java.awt.Color.darkGray);

        lblName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblName.setText("Name:");

        lblGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblGender.setText("Gender:");

        lblPhone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPhone.setText("Phone:");

        lblCPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCPassword.setText("Confirm Password:");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));

        txtPhone.setBorder(null);
        txtPhone.setCaretColor(java.awt.Color.darkGray);

        cbShowPassword.setText("jCheckBox1");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        txtCPassword.setBorder(null);

        txtName.setBorder(null);
        txtName.setCaretColor(java.awt.Color.darkGray);

        txtPassword.setBorder(null);

        lblRole.setText("testing");

        btnBack.setText("Back to Previous Page");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plUserRegisterLayout = new javax.swing.GroupLayout(plUserRegister);
        plUserRegister.setLayout(plUserRegisterLayout);
        plUserRegisterLayout.setHorizontalGroup(
            plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plUserRegisterLayout.createSequentialGroup()
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plUserRegisterLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblGender)
                                .addComponent(lblPhone)))
                        .addComponent(lblIC, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(plUserRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCPassword))
                    .addComponent(lblState, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCountry, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(plUserRegisterLayout.createSequentialGroup()
                        .addComponent(txtCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(plUserRegisterLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRole)
                .addGap(59, 59, 59))
            .addGroup(plUserRegisterLayout.createSequentialGroup()
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plUserRegisterLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(plUserRegisterLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plUserRegisterLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plUserRegisterLayout.createSequentialGroup()
                        .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail)
                            .addComponent(lblAddress))
                        .addGap(321, 321, 321))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plUserRegisterLayout.createSequentialGroup()
                        .addComponent(cbRegisterAdmin)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plUserRegisterLayout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap())))
        );
        plUserRegisterLayout.setVerticalGroup(
            plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plUserRegisterLayout.createSequentialGroup()
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(plUserRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRole)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbShowPassword)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblState)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plUserRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRegisterAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnBack))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        Users user = new Users();
        user.setUserID(txtPhone.getText());
        user.setName(txtName.getText());
        user.setPassword(txtPassword.getText());
        user.setCPassword(txtCPassword.getText());
        user.setEmail(txtEmail.getText());
        user.setIC(txtIC.getText());
        user.setPhoneNo(txtPhone.getText());
        user.setAddress(txtAddress.getText());
        user.setGender(cbGender.getSelectedItem().toString());
        user.setCountry(cbCountry.getSelectedItem().toString());
        user.setState(cbState.getSelectedItem().toString());
        if (cbRegisterAdmin.isSelected())
        {
            user.adminRegister();
        }
        else
        {
           if (user.userRegister())
           {
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
                this.setVisible(false);
           }
        }
        
        if(user.Succesful())
        {
            //Clean txtBox overhere
        }
    
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cbRegisterAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRegisterAdminActionPerformed
        // TODO add your handling code here:
        if (cbRegisterAdmin.isSelected())
        {
            txtName.setVisible(true); lblName.setVisible(true);
            txtPassword.setVisible(true); lblPassword.setVisible(true);
            txtCPassword.setVisible(true); lblCPassword.setVisible(true);
            cbGender.setVisible(false); lblGender.setVisible(false);
            txtPhone.setVisible(false); lblPhone.setVisible(false);
            txtEmail.setVisible(false); lblEmail.setVisible(false);
            txtAddress.setVisible(false); lblAddress.setVisible(false);
            txtIC.setVisible(false); lblIC.setVisible(false);
            cbState.setVisible(false); lblState.setVisible(false); 
            cbCountry.setVisible(false); lblCountry.setVisible(false);
        }
        else
        {
            txtName.setVisible(true); lblName.setVisible(true);
            txtPassword.setVisible(true); lblPassword.setVisible(true);
            txtCPassword.setVisible(true); lblCPassword.setVisible(true);
            cbGender.setVisible(true); lblGender.setVisible(true);
            txtPhone.setVisible(true); lblPhone.setVisible(true);
            txtEmail.setVisible(true); lblEmail.setVisible(true);
            txtAddress.setVisible(true); lblAddress.setVisible(true);
            txtIC.setVisible(true); lblIC.setVisible(true);
            cbState.setVisible(true); lblState.setVisible(true);
            cbCountry.setVisible(true); lblCountry.setVisible(false);
        }
    }//GEN-LAST:event_cbRegisterAdminActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        // TODO add your handling code here:
        if (cbShowPassword.isSelected())
        {
            txtPassword.setEchoChar((char)0);
            txtCPassword.setEchoChar((char)0);
        }
        else
        {
            txtPassword.setEchoChar('*');
            txtCPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       if(role.equals("Admin"))
       {
           AdminUMainPage AUMP = new AdminUMainPage();
           AUMP.setVisible(true);
       }else
       {
           LoginPage loginPage = new LoginPage();
           loginPage.setVisible(true);
       
       }
       this.setVisible(false);
       this.dispose();
       
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cbCountry;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JCheckBox cbRegisterAdmin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JComboBox<String> cbState;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCPassword;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel plUserRegister;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtCPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
