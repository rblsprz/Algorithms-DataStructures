/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Logic;
import Logic.Update;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Logic.Cita;
import Logic.Delete;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class CRUDAdministratorDates extends javax.swing.JFrame {

    /**
     * Creates new form CRUDAdministratorDates
     */
    FondoPanel fondo = new FondoPanel();

    public CRUDAdministratorDates() {
        this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(CRUD.MAXIMIZED_BOTH);
    }

    Logic Stack = new Logic();

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
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        tfTime = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnShowDates = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        tfDate = new javax.swing.JTextField();
        lbMessages = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "TIME", "NAME", "ID"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(160, 210, 438, 360);

        lbName.setText("NAME:");
        getContentPane().add(lbName);
        lbName.setBounds(680, 240, 32, 14);
        getContentPane().add(tfName);
        tfName.setBounds(770, 230, 219, 20);

        lbID.setText("ID:");
        getContentPane().add(lbID);
        lbID.setBounds(680, 280, 15, 14);
        getContentPane().add(tfID);
        tfID.setBounds(770, 280, 219, 20);

        lbDate.setText("DATE:");
        getContentPane().add(lbDate);
        lbDate.setBounds(680, 340, 72, 14);

        lbTime.setText("TIME:");
        getContentPane().add(lbTime);
        lbTime.setBounds(680, 410, 40, 14);
        getContentPane().add(tfTime);
        tfTime.setBounds(770, 410, 219, 20);

        btnUpdate.setText("UPDATE");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(800, 470, 110, 23);

        btnDelete.setText("DELETE");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(920, 470, 120, 23);

        btnShowDates.setText("SHOW DATES");
        btnShowDates.setBorderPainted(false);
        btnShowDates.setContentAreaFilled(false);
        btnShowDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDatesActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowDates);
        btnShowDates.setBounds(640, 470, 140, 23);
        getContentPane().add(dateChooser);
        dateChooser.setBounds(770, 330, 219, 20);
        getContentPane().add(tfDate);
        tfDate.setBounds(770, 370, 97, 20);
        getContentPane().add(lbMessages);
        lbMessages.setBounds(560, 370, 290, 0);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 580, 170, 170);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int seleccion = jTable3.getSelectedRow();
        tfDate.setText(jTable3.getValueAt(seleccion, 0).toString());
        tfTime.setText(jTable3.getValueAt(seleccion, 1).toString());
        tfName.setText(jTable3.getValueAt(seleccion, 2).toString());
        tfID.setText(jTable3.getValueAt(seleccion, 3).toString());
        // jDateChooser1.setDateFormatString(jTable3.getValueAt(seleccion, 0).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    public void mostrarCitas() {
        Logic lC = new Logic();
        ArrayList<Cita> array = new ArrayList();

        Cita tempCountries[] = lC.readRegistersFilesCita();

        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//endfor

        String matriz[][] = new String[array.size()][4];

        for (int i = 0; i < array.size(); i++) {
            matriz[i][0] = array.get(i).getFecha();
            matriz[i][1] = array.get(i).getHora();
            matriz[i][2] = array.get(i).getNombre();
            matriz[i][3] = array.get(i).getCedula();

            jTable3.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "DATE", "TIME", "NAME", "ID"
                    }
            ));
        }
    }
    private void btnShowDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDatesActionPerformed
        mostrarCitas();
    }//GEN-LAST:event_btnShowDatesActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String dia = Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
        String fecha = (year + "-" + mes + "-" + dia);

        try {
            Update em = new Update();
            int edit = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO UPDATE THE DATE FROM " + tfID.getText() + " ?");
            if (edit == 0) {
                if (Stack.searchCita(fecha, tfTime.getText()) == false) {
                    em.actualizarCita(fecha, tfTime.getText(), tfName.getText(), tfID.getText());
                    lbMessages.setText("SUCCESFULLY UPDATED!");
                    mostrarCitas();
                    tfID.setText("");
                    tfName.setText("");
                    tfTime.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "THE DATA AND TIME AREN'T AVAILABLE!");
                }
            }
        } catch (IOException ex) {
            lbMessages.setText("UPDATE ERROR!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            Delete stack = new Delete();
            int d = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO DELETE THE DATE FROM " + tfID.getText() + " ?");
            if (d == 0) {
                stack.borrarCita("citas.txt", tfDate.getText(), tfTime.getText());
                lbMessages.setText("SUCCESSFULLY DELETED!");
                mostrarCitas();
                tfID.setText("");
                tfDate.setText("");
                tfTime.setText("");
                tfName.setText("");
            }
        } catch (IOException ex) {
            lbMessages.setText("DELETE ERROR!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDAdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDAdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDAdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDAdministratorDates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDAdministratorDates().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnShowDates;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable3;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTime;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/fondo5.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }

    }
}
