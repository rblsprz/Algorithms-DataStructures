/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Logic;
import Logic.NodeTrees;
import Logic.Roles;
import java.util.ArrayList;

/**
 *
 * @author David Robles
 */
public class MyAdvances extends javax.swing.JFrame {

    /**
     * Creates new form MyAdvances
     */
    public MyAdvances() {
        initComponents();
        this.setExtendedState(MyAdvances.MAXIMIZED_BOTH);
    }

    public void mostrarNombreCliente() {
        NodeTrees nT;
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();

        Roles tempCountries[] = lC.readRegistersFilesIndividual();
        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//End for
        for (int j = 0; j < 1; j++) {
            tfID.setText(array.get(j).getCedula());
            tfName.setText(array.get(j).getNombre());
            tfLastName.setText(array.get(j).getApellido());
            tfUserName.setText(array.get(j).getNombreUsuario());
            //tfPhone.setText();
            tfEmail.setText(array.get(j).getCorreo());
        }//End for
    }//End mostrarDatosCliente

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMyAdvances = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbLastName = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbPersonalInformation = new javax.swing.JLabel();
        lbNutritionalInformation = new javax.swing.JLabel();
        lbFatLevel = new javax.swing.JLabel();
        lbWeight = new javax.swing.JLabel();
        lbMuscle = new javax.swing.JLabel();
        lbHydration = new javax.swing.JLabel();
        lbShowCharts = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfUserName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfUserName1 = new javax.swing.JTextField();
        tfUserName2 = new javax.swing.JTextField();
        tfUserName3 = new javax.swing.JTextField();
        tfUserName4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMyAdvances.setText("MY ADVANCES");

        jLabel1.setText("NAME:");

        lbID.setText("ID:");

        lbLastName.setText("LAST NAME:");

        lbUserName.setText("USERNAME:");

        lbPhone.setText("PHONE:");

        lbEmail.setText("EMAIL:");

        lbPersonalInformation.setText("PERSONAL INFORMATION");

        lbNutritionalInformation.setText("NUTRITIONAL INFORMATION");

        lbFatLevel.setText("FAT LEVEL:");

        lbWeight.setText("WEIGHT:");

        lbMuscle.setText("MUSCLE:");

        lbHydration.setText("HYDRATION:");

        lbShowCharts.setText("SHOW CHARTS");

        tfID.setEditable(false);
        tfID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfIDMouseClicked(evt);
            }
        });

        tfName.setEditable(false);
        tfName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNameMouseClicked(evt);
            }
        });

        tfLastName.setEditable(false);
        tfLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfLastNameMouseClicked(evt);
            }
        });

        tfUserName.setEditable(false);
        tfUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUserNameMouseClicked(evt);
            }
        });

        tfPhone.setEditable(false);
        tfPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPhoneMouseClicked(evt);
            }
        });

        tfEmail.setEditable(false);
        tfEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfEmailMouseClicked(evt);
            }
        });

        tfUserName1.setEditable(false);
        tfUserName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUserName1MouseClicked(evt);
            }
        });

        tfUserName2.setEditable(false);
        tfUserName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUserName2MouseClicked(evt);
            }
        });

        tfUserName3.setEditable(false);
        tfUserName3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUserName3MouseClicked(evt);
            }
        });

        tfUserName4.setEditable(false);
        tfUserName4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUserName4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMyAdvances)
                .addGap(261, 261, 261))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPersonalInformation)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbPhone)
                                        .addComponent(lbEmail))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbID)
                                    .addGap(61, 61, 61)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHydration)
                                    .addComponent(lbNutritionalInformation)
                                    .addComponent(lbFatLevel)
                                    .addComponent(lbWeight)
                                    .addComponent(lbMuscle)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbShowCharts)
                                    .addComponent(tfUserName3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfUserName4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLastName)
                        .addGap(18, 18, 18)
                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbMyAdvances)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNutritionalInformation)
                    .addComponent(lbPersonalInformation))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(lbFatLevel)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWeight)
                    .addComponent(tfUserName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLastName)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMuscle)
                    .addComponent(tfUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUserName)
                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHydration)
                    .addComponent(tfUserName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhone)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbShowCharts)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfIDMouseClicked
        mostrarNombreCliente();
    }//GEN-LAST:event_tfIDMouseClicked

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameMouseClicked

    private void tfLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfLastNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastNameMouseClicked

    private void tfUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUserNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserNameMouseClicked

    private void tfPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPhoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneMouseClicked

    private void tfEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfEmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailMouseClicked

    private void tfUserName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUserName1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserName1MouseClicked

    private void tfUserName2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUserName2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserName2MouseClicked

    private void tfUserName3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUserName3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserName3MouseClicked

    private void tfUserName4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUserName4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserName4MouseClicked

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
            java.util.logging.Logger.getLogger(MyAdvances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAdvances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAdvances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAdvances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyAdvances().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFatLevel;
    private javax.swing.JLabel lbHydration;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbMuscle;
    private javax.swing.JLabel lbMyAdvances;
    private javax.swing.JLabel lbNutritionalInformation;
    private javax.swing.JLabel lbPersonalInformation;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbShowCharts;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JLabel lbWeight;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUserName;
    private javax.swing.JTextField tfUserName1;
    private javax.swing.JTextField tfUserName2;
    private javax.swing.JTextField tfUserName3;
    private javax.swing.JTextField tfUserName4;
    // End of variables declaration//GEN-END:variables
}
