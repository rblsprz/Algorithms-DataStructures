/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Interfaces.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Logic {

    //Método de lectura general
    public BufferedReader getBufferedReader() {
        File fileAdmin = new File("clientes.txt");
        BufferedReader br = null;
        try {

            FileInputStream fis = new FileInputStream(fileAdmin);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }
        return br;
    }

    /**
     * Busca si existe el usuario registrado para iniciar sesion
     *
     * @param nombre, contraseña, rol valores a buscar.
     * @return true si existe el valor en la lista o false si no existe el valor
     * en la lista
     */
    public boolean searchAdministratorID(String nombreUsuario, String contraseña,int tipoRol) throws IOException {
        BufferedReader br = getBufferedReader();
        String Acounts = "";
        String AcFind = nombreUsuario + ";" + contraseña + ";" + tipoRol;

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

    public int searchAdministrator(String nombre) {

        //Llama y busca el archivo
        int found = -1;

        try {
            BufferedReader br = getBufferedReader();
            String searchNameCustomer = "";

            while (searchNameCustomer != null) {
                searchNameCustomer = br.readLine();

                if (searchNameCustomer != null) {

                    if (searchNameCustomer.equalsIgnoreCase(nombre))//Cuenta mayúsculas y minúsculas(equalsIgnoreCase)
                    {
                        found = 1;
                    }
                }

            }//End while

        }//End try
        catch (FileNotFoundException fnfe) {

            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");

        }//End catch
        catch (IOException ioe) {

            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");

        }//End catch

        return found;
    }

    //Escritura-output
    public void insertCustomer(String cedula, String nombre, String apellido, String nombreUsuario, String contraseña, int edad, int telefono, String correo, int tipoRol) {

        File fileCustomer = new File("clientes.txt");

        try {
            FileOutputStream fos = new FileOutputStream(fileCustomer, true);
            PrintStream ps = new PrintStream(fos);

            if (searchAdministrator(nombre) == -1) {
                ps.println(cedula + ";" + nombre + ";" + apellido + ";" + nombreUsuario + ";" + contraseña + ";" + edad + ";" + telefono + ";" + correo + ";" + tipoRol);
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!" + fnfe);
        }
    }

    public String showCustomers() {

        BufferedReader br = getBufferedReader();
        String customers = "";

        try {

            String customerName = "";

            while (customerName != null) {
                customerName = br.readLine();

                if (customerName != null) {
                    customers += customers + "\n";
                }

            }//End while
        } catch (IOException ioe) {

            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }

        return customers;
    }

    /**
     * Obtiene la cantidad de lineas del archivo
     *
     * @return countRegisters el numero total de lineas
     */
    public int getFileRegisters() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCustomers = new File("registros.txt");
        int countRegisters = 0;
        try {
            FileInputStream fis = new FileInputStream(fileCustomers);
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
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//endCatch
        return countRegisters;
    }//endInt

    /**
     * Leemos los elementos en el archivo
     *
     * @return array[] con los elementos del archivo
     */
    public Roles[] readRegistersFiles() {

        Roles array[] = new Roles[getFileRegisters()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCustomers = new File("registros.txt");

        try {
            FileInputStream fis = new FileInputStream(fileCustomers);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                String cedula = "",nombre = "", apellido = "", nombreUsuario = "", contraseña = "", correo = "";
                int edad = 0, telefono = 0, tipoRol = 0;

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
                        nombreUsuario = st.nextToken();
                    } else if (controlTokens == 5) {
                        contraseña = st.nextToken();
                    } else if (controlTokens == 6) {
                        edad = Integer.parseInt(st.nextToken());
                    } else if (controlTokens == 7) {
                        telefono = Integer.parseInt(st.nextToken());
                    } else if (controlTokens == 8) {
                        correo = st.nextToken();
                    } else if (controlTokens == 9) {
                        tipoRol = Integer.parseInt(st.nextToken());
                    }
                    controlTokens++;
                }//endWhileInterno

                Roles r = new Roles(cedula, nombre, apellido, nombreUsuario, contraseña, edad, telefono, correo, tipoRol);
                array[indexArray] = r;
                indexArray++;

                actualRegister = br.readLine(); //Vuelve a leer, es como el incremento
            }//endWhile
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//endCatch
        return array;
    }//End Roles[]
}
