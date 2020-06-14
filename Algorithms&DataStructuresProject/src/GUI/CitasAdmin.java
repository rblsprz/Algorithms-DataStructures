/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Logic;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import Logic.Cita;
import Logic.logicaPilaFiles;
import Logic.pilaNodo;

/**
 *
 * @author pc
 */
public class CitasAdmin extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_CITAS
     */
    public CitasAdmin() {
        initComponents();
    }
    
    logicaPilaFiles stack = new logicaPilaFiles();
    Logic Stack = new Logic();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbmHora = new javax.swing.JComboBox<>();
        btnSolicitar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(null);

        lblNombre.setText("Nombre del Paciente: ");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(15, 50, 157, 24);

        jLabel1.setText("Cédula:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(118, 87, 54, 20);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(178, 49, 170, 26);
        getContentPane().add(txtCedula);
        txtCedula.setBounds(178, 84, 171, 26);

        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(132, 131, 40, 20);

        cbmHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8 a.m", "9 a.m", "10 a.m", "11 a.m", "2 p.m", "3 p.m", "4 p.m", "5 p.m", " " }));
        getContentPane().add(cbmHora);
        cbmHora.setBounds(178, 128, 79, 26);

        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSolicitar);
        btnSolicitar.setBounds(321, 212, 112, 29);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(464, 49, 160, 26);

        jLabel2.setText("Fecha: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(407, 52, 51, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salida.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 123, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1, 0, 700, 280);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        //Campos vacios validacion
            String dia=Integer.toString(jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes=Integer.toString(jDateChooser1.getCalendar().get(Calendar.MONTH)+1);
            String year=Integer.toString(jDateChooser1.getCalendar().get(Calendar.YEAR));
            String fecha=(year+"-"+mes+"-"+dia);
            
        if (txtCedula.getText().equals("") || txtNombre.getText().equals("") || cbmHora.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los espacios en blanco");
        }//End if 
        else {
            if(Stack.searchCita(fecha, cbmHora.getSelectedItem().toString()) == false){
            pilaNodo pila = new pilaNodo();  
            Cita cita = new Cita(fecha, cbmHora.getSelectedItem().toString(), txtCedula.getText(), txtNombre.getText());            
            pila.push(fecha,cbmHora.getSelectedItem().toString(), txtNombre.getText(), txtCedula.getText());
            stack.insertCita(cita);
            JOptionPane.showMessageDialog(null, "Cita Registrada");
            } else {
                JOptionPane.showMessageDialog(null, "La hora y fecha que solicita se encuentran ocupadas");
            }
        } 
        
        //else
//           JOptionPane.showMessageDialog(null, "Cita NO Registrada");
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Administrator sA=new Administrator();
        dispose();
        sA.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CitasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CitasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CitasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CitasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CitasAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbmHora;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
