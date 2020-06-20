/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.CustomerNotes;
import Logic.Logic;
import Logic.NodeTrees;
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

    public void mostrarDatosCliente() {
        NodeTrees nT;
        Logic lC = new Logic();
        ArrayList<CustomerNotes> array = new ArrayList();
        CustomerNotes tempCountries[] = lC.readRegistersFilesCustomer();
        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//End for
        for (int j = 0; j < tempCountries.length; j++) {
            String edad = array.get(j).getEdad() + "";
            String peso = array.get(j).getPeso() + "";
            String altura = array.get(j).getAltura() + "";
            String grasa = array.get(j).getGrasa() + "";
            String agua = array.get(j).getAgua() + "";
            String masa = array.get(j).getMasaCorporal() + "";
            String musculo = array.get(j).getMusculo() + "";

            tfID.setText(array.get(j).getCedula().trim());
            tfName.setText(array.get(j).getNombre().trim());
            tANotes.setText(array.get(j).getNotas().trim());
            tANotes.setEditable(false);
            tfAge.setText(edad);
            tfWeight.setText(peso);
            tfHeight.setText(altura);
            tfGrease.setText(grasa);
            tfBodyWater.setText(agua);
            tfBodyMassIndex.setText(masa);
            tfMuscleMass.setText(musculo);
        }//End for
    }//End mostrarDatosCliente

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        lbNutritionalInfoemation = new javax.swing.JLabel();
        lbPersonalInformation = new javax.swing.JLabel();
        lbMyAdvances1 = new javax.swing.JLabel();
        lbWeight = new javax.swing.JLabel();
        tfHeight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfWeight = new javax.swing.JTextField();
        lbGrease = new javax.swing.JLabel();
        tfGrease = new javax.swing.JTextField();
        lbBodyWater = new javax.swing.JLabel();
        tfBodyWater = new javax.swing.JTextField();
        lbBodyMassIndex = new javax.swing.JLabel();
        tfBodyMassIndex = new javax.swing.JTextField();
        lbMuscleMass = new javax.swing.JLabel();
        tfMuscleMass = new javax.swing.JTextField();
        lbShowCharts = new javax.swing.JLabel();
        lbNotes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tANotes = new javax.swing.JTextArea();
        lbAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NAME:");

        lbID.setText("ID:");

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

        lbNutritionalInfoemation.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbNutritionalInfoemation.setText("NUTRITIONAL INFORMATION");

        lbPersonalInformation.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbPersonalInformation.setText("PERSONAL INFORMATION");

        lbMyAdvances1.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbMyAdvances1.setText("MY ADVANCES");

        lbWeight.setText("WEIGHT:");

        tfHeight.setEditable(false);
        tfHeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfHeightMouseClicked(evt);
            }
        });

        jLabel2.setText("HEIGHT:");

        tfWeight.setEditable(false);
        tfWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfWeightMouseClicked(evt);
            }
        });

        lbGrease.setText("% GREASE:");

        tfGrease.setEditable(false);
        tfGrease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfGreaseMouseClicked(evt);
            }
        });

        lbBodyWater.setText("% BODY WATER:");

        tfBodyWater.setEditable(false);
        tfBodyWater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBodyWaterMouseClicked(evt);
            }
        });
        tfBodyWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBodyWaterActionPerformed(evt);
            }
        });

        lbBodyMassIndex.setText("BODY MASS INDEX:");

        tfBodyMassIndex.setEditable(false);
        tfBodyMassIndex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBodyMassIndexMouseClicked(evt);
            }
        });
        tfBodyMassIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBodyMassIndexActionPerformed(evt);
            }
        });

        lbMuscleMass.setText("MUSCLE MASS:");

        tfMuscleMass.setEditable(false);
        tfMuscleMass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfMuscleMassMouseClicked(evt);
            }
        });
        tfMuscleMass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMuscleMassActionPerformed(evt);
            }
        });

        lbShowCharts.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbShowCharts.setText("SHOW CHARTS");

        lbNotes.setText("NOTES:");

        tANotes.setColumns(20);
        tANotes.setRows(5);
        jScrollPane1.setViewportView(tANotes);

        lbAge.setText("AGE:");

        tfAge.setEditable(false);
        tfAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfAgeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbID)
                                .addGap(61, 61, 61)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAge)
                                .addGap(52, 52, 52)
                                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNotes)
                            .addComponent(lbPersonalInformation))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lbGrease)
                            .addComponent(lbBodyWater)
                            .addComponent(lbBodyMassIndex)
                            .addComponent(lbMuscleMass)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBodyWater, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfGrease, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfBodyMassIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMuscleMass, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbWeight)
                            .addComponent(lbNutritionalInfoemation))
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbMyAdvances1)
                        .addGap(325, 325, 325)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbShowCharts)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(822, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbMyAdvances1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNutritionalInfoemation, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbWeight)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbShowCharts, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGrease)
                            .addComponent(tfGrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBodyWater)
                            .addComponent(tfBodyWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBodyMassIndex)
                            .addComponent(tfBodyMassIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMuscleMass)
                            .addComponent(tfMuscleMass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPersonalInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAge)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(lbNotes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(770, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfIDMouseClicked
        mostrarDatosCliente();
    }//GEN-LAST:event_tfIDMouseClicked

    private void tfNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameMouseClicked

    private void tfHeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfHeightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHeightMouseClicked

    private void tfWeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWeightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWeightMouseClicked

    private void tfGreaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfGreaseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGreaseMouseClicked

    private void tfBodyWaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBodyWaterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBodyWaterMouseClicked

    private void tfBodyWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBodyWaterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBodyWaterActionPerformed

    private void tfBodyMassIndexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBodyMassIndexMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBodyMassIndexMouseClicked

    private void tfBodyMassIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBodyMassIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBodyMassIndexActionPerformed

    private void tfMuscleMassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMuscleMassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMuscleMassMouseClicked

    private void tfMuscleMassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMuscleMassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMuscleMassActionPerformed

    private void tfAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfAgeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeMouseClicked

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbBodyMassIndex;
    private javax.swing.JLabel lbBodyWater;
    private javax.swing.JLabel lbGrease;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMuscleMass;
    private javax.swing.JLabel lbMyAdvances1;
    private javax.swing.JLabel lbNotes;
    private javax.swing.JLabel lbNutritionalInfoemation;
    private javax.swing.JLabel lbPersonalInformation;
    private javax.swing.JLabel lbShowCharts;
    private javax.swing.JLabel lbWeight;
    private javax.swing.JTextArea tANotes;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfBodyMassIndex;
    private javax.swing.JTextField tfBodyWater;
    private javax.swing.JTextField tfGrease;
    private javax.swing.JTextField tfHeight;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfMuscleMass;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables
}
