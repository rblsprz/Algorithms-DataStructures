package GUI;

import Logic.Logic;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import java.io.IOException;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbLogin.setText("LOGIN");

        jRadioButtonAdministrador.setText("2. ADMINISTRATOR");
        jRadioButtonAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAdministradorActionPerformed(evt);
            }
        });

        jRadioButtonCustomer.setText("3. CUSTOMER");

        lbNombreUsuario.setText("USERNAME:");

        lbContraseña.setText("PASSWORD:");

        btnIniciarSesion.setText("LOGIN");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jRadioButtonSuperAdministrador.setText("1. SUPER ADMINISTRATOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jRadioButtonSuperAdministrador)
                .addGap(52, 52, 52)
                .addComponent(jRadioButtonAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonCustomer)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(lbLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAutenticacion, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNombreUsuario)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbContraseña)
                                        .addGap(21, 21, 21)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tFnombredeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(tfpassword))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lbLogin)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAdministrador)
                    .addComponent(jRadioButtonCustomer)
                    .addComponent(jRadioButtonSuperAdministrador))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFnombredeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombreUsuario))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContraseña)
                    .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(lbAutenticacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnIniciarSesion)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAdministradorActionPerformed

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
        else if (jRadioButtonSuperAdministrador.isSelected()) {
            if (tFnombredeUsuario.getText().equals(superAdministradorNombre) && tfpassword.getText().equals(superAdministradorContrasena)) {
                SuperAdministrator sA;
                sA = new SuperAdministrator();
                sA.show(true);
                this.show(false);
            }//End if
        }//End else if
        
        if(jRadioButtonAdministrador.isSelected()){
           rol = 2; 
       }
       else if(jRadioButtonCustomer.isSelected()){
           rol = 3;
       }
       
     try {      
                
         
                if(Lf.searchAdministratorID(tFnombredeUsuario.getText(),tfpassword.getText(), rol)==false){
                    JOptionPane.showMessageDialog(null, "NO DATA FOUND"); //No encuentra al usuario
                    tFnombredeUsuario.setText("");
                    tfpassword.setText("");   
               }else{
                 if (rol==2) {
                          JOptionPane.showMessageDialog(null, "Administrador Aceptado"); //Usuario tipo Admin
                            tFnombredeUsuario.setText("");
                            tfpassword.setText(""); 
                            
                             Administrator A = new Administrator();
                             dispose();
                             A.setVisible(true);
                             
                            
                   } else if(rol==3){
                            JOptionPane.showMessageDialog(null, "Usuario Aceptado"); //Usuario tipo Cliente
                            tFnombredeUsuario.setText("");
                            tfpassword.setText("");
                             Customer C= new Customer();
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
