package GUI;

import static GUI.CRUD.jTable3;
import Logic.Cita;
import Logic.Logic;
import Logic.Roles;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Robles
 */
public class DatingHistory extends javax.swing.JFrame {

    /**
     * Creates new form DatingHistory
     */
    public DatingHistory() {
        initComponents();
        this.setExtendedState(DatingHistory.MAXIMIZED_BOTH);
    }

    public void mostrarRegistrosCitas() {
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();

        Roles[] tempCustomers = lC.readRegistersFilesIndividual();
        for (int i = 0; i < tempCustomers.length; i++) {
            array.add(tempCustomers[i]);
        }//End for
         
        for (int j = 0; j < 1; j++) {
            tfID.setText(array.get(j).getCedula());
            tfName.setText(array.get(j).getNombre());
        }//End for
    }//End mostrarNombre

    //Busca al cliente en los registros si lo encuentra lo va a mostra en la tabla
    public void searchCustomers(String cedula) throws FileNotFoundException {
        Logic lC = new Logic();
        ArrayList<Cita> individual = new ArrayList();
        Cita[] c = lC.readRegistersFilesCita();
        for (int i = 0; i < c.length; i++) {
                individual.add(c[i]);  
        }//End for

        String matriz[][] = new String[individual.size()][4];

        for (int i = 0; i < individual.size(); i++) {
            matriz[i][0] = individual.get(i).getFecha();
            matriz[i][1] = individual.get(i).getHora();
            matriz[i][2] = individual.get(i).getNombre();
            matriz[i][3] = individual.get(i).getCedula();

            tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "DATE", "TIME", "NAME", "ID"
                    }//End tablaMyDatingHistory
            ));
        }//End for
    }//End searchIndividualCustomer

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDatingHistory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        lbName = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfTime = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        btnShowDatingHistory = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDatingHistory.setText("DATING HISTORY");

        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "TIME", "NAME", "ID"
            }
        ));
        tablaRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRegistros);

        lbName.setText("NAME:");

        lbID.setText("ID:");

        lbTime.setText("TIME:");

        lbDate.setText("DATE:");

        tfTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTimeActionPerformed(evt);
            }
        });

        btnShowDatingHistory.setText("SHOW DATING HISTORY");
        btnShowDatingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDatingHistoryActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");

        btnDelete.setText("DELETE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDatingHistory)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnShowDatingHistory)
                        .addGap(26, 26, 26)
                        .addComponent(btnUpdate)
                        .addGap(37, 37, 37)
                        .addComponent(btnDelete))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lbDate)
                            .addGap(18, 18, 18)
                            .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbName)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbID)
                                        .addGap(35, 35, 35)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbTime)
                                    .addGap(22, 22, 22)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfTime, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbDatingHistory)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTime)
                            .addComponent(tfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDate)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShowDatingHistory)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTimeActionPerformed

    private void tablaRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRegistrosMouseClicked
        int seleccion = tablaRegistros.getSelectedRow();
        tfTime.setText(tablaRegistros.getValueAt(seleccion, 1).toString());
        tfID.setText(tablaRegistros.getValueAt(seleccion, 3).toString());
        tfName.setText(tablaRegistros.getValueAt(seleccion, 2).toString());
        tfDate.setText(tablaRegistros.getValueAt(seleccion, 0).toString());
    }//GEN-LAST:event_tablaRegistrosMouseClicked

    private void btnShowDatingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDatingHistoryActionPerformed
       try {
            mostrarRegistrosCitas();
            searchCustomers(tfID.getText());
        }//End try 
        catch (FileNotFoundException ex) {
            Logger.getLogger(CRUDCustomerDates.class.getName()).log(Level.SEVERE, null, ex);
        }//End catch
    }//GEN-LAST:event_btnShowDatingHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(DatingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatingHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnShowDatingHistory;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDatingHistory;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTable tablaRegistros;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTime;
    // End of variables declaration//GEN-END:variables
}
