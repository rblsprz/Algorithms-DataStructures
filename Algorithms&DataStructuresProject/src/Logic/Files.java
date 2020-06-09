package Logic;

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
 * @author David Robles
 */
public class Files {

    //Método de lectura general
    public BufferedReader getBufferedReader() {
        File fileAdministrator = new File("clientes.txt");
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream(fileAdministrator);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
        }//End try 
        catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
        return br;
    }//End BufferedReader

    public boolean searchAdministratorID(String cedula, String nombre, String apellido, String nombreUsuario, String contraseña, int edad, int telefono, String correo, int tipoRol) throws IOException {
        BufferedReader br = getBufferedReader();
        String Acounts = "";
        String findAccount = cedula + ";" + nombre + ";" + apellido + ";" + nombreUsuario + ";" + contraseña + ";" + edad + ";" + telefono + ";" + correo + ";" + tipoRol;
        while (Acounts != null) {
            Acounts = br.readLine();
            if (Acounts == null) {
                return false;
            }//End if
            if (Acounts.equals(findAccount)) {
                return true;
            }//End if           
        }//end while        
        return false;
    }//End 

    public int searchAdministrator(String nombre) {
        //Llama y busca el archivo
        int found = -1;
        try {
            BufferedReader br = getBufferedReader();
            String searchnameCustomer = "";
            while (searchnameCustomer != null) {
                searchnameCustomer = br.readLine();
                if (searchnameCustomer != null) {
                    if (searchnameCustomer.equalsIgnoreCase(nombre)) {//Cuenta mayúsculas y minúsculas(equalsIgnoreCase)
                        found = 1;
                    }//End if
                }//End if
            }//End while
        }//End try//End try
        catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
        catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
        return found;
    }//End 

    //Escritura-output
    public void insertCustomer(int cedula, String nombre, String apellido, String nombreUsuario, String contraseña, int edad, int telefono, String correo, int tipoRol) {
        File fileCustomer = new File("clientes.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fileCustomer, true);
            PrintStream ps = new PrintStream(fos);
            if (searchAdministrator(nombre) == -1) {
                ps.println(cedula + ";" + nombre + ";" + apellido + ";" + nombreUsuario + ";" + contraseña + ";" + edad + ";" + telefono + ";" + correo + ";" + tipoRol);
            }//End if
        }//End try  
        catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
    }//End insertCustomer

    public String showCustomers() {
        BufferedReader br = getBufferedReader();
        String customers = "";
        try {
            String customerName = "";
            while (customerName != null) {
                customerName = br.readLine();
                if (customerName != null) {
                    customers += customers + "\n";
                }//End if
            }//End while
        }//End try 
        catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
        return customers;
    }//End showCustomers

    public int getFileRegisters() { //Ocupamos este metodo para asignarle el tamaño al arreglo
        File files = new File("registros.txt");
        int countRegisters = 0;
        try {
            FileInputStream fis = new FileInputStream(files);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String actualRegister = br.readLine(); //Lee el archivo 
            while (actualRegister != null) { //Cuando sea null va a parar
                if (actualRegister != null) {
                    countRegisters++; //Cuenta cuantos espacios estan ocupados en el archivo
                }//End if
                actualRegister = br.readLine(); //Vuelve a leer
            }//End while
        }//End try 
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
        return countRegisters;
    }//End getFileRegisters

    public Roles[] readRegistersFiles() {

        Roles array[] = new Roles[getFileRegisters()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File files = new File("registros.txt");
        try {
            FileInputStream fis = new FileInputStream(files);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String actualRegister = br.readLine(); //Lee el archivo 
            int indexArray = 0;
            while (actualRegister != null) { //Cuando sea null va a parar
                String cedula = "", nombre = "", apellido = "",nombreUsuario = "" ,contraseña = "", correo = "";
                int edad = 0, telefono = 0, tipoRol = 0;
                //Se pone dentro del ciclo para que se resetee
                int controlTokens = 1;
                StringTokenizer st = new StringTokenizer(actualRegister, ";"); //Busca los toques, en nuestra caso los % y asi separa la informacion
                while (st.hasMoreTokens()) {
                    if (controlTokens == 1) {
                        cedula = st.nextToken();
                    }//End if 
                    else if (controlTokens == 2) {
                        nombre = st.nextToken();
                    }//End else if
                    else if (controlTokens == 3) {
                        apellido = st.nextToken();
                    }//End else if
                    else if (controlTokens == 4) {
                        nombreUsuario = st.nextToken();
                    }//End else if 
                    else if (controlTokens == 5) {
                        contraseña = st.nextToken();
                    }//End else if
                    else if (controlTokens == 6) {
                        edad = Integer.parseInt(st.nextToken());
                    }//End else if 
                    else if (controlTokens == 7) {
                        telefono = Integer.parseInt(st.nextToken());
                    }//End else if 
                    else if (controlTokens == 8) {
                        correo = st.nextToken();
                    }//End else if 
                    else if (controlTokens == 9) {
                        tipoRol = Integer.parseInt(st.nextToken());
                    }//End else if
                    controlTokens++;
                }//End while 
                Roles r = new Roles(cedula,nombre,apellido,nombreUsuario,contraseña,edad,telefono,correo,tipoRol);
                array[indexArray] = r;
                indexArray++;
                actualRegister = br.readLine(); //Vuelve a leer, es como el incremento
            }//Endwhile
        }//End try 
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
        return array;
    }//End Roles
}//End Files
