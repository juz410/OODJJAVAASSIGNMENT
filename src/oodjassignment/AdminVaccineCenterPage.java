/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class AdminVaccineCenterPage extends javax.swing.JFrame {

    Validation adminValid = new Validation();
    boolean confirm;
     private void showTableData()
    {
        ((DefaultTableModel)tblVCenter.getModel()).setNumRows(0);
        DefaultTableModel model =(DefaultTableModel)tblVCenter.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblVCenter.getModel());
        tblVCenter.setRowSorter(rowSorter);
        String [] Array = VCenter.VCenterViewAll();
        model.setColumnIdentifiers(Array[0].split("\\|"));
        model.setColumnCount(3);
        for (int i =0; i < Array.length ; i ++)
        {
            if(i > 0)
            {
                
              String temp = Array[i];
              
              String [] temp2 = temp.split("\\|");  
              model.addRow(temp2);  
            }
        }
    }
    public void showCenterAddresses()
    {
        
        String [] AddArr = new String[2];
        AddArr = VCenter.showCentersAddress(cbCenter.getSelectedItem().toString());
        if(!cbCenter.getSelectedItem().toString().equals("All"))
        {
            
            lblAddress.setText(AddArr[0]);
            lblState.setText(AddArr[1]);
        }else
        {
            lblAddress.setText("NULL");
            lblState.setText("NULL");
        }
        
    }
    
    public void showQuantityofVaccines()
    {
        VCenter vc = new VCenter(cbCenter.getSelectedItem().toString()){};
        
        int PQuantity = vc.calCenterVacQuantity(VType.Phizer, vc.getCenterID());
        int SQuantity = vc.calCenterVacQuantity(VType.Sinovac, vc.getCenterID());
        int AQuantity = vc.calCenterVacQuantity(VType.AstraZeneca, vc.getCenterID());
        lblPhizerQuantity.setText(String.valueOf(PQuantity));
        lblSinovacQuantity.setText(String.valueOf(SQuantity));
        lblAZQuantity.setText(String.valueOf(AQuantity));
        lblTotalQuantity.setText(String.valueOf(PQuantity + SQuantity + AQuantity));
    }
    Users admin = new Users();
    public AdminVaccineCenterPage(String adminID) {
        initComponents();
        this.setLocationRelativeTo(null);
        admin.setUserID(adminID);
        showQuantityofVaccines();
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

        jPanel1 = new javax.swing.JPanel();
        cbCenter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        panelforAddingVaccineToCenter = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbVaccineType = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAddVaccines = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtRemoveQuantity = new javax.swing.JTextField();
        cbRemoveVaccine = new javax.swing.JComboBox<>();
        btnRemove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVCenter = new javax.swing.JTable();
        btnToVaccinePage = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPhizerQuantity = new javax.swing.JLabel();
        lblSinovacQuantity = new javax.swing.JLabel();
        lblAZQuantity = new javax.swing.JLabel();
        lblTotalQuantity = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(725, 550));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(710, 720));
        jPanel1.setLayout(null);

        cbCenter.setBackground(new java.awt.Color(102, 102, 102));
        cbCenter.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbCenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "J01", "J02", "J03", "KL01", "KL02", "KL03", "KDH01", "KDH02", "KDH03", "KLT01", "KLT02", "KLT03", "L01", "L02", "L03", "M01", "M02", "M03", "NS01", "NS02", "NS03", "PAH01", "PAH02", "PAH03", "PEN01", "PEN02", "PEN03", "PK01", "PK02", "PK03", "PS01", "PS02", "PS03", "PJ01", "PJ02", "PJ03", "SBH01", "SBH02", "SBH03", "SRK01", "SRK02", "SRK03", "SLG01", "SLG02", "SLG03", "T01", "T02", "T03" }));
        cbCenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCenterActionPerformed(evt);
            }
        });
        jPanel1.add(cbCenter);
        cbCenter.setBounds(30, 120, 77, 23);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Center:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 90, 50, 20);

        lblTitle.setBackground(new java.awt.Color(102, 102, 102));
        lblTitle.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Vaccine Center Information");
        jPanel1.add(lblTitle);
        lblTitle.setBounds(60, 10, 570, 70);

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("State:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(200, 110, 40, 17);

        jLabel22.setBackground(new java.awt.Color(102, 102, 102));
        jLabel22.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Address:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(190, 90, 50, 17);

        panelforAddingVaccineToCenter.setBackground(new java.awt.Color(153, 153, 153));
        panelforAddingVaccineToCenter.setLayout(null);

        jLabel15.setBackground(new java.awt.Color(153, 153, 153));
        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Adding Vaccines to Center");
        panelforAddingVaccineToCenter.add(jLabel15);
        jLabel15.setBounds(30, 20, 240, 25);

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Vaccine Type:");
        panelforAddingVaccineToCenter.add(jLabel16);
        jLabel16.setBounds(30, 60, 80, 17);

        cbVaccineType.setBackground(new java.awt.Color(153, 153, 153));
        cbVaccineType.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbVaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phizer", "Sinovac", "AstraZeneca", " " }));
        panelforAddingVaccineToCenter.add(cbVaccineType);
        cbVaccineType.setBounds(110, 50, 90, 23);

        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Quantity:");
        panelforAddingVaccineToCenter.add(jLabel23);
        jLabel23.setBounds(50, 80, 60, 20);

        txtQuantity.setBackground(new java.awt.Color(153, 153, 153));
        txtQuantity.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantity.setBorder(null);
        txtQuantity.setCaretColor(new java.awt.Color(255, 255, 255));
        panelforAddingVaccineToCenter.add(txtQuantity);
        txtQuantity.setBounds(110, 80, 87, 17);

        btnAddVaccines.setBackground(new java.awt.Color(102, 102, 102));
        btnAddVaccines.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnAddVaccines.setForeground(new java.awt.Color(255, 255, 255));
        btnAddVaccines.setText("Add Vaccines");
        btnAddVaccines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVaccinesActionPerformed(evt);
            }
        });
        panelforAddingVaccineToCenter.add(btnAddVaccines);
        btnAddVaccines.setBounds(80, 110, 120, 20);

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Removing Vaccines from Center");
        panelforAddingVaccineToCenter.add(jLabel24);
        jLabel24.setBounds(350, 20, 260, 25);

        jLabel25.setBackground(new java.awt.Color(153, 153, 153));
        jLabel25.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Vaccine Type:");
        panelforAddingVaccineToCenter.add(jLabel25);
        jLabel25.setBounds(380, 60, 80, 17);

        jLabel26.setBackground(new java.awt.Color(153, 153, 153));
        jLabel26.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Quantity:");
        panelforAddingVaccineToCenter.add(jLabel26);
        jLabel26.setBounds(400, 90, 60, 17);

        txtRemoveQuantity.setBackground(new java.awt.Color(153, 153, 153));
        txtRemoveQuantity.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        txtRemoveQuantity.setForeground(new java.awt.Color(255, 255, 255));
        txtRemoveQuantity.setBorder(null);
        txtRemoveQuantity.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRemoveQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveQuantityActionPerformed(evt);
            }
        });
        panelforAddingVaccineToCenter.add(txtRemoveQuantity);
        txtRemoveQuantity.setBounds(470, 90, 91, 10);

        cbRemoveVaccine.setBackground(new java.awt.Color(153, 153, 153));
        cbRemoveVaccine.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbRemoveVaccine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phizer", "Sinovac", "AstraZeneca", " " }));
        panelforAddingVaccineToCenter.add(cbRemoveVaccine);
        cbRemoveVaccine.setBounds(470, 60, 90, 23);

        btnRemove.setBackground(new java.awt.Color(102, 102, 102));
        btnRemove.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove Vaccines");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        panelforAddingVaccineToCenter.add(btnRemove);
        btnRemove.setBounds(420, 110, 140, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("???????????????????????????");
        panelforAddingVaccineToCenter.add(jLabel4);
        jLabel4.setBounds(470, 96, 100, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html> | <br>\n| <br>\n| <br>\n| <br>\n| <br>\n| <br>\n| <br>\n| <br>\n| <br>\n| <html>");
        panelforAddingVaccineToCenter.add(jLabel5);
        jLabel5.setBounds(310, 0, 20, 150);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("???????????????????????????");
        panelforAddingVaccineToCenter.add(jLabel6);
        jLabel6.setBounds(110, 94, 110, 10);

        jPanel1.add(panelforAddingVaccineToCenter);
        panelforAddingVaccineToCenter.setBounds(24, 296, 640, 150);

        lblAddress.setBackground(new java.awt.Color(102, 102, 102));
        lblAddress.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("NULL");
        jPanel1.add(lblAddress);
        lblAddress.setBounds(260, 110, 50, 17);

        lblState.setBackground(new java.awt.Color(102, 102, 102));
        lblState.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        lblState.setForeground(new java.awt.Color(255, 255, 255));
        lblState.setText("NULL");
        jPanel1.add(lblState);
        lblState.setBounds(260, 90, 50, 17);

        tblVCenter.setBackground(new java.awt.Color(102, 102, 102));
        tblVCenter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblVCenter.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        tblVCenter.setForeground(new java.awt.Color(255, 255, 255));
        tblVCenter.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblVCenter);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 140, 500, 148);

        btnToVaccinePage.setBackground(new java.awt.Color(102, 102, 102));
        btnToVaccinePage.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnToVaccinePage.setForeground(new java.awt.Color(255, 255, 255));
        btnToVaccinePage.setText("To Vaccine Page");
        btnToVaccinePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToVaccinePageActionPerformed(evt);
            }
        });
        jPanel1.add(btnToVaccinePage);
        btnToVaccinePage.setBounds(510, 100, 149, 27);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblPhizerQuantity.setBackground(new java.awt.Color(102, 102, 102));
        lblPhizerQuantity.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblPhizerQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblPhizerQuantity.setText("0");

        lblSinovacQuantity.setBackground(new java.awt.Color(102, 102, 102));
        lblSinovacQuantity.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblSinovacQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblSinovacQuantity.setText("0");

        lblAZQuantity.setBackground(new java.awt.Color(102, 102, 102));
        lblAZQuantity.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblAZQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblAZQuantity.setText("0");

        lblTotalQuantity.setBackground(new java.awt.Color(102, 102, 102));
        lblTotalQuantity.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        lblTotalQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalQuantity.setText("0");

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total Phizer:");

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total Sinovac:");

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Total AZ:");

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Total Vaccines:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel20))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAZQuantity)
                    .addComponent(lblTotalQuantity)
                    .addComponent(lblPhizerQuantity)
                    .addComponent(lblSinovacQuantity))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblPhizerQuantity))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblSinovacQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblAZQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblTotalQuantity))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 150, 120, 130);

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("To Previous Page");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(530, 480, 150, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(!cbCenter.getSelectedItem().toString().equals("All"))
        {
            VCenter vc = new VCenter(cbCenter.getSelectedItem().toString());
            vc.setAdminID(admin.getUserID());
            vc.setVacType(VType.valueOf(cbRemoveVaccine.getSelectedItem().toString()));
            try
            {
                vc.setRequestQuantity(Integer.parseInt(txtRemoveQuantity.getText()));
                confirm = adminValid.AdminActionConfirmation("Are you sure want to remove " + vc.getRequestQuantity()+" amount of "+vc.getVacType()+"?The action can't be undone");
                if(confirm)
                {
                    vc.RemoveVaccine();
                }
                
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter numeric number");
                txtRemoveQuantity.setText("");
            }

            showQuantityofVaccines();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a center");
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddVaccinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVaccinesActionPerformed
        if(!cbCenter.getSelectedItem().toString().equals("All"))
        {
            
            VCenter vc = new VCenter(cbCenter.getSelectedItem().toString());
            vc.setAdminID(admin.getUserID());
            vc.setVacType(VType.valueOf(cbVaccineType.getSelectedItem().toString()));
            try
            {
                vc.setRequestQuantity(Integer.parseInt(txtQuantity.getText()));
                confirm = adminValid.AdminActionConfirmation("Are you sure want to add " + vc.getRequestQuantity()+" amount of "+vc.getVacType()+"?The action can't be undone");
                if(confirm)
                {
                    vc.AddVaccine();
                }
                
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter numeric number");
                txtQuantity.setText("");
            }

            showQuantityofVaccines();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a center");
        }

    }//GEN-LAST:event_btnAddVaccinesActionPerformed

    private void cbCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCenterActionPerformed
        showCenterAddresses();
        showQuantityofVaccines();

    }//GEN-LAST:event_cbCenterActionPerformed

    private void btnToVaccinePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToVaccinePageActionPerformed
        AdminVaccinePage AVP = new AdminVaccinePage();
        AVP.setVisible(true);
        
    }//GEN-LAST:event_btnToVaccinePageActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         this.hide();
         this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtRemoveQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemoveQuantityActionPerformed

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
            java.util.logging.Logger.getLogger(AdminVaccineCenterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminVaccineCenterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminVaccineCenterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminVaccineCenterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminVaccineCenterPage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVaccines;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnToVaccinePage;
    private javax.swing.JComboBox<String> cbCenter;
    private javax.swing.JComboBox<String> cbRemoveVaccine;
    private javax.swing.JComboBox<String> cbVaccineType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAZQuantity;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblPhizerQuantity;
    private javax.swing.JLabel lblSinovacQuantity;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalQuantity;
    private javax.swing.JPanel panelforAddingVaccineToCenter;
    private javax.swing.JTable tblVCenter;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRemoveQuantity;
    // End of variables declaration//GEN-END:variables
}
