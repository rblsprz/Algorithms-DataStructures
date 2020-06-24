package GUI;

import Logic.Logic;
import Logic.Encrypted;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

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
        this.setExtendedState(Main.MAXIMIZED_BOTH);
         //Color JFrame
        this.getContentPane().setBackground(Color.WHITE);

    }//End Main

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogin = new javax.swing.JLabel();
        lbNombreUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        tFnombredeUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        tfpassword = new javax.swing.JPasswordField();
        lbAutenticacion = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        lbMessages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbLogin.setText("LOGIN");

        lbNombreUsuario.setText("USERNAME:");

        lbContraseña.setText("PASSWORD:");

        tFnombredeUsuario.setBackground(new java.awt.Color(204, 204, 204));
        tFnombredeUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        btnIniciarSesion.setText("LOGIN");
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setDoubleBuffered(true);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        tfpassword.setBackground(new java.awt.Color(204, 204, 204));
        tfpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jToggleButton2.setText("SUPER ADMINISTRATOR");
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(970, 970, 970)
                .addComponent(lbLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(950, 950, 950)
                .addComponent(lbNombreUsuario))
            .addGroup(layout.createSequentialGroup()
                .addGap(880, 880, 880)
                .addComponent(tFnombredeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(950, 950, 950)
                .addComponent(lbContraseña))
            .addGroup(layout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAutenticacion, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(880, 880, 880)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(lbMessages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbLogin)
                .addGap(60, 60, 60)
                .addComponent(lbNombreUsuario)
                .addGap(30, 30, 30)
                .addComponent(tFnombredeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lbContraseña)
                .addGap(20, 20, 20)
                .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(lbMessages)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAutenticacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tfpassword.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList activo() {

        ArrayList<String> usuarioActivo = new ArrayList<String>();
        usuarioActivo.add(tFnombredeUsuario.getText());
        usuarioActivo.add(tfpassword.getText());
        return usuarioActivo;
    }

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

       
  
        
        Logic Lf = new Logic();
        Encrypted encode = new Encrypted();

        try {

            //Lf.searchAdminID(txtNombre.getText(),jPasswordField1.getText(), rol)
            if (Lf.searchActivo(tFnombredeUsuario.getText(), tfpassword.getText()) == false) {
                lbMessages.setText("USER NOT FOUND"); //No encuentra al usuario
                tFnombredeUsuario.setText("");
                tfpassword.setText("");
            } else {
                Lf.searchCliente(tFnombredeUsuario.getText(), tfpassword.getText());
                tFnombredeUsuario.setText("");
                tfpassword.setText("");
                dispose();
//                    Main m = new Main();
//                    m.setVisible(false);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        SuperAdministratorWindow vS=new SuperAdministratorWindow();
        dispose();
        vS.show(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lbAutenticacion;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JTextField tFnombredeUsuario;
    private javax.swing.JPasswordField tfpassword;
    // End of variables declaration//GEN-END:variables
}
