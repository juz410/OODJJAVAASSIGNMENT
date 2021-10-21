/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AdminVaccineCenterPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminVaccinePage
     */
     private void showTableData()
    {
        ((DefaultTableModel)tblVCenter.getModel()).setNumRows(0);
        DefaultTableModel model =(DefaultTableModel)tblVCenter.getModel();
        
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
    public AdminVaccineCenterPage() {
        initComponents();
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
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblPhizerQuantity = new javax.swing.JLabel();
        lblSinovacQuantity = new javax.swing.JLabel();
        lblAZQuantity = new javax.swing.JLabel();
        lblTotalQuantity = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        panelforAddingVaccineToCenter = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbVaccineType = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtRemoveQuantity = new javax.swing.JTextField();
        cbRemoveVaccine = new javax.swing.JComboBox<>();
        btnRemove = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVCenter = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbCenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "C01", "C02", "C03", "C04", "C05", "C06", "C07", "C08", "C09", "C10", "C11", "C12", "C13", "C14", "C15", "C16" }));
        cbCenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCenterActionPerformed(evt);
            }
        });

        jLabel1.setText("Center:");

        lblTitle.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Vaccine Center Information");

        jLabel17.setText("Total Phizer:");

        jLabel18.setText("Total Sinovac:");

        jLabel19.setText("Total AZ:");

        jLabel20.setText("Total Vaccines:");

        lblPhizerQuantity.setText("0");

        lblSinovacQuantity.setText("0");

        lblAZQuantity.setText("0");

        lblTotalQuantity.setText("0");

        jLabel21.setText("State");

        jLabel22.setText("Address");

        jLabel15.setText("Adding Vaccines to Center");

        jLabel16.setText("Vaccine Type:");

        cbVaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phizer", "Sinovac", "AstraZeneca", " " }));

        jLabel23.setText("Quantity:");

        jButton1.setText("Add Vaccines");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel24.setText("Removing Vaccines from Center");

        jLabel25.setText("Vaccine Type:");

        jLabel26.setText("Quantity:");

        cbRemoveVaccine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phizer", "Sinovac", "AstraZeneca", " " }));

        btnRemove.setText("Remove Vaccines");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelforAddingVaccineToCenterLayout = new javax.swing.GroupLayout(panelforAddingVaccineToCenter);
        panelforAddingVaccineToCenter.setLayout(panelforAddingVaccineToCenterLayout);
        panelforAddingVaccineToCenterLayout.setHorizontalGroup(
            panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelforAddingVaccineToCenterLayout.createSequentialGroup()
                .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelforAddingVaccineToCenterLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel15)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel24))
                    .addGroup(panelforAddingVaccineToCenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelforAddingVaccineToCenterLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(183, 183, 183)
                                .addComponent(btnRemove))
                            .addGroup(panelforAddingVaccineToCenterLayout.createSequentialGroup()
                                .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelforAddingVaccineToCenterLayout.createSequentialGroup()
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26))
                                    .addGroup(panelforAddingVaccineToCenterLayout.createSequentialGroup()
                                        .addComponent(cbVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(131, 131, 131)
                                        .addComponent(jLabel25)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbRemoveVaccine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRemoveQuantity))))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        panelforAddingVaccineToCenterLayout.setVerticalGroup(
            panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelforAddingVaccineToCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cbVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(cbRemoveVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtRemoveQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelforAddingVaccineToCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRemove))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        lblAddress.setText("NULL");

        lblState.setText("jLabel2");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelforAddingVaccineToCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblState)
                                        .addGap(66, 66, 66)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAddress)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel20))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAZQuantity)
                            .addComponent(lblTotalQuantity)
                            .addComponent(lblPhizerQuantity)
                            .addComponent(lblSinovacQuantity))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel22)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(lblState))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblPhizerQuantity))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblSinovacQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblAZQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lblTotalQuantity))
                        .addGap(67, 67, 67)
                        .addComponent(panelforAddingVaccineToCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(!cbCenter.getSelectedItem().toString().equals("All"))
        {
            VCenter vc = new VCenter(cbCenter.getSelectedItem().toString());
            vc.setVacType(VType.valueOf(cbRemoveVaccine.getSelectedItem().toString()));
            try
            {
                vc.setRequestQuantity(Integer.parseInt(txtRemoveQuantity.getText()));
                vc.RemoveVaccine();
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter numeric number");
                txtRemoveQuantity.setText("");
            }

            showQuantityofVaccines();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a center");
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!cbCenter.getSelectedItem().toString().equals("All"))
        {
            VCenter vc = new VCenter(cbCenter.getSelectedItem().toString());

            vc.setVacType(VType.valueOf(cbVaccineType.getSelectedItem().toString()));
            try
            {
                vc.setRequestQuantity(Integer.parseInt(txtQuantity.getText()));
                vc.AddVaccine();
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter numeric number");
                txtQuantity.setText("");
            }

            showQuantityofVaccines();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a center");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCenterActionPerformed
        showCenterAddresses();
        showQuantityofVaccines();

    }//GEN-LAST:event_cbCenterActionPerformed

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
                new AdminVaccineCenterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cbCenter;
    private javax.swing.JComboBox<String> cbRemoveVaccine;
    private javax.swing.JComboBox<String> cbVaccineType;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
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