/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.StudentManagementSystem.view;
import com.iCet.StudentManagementSystem.db.DBConnection;
import com.iCet.StudentManagementSystem.model.Student;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import sun.security.pkcs11.Secmod;
import java.util.Comparator;
/**
 *
 * @author dimut
 */
public class ViewStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form ViewStudentForm
     */
    public ViewStudentForm() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        bestInPrfButton = new javax.swing.JButton();
        bestInDbmsButton = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        printButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("View Student Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));

        bestInPrfButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bestInPrfButton.setText("Best in PRF");
        bestInPrfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestInPrfButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bestInPrfButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        bestInDbmsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bestInDbmsButton.setText("Best in DBMS");
        bestInDbmsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestInDbmsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bestInDbmsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "PRF", "DBMS"
            }
        ));
        table.setViewportView(studentTable);

        getContentPane().add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 130, 660, 250));

        printButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printButton.setText("Print");
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 90, -1));

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 464, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bestInPrfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestInPrfButtonActionPerformed
        Student[] temp1=DBConnection.getInstance().getStudentDb().getStudentArray();
        Arrays.sort(temp1,new PrfComparator());
        
        DefaultTableModel dtm=(DefaultTableModel)studentTable.getModel();
        dtm.setRowCount(0);
        for (int i=temp1.length-1;i>=0;i--) {
            Object[] rowData = {temp1[i].getStudentId(), temp1[i].getStudentName(), temp1[i].getPrfMarks(), temp1[i].getDbmsMarks()};
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_bestInPrfButtonActionPerformed

    private void bestInDbmsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestInDbmsButtonActionPerformed
        Student[] temp=DBConnection.getInstance().getStudentDb().getStudentArray();
         Arrays.sort(temp,new DbmsComparator());
        DefaultTableModel dtm=(DefaultTableModel)studentTable.getModel();
        dtm.setRowCount(0);
        for (int i=temp.length-1;i>=0;i--) {
            Object[] rowData = {temp[i].getStudentId(), temp[i].getStudentName(), temp[i].getPrfMarks(), temp[i].getDbmsMarks()};
            dtm.addRow(rowData);
        }
       
    }//GEN-LAST:event_bestInDbmsButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bestInDbmsButton;
    private javax.swing.JButton bestInPrfButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton printButton;
    private javax.swing.JTable studentTable;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables

        class DbmsComparator implements Comparator<Student>{
        

        @Override
        public int compare(Student s1,Student s2) {
            return (int)s1.getDbmsMarks()-(int)s2.getDbmsMarks(); //To change body of generated methods, choose Tools | Templates.
        }
    }
        class PrfComparator implements Comparator<Student>{
        

        @Override
        public int compare(Student s1,Student s2) {
            return (int)s1.getPrfMarks()-(int)s2.getPrfMarks(); //To change body of generated methods, choose Tools | Templates.
        }
    }
   
}
