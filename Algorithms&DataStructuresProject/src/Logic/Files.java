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

    public boolean searchAdministratorID(String name, String password) throws IOException {
        BufferedReader br = getBufferedReader();
        String Acounts = "";
        String findAccount = name + ";" + password;
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

    public int searchAdministrator(String name) {
        //Llama y busca el archivo
        int found = -1;
        try {
            BufferedReader br = getBufferedReader();
            String searchnameCustomer = "";
            while (searchnameCustomer != null) {
                searchnameCustomer = br.readLine();
                if (searchnameCustomer != null) {
                    if (searchnameCustomer.equalsIgnoreCase(name)) {//Cuenta mayúsculas y minúsculas(equalsIgnoreCase)
                        found = 1;
                    }//End if
                }//End if
            }//End while
        }//End try
        catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
        catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
        return found;
    }//End 

    //Escritura-output
    public void insertCustomer(String name, String password, int rol) {
        File fileCustomer = new File("clientes.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fileCustomer, true);
            PrintStream ps = new PrintStream(fos);
            if (searchAdministrator(name) == -1) {
                ps.println(name + ";" + password + ";" + rol);
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
                String nombre = "", apellido = "", contraseña = "", direccion = "";
                int tipo = 0, tel = 0;
                //Se pone dentro del ciclo para que se resetee
                int controlTokens = 1;
                StringTokenizer st = new StringTokenizer(actualRegister, ";"); //Busca los toques, en nuestra caso los % y asi separa la informacion
                while (st.hasMoreTokens()) {
                    if (controlTokens == 1) {
                        nombre = st.nextToken();
                    }//End if 
                    else if (controlTokens == 2) {
                        apellido = st.nextToken();
                    }//End else if 
                    else if (controlTokens == 3) {
                        contraseña = st.nextToken();
                    }//End else if 
                    else if (controlTokens == 4) {
                        direccion = st.nextToken();
                    }//End else if 
                    else if (controlTokens == 5) {
                        tipo = Integer.parseInt(st.nextToken());
                    }//End else if 
                    else if (controlTokens == 6) {
                        tel = Integer.parseInt(st.nextToken());
                    }//End else if
                    controlTokens++;
                }//End while 
                Roles r = new Roles(nombre, apellido, tel, nombre, contraseña, direccion, tel, tipo);
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
    
    //Muestra la lista de los empleados
    public boolean loginAdministrator(String name, String password) throws IOException {
        BufferedReader br = getBufferedReader();
        String Acounts = "";
        String findAccount = name + "|" + password;
        String firstAdministrator = "David;david2020";
        String secondAdministrator = "Erick;erick2020";
        String thirdAdministrator = "Jesús;jesús2020";
        while (Acounts != null) {
            Acounts = br.readLine();
            if (Acounts == null) {
                return false;
            }//End if
            if (firstAdministrator.equals(findAccount) || secondAdministrator.equals(findAccount) || thirdAdministrator.equals(findAccount)) {
                return true;
            }//End if
        }//End while
        return true;
    }//End 
}//End Files
