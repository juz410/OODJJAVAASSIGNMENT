/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class AdminVaccinePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminVaccinePage
     */
    private void showTableData()
    {
        ((DefaultTableModel)tblVaccine.getModel()).setNumRows(0);
        DefaultTableModel model =(DefaultTableModel)tblVaccine.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblVaccine.getModel());
        tblVaccine.setRowSorter(rowSorter);
        Vaccines vac = new Vaccines();
        String [] vacArray = vac.VaccineViewAll();
        model.setColumnIdentifiers(vacArray[0].split("\\|"));
        model.setColumnCount(4);
        for (int i =0; i < vacArray.length ; i ++)
        {
            if(i > 0)
            {
                
              String temp = vacArray[i];
              
              String [] temp2 = temp.split("\\|");  
              model.addRow(temp2);  
            }
        }
    }
    public AdminVaccinePage() {
        initComponents();
        this.setLocationRelativeTo(null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtQuantity = new javax.swing.JTextField();
        btnInsertNewVaccine = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbVaccineType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccine = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        txtQuantity.setBackground(new java.awt.Color(102, 102, 102));
        txtQuantity.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantity.setBorder(null);
        txtQuantity.setCaretColor(new java.awt.Color(255, 255, 255));
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantity);
        txtQuantity.setBounds(100, 90, 100, 17);

        btnInsertNewVaccine.setBackground(new java.awt.Color(102, 102, 102));
        btnInsertNewVaccine.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnInsertNewVaccine.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertNewVaccine.setText("New Vaccine to Werehouse");
        btnInsertNewVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertNewVaccineActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertNewVaccine);
        btnInsertNewVaccine.setBounds(250, 90, 220, 30);

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back to previous Page");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(310, 600, 180, 30);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vaccine Type:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 90, 19);

        cbVaccineType.setBackground(new java.awt.Color(102, 102, 102));
        cbVaccineType.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbVaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phizer", "Sinovac", "AstraZeneca", " " }));
        jPanel1.add(cbVaccineType);
        cbVaccineType.setBounds(100, 60, 100, 23);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(38, 90, 60, 19);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vaccine Factory");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 10, 300, 50);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("——————————");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 100, 200, 20);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        tblVaccine.setBackground(new java.awt.Color(102, 102, 102));
        tblVaccine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblVaccine.setForeground(new java.awt.Color(255, 255, 255));
        tblVaccine.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblVaccine);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 80, 430, 360);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Vaccine in Werehouse");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 10, 320, 30);

        txtSearch.setBackground(new java.awt.Color(153, 153, 153));
        txtSearch.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(null);
        txtSearch.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch);
        txtSearch.setBounds(90, 50, 170, 20);

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search here:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 50, 100, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("————————————————");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(90, 60, 220, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 130, 450, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertNewVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertNewVaccineActionPerformed
        
        Vaccines vac = new Vaccines("A01");
        vac.setVacType(VType.valueOf(cbVaccineType.getSelectedItem().toString()));
        
        try
        {
            vac.setRequestQuantity(Integer.parseInt(txtQuantity.getText()));
            
            String confirmText = "Are you sure want to add this specific Vaccines and Amount?" +"\nVaccine Type: "
                    +vac.getVacType().toString()+"\nQuantity: "+vac.getRequestQuantity();
            
            int dialogButton = JOptionPane.showConfirmDialog (null,confirmText ,"WARNING", JOptionPane.YES_NO_OPTION);
            
            if(dialogButton == JOptionPane.YES_OPTION) 
            {
                vac.VaccineInsertion();
                JOptionPane.showMessageDialog(null,"Insertion Completed");
                showTableData();
            }
            else
            {
                  remove(dialogButton);
                  
            }
            
            
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter numeric number");
            
        }
        
        txtQuantity.setText("");
        
                
        
        
        
        
    }//GEN-LAST:event_btnInsertNewVaccineActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel model =(DefaultTableModel)tblVaccine.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblVaccine.getModel());
        tblVaccine.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
       
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

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
            java.util.logging.Logger.getLogger(AdminVaccinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminVaccinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminVaccinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminVaccinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminVaccinePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInsertNewVaccine;
    private javax.swing.JComboBox<String> cbVaccineType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblVaccine;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
