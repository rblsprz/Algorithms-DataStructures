package GUI;

import Logic.Cita;
import Logic.Delete;
import Logic.Logic;
import Logic.Roles;
import Logic.Update;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static GUI.CRUDCustomerDates.jTableCustom;

/**
 *
 * @author David Robles
 */
public class MyDatingHistory extends javax.swing.JFrame {

    /**
     * Creates new form MyDatingHistory
     */
    public MyDatingHistory() {
        initComponents();
        this.setExtendedState(MyDatingHistory.MAXIMIZED_BOTH);
    }

    public void mostrarNombre() {
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
    public void searchIndividualCustomer(String cedula) throws FileNotFoundException {
        Logic lC = new Logic();
        ArrayList<Cita> individual = new ArrayList();
        Cita[] c = lC.readRegistersFilesCita();
        for (int i = 0; i < c.length; i++) {
            if (c[i].getCedula().equalsIgnoreCase(cedula)) {
                individual.add(c[i]);
            }//End if
        }//End for

        String matriz[][] = new String[individual.size()][4];

        for (int i = 0; i < individual.size(); i++) {
            matriz[i][0] = individual.get(i).getFecha();
            matriz[i][1] = individual.get(i).getHora();
            matriz[i][2] = individual.get(i).getNombre();
            matriz[i][3] = individual.get(i).getCedula();

            tablaMyDatingHistory.setModel(new javax.swing.table.DefaultTableModel(
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

        lbDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMyDatingHistory = new javax.swing.JTable();
        btnShowMyDatingHistory = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lbDates = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfTime = new javax.swing.JTextField();
        lbMessages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDate.setText("MY DATING HISTORY");

        tablaMyDatingHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "TIME", "NAME", "ID"
            }
        ));
        tablaMyDatingHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMyDatingHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMyDatingHistory);

        btnShowMyDatingHistory.setText("SHOW MY DATING HISTORY");
        btnShowMyDatingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMyDatingHistoryActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbName.setText("NAME:");

        lbID.setText("ID:");

        lbDates.setText("DATE:");

        jLabel1.setText("TIME:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbName)
                                            .addComponent(lbID)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbDates)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfName)
                            .addComponent(tfID)
                            .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(tfDate)
                            .addComponent(tfTime)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMessages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShowMyDatingHistory)
                                .addGap(28, 28, 28)
                                .addComponent(btnUpdate)
                                .addGap(35, 35, 35)
                                .addComponent(btnDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lbDate)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDates))
                        .addGap(18, 18, 18)
                        .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbDate)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowMyDatingHistory)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(40, 40, 40)
                .addComponent(lbMessages)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMyDatingHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMyDatingHistoryMouseClicked
        int seleccion = tablaMyDatingHistory.getSelectedRow();
        tfTime.setText(tablaMyDatingHistory.getValueAt(seleccion, 1).toString());
        tfID.setText(tablaMyDatingHistory.getValueAt(seleccion, 3).toString());
        tfName.setText(tablaMyDatingHistory.getValueAt(seleccion, 2).toString());
        tfDate.setText(tablaMyDatingHistory.getValueAt(seleccion, 0).toString());
    }//GEN-LAST:event_tablaMyDatingHistoryMouseClicked

    private void btnShowMyDatingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMyDatingHistoryActionPerformed
        try {
            mostrarNombre();
            searchIndividualCustomer(tfID.getText());
        }//End try 
        catch (FileNotFoundException ex) {
            Logger.getLogger(CRUDCustomerDates.class.getName()).log(Level.SEVERE, null, ex);
        }//End catch
    }//GEN-LAST:event_btnShowMyDatingHistoryActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
//        String dia = Integer.toString(dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
//        String mes = Integer.toString(dateChooser.getCalendar().get(Calendar.MONTH) + 1);
//        String year = Integer.toString(dateChooser.getCalendar().get(Calendar.YEAR));
//        String fecha = (year + "-" + mes + "-" + dia);
//
//        try {
//            Update uP = new Update();
//            int edit = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO UPDATE " + tfID.getText() + " ?");
//            if (edit == 0) {
//                if (Trees.searchCita(fecha, tfTime.getText()) == false) {
//                    uP.actualizarCita2(fecha, tfTime.getText(), tfName.getText(), tfID.getText());
//                    searchIndividualCustomer(tfID.getText());
//                    lbMessages.setText("SUCCESSFULLY UPDATED!");
//                    tfID.setText("");
//                    tfName.setText("");
//                    tfTime.setText("");
//                    tfDate.setText("");
//                }//End if 
//                else {
//                    JOptionPane.showMessageDialog(null, "THE DATA AND TIME AREN'T AVAILABLE!");
//                }//End else
//            }//End if
//        }//End try 
//        catch (IOException ex) {
//            lbMessages.setText("UPDATE ERROR!");
//        }//End catch
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//        try {
//            Delete stack = new Delete();
//            int d = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO DELETE " + tfID.getText()+ " ?");
//            if(d == 0){
//                stack.borrarCita("citas.txt", tfDate.getText(), tfTime.getText());
//                searchIndividualCustomer(tfID.getText());
//                lbMessages.setText("SUCCESSFULLY DELETED!");
//                tfID.setText("");
//                tfDate.setText("");
//                tfTime.setText("");
//                tfName.setText("");
//                tfDate.setText("");
//            }
//        }catch (IOException ex) {
//            lbMessages.setText("DELETE ERROR!!");
//        }
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
            java.util.logging.Logger.getLogger(MyDatingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyDatingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyDatingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyDatingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyDatingHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnShowMyDatingHistory;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDates;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbName;
    private javax.swing.JTable tablaMyDatingHistory;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTime;
    // End of variables declaration//GEN-END:variables
}
