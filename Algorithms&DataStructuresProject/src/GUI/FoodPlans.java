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

    /**
     * Creates new form FoodPlans
     */
    public FoodPlans() {
        initComponents();
        this.setExtendedState(FoodPlans.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFoodPlans = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbAddFoodPlan = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        lbMessages = new javax.swing.JLabel();
        checkBoxFruits = new javax.swing.JCheckBox();
        checkBoxDarkGreenVegetables = new javax.swing.JCheckBox();
        checkBoxRedOrangeVegetables = new javax.swing.JCheckBox();
        checkBoxStarchyVegetables = new javax.swing.JCheckBox();
        checkBoxOtherVegetables = new javax.swing.JCheckBox();
        checkBoxWholeGrains = new javax.swing.JCheckBox();
        checkBoxOtherGrains = new javax.swing.JCheckBox();
        checkBoxMeats = new javax.swing.JCheckBox();
        checkBoxFish = new javax.swing.JCheckBox();
        checkBoxBeans = new javax.swing.JCheckBox();
        checkBoxPoultry = new javax.swing.JCheckBox();
        checkBoxNutsSeeds = new javax.swing.JCheckBox();
        checkBoxEggs = new javax.swing.JCheckBox();
        checkBoxFatsOils = new javax.swing.JCheckBox();
        checkBoxDairyProducts = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbFoodPlans.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbFoodPlans.setText("FOOD PLANS");

        lbID.setText("ID:");

        lbName.setText("NAME:");

        lbAddFoodPlan.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbAddFoodPlan.setText("ADD FOOD PLAN");
        lbAddFoodPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAddFoodPlanMouseClicked(evt);
            }
        });

        checkBoxFruits.setText("FRUITS");

        checkBoxDarkGreenVegetables.setText("DARK GREEN VEGETABLES");

        checkBoxRedOrangeVegetables.setText("RED AND ORANGE VEGETABLES");

        checkBoxStarchyVegetables.setText("STARCHY VEGETABLES");

        checkBoxOtherVegetables.setText("OTHER VEGETABLES");

        checkBoxWholeGrains.setText("WHOLE GRAINS");

        checkBoxOtherGrains.setText("OTHER GRAINS");

        checkBoxMeats.setText("MEATS");

        checkBoxFish.setText("FISH");

        checkBoxBeans.setText("BEANS");

        checkBoxPoultry.setText("POULTRY");

        checkBoxNutsSeeds.setText("NUTS AND SEEDS");

        checkBoxEggs.setText("EGGS");

        checkBoxFatsOils.setText("FATS AND OILS");

        checkBoxDairyProducts.setText("DAIRY PRODUCTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbID)
                                    .addComponent(lbName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxFruits)
                            .addComponent(checkBoxDarkGreenVegetables)
                            .addComponent(checkBoxRedOrangeVegetables)
                            .addComponent(checkBoxStarchyVegetables))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxMeats)
                            .addComponent(checkBoxOtherGrains)
                            .addComponent(checkBoxWholeGrains)
                            .addComponent(checkBoxOtherVegetables))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lbFoodPlans)
                            .addGap(378, 378, 378))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(checkBoxNutsSeeds)
                            .addGap(73, 73, 73)
                            .addComponent(lbAddFoodPlan)
                            .addGap(158, 158, 158)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxFish)
                            .addComponent(checkBoxBeans)
                            .addComponent(checkBoxPoultry))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxDairyProducts)
                            .addComponent(checkBoxFatsOils)
                            .addComponent(checkBoxEggs)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoodPlans, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lbMessages)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxFruits)
                    .addComponent(checkBoxOtherVegetables)
                    .addComponent(checkBoxFish)
                    .addComponent(checkBoxEggs))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoxDarkGreenVegetables)
                            .addComponent(checkBoxWholeGrains)
                            .addComponent(checkBoxBeans)
                            .addComponent(checkBoxFatsOils))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoxRedOrangeVegetables)
                            .addComponent(checkBoxOtherGrains)
                            .addComponent(checkBoxPoultry)
                            .addComponent(checkBoxDairyProducts))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoxStarchyVegetables)
                            .addComponent(checkBoxMeats)
                            .addComponent(checkBoxNutsSeeds))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAddFoodPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbAddFoodPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddFoodPlanMouseClicked
        if (tfID.getText().equals("") || tfName.getText().equals("")) {
            lbMessages.setText("PLEASE FILL THE DATA!");
        }//End if

        String selected;
        if (checkBoxFruits.isSelected()) {
            selected = "FRUITS";
        }//End if
        if (checkBoxDarkGreenVegetables.isSelected()) {
            selected = "DARK GREEN VEGETABLES";
        }//End if
        if (checkBoxDarkGreenVegetables.isSelected()) {
            selected = "DARK GREEN VEGETABLES";
        }//End if
        if (checkBoxRedOrangeVegetables.isSelected()) {
            selected = "RED AND ORANGE VEGETABLES";
        }//End if
        if (checkBoxStarchyVegetables.isSelected()) {
            selected = "STARCHY VEGETABLES";
        }//End if
        if (checkBoxOtherVegetables.isSelected()) {
            selected = "OTHER VEGETABLES";
        }//End if
        if (checkBoxWholeGrains.isSelected()) {
            selected = "WHOLE GRAINS";
        }//End if
        if (checkBoxOtherGrains.isSelected()) {
            selected = "OTHER GRAINS";
        }//End if
        if (checkBoxMeats.isSelected()) {
            selected = "MEATS";
        }//End if
        if (checkBoxFish.isSelected()) {
            selected = "FISH";
        }//End if
        if (checkBoxBeans.isSelected()) {
            selected = "BEANS";
        }//End if
        if (checkBoxPoultry.isSelected()) {
            selected = "POULTRY";
        }//End if}
        if (checkBoxNutsSeeds.isSelected()) {
            selected = "NUTS AND SEEDS";
        }//End if
        if (checkBoxEggs.isSelected()) {
            selected = "EGGS";
        }//End if
        if (checkBoxFatsOils.isSelected()) {
            selected = "FATS AND OILS";
        }//End if
        if (checkBoxDairyProducts.isSelected()) {
            selected = "DAIRY PRODUCTS";
        }//End if
    }//GEN-LAST:event_lbAddFoodPlanMouseClicked

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
    private javax.swing.JCheckBox checkBoxBeans;
    private javax.swing.JCheckBox checkBoxDairyProducts;
    private javax.swing.JCheckBox checkBoxDarkGreenVegetables;
    private javax.swing.JCheckBox checkBoxEggs;
    private javax.swing.JCheckBox checkBoxFatsOils;
    private javax.swing.JCheckBox checkBoxFish;
    private javax.swing.JCheckBox checkBoxFruits;
    private javax.swing.JCheckBox checkBoxMeats;
    private javax.swing.JCheckBox checkBoxNutsSeeds;
    private javax.swing.JCheckBox checkBoxOtherGrains;
    private javax.swing.JCheckBox checkBoxOtherVegetables;
    private javax.swing.JCheckBox checkBoxPoultry;
    private javax.swing.JCheckBox checkBoxRedOrangeVegetables;
    private javax.swing.JCheckBox checkBoxStarchyVegetables;
    private javax.swing.JCheckBox checkBoxWholeGrains;
    private javax.swing.JLabel lbAddFoodPlan;
    private javax.swing.JLabel lbFoodPlans;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

}
