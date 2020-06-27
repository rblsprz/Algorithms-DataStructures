/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HELLO
 */
public class SuperAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form SuperAdministrator
     */
    FondoPanel fondo = new FondoPanel();

    public SuperAdministrator() {
        this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(SuperAdministrator.MAXIMIZED_BOTH);
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
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        lbSuperAdministrator = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdd = new javax.swing.JMenu();
        menuItemNewRol = new javax.swing.JMenuItem();
        menuInformation = new javax.swing.JMenu();
        menuItemCRUDRoles = new javax.swing.JMenuItem();
        menuItemSystemActions = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuItemChangeTime = new javax.swing.JMenuItem();
        menuItemEmptyApp = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        menuItemMainDocument = new javax.swing.JMenuItem();
        menuItemUserManual = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        menuItemSignOff = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbSuperAdministrator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSuperAdministrator.setText("SUPER ADMINISTRATOR");
        getContentPane().add(lbSuperAdministrator);
        lbSuperAdministrator.setBounds(880, 70, 248, 108);

        menuAdd.setText("ADD");

        menuItemNewRol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItemNewRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        menuItemNewRol.setText("NEW ROL");
        menuItemNewRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewRolActionPerformed(evt);
            }
        });
        menuAdd.add(menuItemNewRol);

        jMenuBar1.add(menuAdd);

        menuInformation.setText("INFORMATION");

        menuItemCRUDRoles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCRUDRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configure_user_16726.png"))); // NOI18N
        menuItemCRUDRoles.setText("ROLES");
        menuItemCRUDRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCRUDRolesActionPerformed(evt);
            }
        });
        menuInformation.add(menuItemCRUDRoles);

        menuItemSystemActions.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSystemActions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png"))); // NOI18N
        menuItemSystemActions.setText("SYSTEM ACTIONS");
        menuItemSystemActions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSystemActionsActionPerformed(evt);
            }
        });
        menuInformation.add(menuItemSystemActions);

        jMenuBar1.add(menuInformation);

        jMenu7.setText("GLOBAL SETTINGS");

        menuItemChangeTime.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuItemChangeTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configure_user_16726.png"))); // NOI18N
        menuItemChangeTime.setText("CLINIC TIME");
        menuItemChangeTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemChangeTimeActionPerformed(evt);
            }
        });
        jMenu7.add(menuItemChangeTime);

        menuItemEmptyApp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEmptyApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2.png"))); // NOI18N
        menuItemEmptyApp.setText("EMPTY APP");
        menuItemEmptyApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmptyAppActionPerformed(evt);
            }
        });
        jMenu7.add(menuItemEmptyApp);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("DOCUMENTS");

        menuItemMainDocument.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menuItemMainDocument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        menuItemMainDocument.setText("MAIN DOCUMENT");
        menuItemMainDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMainDocumentActionPerformed(evt);
            }
        });
        jMenu8.add(menuItemMainDocument);

        menuItemUserManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemUserManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        menuItemUserManual.setText("USER MANUAL");
        menuItemUserManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUserManualActionPerformed(evt);
            }
        });
        jMenu8.add(menuItemUserManual);

        jMenuBar1.add(jMenu8);

        menuOptions.setText("OPTIONS");
        menuOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionsActionPerformed(evt);
            }
        });

        menuItemSignOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemSignOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salida.png"))); // NOI18N
        menuItemSignOff.setText("SIGN OFF");
        menuItemSignOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSignOffActionPerformed(evt);
            }
        });
        menuOptions.add(menuItemSignOff);

        jMenuBar1.add(menuOptions);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionsActionPerformed
        Main m = new Main();
        m.setVisible(true);
        dispose();    }//GEN-LAST:event_menuOptionsActionPerformed

    private void menuItemSignOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSignOffActionPerformed
        Main m = new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemSignOffActionPerformed

    private void menuItemNewRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewRolActionPerformed
        NewRol nR = new NewRol();
        nR.show();
        nR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SuperAdministrator sA = new SuperAdministrator();
        sA.setVisible(false);
        //dispose();
    }//GEN-LAST:event_menuItemNewRolActionPerformed

    private void menuItemCRUDRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCRUDRolesActionPerformed
        CRUD cR = new CRUD();
        cR.show();
        cR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SuperAdministrator sA = new SuperAdministrator();
        sA.setVisible(false);
        //dispose();
    }//GEN-LAST:event_menuItemCRUDRolesActionPerformed

    private void menuItemChangeTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemChangeTimeActionPerformed
        ClinicTime cT = new ClinicTime();
        cT.show();
        cT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        SuperAdministrator sA = new SuperAdministrator();
