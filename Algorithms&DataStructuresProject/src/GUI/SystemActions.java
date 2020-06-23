/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.History;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Logic.ExportarExcel;
import Logic.Logic;

/**
 *
 * @author pc
 */
public class SystemActions extends javax.swing.JFrame {

    /**
     * Creates new form AccionesSistema
     */
    public SystemActions() {
        initComponents();
         this.setExtendedState(SystemActions.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSystemActions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnShowHistory = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        lbMessages = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPDF = new javax.swing.JMenu();
        menuExcel = new javax.swing.JMenu();
        menuWord = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbSystemActions.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        lbSystemActions.setText("SYSTEM ACTIONS");
        getContentPane().add(lbSystemActions);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "TIME", "ACTION", "PERSON"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);

        btnShowHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/show.png"))); // NOI18N
        btnShowHistory.setText("SHOW HISTORY");
        btnShowHistory.setBorderPainted(false);
        btnShowHistory.setContentAreaFilled(false);
        btnShowHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowHistory);
        getContentPane().add(tfSearch);
        getContentPane().add(lbMessages);

        menuPDF.setText("PDF EXPORT");
        menuPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPDFMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPDF);

        menuExcel.setText("EXCEL EXPORT");
        menuExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExcelMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuExcel);

        menuWord.setText("WORD EXPORT");
        jMenuBar1.add(menuWord);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPDFMouseClicked
        MessageFormat header = new MessageFormat("Planes Alimenticios");
        MessageFormat footer = new MessageFormat("Página{0,number,integer}");
        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            JOptionPane.showMessageDialog(null, "Exportado correctamente");
        } catch (PrinterException ex) {
            System.err.format("Error de impresion", ex.getMessage());
        }
    }//GEN-LAST:event_menuPDFMouseClicked

    private void menuExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExcelMouseClicked
        JFileChooser seleccionar = new JFileChooser();
        File archivo;
        if (seleccionar.showDialog(null, "Exportar Excel") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            String imagen = archivo + ".xls";
            File file = new File(imagen);
            ExportarExcel excel = new ExportarExcel(jTable1, file, "" + "tablaimporte");
            excel.export();
            JOptionPane.showMessageDialog(null, "Exportado correctamente");
        }
    }//GEN-LAST:event_menuExcelMouseClicked

    private void btnShowHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowHistoryActionPerformed
        if (tfSearch.getText().equals("")) {
            mostrarHistorial();
        } else {

            Logic lC = new Logic();
            ArrayList<History> array = new ArrayList();

            History tempCountries[] = lC.readRegistersFilesHistorialAcciones();
            for (int i = 0; i < tempCountries.length; i++) {
                if (tempCountries[i].getFecha().equals(tfSearch.getText()) || tempCountries[i].getPersona().equals(tfSearch.getText())) {
                    array.add(tempCountries[i]);
                }
            }//endfor

            if (array.isEmpty()) {
                lbMessages.setText("NOT FOUND!");
            } else {

                String matriz[][] = new String[array.size()][4];

                for (int i = 0; i < array.size(); i++) {
                    matriz[i][0] = array.get(i).getFecha();
                    matriz[i][1] = array.get(i).getHora();
                    matriz[i][2] = array.get(i).getAccion();
                    matriz[i][3] = array.get(i).getPersona();

                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
                            matriz,
                            new String[]{
                                "DATE", "TIME", "ACTION", "PERSON"
                            }
                    ));
                }
            }
        }
        tfSearch.setText("");
    }//GEN-LAST:event_btnShowHistoryActionPerformed
    public void mostrarHistorial() {
        Logic lC = new Logic();
        ArrayList<History> array = new ArrayList();

        History tempCountries[] = lC.readRegistersFilesHistorialAcciones();
        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//endfor

        String matriz[][] = new String[array.size()][4];

        for (int i = 0; i < array.size(); i++) {
            matriz[i][0] = array.get(i).getFecha();
            matriz[i][1] = array.get(i).getHora();
            matriz[i][2] = array.get(i).getAccion();
            matriz[i][3] = array.get(i).getPersona();

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "DATE", "TIME", "ACTION", "PERSON"
                    }
            ));
        }
    }

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
            java.util.logging.Logger.getLogger(SystemActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemActions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowHistory;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbMessages;
    private javax.swing.JLabel lbSystemActions;
    private javax.swing.JMenu menuExcel;
    private javax.swing.JMenu menuPDF;
    private javax.swing.JMenu menuWord;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
