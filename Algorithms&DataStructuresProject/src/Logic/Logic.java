/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import GUI.Administrator;
import GUI.Customer;
import GUI.SuperAdministrator;
import Interfaces.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import static java.nio.file.Files.delete;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Logic {

    Encrypted encripta = new Encrypted();
    Delete delete = new Delete();

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
    public boolean searchAdministratorID(String nombreUsuario, String contraseña, int tipoRol) throws IOException {
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

    /**
     * Ingresa un nuevo cliente en el archivo
     *
     * @param constructor Roles
     * @return file
     *
     */
    public void insertCustomer(String cedula, String nombre, String apellido, String nombreUsuario, String contraseña, int edad, int telefono, String correo, int tipoRol) {

        File fileCustomer = new File("clientes.txt");

        try {
            FileOutputStream fos = new FileOutputStream(fileCustomer, true);
            PrintStream ps = new PrintStream(fos);

            if (searchAdministrator(nombre) == -1) {
                ps.println(nombreUsuario + ";" + contraseña + ";" + tipoRol);
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
                String cedula = "", nombre = "", apellido = "", nombreUsuario = "", contraseña = "", correo = "";
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
    }//endCountry[]

    /**
     * Busca los datos del cliente en el archivo
     *
     * @param constructor
     * @return file
     *
     */
    public void searchCliente(String nombre, String contraseña) throws FileNotFoundException {
        Roles[] c = readRegistersFiles();
        for (int i = 0; i < c.length; i++) {
            if (encripta.deecnode("Algoritmos", c[i].getContraseña()).equalsIgnoreCase(contraseña) && c[i].getNombreUsuario().equalsIgnoreCase(nombre)) {
                File f2 = new File("temporal.txt");
                FileOutputStream fos = new FileOutputStream(f2); //Elimina los datos cada vez que guarda
                PrintStream ps = new PrintStream(fos);

                ps.println(c[i].getCedula() + ";" + c[i].getNombre() + ";" + c[i].getApellido() + ";" + c[i].getNombreUsuario() + ";" + c[i].getContraseña() + ";" + c[i].getEdad() + ";" + c[i].getTelefono() + ";" + c[i].getCorreo() + ";" + c[i].getTipoRol());
            }
        }
    }

    public BufferedReader getBufferedReaderCita() {
        File fileAdmin = new File("citas.txt");
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
     * Obtiene la cantidad de lineas del archivo
     *
     * @return countRegisters el numero total de lineas
     */
    public int getFileRegistersCita() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCountries = new File("citas.txt");
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
     * Lee los datos de las citas en el archivo
     *
     * @param Cita[]
     * @return file
     *
     */
    public Cita[] readRegistersFilesCita() {

        Cita array[] = new Cita[getFileRegistersCita()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCountries = new File("citas.txt");

        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                String fecha = "", hora = "", cedula = "", nombre = "";

                //Se pone dentro del ciclo para que se resetee
                int controlTokens = 1;
                StringTokenizer st = new StringTokenizer(actualRegister, ";"); //Busca los toques, en nuestra caso los % y asi separa la informacion

                while (st.hasMoreTokens()) {

                    if (controlTokens == 1) {
                        fecha = st.nextToken();
                    } else if (controlTokens == 2) {
                        hora = st.nextToken();
                    } else if (controlTokens == 3) {
                        cedula = st.nextToken();
                    } else if (controlTokens == 4) {
                        nombre = st.nextToken();
                    }
                    controlTokens++;
                }//endWhileInterno

                Cita c = new Cita(fecha, hora, cedula, nombre);
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

    /**
     * Busca la cita de la persona en el archivo
     *
     * @param fecha, hora
     * @return file
     *
     */
     public boolean searchCita(String fecha, String hora) {
        Cita[] c = readRegistersFilesCita();
        for (int i = 0; i < c.length; i++) {
            if (c[i].getFecha().equalsIgnoreCase(fecha) && c[i].getHora().equalsIgnoreCase(hora)){
                return true;
            }
        }
        return false;
    }

    /**
     * Validaciones de entradas de datos
     *
     * @param datos
     * @return datos.matches
     *
     */
    public boolean validateTel(String datos) {
        return datos.matches("[0-9]*");
    }

    public boolean validateLetras(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

    public boolean validateNombre(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

    public boolean validatePassword(String p) {
        boolean verificado = false;
        int especiales = 0;
        int size = 0;
        int mayuscula = 0;
        int miniscula = 0;
        int nums = 0;

        if (p.length() >= 8) {

            for (int i = 0; i < p.length(); i++) {
                char letras = p.charAt(i);
                if (letras >= 65 && letras <= 90) {
                    mayuscula++;
                }
                if (letras >= 97 && letras <= 122) {
                    miniscula++;
                }
                if (letras >= 48 && letras <= 57) {
                    nums++;
                }
                if (letras >= 33 && letras <= 47) {
                    especiales++;
                }
            }//End for
            if (mayuscula > 0 && miniscula > 0 && nums > 0 && especiales > 0) {
                verificado = true;
            }
        }//End if

        return verificado;
    }//End validatePassword

    public boolean validateID(String cadena) {

        int num;

        try {
            if (cadena.length() == 9) {
                num = Integer.parseInt(cadena);

                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return validateID(cadena);
    }

    public boolean validateCed(String datos) {
        return datos.matches("[0-9]*");
    }

    public boolean validateAge(String datos) {
        return datos.matches("[0-9]*");
    }

    /**
     * Obtiene los datos del archivo de forma individual
     *
     * @param void
     * @return file
     *
     */
    public int getFileRegistersIndividual() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCountries = new File("temporal.txt");
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
    public Roles[] readRegistersFilesIndividual() {

        Roles array[] = new Roles[getFileRegisters()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCountries = new File("temporal.txt");
        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                String cedula = "", nombre = "", apellido = "", nombreUsuario = "", contraseña = "";
                int edad = 0, telefono = 0;
                String correo = "";
                int tipoRol = 0;

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
    }//endCountry[]
    //************************************************//

    /**
     * Obtiene los datos del cliente en el archivo
     *
     * @param void
     * @return file
     *
     */
    public int getFileRegistersCustomer() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCountries = new File("notasPaciente.txt");
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
    public CustomerNotes[] readRegistersFilesCustomer() {

        CustomerNotes array[] = new CustomerNotes[getFileRegisters()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCountries = new File("notasPaciente.txt");
        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                String cedula = "", nombre = "", notas = "", fecha = "";
                int edad = 0;
                double peso = 0, musculo = 0, grasa = 0, altura = 0, masaCorporal = 0, agua = 0;

                //Se pone dentro del ciclo para que se resetee
                int controlTokens = 1;
                StringTokenizer st = new StringTokenizer(actualRegister, ";"); //Busca los toques, en nuestra caso los % y asi separa la informacion

                while (st.hasMoreTokens()) {

                    if (controlTokens == 1) {
                        cedula = st.nextToken();
                    } else if (controlTokens == 2) {
                        nombre = st.nextToken();
                    } else if (controlTokens == 3) {
                        notas = st.nextToken();
                    } else if (controlTokens == 4) {
                        peso = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 5) {
                        musculo = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 6) {
                        grasa = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 7) {
                        altura = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 8) {
                        edad = Integer.parseInt(st.nextToken());
                    } else if (controlTokens == 9) {
                        masaCorporal = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 10) {
                        agua = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 11) {
                        fecha = st.nextToken();
                    }
                    controlTokens++;
                }//endWhileInterno

                CustomerNotes r = new CustomerNotes(cedula, nombre, notas, peso, musculo, grasa, altura, edad, masaCorporal, agua, fecha);
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
    }//endCountry[]

    //************************************************// 
    /**
     * Verifica que tipo de usuario ingresó al sistema
     *
     * @param nombre, contraseña
     * @return file
     *
     */
    public boolean searchActivo(String nombre, String contraseña) throws FileNotFoundException {
        Roles[] c = readRegistersFiles();
        for (int i = 0; i < c.length; i++) {
            if (encripta.deecnode("Algoritmos", c[i].getContraseña()).equalsIgnoreCase(contraseña) && c[i].getNombreUsuario().equalsIgnoreCase(nombre)) {

                if (c[i].getTipoRol() == 2) {
                    //JOptionPane.showMessageDialog(null, "Administrador Aceptado");
                    Administrator nS = new Administrator();
                    nS.setVisible(true);
                } else {
                    //JOptionPane.showMessageDialog(null, "Cliente Aceptado");
                    Customer nS = new Customer();
                    nS.setVisible(true);
                }
                return true; //Existe
            }
        }
        return false;
    }

    /**
     * Obtiene las horas registradas en el archivo
     *
     * @param String l
     * @return file
     *
     */
    public int getFileRegistersHoras() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCountries = new File("horasConsulta.txt");
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
    public String[] readRegistersFilesHoras() {

        String array[] = new String[getFileRegistersHoras()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCountries = new File("horasConsulta.txt");

        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                array[indexArray] = actualRegister;
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

    /**
     * Borra la hora del archivo
     *
     * @param archivo, hora
     * @return file
     *
     */
    public void borrarHora(String archivo, String hora) throws IOException {
        String array[] = readRegistersFilesHoras();
        PrintStream ps = delete.getPrintStream(archivo, false);

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equalsIgnoreCase(hora)) {
                ps.println(array[i]);
            }
        }
    }

    public boolean searchHora(String hora) {
        String[] c = readRegistersFilesHoras();
        for (int i = 0; i < c.length; i++) {
            if (c[i].equalsIgnoreCase(hora)) {
                return true; //Si la encuentra
            }
        }
        return false;

    }

    /**
     * Obtiene las notas del cliente
     *
     * @param String l
     * @return file
     *
     */
    public BufferedReader getBufferedReaderNotas() {
        File fileAdmin = new File("notasPaciente.txt");
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
     * Obtiene la cantidad de lineas del archivo
     *
     * @return countRegisters el numero total de lineas
     */
    public int getFileRegistersNotas() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCountries = new File("notasPaciente.txt");
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
     * Lee los registros de las notas de cada cliente
     *
     * @param CustomerNotes[]
     * @return file
     *
     */
    public CustomerNotes[] readRegistersFilesNotas() {

        CustomerNotes array[] = new CustomerNotes[getFileRegistersNotas()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCountries = new File("notasPaciente.txt");

        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                String cedula = "";
                String nombre = "";
                String notas = "";
                double peso = 0;
                double musculo = 0;
                double grasa = 0;
                double altura = 0;
                int edad = 0;
                double masaCorporal = 0;
                double agua = 0;
                String fecha = "";

                //Se pone dentro del ciclo para que se resetee
                int controlTokens = 1;
                StringTokenizer st = new StringTokenizer(actualRegister, ";"); //Busca los toques, en nuestra caso los % y asi separa la informacion

                while (st.hasMoreTokens()) {

                    if (controlTokens == 1) {
                        cedula = st.nextToken();
                    } else if (controlTokens == 2) {
                        nombre = st.nextToken();
                    } else if (controlTokens == 3) {
                        notas = st.nextToken();
                    } else if (controlTokens == 4) {
                        peso = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 5) {
                        musculo = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 6) {
                        grasa = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 7) {
                        altura = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 8) {
                        edad = Integer.parseInt(st.nextToken());
                    } else if (controlTokens == 9) {
                        masaCorporal = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 10) {
                        agua = Double.parseDouble(st.nextToken());
                    } else if (controlTokens == 11) {
                        fecha = st.nextToken();
                    }
                    controlTokens++;
                }//endWhileInterno

                CustomerNotes c = new CustomerNotes(cedula, nombre, notas, peso, musculo, grasa, altura, edad, masaCorporal, agua, fecha);
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

    /**
     * Ingresa el historial de acciones al archivo
     *
     * @param History c
     * @return file
     * 
     */
    public void insertHistorialAcciones(History c) {
        File mainFileE = new File("HistorialAcciones.txt");
        try {
            //                                                  
            FileOutputStream fos = new FileOutputStream(mainFileE, true);
            PrintStream ps = new PrintStream(fos);
             ps.println(c.getFecha()+";"+c.getHora()+";"+c.getAccion()+";"+c.getPersona());

        } catch (FileNotFoundException fnfe) {

            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
        }// end catch()
    }

    /**
     * Obtiene la cantidad de lineas del archivo
     *
     * @return countRegisters el numero total de lineas
     */
    public int getFileRegistersHistorialAcciones() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCountries = new File("HistorialAcciones.txt");
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
    public History[] readRegistersFilesHistorialAcciones() {

        History array[] = new History[getFileRegistersHistorialAcciones()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCountries = new File("HistorialAcciones.txt");

        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                String fecha = "", hora = "", accion = "", persona = "";

                //Se pone dentro del ciclo para que se resetee
                int controlTokens = 1;
                StringTokenizer st = new StringTokenizer(actualRegister, ";"); //Busca los toques, en nuestra caso los % y asi separa la informacion

                while (st.hasMoreTokens()) {

                    if (controlTokens == 1) {
                        fecha = st.nextToken();
                    } else if (controlTokens == 2) {
                        hora = st.nextToken();
                    } else if (controlTokens == 3) {
                        accion = st.nextToken();
                    } else if (controlTokens == 4) {
                        persona = st.nextToken();
                    }

                    controlTokens++;
                }//endWhileInterno

                History c = new History(fecha, hora, accion, persona);
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

    /**
     * Obtiene planes de alimentación de los clientes
     *
     * @param void
     * @return file
     * 
     */
    public BufferedReader getBufferedReaderPlanes() {
        File fileAdmin = new File("planesAlimenticiosPacientes.txt");
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
     * Obtiene la cantidad de lineas del archivo
     *
     * @return countRegisters el numero total de lineas
     */
    public int getFileRegistersPlanes() { //Ocupamos este metodo para asignarle el tamaño al arreglo

        File fileCountries = new File("planesAlimenticiosPacientes.txt");
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
     * Lee los planes de alimentación
     *
     * @param void
     * @return file
     * 
     */

    public Plans[] readRegistersFilesPlanes() {

        Plans array[] = new Plans[getFileRegistersPlanes()]; //el tamaño es segun lo que nos retorna el metodo getFileRegisters
        File fileCountries = new File("planesAlimenticiosPacientes.txt");

        try {
            FileInputStream fis = new FileInputStream(fileCountries);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String actualRegister = br.readLine(); //Lee el archivo 

            int indexArray = 0;

            while (actualRegister != null) { //Cuando sea null va a parar
                String fecha = "", cedula = "", desayuno = "", almuerzo = "", cena = "", meriendas = "";

                //Se pone dentro del ciclo para que se resetee
                int controlTokens = 1;
                StringTokenizer st = new StringTokenizer(actualRegister, ";"); //Busca los toques, en nuestra caso los % y asi separa la informacion

                while (st.hasMoreTokens()) {

                    if (controlTokens == 1) {
                        cedula = st.nextToken();
                    } else if (controlTokens == 2) {
                        fecha = st.nextToken();
                    } else if (controlTokens == 3) {
                        desayuno = st.nextToken();
                    } else if (controlTokens == 4) {
                        almuerzo = st.nextToken();
                    } else if (controlTokens == 5) {
                        cena = st.nextToken();
                    } else if (controlTokens == 6) {
                        meriendas = st.nextToken();
                    }
                    controlTokens++;
                }//endWhileInterno

                Plans c = new Plans(cedula, fecha, desayuno, almuerzo, cena, meriendas);
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

}//End Roles[]

