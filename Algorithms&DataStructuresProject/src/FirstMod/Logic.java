/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstMod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Logic {
    
    //Método de lectura general
    public BufferedReader getBufferedReader() {
        File fileAdmin = new File("clientes-lista.txt");
        BufferedReader br = null;
        try {

            FileInputStream fis = new FileInputStream(fileAdmin);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Troubles with the archive" + fnfe);
        }
        return br;
    }
     /**
     * Busca si existe el usuario registrado para iniciar sesion 
     *
     * @param name, password, rol valores a buscar.
     * @return true si existe el valor en la lista o false si no existe el valor
     * en la lista
     */
    public boolean searchAdminID(String name, String password, int rol) throws IOException {     
        BufferedReader br = getBufferedReader();     
        String Acounts = "";
        String AcFind = name + ";" + password + ";"+ rol;

        while (Acounts != null) {
            
            Acounts = br.readLine();
            
            if (Acounts == null) {
                
                return false;               
            }
            if (Acounts.equals(AcFind)) {
                
                return true;               
            }           
        }//end while        
        return false;
    }
    
    public int searchAdmin(String name) {

        //Llama y busca el archivo
        int found = -1;

        try {
            BufferedReader br = getBufferedReader();
            String searchNameEmployee = "";

            while (searchNameEmployee != null) {
                searchNameEmployee = br.readLine();

                if (searchNameEmployee != null) {
                    
                    if (searchNameEmployee.equalsIgnoreCase(name))//Cuenta mayúsculas y minúsculas(equalsIgnoreCase)
                    {
                        found = 1;
                    }
                }

            }//End while

        }//End try
        
        catch (FileNotFoundException fnfe) {
            
            JOptionPane.showMessageDialog(null, "Troubles with the archive" + fnfe);

        }//End catch
        
        catch (IOException ioe) {

            JOptionPane.showMessageDialog(null, "Troubles with the archive" + ioe);

        }//End catch

        return found;
    }
    
    //Escritura-output
    public void insertEmployee(String name, String password, int rol) {

        File fileEmployee = new File("clientes-lista.txt");

        try {
            FileOutputStream fos = new FileOutputStream(fileEmployee, true);
            PrintStream ps = new PrintStream(fos);

            if (searchAdmin(name) == -1) {
                ps.println(name + ";" + password + ";" + rol);
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Troubles with the archive" + fnfe);
        }
    }


    public String showEmployeeList() {

        BufferedReader br = getBufferedReader();
        String employeeList = "";

        try {

            String employeeName = "";

            while (employeeName != null) {
                employeeName = br.readLine();

                if (employeeName != null) {
                    employeeList += employeeList + "\n";
                }

            }//End while
        } catch (IOException ioe) {

            JOptionPane.showMessageDialog(null, "Troubles with the archive" + ioe);
        }

        return employeeList;
    }
    
     /**
     * Obtiene la cantidad de lineas del archivo
     *
     * @return countRegisters el numero total de lineas
     */
    public int getFileRegisters() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCountries = new File("registros.txt");
        int countRegisters = 0;
        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            while (actualRegister != null) { //Cuando sea null va a parar
                if (actualRegister != null) {
                    countRegisters++; //Cuenta cuantos espacios estan ocupados en el archivo
                }
                actualRegister = br.readLine(); //Vuelve a leer
            }//endWhile

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Fallas en el archivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fallas en el archivo");
        }//endCatch
        return countRegisters;
    }//endInt
    
     /**
     * Leemos los elementos en el archivo
     *
     * @return array[] con los elementos del archivo
     */
    public Person[] readRegistersFiles() {

        Person array[] = new Person[getFileRegisters()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCountries = new File("registros.txt");

        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                String nombre = "", apellido = "", contraseña = "", direccion = "", cedula = "";
                int tipo = 0, tel = 0;
               
                //Se pone dentro del ciclo para que se resetee
                int controlTokens = 1;
                StringTokenizer st = new StringTokenizer(actualRegister, ";"); //Busca los toques, en nuestra caso los % y asi separa la informacion

                while (st.hasMoreTokens()) {

                    if (controlTokens == 1) {
                        cedula = st.nextToken();
                    } else if (controlTokens == 2) {
                        nombre = st.nextToken();
                    } else if (controlTokens == 3) {
                        apellido = st.nextToken();
                    } else if (controlTokens == 4) {
                        contraseña = st.nextToken();
                    } else if (controlTokens == 5) {
                        direccion = st.nextToken();
                    } else if (controlTokens == 6) {
                        tipo = Integer.parseInt(st.nextToken());
                    } else if (controlTokens == 7) {
                        tel = Integer.parseInt(st.nextToken());
                    } 

                    controlTokens++;
                }//endWhileInterno

                Person c = new Person(cedula,nombre, apellido, contraseña, direccion, tipo, tel);
                array[indexArray] = c;
                indexArray++;

                actualRegister = br.readLine(); //Vuelve a leer, es como el incremento
            }//endWhile
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Fallas en el archivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fallas en el archivo");
        }//endCatch

        return array;
    }//endCountry[]
    
}
