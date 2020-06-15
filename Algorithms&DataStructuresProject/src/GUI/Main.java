package GUI;

import Logic.Logic;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author David Robles
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        ButtonGroup grupoDeBotones = new ButtonGroup();
        grupoDeBotones.add(jRadioButtonSuperAdministrador);
        grupoDeBotones.add(jRadioButtonAdministrador);
        grupoDeBotones.add(jRadioButtonCustomer);
    }//End Main

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogin = new javax.swing.JLabel();
        jRadioButtonAdministrador = new javax.swing.JRadioButton();
        jRadioButtonCustomer = new javax.swing.JRadioButton();
        lbNombreUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        tFnombredeUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        jRadioButtonSuperAdministrador = new javax.swing.JRadioButton();
        tfpassword = new javax.swing.JPasswordField();
        lbAutenticacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(null);

        lbLogin.setText("LOGIN");
        getContentPane().add(lbLogin);
        lbLogin.setBounds(282, 58, 48, 20);

        jRadioButtonAdministrador.setText("2. ADMINISTRATOR");
        jRadioButtonAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonAdministrador);
        jRadioButtonAdministrador.setBounds(307, 110, 181, 29);

        jRadioButtonCustomer.setText("3. CUSTOMER");
        getContentPane().add(jRadioButtonCustomer);
        jRadioButtonCustomer.setBounds(489, 110, 135, 29);

        lbNombreUsuario.setText("USERNAME:");
        getContentPane().add(lbNombreUsuario);
        lbNombreUsuario.setBounds(150, 251, 88, 20);

        lbContraseña.setText("PASSWORD:");
        getContentPane().add(lbContraseña);
        lbContraseña.setBounds(150, 304, 91, 20);
        getContentPane().add(tFnombredeUsuario);
        tFnombredeUsuario.setBounds(274, 248, 216, 26);

        btnIniciarSesion.setText("LOGIN");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion);
        btnIniciarSesion.setBounds(345, 419, 81, 29);

        jRadioButtonSuperAdministrador.setText("1. SUPER ADMINISTRATOR");
        getContentPane().add(jRadioButtonSuperAdministrador);
        jRadioButtonSuperAdministrador.setBounds(22, 110, 233, 29);
        getContentPane().add(tfpassword);
        tfpassword.setBounds(274, 301, 216, 26);
        getContentPane().add(lbAutenticacion);
        lbAutenticacion.setBounds(150, 366, 337, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1, 0, 690, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAdministradorActionPerformed
    public ArrayList activo() {

        ArrayList<String> usuarioActivo = new ArrayList<String>();
        usuarioActivo.add(tFnombredeUsuario.getText());
        usuarioActivo.add(tfpassword.getText());
        return usuarioActivo;
    }

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String superAdministradorNombre = "r";
        String superAdministradorContrasena = "u";
        Logic Lf = new Logic();

        int rol = 0;

        if ((tfpassword.getText().length() == 0 && tfpassword.getText().length() == 0) && (!jRadioButtonSuperAdministrador.isSelected() && !jRadioButtonAdministrador.isSelected() && !jRadioButtonCustomer.isSelected())) {
            lbAutenticacion.setText("INVALID USERNAME OR PASSWORD!");
        }//End if
        else if ((tfpassword.getText().length() == 0 || tfpassword.getText().length() == 0) || (!jRadioButtonSuperAdministrador.isSelected() && !jRadioButtonAdministrador.isSelected() && !jRadioButtonCustomer.isSelected())) {
            lbAutenticacion.setText("INVALID USERNAME OR PASSWORD!");
        }//End else if 
//End else if

        if (jRadioButtonSuperAdministrador.isSelected()) {
            rol = 1;
        } else if (jRadioButtonAdministrador.isSelected()) {
            rol = 2;
        } else if (jRadioButtonCustomer.isSelected()) {
            rol = 3;
        }

        try {
            if (rol == 1) {
                tFnombredeUsuario.setText(superAdministradorNombre);
                tfpassword.setText(superAdministradorContrasena);

                if (tFnombredeUsuario.getText().equals(superAdministradorNombre) && tfpassword.getText().equals(superAdministradorContrasena)) {
                    SuperAdministrator sA = new SuperAdministrator();
                    sA.setVisible(true);
                    dispose();
                }//End if
            } else if (Lf.searchAdministratorID(tFnombredeUsuario.getText(), tfpassword.getText(), rol) == false) {
                JOptionPane.showMessageDialog(null, "NO DATA FOUND"); //No encuentra al usuario
                tFnombredeUsuario.setText("");
                tfpassword.setText("");
            } else {

                if (rol == 2) {
                    JOptionPane.showMessageDialog(null, "Administrador Aceptado"); //Usuario tipo Admin

                    Lf.searchCliente(tFnombredeUsuario.getText(), tfpassword.getText());
                    tFnombredeUsuario.setText("");
                    tfpassword.setText("");

                    Administrator A = new Administrator();
                    dispose();
                    A.setVisible(true);

                }
                if (rol == 3) {
                    JOptionPane.showMessageDialog(null, "Usuario Aceptado"); //Usuario tipo Cliente
                    Lf.searchCliente(tFnombredeUsuario.getText(), tfpassword.getText());
                    tFnombredeUsuario.setText("");
                    tfpassword.setText("");
                    Customer C = new Customer();
                    dispose();
                    C.setVisible(true);

                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonAdministrador;
    private javax.swing.JRadioButton jRadioButtonCustomer;
    private javax.swing.JRadioButton jRadioButtonSuperAdministrador;
    private javax.swing.JLabel lbAutenticacion;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JTextField tFnombredeUsuario;
    private javax.swing.JPasswordField tfpassword;
    // End of variables declaration//GEN-END:variables
}
