/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalms;

import conexion.Conexion;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author morochas
 */
public class Diagnosis extends javax.swing.JFrame {

    /**
     * Creates new form Diagnosis
     */
    public Diagnosis() {
        initComponents();
        s();
        GetPatient();
        Selectional();
        
    }
    Conexion c=new Conexion();
    Connection con=null;
    PreparedStatement ps=null;
    Statement st=null;
    ResultSet rs=null,rs1=null;
    DefaultTableModel modelo2 = new DefaultTableModel();
    
     private void s(){
        modelo2.addColumn("ID");
        modelo2.addColumn("Id_Patient");
        modelo2.addColumn("Name");
        modelo2.addColumn("Symptoms");
        modelo2.addColumn("Diagnosis");
        modelo2.addColumn("Medicines");
    }
    
    
    private void GetPatient(){
        try {
            con=c.conectar();
            st=con.createStatement();
            rs=st.executeQuery("select * from patient");
            
            while(rs.next()){
                String mypaint= rs.getString("id");
                cbPATID.addItem(mypaint);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Diagnosis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
      private void FetchName(){
        try {
            con=c.conectar();
            st=con.createStatement();
            rs1=st.executeQuery("select * from patient where id="+cbPATID.getSelectedItem().toString()+"");
            while(rs1.next()){
                String myname= rs1.getString("name");
                txtname.setText(myname);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Diagnosis.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMedicines = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSymptoms = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiagnosis = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDiagnosis = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbPATID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatSummart = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setText("DOCTOR INFORMATION");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtid.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 131, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("PATID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtMedicines.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 131, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("SYMPTOMS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        txtSymptoms.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 131, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("DIAGNOSIS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        txtDiagnosis.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtDiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 131, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PRINT");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DIAGNOSIS LIST");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(330, 330, 330)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 890, -1));

        tableDiagnosis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "ADDRESS", "PHONE", "AGE", "GENDER", "BLOOD GROUP", "PATHOLOGIES"
            }
        ));
        tableDiagnosis.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableDiagnosis.setRowHeight(32);
        tableDiagnosis.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tableDiagnosis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDiagnosisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDiagnosis);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 841, 282));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("UPDATE");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 890, 20));

        txtname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 131, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("NAME");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("MEDICINES");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        cbPATID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbPATID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPATIDActionPerformed(evt);
            }
        });
        jPanel2.add(cbPATID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 131, 30));

        PatSummart.setColumns(20);
        PatSummart.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PatSummart.setForeground(new java.awt.Color(255, 0, 0));
        PatSummart.setRows(5);
        PatSummart.setText("==============PATIENT SUMMARY=============");
        jScrollPane1.setViewportView(PatSummart);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 360, 200));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("CLEAN");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 890, 700));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hospital Management System");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MANAGER DOCTORS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void cbPATIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPATIDActionPerformed
     FetchName();
    }//GEN-LAST:event_cbPATIDActionPerformed
    
     private void Selectional(){
        DefaultTableModel modelo=(DefaultTableModel) tableDiagnosis.getModel();
            int filas=tableDiagnosis.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        

        
        try {
            con=c.conectar();
            st= con.createStatement();
            rs= st.executeQuery("select * from diagnosis");
            while(rs.next()){
                 modelo2.addRow(new Object[]{String.valueOf(rs.getInt("id_diag")), rs.getString("id_pati"),rs.getString("name"),rs.getString("symptoms"),rs.getString("diagnosis"),rs.getString("medicines")});
                
            }
            tableDiagnosis.setModel(modelo2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            con=c.conectar();
            ps=con.prepareStatement("insert into diagnosis values(?,?,?,?,?,?)");
            ps.setInt(1,Integer.valueOf(txtid.getText()));
            ps.setString(2,cbPATID.getSelectedItem().toString());
            ps.setString(3,txtname.getText());
            ps.setString(4,txtSymptoms.getText());
            ps.setString(5,txtDiagnosis.getText());
            ps.setString(6,txtMedicines.getText());

            int row=ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"DIAGNOSIS ADDED SUCCESSFULLY");
            Selectional();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void tableDiagnosisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDiagnosisMouseClicked
        int Row= tableDiagnosis.getSelectedRow();
        DefaultTableModel modelo=(DefaultTableModel) tableDiagnosis.getModel();
        txtid.setText(modelo2.getValueAt(Row, 0).toString());
        cbPATID.setSelectedItem(modelo2.getValueAt(Row, 1).toString());
        txtname.setText(modelo2.getValueAt(Row, 2).toString());
        txtSymptoms.setText(modelo2.getValueAt(Row, 3).toString());
        txtDiagnosis.setText(modelo2.getValueAt(Row, 4).toString());
        txtMedicines.setText(modelo2.getValueAt(Row, 5).toString());
        PatSummart.setText(PatSummart.getText()+"\n \n"+"Patient Name: "+modelo2.getValueAt(Row, 2).toString()+"           "+"Symptoms: "+modelo2.getValueAt(Row, 3).toString()+"\n \n \n" +"Diagnosis: "+modelo2.getValueAt(Row,4 ).toString()+"                      "+"Medicines: "+modelo2.getValueAt(Row, 5).toString()+"\n \n \n                          CodeSpaceHospital" );
        
    }//GEN-LAST:event_tableDiagnosisMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
          if(txtid.getText().isEmpty() || txtname.getText().isEmpty() || txtSymptoms.getText().isEmpty() || txtDiagnosis.getText().isEmpty()|| txtMedicines.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Missing Information");
       }else{
          
             try {
            con=c.conectar();
            ps=con.prepareStatement("Update diagnosis set id_diag=?,id_pati=?,name=?,symptoms=?,diagnosis=?,medicines=? WHERE id_diag=?");
            ps.setInt(1,Integer.valueOf(txtid.getText()));
            ps.setString(2,cbPATID.getSelectedItem().toString());
            ps.setString(3,txtname.getText());
            ps.setString(4,txtSymptoms.getText());
            ps.setString(5,txtDiagnosis.getText());
            ps.setString(6,txtMedicines.getText());
            ps.setInt(7,Integer.valueOf(txtid.getText()));
            int row=ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"DIAGNOSIS UPDATE SUCCESSFULLY");
            Selectional();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
            
            
            
            
            
       }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(txtid.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Enter The Diagnosis To Be Deleted");
       }else{
           int id= Integer.parseInt(txtid.getText());
           try {
            con=c.conectar();
            st= con.createStatement();
            st.executeUpdate("Delete from diagnosis where id_diag="+id);
            JOptionPane.showMessageDialog(this, "Diagnosis Successfully Deleted");
            Selectional();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            PatSummart.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Diagnosis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         HospitalForm g=new HospitalForm();
         g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea PatSummart;
    private javax.swing.JComboBox<String> cbPATID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDiagnosis;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtMedicines;
    private javax.swing.JTextField txtSymptoms;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
