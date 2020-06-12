/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Logic;
import Logic.Delete;
import Logic.Roles;
import Logic.Update;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class CRUD extends javax.swing.JFrame {

    /**
     * Creates new form CRUD
     */
    public CRUD() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnshowRoles = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        tfUserName = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbRol = new javax.swing.JLabel();
        tfRol = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lbMensajes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "LAST NAME", "USERNAME", "PASSWORD", "AGE", "PHONE", "EMAIL", "ROL"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        btnshowRoles.setText("SHOW ROLES");
        btnshowRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowRolesActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbName.setText("NAME");

        tfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneActionPerformed(evt);
            }
        });

        lbLastName.setText("LAST NAME");

        lbUserName.setText("USERNAME");

        lbAge.setText("AGE");

        lbPhone.setText("PHONE");

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbID.setText("ID");

        lbEmail.setText("EMAIL");

        lbRol.setText("ROL");

        lbPassword.setText("PASSWORD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbName)
                    .addComponent(tfName)
                    .addComponent(tfLastName)
                    .addComponent(tfUserName)
                    .addComponent(tfAge)
                    .addComponent(lbLastName)
                    .addComponent(lbUserName)
                    .addComponent(lbAge)
                    .addComponent(lbPhone)
                    .addComponent(lbID)
                    .addComponent(tfID, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail)
                    .addComponent(lbRol)
                    .addComponent(tfRol)
                    .addComponent(lbPassword)
                    .addComponent(tfPassword))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnshowRoles)
                                .addGap(41, 41, 41)
                                .addComponent(btnDelete)
                                .addGap(41, 41, 41)
                                .addComponent(btnUpdate)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbName)
                .addGap(18, 18, 18)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbLastName)
                .addGap(18, 18, 18)
                .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbUserName)
                .addGap(18, 18, 18)
                .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbPassword)
                .addGap(18, 18, 18)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbAge)
                .addGap(18, 18, 18)
                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnshowRoles)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))
                        .addGap(27, 27, 27)
                        .addComponent(lbMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbEmail)
                        .addGap(18, 18, 18)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbRol)
                        .addGap(18, 18, 18)
                        .addComponent(tfRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int seleccion = jTable3.getSelectedRow();
        tfID.setText(jTable3.getValueAt(seleccion, 0).toString());
        tfName.setText(jTable3.getValueAt(seleccion, 1).toString());
        tfLastName.setText(jTable3.getValueAt(seleccion, 2).toString());
        tfUserName.setText(jTable3.getValueAt(seleccion,3).toString());
        tfPassword.setText(jTable3.getValueAt(seleccion, 4).toString());
        tfAge.setText(jTable3.getValueAt(seleccion, 5).toString());
        tfPhone.setText(jTable3.getValueAt(seleccion, 6).toString());
        tfEmail.setText(jTable3.getValueAt(seleccion, 7).toString());
        tfRol.setText(jTable3.getValueAt(seleccion, 8).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void btnshowRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowRolesActionPerformed

        mostrarRegistros();

    }//GEN-LAST:event_btnshowRolesActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
          try {
        Delete em = new Delete();
        int d = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO DELETE " + tfID.getText()+ " ?");
        if (d == 0) {
          
            em.removeLines(tfID.getText());
            lbMensajes.setText("SUCCESSFULLY REMOVED!");
            mostrarRegistros();
            tfID.setText("");
            tfName.setText("");
            tfLastName.setText("");
            tfUserName.setText("");
            tfPassword.setText("");
            tfAge.setText("");
            tfPhone.setText("");
            tfEmail.setText("");
            tfRol.setText("");
            
        }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {
            Logic lC = new Logic();
            ArrayList<Roles> array = new ArrayList();
            String contraseña = "";

            Roles tempCustomers[] = lC.readRegistersFiles();
            for (int i = 0; i < tempCustomers.length; i++) {
                array.add(tempCustomers[i]);
            }//endfor

            for (int j = 0; j < array.size(); j++) {
                if (tfName.getText().equals(array.get(j).getNombre())) {
                    contraseña = array.get(j).getContraseña();
                }
            }

            Update em = new Update();
            int edit = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO UPDATE " + tfID.getText()+ " ?");
            if (edit == 0) {
                em.actualizarPersona(tfID.getText(), tfName.getText(), tfLastName.getText(),tfUserName.getText(), tfPassword.getText(),Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()),tfEmail.getText(), Integer.parseInt(tfRol.getText()));
                lbMensajes.setText("SUCCESSFULLY UPDATED!");
                mostrarRegistros();
                tfID.setText("");
                tfName.setText("");
                tfLastName.setText("");
                tfUserName.setText("");
                tfPassword.setText("");
                tfAge.setText("");
                tfPhone.setText(""); 
                tfEmail.setText("");
                tfRol.setText("");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "UPDATE ERROR!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneActionPerformed

    public void mostrarRegistros() {
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();

        Roles tempCustomers[] = lC.readRegistersFiles();
        for (int i = 0; i < tempCustomers.length; i++) {
            array.add(tempCustomers[i]);
        }//endfor

        String matriz[][] = new String[array.size()][9];

        for (int i = 0; i < array.size(); i++) {
            int edad = array.get(i).getEdad();
            int tipoRol = array.get(i).getTipoRol();
            int telefono = array.get(i).getTelefono();
            
            matriz[i][0] = array.get(i).getCedula();
            matriz[i][1] = array.get(i).getNombre();
            matriz[i][2] = array.get(i).getApellido();
            matriz[i][3] = array.get(i).getNombreUsuario();
            matriz[i][4] = array.get(i).getContraseña();
            matriz[i][5] = String.valueOf(edad);
            matriz[i][6] = String.valueOf(telefono);
            matriz[i][7] = array.get(i).getCorreo();
            matriz[i][8] = String.valueOf(tipoRol);

            jTable3.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "ID", "NAME", "LAST NAME", "USERNAME", "PASSWORD","AGE", "PHONE","EMAIL","ROL"
                    }
            ));
        }
    }

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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnshowRoles;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable3;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbMensajes;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRol;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfRol;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
