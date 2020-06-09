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
public class Delete {
    
    //Retorna un printstream 
    public PrintStream getPrintStream(String nombreArchivo, boolean editable) {
     
        File archivo = new File(nombreArchivo);
        PrintStream ps = null;
        try{
            FileOutputStream fos = new FileOutputStream(archivo,editable);
            ps = new PrintStream(fos);
        }
        catch(FileNotFoundException fnfe){
            System.out.println("¡PROBLEMAS CON EL ARCHIVO!");
        }
    return ps;
    }//End getPrintStream
    
    //Retorna un BufferedReader
    public BufferedReader getBufferedReader(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        BufferedReader br = null;
        try{
            FileInputStream fis = new FileInputStream(archivo);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
        }
        catch(FileNotFoundException fnfe){
            System.out.println("¡PROBLEMAS CON EL ARCHIVO!");
        }
    return br;
    }//End getBufferedReader
    
    //Retorna cuántas líneas tiene un archivo
    public int cuentaLineasArchivo(String archivo){
        int contador = 0;
        BufferedReader br = getBufferedReader(archivo);
        try{    
            String registroActual = br.readLine();
            
            while(registroActual != null){
                contador++;
                registroActual = br.readLine();
                
            }//End while 
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS CON EL ARCHIVO!");
        }
    return contador;
    }//End cuentaLineasArchivo
    
    //Retorna un arreglo con los string del archivo
    public String [] getArregloArchivo(String nombreArchivo){
        String arregloArchivo[] = new String[cuentaLineasArchivo(nombreArchivo)];
        int indice = 0;
        BufferedReader br = getBufferedReader(nombreArchivo);
        try{    
            String registroActual = br.readLine();
            
            while(registroActual != null){
                arregloArchivo[indice]= registroActual; 
                indice++;
                registroActual = br.readLine();
                
            }//Fin while 
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS CON EL ARCHIVO!");
        }
    return arregloArchivo;
    }//Fin getArregloArchivo
    
    //Retorna un string especifico de una linea del archivo
    public String getNombreArchivo(String archivo, int lugarNombre){
        String nombreArchivo = "";
        int contandor = 0;
        for (int i = 0; i < archivo.length() && contandor != lugarNombre+1; i++) {
            if(archivo.charAt(i)==';')
                contandor++;
            if(contandor==lugarNombre && archivo.charAt(i)!=';')
                nombreArchivo += archivo.charAt(i);
        }
    return nombreArchivo;
    }//Fin getNombreArchivo
    
    public void borrarPersona(String archivo, String identificador) throws IOException {
        String [] arregloArchivo = getArregloArchivo(archivo);
        
        PrintStream ps = getPrintStream(archivo, false);
        for(int i = 0; i < arregloArchivo.length; i++){
            if(!getNombreArchivo(arregloArchivo[i], 0).equalsIgnoreCase(identificador))
                ps.println(arregloArchivo[i]);
        }//End if
    }//End borrarPersona
}
