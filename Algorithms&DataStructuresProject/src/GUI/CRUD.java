/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Logic;
import Logic.Delete;
import Logic.ExportarExcel;
import Logic.History;
import Logic.Roles;
import Logic.Update;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author pc
 */

public class CRUD extends javax.swing.JFrame {

    /**
     * Creates new form CRUD
     */
    FondoPanel fondo = new FondoPanel();
    public CRUD() {
        this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(CRUD.MAXIMIZED_BOTH);
    }

    String Ruta;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        JTable1 = new javax.swing.JTable();
        btnshowRoles = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        tfUserName = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbRol = new javax.swing.JLabel();
        tfRol = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lbMensajes = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "LAST NAME", "USERNAME", "PASSWORD", "AGE", "PHONE", "EMAIL", "ROL"
            }
        ));
        JTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTable1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1070, 40, 600, 440);

        btnshowRoles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnshowRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/show.png"))); // NOI18N
        btnshowRoles.setText("SHOW ROLES");
        btnshowRoles.setBorderPainted(false);
        btnshowRoles.setContentAreaFilled(false);
        btnshowRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowRolesActionPerformed(evt);
            }
        });
        getContentPane().add(btnshowRoles);
        btnshowRoles.setBounds(1080, 550, 210, 41);

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete2.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(1500, 550, 170, 41);

        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNameKeyTyped(evt);
            }
        });
        getContentPane().add(tfName);
        tfName.setBounds(890, 140, 150, 40);

        lbName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbName.setText("NAME");
        getContentPane().add(lbName);
        lbName.setBounds(890, 120, 120, 20);

        tfLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLastNameKeyTyped(evt);
            }
        });
        getContentPane().add(tfLastName);
        tfLastName.setBounds(890, 230, 150, 40);
        getContentPane().add(tfUserName);
        tfUserName.setBounds(890, 310, 150, 40);

        tfAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAgeKeyTyped(evt);
            }
        });
        getContentPane().add(tfAge);
        tfAge.setBounds(890, 470, 150, 40);

        tfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneActionPerformed(evt);
            }
        });
        tfPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPhoneKeyTyped(evt);
            }
        });
        getContentPane().add(tfPhone);
        tfPhone.setBounds(890, 560, 150, 40);

        lbLastName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbLastName.setText("LAST NAME");
        getContentPane().add(lbLastName);
        lbLastName.setBounds(890, 210, 150, 20);

        lbUserName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbUserName.setText("USERNAME");
        getContentPane().add(lbUserName);
        lbUserName.setBounds(890, 290, 150, 20);

        lbAge.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbAge.setText("AGE");
        getContentPane().add(lbAge);
        lbAge.setBounds(890, 450, 110, 20);

        lbPhone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbPhone.setText("PHONE");
        getContentPane().add(lbPhone);
        lbPhone.setBounds(890, 540, 130, 20);

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(1300, 550, 170, 41);

        lbID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbID.setText("ID");
        getContentPane().add(lbID);
        lbID.setBounds(890, 40, 100, 20);

        tfID.setEditable(false);
        tfID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIDKeyTyped(evt);
            }
        });
        getContentPane().add(tfID);
        tfID.setBounds(890, 60, 150, 40);

        lbEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbEmail.setText("EMAIL");
        getContentPane().add(lbEmail);
        lbEmail.setBounds(890, 620, 120, 20);

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(tfEmail);
        tfEmail.setBounds(890, 640, 150, 40);

        lbRol.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbRol.setText("ROL");
        getContentPane().add(lbRol);
        lbRol.setBounds(890, 700, 110, 20);
        getContentPane().add(tfRol);
        tfRol.setBounds(890, 720, 150, 40);

        lbPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbPassword.setText("PASSWORD");
        getContentPane().add(lbPassword);
        lbPassword.setBounds(890, 370, 160, 20);

        tfPassword.setEnabled(false);
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(tfPassword);
        tfPassword.setBounds(890, 390, 150, 40);
        getContentPane().add(lbMensajes);
        lbMensajes.setBounds(1110, 500, 350, 28);

        jToggleButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Excel_2013_23480.png"))); // NOI18N
        jToggleButton2.setText("Excel");
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(1230, 630, 120, 41);

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        jToggleButton1.setText("PDF");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(1430, 620, 120, 50);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel7.setText("ROLES");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 310, 130, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable1MouseClicked
        int seleccion = JTable1.getSelectedRow();
        tfID.setText(JTable1.getValueAt(seleccion, 0).toString());
        tfName.setText(JTable1.getValueAt(seleccion, 1).toString());
        tfLastName.setText(JTable1.getValueAt(seleccion, 2).toString());
        tfUserName.setText(JTable1.getValueAt(seleccion, 3).toString());
        tfPassword.setText(JTable1.getValueAt(seleccion, 4).toString());
        tfAge.setText(JTable1.getValueAt(seleccion, 5).toString());
        tfPhone.setText(JTable1.getValueAt(seleccion, 6).toString());
        tfEmail.setText(JTable1.getValueAt(seleccion, 7).toString());
        tfRol.setText(JTable1.getValueAt(seleccion, 8).toString());
    }//GEN-LAST:event_JTable1MouseClicked
 public String getPersona() {
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();
        String persona = "";

        Roles tempCountries[] = lC.readRegistersFilesIndividual();
        for (int i = 0; i < tempCountries.length; i++) {
            array.add(tempCountries[i]);
        }//endfor
        for (int j = 0; j < 1; j++) {
            persona = array.get(j).getNombre() + " - " + array.get(j).getCedula(); //Obtengo la cedula del usuario activo
        }
        return persona;
    }
    private void btnshowRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowRolesActionPerformed

        mostrarRegistros();

    }//GEN-LAST:event_btnshowRolesActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
         Logic Lf = new Logic(); 
        try {
                Delete em = new Delete();
                int d = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar " + tfName.getText() + " de este archivo?");
                if(d == 0){
                    em.removeLines(tfID.getText());
                    JOptionPane.showMessageDialog(null, "ELIMINADO CON EXITO");
                    mostrarRegistros();
                    
                    //-------------------------------------------FECHA-----------------------------
                    Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
                    String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
                    
                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    History c = new History(objSDF.format(objDate), hora , "Elimino a "+tfID.getText() , "SUPER ADMINISTRADOR");
                    Lf.insertHistorialAcciones(c);

                em.removeLines(tfID.getText());
                lbMensajes.setText("SUCCESSFULLY REMOVED!");
                mostrarRegistros();
                tfID.setText("");
                tfName.setText("");
                tfLastName.setText("");
                tfUserName.setText("");
                tfPassword.setText("");
                tfAge.setText("");
                tfPhone.setText("");
                tfEmail.setText("");
                tfRol.setText("");

            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "DELETE ERROR!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

         try {
                Logic lC = new Logic();
                ArrayList<Roles> array = new ArrayList();
                String contraseña = "";

                Roles tempCountries[] = lC.readRegistersFiles();
                for(int i = 0; i < tempCountries.length; i++){
                    array.add(tempCountries[i]);
                }//endfor

                for(int j = 0; j < array.size(); j++){
                    if(tfName.getText().equals(array.get(j).getNombre())){
                       contraseña = array.get(j).getContraseña();
                    }
                }

                Update em = new Update();
                int edit = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar a " + tfName.getText() + " ?");
                if(edit == 0){
                em.actualizarPersona(tfID.getText(), tfName.getText(), tfLastName.getText(), tfUserName.getText(), tfPassword.getText(), Integer.parseInt(tfAge.getText()), Integer.parseInt(tfPhone.getText()), tfEmail.getText(), Integer.parseInt(tfRol.getText()));
                    JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
                    mostrarRegistros();
                    
                    //-------------------------------------------FECHA-----------------------------
                    Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
                    String strDateFormat = "dd-MMM-y"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
                    
                    //-----------------------------------------HORA-------------------------------
                    Calendar calendario = Calendar.getInstance();
                    String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":" + String.valueOf(calendario.get(Calendar.MINUTE))+ ":" + String.valueOf(calendario.get(Calendar.SECOND));
                    
                    History c = new History(objSDF.format(objDate), hora , "Modifico a "+tfID.getText() , "SUPER ADMINISTRADOR");
                    lC.insertHistorialAcciones(c);
              
                lbMensajes.setText("SUCCESSFULLY UPDATED!");
                mostrarRegistros();
                tfID.setText("");
                tfName.setText("");
                tfLastName.setText("");
                tfUserName.setText("");
                tfPassword.setText("");
                tfAge.setText("");
                tfPhone.setText("");
                tfEmail.setText("");
                tfRol.setText("");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "UPDATE ERROR!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {
        MessageFormat header = new MessageFormat("Citas personal");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            JTable1.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
            System.err.format("error de impresion", ex.getMessage());
        }

    }

    void impresion() {
        JFileChooser seleccionar = new JFileChooser();
        File archivo;

        if (seleccionar.showDialog(null, "Exportar Excel") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            String imagen = archivo + ".xls";
            File file = new File(imagen);
            ExportarExcel excel = new ExportarExcel(JTable1, file, "" + "tablaimporte");
            excel.export();
        }
    }
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        impresion();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        MessageFormat header=new MessageFormat("Registro de citas");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            JTable1.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
            System.err.format("error de impresion", ex.getMessage());
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed

        tfPassword.setEditable(false);
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
       
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIDKeyTyped
         char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_tfIDKeyTyped

    private void tfAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAgeKeyTyped
         char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_tfAgeKeyTyped

    private void tfPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPhoneKeyTyped
         char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_tfPhoneKeyTyped

    private void tfNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyTyped
         char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z')) evt.consume();
    }//GEN-LAST:event_tfNameKeyTyped

    private void tfLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLastNameKeyTyped
         char car = evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z')) evt.consume();
    }//GEN-LAST:event_tfLastNameKeyTyped

    public void mostrarRegistros() {
        Logic lC = new Logic();
        ArrayList<Roles> array = new ArrayList();

        Roles tempCustomers[] = lC.readRegistersFiles();
        for (int i = 0; i < tempCustomers.length; i++) {
            array.add(tempCustomers[i]);
        }//endfor

        String matriz[][] = new String[array.size()][9];

        for (int i = 0; i < array.size(); i++) {
            int edad = array.get(i).getEdad();
            int tipoRol = array.get(i).getTipoRol();
            int telefono = array.get(i).getTelefono();

            matriz[i][0] = array.get(i).getCedula();
            matriz[i][1] = array.get(i).getNombre();
            matriz[i][2] = array.get(i).getApellido();
            matriz[i][3] = array.get(i).getNombreUsuario();
            matriz[i][4] = array.get(i).getContraseña();
            matriz[i][5] = String.valueOf(edad);
            matriz[i][6] = String.valueOf(telefono);
            matriz[i][7] = array.get(i).getCorreo();
            matriz[i][8] = String.valueOf(tipoRol);

            JTable1.setModel(new javax.swing.table.DefaultTableModel(
                    matriz,
                    new String[]{
                        "ID", "NAME", "LAST NAME", "USERNAME", "PASSWORD", "AGE", "PHONE", "EMAIL", "ROL"
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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable JTable1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnshowRoles;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbMensajes;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbRol;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfRol;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Images/fondos18.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