//        sA.setVisible(false);

    }//GEN-LAST:event_menuItemChangeTimeActionPerformed

    private void menuItemEmptyAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmptyAppActionPerformed

        int i = JOptionPane.showConfirmDialog(null, "¿ESTÁ SEGUR@ QUÉ DESEA ELIMINAR TODOS LOS DATOS DE LA APLICACIÓN?");
        if (i == 0) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("registros.txt")); //Stream de Escritura de Archivos
                bw.write(""); //Escribe una línea vacía sobre código
                bw.close(); //Vaciar Aplicación
                //////////////////////////////////
                BufferedWriter ba = new BufferedWriter(new FileWriter("citas.txt")); //Stream de Escritura de Archivos
                ba.write(""); //Escribe una línea vacía sobre código
                ba.close(); //Vaciar Aplicación
                /////////////////////////////////////
                BufferedWriter br = new BufferedWriter(new FileWriter("horasConsulta.txt")); //Stream de Escritura de Archivos
                br.write(""); //Escribe una línea vacía sobre código
                br.close(); //Vaciar Aplicación
                ///////////////////////////////////////
                BufferedWriter bs = new BufferedWriter(new FileWriter("notasPaciente.txt")); //Stream de Escritura de Archivos
                bs.write(""); //Escribe una línea vacía sobre código
                bs.close(); //Vaciar Aplicación
                //////////////////////////////////////
                BufferedWriter bt = new BufferedWriter(new FileWriter("clientes.txt")); //Stream de Escritura de Archivos
                bt.write(""); //Escribe una línea vacía sobre código
                bt.close(); //Vaciar Aplicación
                ///////////////////////////////////////
                BufferedWriter bp = new BufferedWriter(new FileWriter("temporal.txt")); //Stream de Escritura de Archivos
                bp.write(""); //Escribe una línea vacía sobre código
                bp.close(); //Vaciar Aplicación
            }//End try
            catch (FileNotFoundException fnfe) {
                JOptionPane.showMessageDialog(null, "Problemas de Archivo");
            }//End catch
            catch (IOException io) {
                JOptionPane.showMessageDialog(null, "Problemas de Archivo");
            }//End catch
        }//End if
    }//GEN-LAST:event_menuItemEmptyAppActionPerformed

    private void menuItemSystemActionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSystemActionsActionPerformed
        SystemActions sR = new SystemActions();
        sR.show();
        sR.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuItemSystemActionsActionPerformed

    private void menuItemMainDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMainDocumentActionPerformed
        try {
      File path = new File ("C:/Users/HELLO/Documents/GitHub/Algorithms-DataStructures/Algorithms&DataStructuresProject/DocumentoNutriciónClínica.pdf");
      Desktop.getDesktop().open(path);
      }//End try
     catch (IOException ex) {
     ex.printStackTrace();
    }//End catch
    }//GEN-LAST:event_menuItemMainDocumentActionPerformed

    private void menuItemUserManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUserManualActionPerformed
//        try {
//            File path = new File("C:/Users/HELLO/Desktop/UCR/Informática y Computación/III Semestre 2020/Algoritmos y Estructuras de Datos/Mayo/Algorithms&DataStructures/Documento.pdf");
//            Desktop.getDesktop().open(path);
//        }//End try
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }//End catch
    }//GEN-LAST:event_menuItemUserManualActionPerformed

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
            java.util.logging.Logger.getLogger(SuperAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel lbSuperAdministrator;
    private javax.swing.JMenu menuAdd;
    private javax.swing.JMenu menuInformation;
    private javax.swing.JMenuItem menuItemCRUDRoles;
    private javax.swing.JMenuItem menuItemChangeTime;
    private javax.swing.JMenuItem menuItemEmptyApp;
    private javax.swing.JMenuItem menuItemMainDocument;
    private javax.swing.JMenuItem menuItemNewRol;
    private javax.swing.JMenuItem menuItemSignOff;
    private javax.swing.JMenuItem menuItemSystemActions;
    private javax.swing.JMenuItem menuItemUserManual;
    private javax.swing.JMenu menuOptions;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/fondos19.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
