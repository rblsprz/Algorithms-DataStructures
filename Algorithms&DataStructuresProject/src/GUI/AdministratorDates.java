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
import Logic.FileStacks;
import Logic.NodeStacks;

/**
 *
 * @author pc
 */
public class AdministratorDates extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_CITAS
     */
    public AdministratorDates() {
        initComponents();
        this.setExtendedState(AdministratorDates.MAXIMIZED_BOTH);
    }
    
    FileStacks stack = new FileStacks();
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
        lbName = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        lbTime = new javax.swing.JLabel();
        cBTime = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lbDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(860, 120, 32, 24);

        lbID.setText("ID:");
        getContentPane().add(lbID);
        lbID.setBounds(870, 80, 37, 14);

        tfName.setBackground(new java.awt.Color(0, 102, 102));
        tfName.setOpaque(false);
        getContentPane().add(tfName);
        tfName.setBounds(920, 120, 170, 20);

        tfID.setBackground(new java.awt.Color(0, 102, 102));
        tfID.setOpaque(false);
        tfID.setSelectionColor(new java.awt.Color(204, 204, 204));
        getContentPane().add(tfID);
        tfID.setBounds(920, 80, 171, 20);

        lbTime.setText("TIME:");
        getContentPane().add(lbTime);
        lbTime.setBounds(870, 220, 28, 20);

        cBTime.setBackground(new java.awt.Color(204, 204, 204));
        cBTime.setEditable(true);
        cBTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 a.m", "09:00 a.m", "10:00 a.m", "11:00 a.m", "12:00 p.m", "13:00 p.m", "14:00 p.m", "15:00 p.m", "16:00 p.m", "17:00 p.m" }));
        cBTime.setToolTipText("");
        cBTime.setOpaque(false);
        cBTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBTimeActionPerformed(evt);
            }
        });
        getContentPane().add(cBTime);
        cBTime.setBounds(920, 220, 79, 20);

        btnRequest.setBackground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("REQUEST");
        btnRequest.setOpaque(false);
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequest);
        btnRequest.setBounds(920, 300, 112, 23);

        dateChooser.setBackground(new java.awt.Color(204, 204, 204));
        dateChooser.setForeground(new java.awt.Color(255, 255, 255));
        dateChooser.setOpaque(false);
        getContentPane().add(dateChooser);
        dateChooser.setBounds(920, 160, 170, 20);

        lbDate.setText("DATE:");
        getContentPane().add(lbDate);
        lbDate.setBounds(870, 170, 30, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 2030, 1020);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        
//Campos vacios validacion
            String dia=Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes=Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH)+1);
            String year=Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
            String fecha=(year+"-"+mes+"-"+dia);
            
        if (tfID.getText().equals("") || tfName.getText().equals("") || cBTime.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los espacios en blanco");
        }//End if 
        else {
            if(Stack.searchCita(fecha, cBTime.getSelectedItem().toString()) == false){
            NodeStacks pila = new NodeStacks();  
            Cita cita = new Cita(fecha, cBTime.getSelectedItem().toString(), tfID.getText(), tfName.getText());            
            pila.push(fecha,cBTime.getSelectedItem().toString(), tfName.getText(), tfID.getText());
            stack.insertCita(cita);
            JOptionPane.showMessageDialog(null, "Cita Registrada");
            } else {
                JOptionPane.showMessageDialog(null, "La hora y fecha que solicita se encuentran ocupadas");
            }
        } 
        
        //else
//           JOptionPane.showMessageDialog(null, "Cita NO Registrada");
    }//GEN-LAST:event_btnRequestActionPerformed

    private void cBTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBTimeActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorDates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cBTime;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
