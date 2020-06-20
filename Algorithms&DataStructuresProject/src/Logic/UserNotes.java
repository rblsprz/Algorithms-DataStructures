package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author pc
 */
public class UserNotes {
    
   CustomerNotes cola = new CustomerNotes();
    
    //Inserta las notas tomadas por paciente
     public void notasPacienteInsertar(String cedula, String name, String notas, double peso, double musculo, double grasa, double altura, int edad, double masaCorporal, double agua,String fecha) throws FileNotFoundException{
         
         cola.setCedula(cedula);
         cola.setNombre(name);
         cola.setNotas(notas);
         cola.setPeso(peso);
         cola.setMusculo(musculo);
         cola.setGrasa(grasa);
         cola.setAltura(altura);
         cola.setEdad(edad);
         cola.setFecha(fecha);
         cola.setMasaCorporal(masaCorporal);
         cola.setAgua(agua);
         
        File f2 = new File ("notasPaciente.txt");
        FileOutputStream fos = new FileOutputStream(f2, true);
        PrintStream ps = new PrintStream(fos);
        
        if(!cola.getCedula().equals("") && !cola.getNombre().equals("") && !cola.getNotas().equals("") 
                && (cola.getPeso() != 0) && (cola.getMusculo()!= 0) && (cola.getGrasa()!= 0) && (cola.getAltura()!= 0) 
                && (cola.getEdad()!= 0) && (cola.getMasaCorporal()!= 0) && (cola.getAgua()!= 0) && !cola.getFecha().equals("")){
         
            ps.println(cola.getCedula()+";"+cola.getNombre()+";"+cola.getNotas()+";"+cola.getPeso()+";"+cola.getMusculo()+";"+cola.getGrasa()+";"+cola.getAltura()+";"+cola.getEdad()+";"+cola.getMasaCorporal()+";"+cola.getAgua()+";"+cola.getFecha());
      }//end createEmployee()
    }
}
