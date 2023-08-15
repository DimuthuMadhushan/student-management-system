/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.StudentManagementSystem.view;

import com.iCet.StudentManagementSystem.db.DBConnection;
import com.iCet.StudentManagementSystem.db.StudentDB;
import javax.swing.JOptionPane;
import com.iCet.StudentManagementSystem.model.Student;
/**
 *
 * @author dimut
 */
public class AddStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form AddStudentForm
     */
    public AddStudentForm() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        studentNameTextField = new javax.swing.JTextField();
        PrfTextField = new javax.swing.JTextField();
        DbmsTextField = new javax.swing.JTextField();
        addStudentButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Student Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 80));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Student Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("PRF Marks");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("DBMS MArks");

        studentIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdTextFieldActionPerformed(evt);
            }
        });
        studentIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentIdTextFieldKeyPressed(evt);
            }
        });

        studentNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentNameTextFieldKeyPressed(evt);
            }
        });

        PrfTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PrfTextFieldKeyPressed(evt);
            }
        });

        DbmsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DbmsTextFieldKeyPressed(evt);
            }
        });

        addStudentButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addStudentButton.setText("Add Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });
        addStudentButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addStudentButtonKeyPressed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DbmsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PrfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(addStudentButton)
                        .addGap(37, 37, 37)
                        .addComponent(closeButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DbmsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudentButton)
                    .addComponent(closeButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
       setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void studentIdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentIdTextFieldKeyPressed
       int key=evt.getKeyCode();
       if(key==10){
           String studentId=studentIdTextField.getText();
           StudentDB studentDb=DBConnection.getInstance().getStudentDb();
           int index=studentDb.searchStudentId(studentId);
            if(index<0){
                studentNameTextField.requestFocus();
             
            }
            else{
                JOptionPane.showMessageDialog(this,"Student Already Added.."); 
                studentIdTextField.setText("");
            }
       }
    }//GEN-LAST:event_studentIdTextFieldKeyPressed

    private void studentNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentNameTextFieldKeyPressed
        int key=evt.getKeyCode();
        if(key==10){
           PrfTextField.requestFocus();
       }
    }//GEN-LAST:event_studentNameTextFieldKeyPressed

    private void PrfTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrfTextFieldKeyPressed
        int key=evt.getKeyCode();
        if(key==10){
            double prf=Double.parseDouble(PrfTextField.getText());
            if(prf>=0 && prf<=100){
              DbmsTextField.requestFocus();  
            }else{
                JOptionPane.showMessageDialog(this, "Wrong Input");
                PrfTextField.setText("");
            }   
       }
    }//GEN-LAST:event_PrfTextFieldKeyPressed

    private void DbmsTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DbmsTextFieldKeyPressed
        int key=evt.getKeyCode();
        if(key==10){
            double dbms=Double.parseDouble(DbmsTextField.getText());
            if(dbms>=0 && dbms<=100){
              addStudentButton.requestFocus();  
            }else{
                JOptionPane.showMessageDialog(this, "Wrong Input");
                DbmsTextField.setText("");
            }  
        }
    }//GEN-LAST:event_DbmsTextFieldKeyPressed

    private void studentIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdTextFieldActionPerformed
        
        
    }//GEN-LAST:event_studentIdTextFieldActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        
        String studentId=studentIdTextField.getText();
        String studentName=studentNameTextField.getText();
        double prfMarks=Double.parseDouble(PrfTextField.getText());
        double dbmsMarks=Double.parseDouble(DbmsTextField.getText());
        Student student=new Student(studentId,studentName,prfMarks,dbmsMarks);
        DBConnection.getInstance().getStudentDb().add(student);
        JOptionPane.showMessageDialog(this,"Successfully Added.."); 
        studentIdTextField.setText("");
        studentNameTextField.setText("");
        PrfTextField.setText("");
        DbmsTextField.setText("");
        studentIdTextField.requestFocus();
        
        
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void addStudentButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addStudentButtonKeyPressed
        int key=evt.getKeyCode();
        if(key==10){
            String studentId=studentIdTextField.getText();
        String studentName=studentNameTextField.getText();
        double prfMarks=Double.parseDouble(PrfTextField.getText());
        double dbmsMarks=Double.parseDouble(DbmsTextField.getText());
        Student student=new Student(studentId,studentName,prfMarks,dbmsMarks);
        DBConnection.getInstance().getStudentDb().add(student);
        
        JOptionPane.showMessageDialog(this,"Successfully Added.."); 
        studentIdTextField.setText("");
        studentNameTextField.setText("");
        PrfTextField.setText("");
        DbmsTextField.setText("");
        studentIdTextField.requestFocus();
        }       
    }//GEN-LAST:event_addStudentButtonKeyPressed

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
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DbmsTextField;
    private javax.swing.JTextField PrfTextField;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JTextField studentNameTextField;
    // End of variables declaration//GEN-END:variables
}
