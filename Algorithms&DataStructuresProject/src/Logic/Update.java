package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Update {
    
    public BufferedReader getBufferedReader(String nameFile) {
        File archivo = new File(nameFile);
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Problemas con el archivo");
        }
        return br;
    }//End getBufferedReader
    
     public String getNameFile(String file, int lugarNombre) {
        String nombreArchivo = "";
        int contandor = 0;
        for (int i = 0; i < file.length() && contandor != lugarNombre + 1; i++) {
            if (file.charAt(i) == ';') {
                contandor++;
            }
            if (contandor == lugarNombre && file.charAt(i) != ';') {
                nombreArchivo += file.charAt(i);
            }
        }
        return nombreArchivo;
    }//Fin getNombreArchivo
    
    public int cuentaLineasArchivo(String file) {
        int contador = 0;
        BufferedReader br = getBufferedReader(file);
        try {
            String registroActual = br.readLine();

            while (registroActual != null) {
                contador++;
                registroActual = br.readLine();

            }//End while 
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS CON EL ARCHIVO!");
        }
        return contador;
    }//End cuentaLineasArchivo
    
    public String[] getArregloArchivo(String nameFile) {
        String arregloArchivo[] = new String[cuentaLineasArchivo(nameFile)];
        int indice = 0;
        BufferedReader br = getBufferedReader(nameFile);
        try {
            String registroActual = br.readLine();

            while (registroActual != null) {
                arregloArchivo[indice] = registroActual;
                indice++;
                registroActual = br.readLine();

            }//Fin while 
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS CON EL ARCHIVO!");
        }
        return arregloArchivo;
    }//Fin getArregloArchivo
    
    public PrintStream getPrintStream(String nombreArchivo, boolean editable) {

        File archivo = new File(nombreArchivo);
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(archivo, editable);
            ps = new PrintStream(fos);
        } catch (FileNotFoundException fnfe) {
            System.out.println("¡PROBLEMAS CON EL ARCHIVO!");
        }
        return ps;
    }//End getPrintStream
    
    public void actualizarPersona(String cedula, String nombre, String apellido, String nombreUsuario,String contraseña, int edad,int telefono, String correo, int tipoRol) throws IOException{
        String[] arregloArchivo = getArregloArchivo("registros.txt");

        PrintStream ps = getPrintStream("registros.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 0).equals(cedula)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(cedula+ ";" +nombre + ";" + apellido + ";" + nombreUsuario + ";" + contraseña + ";" + edad + ";" + telefono + ";"+ correo + ";" + tipoRol);
            }
        }//End for
    }//End actualizarDatos
    public void actualizarCita(String fecha, String hora, String nombre, String cedula) throws IOException{
        String[] arregloArchivo = getArregloArchivo("citas.txt");

        PrintStream ps = getPrintStream("citas.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 2).equals(cedula)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(fecha+ ";" +hora + ";" + cedula + ";" + nombre);
            }
        }//End for
    }//End actualizarPaises
}
