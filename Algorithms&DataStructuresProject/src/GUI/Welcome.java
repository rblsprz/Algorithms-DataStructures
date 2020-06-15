/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author David Robles
 */
public class Welcome extends javax.swing.JFrame {
private Timer time;

    public Welcome() {
        initComponents();
        lbEnter.setCursor(new Cursor(HAND_CURSOR));
        setLocation(350, 50);
    }//End Welcome

    public class progress implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            int n = jProgressBar.getValue();
            if (n < 100) {
                n++;
                jProgressBar.setValue(n);             
        }//End if
            else{
               time.stop();
               Main m = new Main();
               m.show(true);
               show(false);
            }//End else
        }//End actionEvent   
    }//End progress
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBarrasWelcome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        lbEnter = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lbBarrasWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/barrasWelcome.jpg"))); // NOI18N
        getContentPane().add(lbBarrasWelcome);
        lbBarrasWelcome.setBounds(0, 0, 290, 710);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/barrasWelcome.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(940, 0, 310, 710);
        getContentPane().add(jProgressBar);
        jProgressBar.setBounds(440, 360, 390, 14);

        lbEnter.setText("     ENTER");
        lbEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEnterMouseClicked(evt);
            }
        });
        getContentPane().add(lbEnter);
        lbEnter.setBounds(600, 390, 90, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-blanco.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jLabel3.setMinimumSize(new java.awt.Dimension(2000, 2000));
        jLabel3.setPreferredSize(new java.awt.Dimension(2000, 2000));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, -3, 662, 710);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEnterMouseClicked
        time.start();
    }//GEN-LAST:event_lbEnterMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        time = new Timer(20, new progress());
    }//GEN-LAST:event_formWindowOpened
                               

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        }//End Runnable
        );
    }//End main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JLabel lbBarrasWelcome;
    private javax.swing.JLabel lbEnter;
    // End of variables declaration//GEN-END:variables
}
