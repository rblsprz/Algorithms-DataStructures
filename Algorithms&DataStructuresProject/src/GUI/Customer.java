/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author HELLO
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        this.setExtendedState(Customer.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lbCustomer = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMyProfile = new javax.swing.JMenu();
        menuItemMyAdvances = new javax.swing.JMenuItem();
        menuItemMyDatingHistory = new javax.swing.JMenuItem();
        menuItemMyFoodPlans = new javax.swing.JMenuItem();
        menuAdd = new javax.swing.JMenu();
        menuItemNewDate = new javax.swing.JMenuItem();
        menuCRUD = new javax.swing.JMenu();
        menuItemMyCRUD = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        menuItemSignOff = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCustomer.setText("CUSTOMER");

        menuMyProfile.setText("MY PROFILE");

        menuItemMyAdvances.setText("MY ADVANCES");
        menuItemMyAdvances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMyAdvancesActionPerformed(evt);
            }
        });
        menuMyProfile.add(menuItemMyAdvances);

        menuItemMyDatingHistory.setText("MY DATING HISTORY");
        menuItemMyDatingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMyDatingHistoryActionPerformed(evt);
            }
        });
        menuMyProfile.add(menuItemMyDatingHistory);

        menuItemMyFoodPlans.setText("MY FOOD PLANS");
        menuItemMyFoodPlans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMyFoodPlansActionPerformed(evt);
            }
        });
        menuMyProfile.add(menuItemMyFoodPlans);

        jMenuBar1.add(menuMyProfile);

        menuAdd.setText("ADD");

        menuItemNewDate.setText("NEW DATE");
        menuItemNewDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewDateActionPerformed(evt);
            }
        });
        menuAdd.add(menuItemNewDate);

        jMenuBar1.add(menuAdd);

        menuCRUD.setText("CRUD");

        menuItemMyCRUD.setText("MY CRUD");
        menuItemMyCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMyCRUDActionPerformed(evt);
            }
        });
        menuCRUD.add(menuItemMyCRUD);

        jMenuBar1.add(menuCRUD);

        menuOptions.setText("OPTIONS");

        menuItemSignOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemSignOff.setText("SIGN OFF");
        menuItemSignOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSignOffActionPerformed(evt);
            }
        });
        menuOptions.add(menuItemSignOff);

        jMenuBar1.add(menuOptions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lbCustomer)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbCustomer)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemMyDatingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMyDatingHistoryActionPerformed
        MyDatingHistory mH = new MyDatingHistory();
        mH.show();
        mH.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemMyDatingHistoryActionPerformed

    private void menuItemMyAdvancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMyAdvancesActionPerformed
        MyAdvances mA = new MyAdvances();
        mA.show();
        mA.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemMyAdvancesActionPerformed

    private void menuItemMyFoodPlansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMyFoodPlansActionPerformed
        MyFoodPlans mF = new MyFoodPlans();
        mF.show();
        mF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemMyFoodPlansActionPerformed

    private void menuItemNewDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewDateActionPerformed
        CitaCliente cC = new CitaCliente();
        cC.show();
        cC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemNewDateActionPerformed

    private void menuItemSignOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSignOffActionPerformed
        Main m = new Main();
        m.show();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemSignOffActionPerformed

    private void menuItemMyCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMyCRUDActionPerformed
        CRUDCustomerDates cS = new CRUDCustomerDates();
        cS.show();
        cS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemMyCRUDActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbCustomer;
    private javax.swing.JMenu menuAdd;
    private javax.swing.JMenu menuCRUD;
    private javax.swing.JMenuItem menuItemMyAdvances;
    private javax.swing.JMenuItem menuItemMyCRUD;
    private javax.swing.JMenuItem menuItemMyDatingHistory;
    private javax.swing.JMenuItem menuItemMyFoodPlans;
    private javax.swing.JMenuItem menuItemNewDate;
    private javax.swing.JMenuItem menuItemSignOff;
    private javax.swing.JMenu menuMyProfile;
    private javax.swing.JMenu menuOptions;
    // End of variables declaration//GEN-END:variables
}
