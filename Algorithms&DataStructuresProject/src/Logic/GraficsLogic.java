package Logic;

import Logic.CustomerNotes;
import Logic.CustomerNotes;
import Logic.Logic;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class GraficsLogic {
    
    Logic lC = new Logic();
    
    public DefaultTableModel mostrarGrasa(String cedula){
        
        DefaultTableModel miModelo = null;
        ArrayList <CustomerNotes> individual = new ArrayList();
        
        //Segun la cedula, llena al array con los datos especificos del cliente
        CustomerNotes tempGrasa[] = lC.readRegistersFilesNotas();
        for (int i = 0; i < tempGrasa.length; i++) {
            if (tempGrasa[i].getCedula().equalsIgnoreCase(cedula)){
                individual.add(tempGrasa[i]);
            } 
        }

        //Lo agrega a la tabla 
            String titulos[] = {"N°", "% Grasa" , "Fecha"};
            Object dts[] = new Object[3];
            miModelo = new DefaultTableModel(null, titulos);

            for (int i = 0; i < individual.size(); i++) {
                String contador = "" + i;
                dts[0] = contador;
                dts[1] = individual.get(i).getGrasa();
                dts[2] = individual.get(i).getFecha();
                miModelo.addRow(dts);
            }
        
        return miModelo;
    }
    
   public DefaultTableModel mostrarMusculo(String cedula){
        
        DefaultTableModel miModelo = null;
        ArrayList <CustomerNotes> individual = new ArrayList();
        
        //Segun la cedula, llena al array con los datos especificos del cliente
        CustomerNotes tempMusculo[] = lC.readRegistersFilesNotas();
        for (int i = 0; i < tempMusculo.length; i++) {
            if (tempMusculo[i].getCedula().equalsIgnoreCase(cedula)){
                individual.add(tempMusculo[i]);
            } 
        }

        //Lo agrega a la tabla 
            String titulos[] = {"N°", "% Musculo" , "Fecha"};
            Object dts[] = new Object[3];
            miModelo = new DefaultTableModel(null, titulos);

            for (int i = 0; i < individual.size(); i++) {
                String contador = "" + i;
                dts[0] = contador;
                dts[1] = individual.get(i).getMusculo();
                dts[2] = individual.get(i).getFecha();
                miModelo.addRow(dts);
            }
        
        return miModelo;
    }
   
    public DefaultTableModel mostrarHidratacion(String cedula){
        
        DefaultTableModel miModelo = null;
        ArrayList <CustomerNotes> individual = new ArrayList();
        
        //Segun la cedula, llena al array con los datos especificos del cliente
        CustomerNotes tempHidratacion[] = lC.readRegistersFilesNotas();
        for (int i = 0; i < tempHidratacion.length; i++) {
            if (tempHidratacion[i].getCedula().equalsIgnoreCase(cedula)){
                individual.add(tempHidratacion[i]);
            } 
        }

        //Lo agrega a la tabla 
            String titulos[] = {"N°", "% Hidratación" , "Fecha"};
            Object dts[] = new Object[3];
            miModelo = new DefaultTableModel(null, titulos);

            for (int i = 0; i < individual.size(); i++) {
                String contador = "" + i;
                dts[0] = contador;
                dts[1] = individual.get(i).getAgua();
                dts[2] = individual.get(i).getFecha();
                miModelo.addRow(dts);
            }
        
        return miModelo;
    }
    
    public DefaultTableModel mostrarPeso(String cedula){
        
        DefaultTableModel miModelo = null;
        ArrayList <CustomerNotes> individual = new ArrayList();
        
        //Segun la cedula, llena al array con los datos especificos del cliente
        CustomerNotes tempPeso[] = lC.readRegistersFilesNotas();
        for (int i = 0; i < tempPeso.length; i++) {
            if (tempPeso[i].getCedula().equalsIgnoreCase(cedula)){
                individual.add(tempPeso[i]);
            } 
        }

        //Lo agrega a la tabla 
            String titulos[] = {"N°", "Peso" , "Fecha"};
            Object dts[] = new Object[3];
            miModelo = new DefaultTableModel(null, titulos);

            for (int i = 0; i < individual.size(); i++) {
                String contador = "" + i;
                dts[0] = contador;
                dts[1] = individual.get(i).getPeso();
                dts[2] = individual.get(i).getFecha();
                miModelo.addRow(dts);
            }
        
        return miModelo;
    }
}
