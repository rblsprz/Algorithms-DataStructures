/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Logic.FileStacks;
import Logic.Logic;
import Logic.NodeTrees;
import Logic.Roles;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HELLO
 */
public class FoodPlans extends javax.swing.JFrame {

    /** Creates new form FoodPlans */
    public FoodPlans() {
        initComponents();
        this.setExtendedState(FoodPlans.MAXIMIZED_BOTH);
    }

    Main uR = new Main();
    FileStacks stack = new FileStacks();
    Logic Stack = new Logic();

    public void mostrarNombre() {
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();

        Roles tempCountries[] = lC.readRegistersFilesIndividual();
        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//endfor
        for (int j = 0; j < 1; j++) {
            tfID.setText(array.get(j).getCedula().trim());
            tfName.setText(array.get(j).getNombre().trim());

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFoodPlans = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        btnSaveFoodPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbFoodPlans.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbFoodPlans.setText("FOOD PLANS");

        lbID.setText("ID:");

        tfID.setEditable(false);

        lbName.setText("NAME:");

        tfName.setEditable(false);
        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        btnSaveFoodPlan.setText("ADD FOOD PLAN");
        btnSaveFoodPlan.setBorderPainted(false);
        btnSaveFoodPlan.setContentAreaFilled(false);
        btnSaveFoodPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFoodPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSaveFoodPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbFoodPlans)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbName)
                                .addGap(18, 18, 18)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbFoodPlans, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnSaveFoodPlan)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        mostrarNombre();
        Logic lC = new Logic();
        String tempCountries[] = lC.readRegistersFilesHoras();
    }//GEN-LAST:event_tfNameMouseClicked

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void btnSaveFoodPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFoodPlanActionPerformed

//        if (tfID.getText().equals("") || tfName.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "Rellene todos los espacios en blanco");
//        }//End if
//        else {
//            if (Stack.searchCita(fecha, cbmHora.getSelectedItem().toString()) == false) {
//                NodeTrees trees = new NodeTrees();
//                Cita cita = new Cita(fecha, cbmHora.getSelectedItem().toString(), tfID.getText(), tfName.getText());
//
//                //pila.push(fecha,cbmHora.getSelectedItem().toString(), tfName.getText(), tfID.getText());
//
//                stack.insertCita(cita);
//                JOptionPane.showMessageDialog(null, "Cita Registrada");
//            } else {
//                JOptionPane.showMessageDialog(null, "La hora y fecha que solicita se encuentran ocupadas");
//            }
//        }
//
//        //else
//        //           JOptionPane.showMessageDialog(null, "Cita NO Registrada");
    }//GEN-LAST:event_btnSaveFoodPlanActionPerformed

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
            java.util.logging.Logger.getLogger(FoodPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodPlans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveFoodPlan;
    private javax.swing.JLabel lbFoodPlans;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

}
