/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Cita;
import Logic.Logic;
import Logic.Roles;
import Logic.FileStacks;
import Logic.NodeStacks;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class CitaCliente extends javax.swing.JFrame {

    /**
     * Creates new form CitaCliente
     */
    public CitaCliente() {
        initComponents();
        this.setExtendedState(CitaCliente.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfID = new javax.swing.JTextField();
        lbTime = new javax.swing.JLabel();
        cbmHora = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lbDate = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfID.setEditable(false);
        getContentPane().add(tfID);
        tfID.setBounds(220, 80, 171, 24);

        lbTime.setText("TIME:");
        getContentPane().add(lbTime);
        lbTime.setBounds(150, 240, 60, 16);

        cbmHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 a.m", "09:00 a.m", "10:00 a.m", "11:00 a.m", "12:00 p.m", "13:00 p.m", "14:00 p.m", "15:00 p.m", "16:00 p.m", "17:00 p.m", " " }));
        cbmHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmHoraActionPerformed(evt);
            }
        });
        getContentPane().add(cbmHora);
        cbmHora.setBounds(230, 240, 79, 26);

        btnRequest.setText("REQUEST");
        btnRequest.setBorderPainted(false);
        btnRequest.setContentAreaFilled(false);
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequest);
        btnRequest.setBounds(200, 310, 130, 32);
        getContentPane().add(dateChooser);
        dateChooser.setBounds(220, 180, 160, 29);

        lbDate.setText("DATE:");
        getContentPane().add(lbDate);
        lbDate.setBounds(150, 190, 50, 16);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.png"))); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusable(false);
        btnBack.setOpaque(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 20, 160, 48);

        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(150, 130, 60, 24);

        lbID.setText("ID:");
        getContentPane().add(lbID);
        lbID.setBounds(150, 90, 50, 16);

        tfName.setEditable(false);
        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });
        getContentPane().add(tfName);
        tfName.setBounds(220, 130, 170, 24);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   Main uR = new Main();
    FileStacks stack = new FileStacks();
    Logic Stack = new Logic();
   
     public void mostrarNombre(){
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();
        
        Roles tempCountries[] = lC.readRegistersFilesIndividual();
        for(int i = 0; i < tempCountries.length; i++){
            array.add(tempCountries[i]);
        }//endfor
        for (int j = 0; j < 1; j++) {
            tfID.setText(array.get(j).getCedula().trim());
        tfName.setText(array.get(j).getNombre().trim());
        
        }
    } 
 
    
    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        //Campos vacios validacion
        String dia=Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes=Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH)+1);
        String year=Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
        String fecha=(year+"-"+mes+"-"+dia);

        if (tfID.getText().equals("") || tfName.getText().equals("") || cbmHora.getSelectedItem().equals("") || dateChooser.getDate().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los espacios en blanco");
        }//End if
        else {
            if(Stack.searchCita(fecha, cbmHora.getSelectedItem().toString()) == false){
                NodeStacks pila = new NodeStacks();
                Cita cita = new Cita(fecha, cbmHora.getSelectedItem().toString(), tfID.getText(), tfName.getText());
                pila.push(fecha,cbmHora.getSelectedItem().toString(), tfName.getText(), tfID.getText());
                stack.insertCita(cita);
                JOptionPane.showMessageDialog(null, "Cita Registrada");
            } else {
                JOptionPane.showMessageDialog(null, "La hora y fecha que solicita se encuentran ocupadas");
            }
        }

        //else
        //           JOptionPane.showMessageDialog(null, "Cita NO Registrada");
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Customer nS = new Customer();
        nS.setVisible (true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        mostrarNombre();
    }//GEN-LAST:event_tfNameMouseClicked

    private void cbmHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmHoraActionPerformed

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
            java.util.logging.Logger.getLogger(CitaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CitaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CitaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CitaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CitaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cbmHora;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
