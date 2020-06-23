package Logic;

import Logic.CustomerNotes;
import Logic.Plans;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author pc
 */
public class PlanNotes {
    
    CustomerNotes cola = new CustomerNotes();
    Plans plan = new Plans();
    
    /**
    * Este metodo permite al admin ingresar notas nuevas del paciente
    * @param cedula, name, notas, peso, musculo, grasa, altura, edad, masacorpral, agua, fecha.
    * @return Nada.
    */

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
      }//end 
    }
     
     
    /**
    * Este metodo permite al admin crear nuevos planes alimenticios
    * @param cedula, desayuno, almuerzo, cena y meriendas.
    * @return Nada.
    */

     public void planesPacienteInsertar(String cedula, String fecha ,String desayuno, String almuerzo, String cena, String meriendas) throws FileNotFoundException{
         
         plan.setCedula(cedula);
         plan.setFecha(fecha);
         plan.setDesayuno(desayuno);
         plan.setAlmuerzo(almuerzo);
         plan.setCena(cena);
         plan.setMeriendas(meriendas);
         
        File f2 = new File ("planesAlimenticiosPacientes.txt");
        FileOutputStream fos = new FileOutputStream(f2, true);
        PrintStream ps = new PrintStream(fos);
        
        if(!plan.getCedula().equals("") && !plan.getDesayuno().equals("") && !plan.getAlmuerzo().equals("") 
                 && !plan.getCena().equals("") && !plan.getMeriendas().equals("") && !plan.getFecha().equals("")){
         
            ps.println(plan.getCedula()+";"+plan.getFecha()+";"+plan.getDesayuno()+";"+plan.getAlmuerzo()+";"+plan.getCena()+";"+plan.getMeriendas());
      }//end createEmployee()
    } 
}
