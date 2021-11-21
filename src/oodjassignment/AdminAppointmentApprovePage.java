/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class AdminAppointmentApprovePage extends javax.swing.JFrame {
    Users admin = new Users();
    Validation adminValid = new Validation();
    boolean confirm;
    private void showTableData()
    {
        ((DefaultTableModel)tblRequestedAppTable.getModel()).setNumRows(0);
        DefaultTableModel model =(DefaultTableModel)tblRequestedAppTable.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblRequestedAppTable.getModel());
        tblRequestedAppTable.setRowSorter(rowSorter);
        String [] Arr = Appointment.AppointmentViewAll(AppStatus.Requesting,AppStatus.RequestingCancel);
        model.setColumnIdentifiers(Arr[0].split("\\|"));
        model.setColumnCount(10);
        for (int i =0; i < Arr.length ; i ++)
        {
            if(i > 0)
            {
                
              String temp = Arr[i];
              
              String [] temp2 = temp.split("\\|");  
              model.addRow(temp2);  
            }
        }
    }
    /**
     * Creates new form AdminAppointmentPage
     */
    public AdminAppointmentApprovePage(String adminID) {
        initComponents();
        this.setLocationRelativeTo(null);
        admin.setUserID(adminID);
        showTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgModify = new javax.swing.JDialog();
        plModify = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        txtAddress5 = new javax.swing.JTextField();
        txtEmail1 = new javax.swing.JTextField();
        txtIC1 = new javax.swing.JTextField();
        txtPhone1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblAdminName = new javax.swing.JLabel();
        lblAdminName1 = new javax.swing.JLabel();
        txtAddress2 = new javax.swing.JTextField();
        txtAddress3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        plAppointment = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequestedAppTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Date:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Center ID:");

        txtAddress.setBorder(null);
        txtAddress.setCaretColor(java.awt.Color.darkGray);
        txtAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("User ID:");

        txtIC.setBorder(null);
        txtIC.setCaretColor(java.awt.Color.darkGray);
        txtIC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnConfirm.setText("Confirm");
        btnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtAddress5.setBorder(null);
        txtAddress5.setCaretColor(java.awt.Color.darkGray);
        txtAddress5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddress5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress5ActionPerformed(evt);
            }
        });

        txtEmail1.setBorder(null);
        txtEmail1.setCaretColor(java.awt.Color.darkGray);
        txtEmail1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtIC1.setBorder(null);
        txtIC1.setCaretColor(java.awt.Color.darkGray);
        txtIC1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPhone1.setBorder(null);
        txtPhone1.setCaretColor(java.awt.Color.darkGray);
        txtPhone1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Dose:");

        lblAdminName.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblAdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminName.setText("Modify");

        lblAdminName1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblAdminName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminName1.setText("Appointment");

        txtAddress2.setBorder(null);
        txtAddress2.setCaretColor(java.awt.Color.darkGray);
        txtAddress2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddress2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress2ActionPerformed(evt);
            }
        });

        txtAddress3.setBorder(null);
        txtAddress3.setCaretColor(java.awt.Color.darkGray);
        txtAddress3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddress3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Vaccine ID:");

        txtAddress4.setBorder(null);
        txtAddress4.setCaretColor(java.awt.Color.darkGray);
        txtAddress4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddress4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Vaccine Type:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Appoint Status:");

        txtAddress1.setBorder(null);
        txtAddress1.setCaretColor(java.awt.Color.darkGray);
        txtAddress1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Time:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Appointment ID:");

        javax.swing.GroupLayout plModifyLayout = new javax.swing.GroupLayout(plModify);
        plModify.setLayout(plModifyLayout);
        plModifyLayout.setHorizontalGroup(
            plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plModifyLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plModifyLayout.createSequentialGroup()
                        .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7))
                            .addGroup(plModifyLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))))
                        .addGap(68, 68, 68)
                        .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plModifyLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAddress1)
                                    .addComponent(txtEmail1)
                                    .addComponent(txtIC1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plModifyLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPhone1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(plModifyLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plModifyLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblAdminName))
                            .addComponent(lblAdminName1))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        plModifyLayout.setVerticalGroup(
            plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plModifyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblAdminName)
                .addGap(5, 5, 5)
                .addComponent(lblAdminName1)
                .addGap(18, 18, 18)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddress5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgModifyLayout = new javax.swing.GroupLayout(dlgModify.getContentPane());
        dlgModify.getContentPane().setLayout(dlgModifyLayout);
        dlgModifyLayout.setHorizontalGroup(
            dlgModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgModifyLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(plModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        dlgModifyLayout.setVerticalGroup(
            dlgModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgModifyLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(plModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plAppointment.setBackground(new java.awt.Color(102, 102, 102));
        plAppointment.setLayout(null);

        lblTitle.setBackground(new java.awt.Color(102, 102, 102));
        lblTitle.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Appointment Approve ");
        plAppointment.add(lblTitle);
        lblTitle.setBounds(170, 10, 520, 80);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Serach Here:");
        plAppointment.add(jLabel1);
        jLabel1.setBounds(20, 260, 100, 30);

        txtSearch.setBackground(new java.awt.Color(102, 102, 102));
        txtSearch.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(null);
        txtSearch.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        plAppointment.add(txtSearch);
        txtSearch.setBounds(110, 260, 175, 19);

        btnApprove.setBackground(new java.awt.Color(102, 102, 102));
        btnApprove.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        plAppointment.add(btnApprove);
        btnApprove.setBounds(20, 310, 115, 33);

        btnReject.setBackground(new java.awt.Color(102, 102, 102));
        btnReject.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        plAppointment.add(btnReject);
        btnReject.setBounds(190, 310, 112, 33);

        tblRequestedAppTable.setBackground(new java.awt.Color(102, 102, 102));
        tblRequestedAppTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblRequestedAppTable.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        tblRequestedAppTable.setForeground(new java.awt.Color(255, 255, 255));
        tblRequestedAppTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblRequestedAppTable);

        plAppointment.add(jScrollPane2);
        jScrollPane2.setBounds(20, 90, 847, 167);

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back To previous Page");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        plAppointment.add(btnBack);
        btnBack.setBounds(670, 380, 226, 23);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("—————————————————");
        plAppointment.add(jLabel12);
        jLabel12.setBounds(110, 270, 470, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddress5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress5ActionPerformed

    private void txtAddress2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress2ActionPerformed

    private void txtAddress3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress3ActionPerformed

    private void txtAddress4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress4ActionPerformed

    private void txtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress1ActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
       DefaultTableModel model = (DefaultTableModel)tblRequestedAppTable.getModel();
        if(tblRequestedAppTable.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null, "please selected properly");
        }else
        {
            int nRow =tblRequestedAppTable.getSelectedRow();
            int col = 10;
            String [][] tb = new String[1][10];

            for(int i = 0; i < col; i ++)
            {
                tb[0][i] = model.getValueAt(nRow, i).toString();

            }
            
            
            Appointment app = new Appointment(tb[0][0],tb[0][1],tb[0][2],tb[0][3],tb[0][4],tb[0][5],tb[0][6],tb[0][7],tb[0][8],tb[0][9]);
            app.setAdminID(admin.getUserID());
            confirm =adminValid.AdminActionConfirmation("Are you sure you want to approve this reuqest? The action can't be undone");
            if(confirm)
            {
               if(app.getAptStatus().equals(AppStatus.Requesting.toString()))
                {
                    app.ApproveUserAppRequest();
                }else if(app.getAptStatus().equals(AppStatus.RequestingCancel.toString()))
                {
                    app.cancelUserAppointment(AppStatus.RequestingCancel);
                }     
            }
            
            
            this.showTableData();
            
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblRequestedAppTable.getModel();
        if(tblRequestedAppTable.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null, "please selected properly");
        }else
        {
            int nRow =tblRequestedAppTable.getSelectedRow();
            int col = 10;
            String [][] tb = new String[1][10];

            for(int i = 0; i < col; i ++)
            {
                tb[0][i] = model.getValueAt(nRow, i).toString();

            }
            
            
            Appointment app = new Appointment(tb[0][0],tb[0][1],tb[0][2],tb[0][3],tb[0][4],tb[0][5],tb[0][6],tb[0][7],tb[0][8],tb[0][9]);
            app.setAdminID(admin.getUserID());
            confirm = adminValid.AdminActionConfirmation("Are you sure want to reject this request? The action can't be undone");
            if(confirm)
            {
                app.RejectUserAppRequest();
            }
            
            this.showTableData();
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel model =(DefaultTableModel)tblRequestedAppTable.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblRequestedAppTable.getModel());
        tblRequestedAppTable.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAppointmentApprovePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAppointmentApprovePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAppointmentApprovePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAppointmentApprovePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAppointmentApprovePage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnReject;
    private javax.swing.JDialog dlgModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblAdminName1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel plAppointment;
    private javax.swing.JPanel plModify;
    private javax.swing.JTable tblRequestedAppTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtAddress3;
    private javax.swing.JTextField txtAddress4;
    private javax.swing.JTextField txtAddress5;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtIC1;
    private javax.swing.JTextField txtPhone1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
