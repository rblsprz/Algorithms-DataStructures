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
 * @author pc
 */
public class Delete {
    
     public void removeLines(String l) throws IOException {

        prueba listaTemp = new prueba();
        File f = new File("registros.txt");
        try {
            // metodo para leer un archivo
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bR = new BufferedReader(isr);

            String linesUpdate = bR.readLine();
            // creacion de un objeto StringTokenizer
            while (linesUpdate != null) {
                if (!linesUpdate.contains(l)) {

                    StringTokenizer st = new StringTokenizer(linesUpdate, ";");
                  String cedula = "",nombre = "", apellido = "", nombreUsuario = "", contraseña = "";
                int edad = 0, telefono = 0;
                String correo = "";
                int tipoRol = 0;
                int counterTok = 0;

                    // va a controlar cada separador
                    while (st.hasMoreTokens()) {
                        if (counterTok == 0) {
                           cedula = st.nextToken();
                            counterTok++;
                        } else if (counterTok == 1) {
                           nombre = st.nextToken();
                            counterTok++;
                        } else if (counterTok == 2) {
                            apellido = st.nextToken();
                            counterTok++;
                        } else if (counterTok == 3) {
                           nombreUsuario = st.nextToken();
                            counterTok++;
                        }else if(counterTok == 4){
                           contraseña = st.nextToken();
                            counterTok++;
                        }else if (counterTok == 5) {
                       edad = Integer.parseInt(st.nextToken());
                        counterTok++;
                    } else if (counterTok == 6) {
                         telefono = Integer.parseInt(st.nextToken());
                        counterTok++;
                        } else if (counterTok == 7) {
                         correo = st.nextToken();
                        counterTok++;
                        }else if (counterTok == 8) {
                         tipoRol = Integer.parseInt(st.nextToken());
                        counterTok++;
                        }else {
                            st.nextToken();
                        }
                    }// end while pequeño()
                    Roles usu = new Roles(cedula,nombre, apellido,nombreUsuario, contraseña,edad,telefono, correo, tipoRol);
                    listaTemp.add(usu);// crea al usuario y lo agrega
                }// end if()
                linesUpdate = bR.readLine();

            }// end while grande

        } catch (FileNotFoundException fnfe) {

            System.out.println("PROBLEMAS ");
        } catch (IOException ioe) {

            System.out.println("PROBLEMAS ");

        }//end catch
        File fNuevo = new File("registros.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fNuevo);
            PrintStream ps = new PrintStream(fos);
            for (int i = 0; i < listaTemp.size(); i++) {
                ps.println(listaTemp.indexOf(i).getCedula() + ";"
                        + listaTemp.indexOf(i).getNombre()+ ";"
                        + listaTemp.indexOf(i).getApellido()+ ";" + listaTemp.indexOf(i).getNombreUsuario()+ ";" 
                        + listaTemp.indexOf(i).getContraseña() + ";" +listaTemp.indexOf(i).getEdad() + ";" 
                +listaTemp.indexOf(i).getTelefono()+ ";" +listaTemp.indexOf(i).getCorreo()+ ";" +listaTemp.indexOf(i).getTipoRol());
            }
        } catch (FileNotFoundException fnfe) {

            System.out.println("PROBLEMAS ");
        }
        //---------------

    }// end removeLines()
      public PrintStream getPrintStream(String nombreArchivo, boolean editable) {
     
        File archivo = new File(nombreArchivo);
        PrintStream ps = null;
        try{
            FileOutputStream fos = new FileOutputStream(archivo,editable);
            ps = new PrintStream(fos);
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Problemas con el archivo");
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
            System.out.println("Problemas con el archivo.");
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
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
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
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
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
    
    public void borrarCita(String archivo, String fecha, String hora) throws IOException {
        String [] arregloArchivo = getArregloArchivo(archivo);
        
        PrintStream ps = getPrintStream(archivo, false);
        for(int i = 0; i < arregloArchivo.length; i++){
            if(!getNombreArchivo(arregloArchivo[i], 0).equalsIgnoreCase(fecha) || !getNombreArchivo(arregloArchivo[i], 1).equalsIgnoreCase(hora)){
                ps.println(arregloArchivo[i]);
            }   
        } 
    }//End borrarPais
 

    
    
//    public PrintStream getPrintStream(String nombreArchivo, boolean editable) {
//     
//        File archivo = new File(nombreArchivo);
//        PrintStream ps = null;
//        try{
//            FileOutputStream fos = new FileOutputStream(archivo,editable);
//            ps = new PrintStream(fos);
//        }
//        catch(FileNotFoundException fnfe){
//            System.out.println("¡PROBLEMAS CON EL ARCHIVO!");
//        }
//    return ps;
//    }//End getPrintStream
//    
//    //Retorna un BufferedReader
//    public BufferedReader getBufferedReader(String nombreArchivo){
//        File archivo = new File(nombreArchivo);
//        BufferedReader br = null;
//        try{
//            FileInputStream fis = new FileInputStream(archivo);
//            InputStreamReader isr = new InputStreamReader(fis);
//            br = new BufferedReader(isr);
//        }
//        catch(FileNotFoundException fnfe){
//            System.out.println("¡PROBLEMAS CON EL ARCHIVO!");
//        }
//    return br;
//    }//End getBufferedReader
//    
//    //Retorna cuántas líneas tiene un archivo
//    public int cuentaLineasArchivo(String archivo){
//        int contador = 0;
//        BufferedReader br = getBufferedReader(archivo);
//        try{    
//            String registroActual = br.readLine();
//            
//            while(registroActual != null){
//                contador++;
//                registroActual = br.readLine();
//                
//            }//End while 
//        }
//        catch(IOException ioe){
//            JOptionPane.showMessageDialog(null, "¡PROBLEMAS CON EL ARCHIVO!");
//        }
//    return contador;
//    }//End cuentaLineasArchivo
//    
//    //Retorna un arreglo con los string del archivo
//    public String [] getArregloArchivo(String nombreArchivo){
//        String arregloArchivo[] = new String[cuentaLineasArchivo(nombreArchivo)];
//        int indice = 0;
//        BufferedReader br = getBufferedReader(nombreArchivo);
//        try{    
//            String registroActual = br.readLine();
//            
//            while(registroActual != null){
//                arregloArchivo[indice]= registroActual; 
//                indice++;
//                registroActual = br.readLine();
//                
//            }//Fin while 
//        }
//        catch(IOException ioe){
//            JOptionPane.showMessageDialog(null, "¡PROBLEMAS CON EL ARCHIVO!");
//        }
//    return arregloArchivo;
//    }//Fin getArregloArchivo
//    
//    //Retorna un string especifico de una linea del archivo
//    public String getNombreArchivo(String archivo, int lugarNombre){
//        String nombreArchivo = "";
//        int contandor = 0;
//        for (int i = 0; i < archivo.length() && contandor != lugarNombre+1; i++) {
//            if(archivo.charAt(i)==';')
//                contandor++;
//            if(contandor==lugarNombre && archivo.charAt(i)!=';')
//                nombreArchivo += archivo.charAt(i);
//        }
//    return nombreArchivo;
//    }//Fin getNombreArchivo
//    
//    public void borrarPersona(String archivo, String identificador) throws IOException {
//        String [] arregloArchivo = getArregloArchivo(archivo);
//        
//        PrintStream ps = getPrintStream(archivo, false);
//        for(int i = 0; i < arregloArchivo.length; i++){
//            if(!getNombreArchivo(arregloArchivo[i], 0).equalsIgnoreCase(identificador))
//                ps.println(arregloArchivo[i]);
//        }//End if
//    }//End borrarPersona
//
//    public void removeLines(String registrostxt, String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
