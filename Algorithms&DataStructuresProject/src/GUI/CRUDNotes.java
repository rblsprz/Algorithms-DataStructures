package GUI;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Logic.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pc
 */
public class CRUDNotes extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_NOTAS
     */
    public CRUDNotes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        txtMuscular = new javax.swing.JTextField();
        txtGrasa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCorporal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtAgua = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaNotas = new javax.swing.JTextArea();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel7.setText("NOTAS REGISTRADAS");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Paciente", "Notas", "Peso", "M. Muscular", "% Grasa", "Altura", "Edad", "M. Corporal", "% Agua", "Fecha"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Paciente");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Paciente:");

        txtCedula.setEditable(false);

        jLabel2.setText("Cédula:");

        jLabel3.setText("Notas:");

        jLabel4.setText("Peso:");

        jLabel5.setText("M. Muscular:");

        jLabel6.setText("% Grasa:");

        txtPaciente.setEditable(false);

        jLabel8.setText("Altura:");

        jLabel9.setText("Edad:");

        jLabel10.setText("M. Corporal:");

        jLabel11.setText("% Agua:");

        lblFecha.setText("Fecha:");

        txtFecha.setEditable(false);

        txtAreaNotas.setColumns(20);
        txtAreaNotas.setRows(5);
        jScrollPane1.setViewportView(txtAreaNotas);

        btnMostrar.setText("Mostrar Notas");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(375, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(170, 170, 170))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int seleccion = jTable3.getSelectedRow();
        txtCedula.setText(jTable3.getValueAt(seleccion, 0).toString());
        txtPaciente.setText(jTable3.getValueAt(seleccion, 1).toString());
        txtAreaNotas.setText(jTable3.getValueAt(seleccion, 2).toString());
        txtPeso.setText(jTable3.getValueAt(seleccion, 3).toString());
        txtMuscular.setText(jTable3.getValueAt(seleccion, 4).toString());
        txtGrasa.setText(jTable3.getValueAt(seleccion, 5).toString());
        txtAltura.setText(jTable3.getValueAt(seleccion, 6).toString());
        txtEdad.setText(jTable3.getValueAt(seleccion, 7).toString());
        txtCorporal.setText(jTable3.getValueAt(seleccion, 8).toString());
        txtAgua.setText(jTable3.getValueAt(seleccion, 9).toString());
        txtFecha.setText(jTable3.getValueAt(seleccion, 10).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         try {
                Delete em = new Delete();
                int d = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar " + txtPaciente.getText() + " de este archivo?");
                if(d == 0){
                    em.removeLinesColaGeneral(txtCedula.getText());
                    mostrarNotas();
                    JOptionPane.showMessageDialog(null, "ELIMINADO CON EXITO");
                    
                    txtCedula.setText("");
                    txtPaciente.setText("");
                    txtAgua.setText("");
                    txtAltura.setText("");
                    txtAreaNotas.setText("");
                    txtBuscar.setText("");
                    txtCorporal.setText("");
                    txtEdad.setText("");
                    txtFecha.setText("");
                    txtGrasa.setText("");
                    txtMuscular.setText("");
                    txtPeso.setText("");
                }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }   
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarNotas();
        txtPaciente.setText("");
        txtAgua.setText("");
        txtAltura.setText("");
        txtAreaNotas.setText("");
        txtBuscar.setText("");
        txtCorporal.setText("");
        txtEdad.setText("");
        txtFecha.setText("");
        txtGrasa.setText("");
        txtMuscular.setText("");
        txtPeso.setText("");
        txtCedula.setText("");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ColaFilesLog fl = new ColaFilesLog();
        if(fl.readingFiles(txtBuscar.getText()) == true){          
            try {
                searchClienteIndividual(txtBuscar.getText());
                txtBuscar.setText("");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CRUDNotes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
        JOptionPane.showMessageDialog(null, "NO ENCONTRADO");}
        txtPaciente.setText("");
        txtAgua.setText("");
        txtAltura.setText("");
        txtAreaNotas.setText("");
        txtBuscar.setText("");
        txtCorporal.setText("");
        txtEdad.setText("");
        txtFecha.setText("");
        txtGrasa.setText("");
        txtMuscular.setText("");
        txtPeso.setText("");
        txtCedula.setText("");       
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
                Update em = new Update();
                int edit = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar la cita de " + txtPaciente.getText() + " ?");
                if(edit == 0){
                    em.actualizarNotaPersona(txtCedula.getText(), txtPaciente.getText(), txtAreaNotas.getText(), Double.parseDouble(txtPeso.getText()), Double.parseDouble(txtMuscular.getText()), 
                            Double.parseDouble(txtGrasa.getText()), Double.parseDouble(txtAltura.getText()), Integer.parseInt(txtEdad.getText()), Double.parseDouble(txtCorporal.getText()), Double.parseDouble(txtAgua.getText()), txtFecha.getText());
                    JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
                    mostrarNotas();
                    txtCedula.setText("");
                    txtPaciente.setText("");
                    txtAgua.setText("");
                    txtAltura.setText("");
                    txtAreaNotas.setText("");
                    txtBuscar.setText("");
                    txtCorporal.setText("");
                    txtEdad.setText("");
                    txtFecha.setText("");
                    txtGrasa.setText("");
                    txtMuscular.setText("");
                    txtPeso.setText("");
                }
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }   
    }//GEN-LAST:event_btnModificarActionPerformed
        
         //Busca al cliente en los registros si lo encuentra lo va a mostra en la tabla
    public void searchClienteIndividual(String cedula) throws FileNotFoundException{
        Logic lC = new Logic();
        ArrayList <CustomerNotes> individual = new ArrayList();
        
        CustomerNotes tempCountries[] = lC.readRegistersFilesNotas();
        for (int i = 0; i < tempCountries.length; i++) {
            if (tempCountries[i].getCedula().equalsIgnoreCase(cedula)){
                individual.add(tempCountries[i]);
            } 
        }

        String matriz[][]= new String[individual.size()][11];
        
        for (int i = 0; i < individual.size(); i++) {
            
        int edad = individual.get(i).getEdad();
        double peso = individual.get(i).getPeso();
        double musculo = individual.get(i).getMusculo();
        double grasa = individual.get(i).getGrasa();
        double altura = individual.get(i).getAltura();
        double masaCorporal = individual.get(i).getMasaCorporal();
        double agua = individual.get(i).getAgua();
        
        matriz[i][0]= individual.get(i).getCedula();
        matriz[i][1]= individual.get(i).getNombre();
        matriz[i][2]= individual.get(i).getNotas();
        matriz[i][3]= String.valueOf(peso);
        matriz[i][4]= String.valueOf(musculo);
        matriz[i][5]= String.valueOf(grasa);
        matriz[i][6]= String.valueOf(altura);
        matriz[i][7]= String.valueOf(edad);
        matriz[i][8]= String.valueOf(masaCorporal);
        matriz[i][9]= String.valueOf(agua);
        matriz[i][10]= individual.get(i).getFecha();
        
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "Cedula","Paciente", "Notas", "Peso", "M.Musculo", "% Grasa", "Altura", "Edad", "M.Corporal", "% Agua", "Fecha"
            }
        ));
        }   
    }

        public void mostrarNotas(){
        Logic lC = new Logic();
        ArrayList<CustomerNotes> array = new ArrayList();
        
        CustomerNotes tempCountries[] = lC.readRegistersFilesNotas();
        for(int i = 0; i < tempCountries.length; i++){
            array.add(tempCountries[i]);
        }//endfor
       
       String matriz[][]= new String[array.size()][11];
       
         for (int i = 0; i < array.size(); i++) {
        int edad = array.get(i).getEdad();
        double peso = array.get(i).getPeso();
        double musculo = array.get(i).getMusculo();
        double grasa = array.get(i).getGrasa();
        double altura = array.get(i).getAltura();
        double masaCorporal = array.get(i).getMasaCorporal();
        double agua = array.get(i).getAgua();
        
        matriz[i][0]= array.get(i).getCedula();
        matriz[i][1]= array.get(i).getNombre();
        matriz[i][2]= array.get(i).getNotas();
        matriz[i][3]= String.valueOf(peso);
        matriz[i][4]= String.valueOf(musculo);
        matriz[i][5]= String.valueOf(grasa);
        matriz[i][6]= String.valueOf(altura);
        matriz[i][7]= String.valueOf(edad);
        matriz[i][8]= String.valueOf(masaCorporal);
        matriz[i][9]= String.valueOf(agua);
        matriz[i][10]= array.get(i).getFecha();
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "Cedula","Paciente", "Notas", "Peso", "M.Musculo", "% Grasa", "Altura", "Edad", "M.Corporal", "% Agua", "Fecha"
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
            java.util.logging.Logger.getLogger(CRUDNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable3;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTextField txtAgua;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextArea txtAreaNotas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorporal;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGrasa;
    private javax.swing.JTextField txtMuscular;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
