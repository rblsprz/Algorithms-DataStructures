package GUI;

import Logic.Customers;
import Logic.Logic;
import Logic.Roles;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import Logic.Logic;

/**
 *
 * @author pc
 */
public class NewRol extends javax.swing.JFrame {

    /**
     * Creates new form nuevoUsuario
     */
    Logic lo = new Logic();

    public NewRol() {
        initComponents();
        this.setExtendedState(NewRol.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        cbRoles = new javax.swing.JComboBox<>();
        lbRoles = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lbLastName = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        lbPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        lbUserName = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        lbAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbMensajes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        lbName.setForeground(new java.awt.Color(0, 0, 0));
        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(40, 112, 32, 14);

        lbPassword.setForeground(new java.awt.Color(0, 0, 0));
        lbPassword.setText("PASSWORD:");
        getContentPane().add(lbPassword);
        lbPassword.setBounds(40, 276, 61, 14);

        cbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRATOR", "CUSTOMER" }));
        cbRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbRolesMouseClicked(evt);
            }
        });
        cbRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolesActionPerformed(evt);
            }
        });
        getContentPane().add(cbRoles);
        cbRoles.setBounds(161, 492, 293, 20);

        lbRoles.setForeground(new java.awt.Color(0, 0, 0));
        lbRoles.setText("ROLES:");
        getContentPane().add(lbRoles);
        lbRoles.setBounds(40, 495, 36, 14);
        getContentPane().add(tfName);
        tfName.setBounds(161, 109, 293, 20);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnRegistrar.setText("ADD NEW ROL");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(200, 550, 160, 41);

        lbLastName.setForeground(new java.awt.Color(0, 0, 0));
        lbLastName.setText("LAST NAME:");
        getContentPane().add(lbLastName);
        lbLastName.setBounds(40, 168, 59, 14);
        getContentPane().add(tfLastName);
        tfLastName.setBounds(161, 165, 293, 20);

        lbPhone.setForeground(new java.awt.Color(0, 0, 0));
        lbPhone.setText("PHONE:");
        getContentPane().add(lbPhone);
        lbPhone.setBounds(40, 386, 38, 14);
        getContentPane().add(tfPhone);
        tfPhone.setBounds(161, 383, 293, 20);

        lbID.setForeground(new java.awt.Color(0, 0, 0));
        lbID.setText("ID:");
        lbID.setToolTipText("");
        getContentPane().add(lbID);
        lbID.setBounds(40, 61, 15, 14);
        getContentPane().add(tfID);
        tfID.setBounds(161, 58, 293, 20);
        getContentPane().add(tfPassword);
        tfPassword.setBounds(161, 273, 293, 20);

        lbUserName.setForeground(new java.awt.Color(0, 0, 0));
        lbUserName.setText("USERNAME:");
        getContentPane().add(lbUserName);
        lbUserName.setBounds(40, 221, 58, 14);
        getContentPane().add(tfUserName);
        tfUserName.setBounds(161, 218, 293, 20);

        lbAge.setForeground(new java.awt.Color(0, 0, 0));
        lbAge.setText("AGE:");
        getContentPane().add(lbAge);
        lbAge.setBounds(40, 330, 24, 14);
        getContentPane().add(tfAge);
        tfAge.setBounds(161, 327, 293, 20);

        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setText("EMAIL:");
        getContentPane().add(lbEmail);
        lbEmail.setBounds(40, 440, 34, 14);
        getContentPane().add(tfEmail);
        tfEmail.setBounds(161, 434, 293, 20);
        getContentPane().add(lbMensajes);
        lbMensajes.setBounds(658, 544, 338, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 260, 260, 310);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -240, 2130, 1480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String passw = tfPassword.getText().trim();

        if (lo.validatePassword(passw)) {
            Roles p = new Roles();

        }//End if
        else {
            JOptionPane.showMessageDialog(null, "INVALID PASSWORD!");
        }//endValidatePassword

        if (lo.validateTel(tfPhone.getText()) && tfPhone.getText().length() == 8) {

        } else {
            JOptionPane.showMessageDialog(null, "IN THE PHONE, ADD ONLY 8 NUMBERS!");
        }
////////////////////////////////////////////////////////////////////////////

        if (lo.validateCed(tfID.getText()) && tfID.getText().length() == 9) {

        } else {
            JOptionPane.showMessageDialog(null, "IN THE ID, ADD ONLY 9 NUMBERS!");
        }
////////////////////////////////////////////////////////////////////////////

        if (lo.validateLetras(tfLastName.getText())) {

        } else {
            JOptionPane.showMessageDialog(null, "IN THE LAST NAME, ADD ONLY LETTERS!");
        }
///////////////////////////////////////////////////////////////////////

        if (lo.validateNombre(tfName.getText())) {

        } else {
            JOptionPane.showMessageDialog(null, "IN THE NAME, ADD ONLY LETTERS!");
        }
////////////////////////////////////////////////////////////////////

        if (lo.validateAge(tfAge.getText()) && tfAge.getText().length() <= 3) {

        } else {
            JOptionPane.showMessageDialog(null, "IN THE AGE, ADD ONLY NUMBERS!");
        }

        if (tfID.getText().equals("") || tfName.getText().equals("") || tfLastName.getText().equals("") || tfUserName.getText().equals("") || tfPassword.getText().equals("") || tfEmail.getText().equals("")) {
            lbMensajes.setText("FILL THE DATA!");
        }//End if
        else {
            int rol = 0;
            if (cbRoles.getSelectedItem().toString() == "ADMINISTRATOR") {
                rol = 2;
            }//End if 
            else {
                rol = 3;
            }//End else

            Customers cU = new Customers();
            Logic l = new Logic();
            Roles r = new Roles(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), rol);
            cU.add(r);
            try {
                if (((lo.validateAge(tfAge.getText()) && tfAge.getText().length() <= 3) && lo.validateNombre(tfName.getText()) && lo.validateLetras(tfLastName.getText()) && (lo.validateCed(tfID.getText()) && tfID.getText().length() == 9) && lo.validateTel(tfPhone.getText()) && tfPhone.getText().length() == 8) && lo.validatePassword(passw) && cU.createCliente(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), rol) == true) {
                    l.insertCustomer(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), rol);
                    lbMensajes.setText("SUCCESFUL PROCEDURE!");
                    tfID.setText("");
                    tfName.setText("");
                    tfLastName.setText("");
                    tfUserName.setText("");
                    tfPassword.setText("");
                    tfAge.setText("");
                    tfPhone.setText("");
                    tfEmail.setText("");

                } else if (((lo.validateAge(tfAge.getText()) && tfAge.getText().length() <= 3) && lo.validateNombre(tfName.getText()) && lo.validateLetras(tfLastName.getText()) && (lo.validateCed(tfID.getText()) && tfID.getText().length() == 9) && lo.validateTel(tfPhone.getText()) && tfPhone.getText().length() == 8) && lo.validatePassword(passw) && cU.createCliente(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), rol) == false) {

                    lbMensajes.setText("USER ALREADY EXISTS!");
                }
            } catch (FileNotFoundException ex) {

                JOptionPane.showMessageDialog(null, ex);

            }//end try/catch
        }//End else
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbRolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbRolesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolesMouseClicked

    private void cbRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolesActionPerformed

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
            java.util.logging.Logger.getLogger(NewRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbRoles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbMensajes;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRoles;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
