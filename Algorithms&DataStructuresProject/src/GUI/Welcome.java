
package GUI;

import java.applet.AudioClip;
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
AudioClip sonido;
    public Welcome() {
        initComponents();
        lbEnter.setCursor(new Cursor(HAND_CURSOR));
        setLocation(900, 500); 
        this.setExtendedState(Welcome.MAXIMIZED_BOTH);
        //AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Images/Sonidos Pacman.wav"));
        sonido.play();//Reproduce el audio
        start();//Infinito
    }//End Welcome
    
    public void start() { //Hilo de infinito
        int i = 0;
        while (i != 100) {
            i++;
            sonido.loop(); //Reproduce audio
        }//End while
    }//End start
    
    public class progress implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            int n = jProgressBar.getValue();
            if (n < 100) {
                n++;
                jProgressBar.setValue(n); 
        }//End if
            else{
               time.stop();
               sonido.stop();//Detiene al audio en la clase Main
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
        lbBarrasWelcome.setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().add(lbBarrasWelcome);
        lbBarrasWelcome.setBounds(0, -50, 540, 1090);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/barrasWelcome.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1440, -20, 740, 1030);
        getContentPane().add(jProgressBar);
        jProgressBar.setBounds(760, 320, 390, 14);

        lbEnter.setText("     ENTER");
        lbEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEnterMouseClicked(evt);
            }
        });
        getContentPane().add(lbEnter);
        lbEnter.setBounds(920, 360, 90, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-blanco.jpg"))); // NOI18N
        jLabel3.setAlignmentX(500.0F);
        jLabel3.setAlignmentY(500.0F);
        jLabel3.setAutoscrolls(true);
        jLabel3.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jLabel3.setMinimumSize(new java.awt.Dimension(2000, 2000));
        jLabel3.setPreferredSize(new java.awt.Dimension(2000, 2000));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, -40, 900, 1040);

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
