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

    NodeStacks pilaTemp = new NodeStacks();

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
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
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
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
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
            System.out.println("Problemas con el archivo");
        }
        return ps;
    }//End getPrintStream
    
    public void actualizarPersona(String cedula, String name, String apellido,String username, String contraseña, int edad,int tel,String direccion,int tipo) throws IOException{
        String[] arregloArchivo = getArregloArchivo("registros.txt");

        PrintStream ps = getPrintStream("registros.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 0).equals(cedula)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(cedula+ ";" +name + ";" + apellido + ";" +username+ ";" + contraseña + ";" +edad+ ";" + tel+ ";" + direccion + ";" + tipo);
            }
        }//End for
    }//End actualizarPaises
    
    public void actualizarNotaPersona(String cedula, String name, String notas, double peso,
    double musculo,double grasa, double altura, int edad, double masaCorporal, double agua, String fecha) throws IOException{
        String[] arregloArchivo = getArregloArchivo("notasPaciente.txt");

        PrintStream ps = getPrintStream("notasPaciente.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 0).equals(cedula) || !getNameFile(arregloArchivo[i], 10).equals(fecha)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(cedula+ ";" +name + ";" + notas + ";" + peso + ";" + musculo + ";" + grasa + ";"+ altura+ ";" +edad+";"
                +masaCorporal+";"+agua+";"+fecha);
            }
        }//End for
    }//End 
    
    public void actualizarPlanPersona(String cedula, String fecha ,String desayuno, String almuerzo, String cena, String meriendas) throws IOException{
        String[] arregloArchivo = getArregloArchivo("planesAlimenticiosPacientes.txt");

        PrintStream ps = getPrintStream("planesAlimenticiosPacientes.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 0).equals(cedula) || !getNameFile(arregloArchivo[i], 1).equals(fecha)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(cedula+ ";" +fecha + ";" + desayuno + ";" + almuerzo + ";" + cena + ";" + meriendas);
            }
        }//End for
    }//End
    
//    public void actualizarCita(String fecha, String hora, String nombre, String cedula) throws IOException{
//        String[] arregloArchivo = getArregloArchivo("citas.txt");
//
//        PrintStream ps = getPrintStream("citas.txt", false);
//        for (int i = 0; i < arregloArchivo.length; i++) {
//
//            if (!getNameFile(arregloArchivo[i], 0).equals(fecha) && !getNameFile(arregloArchivo[i], 1).equals(hora)) {
//                ps.println(arregloArchivo[i]);
//            } else {
//                ps.println(fecha+ ";" +hora + ";" + cedula + ";" + nombre);
//            }
//        }//End for
//    }//End actualizarPaises
//    
//    public void actualizarCita2(String fecha, String hora, String nombre, String cedula) throws IOException{
//        String[] arregloArchivo = getArregloArchivo("citas.txt");
//
//        PrintStream ps = getPrintStream("citas.txt", false);
//        for (int i = 0; i < arregloArchivo.length; i++) {
//
//            if (!getNameFile(arregloArchivo[i], 0).equals(fecha) && !getNameFile(arregloArchivo[i], 1).equals(hora)) {
//                ps.println(arregloArchivo[i]);
//            } else {
//                ps.println(fecha+ ";" +hora + ";" + cedula + ";" + nombre);
//            }
//        }//End for
//    }//End actualizarPaises
//    
    /**
     *
     * @param element : cita que se desea modificar
     * @param fecha : nueva fecha
     * @param hora : nueva hora
     * @return :
     */
    public Cita newDate(Cita element, String fecha, String hora) {
        Cita u = element;
        Cita cita = new Cita(fecha, hora, u.getCedula(), u.getNombre());

        return cita;
    }

    /**
     *
     * @param c : cita a modificar
     * @param f : fecha que se 
     * @param h ;  hora que se desea modificar/hora nueva
     */
    public void ModifuUse(Cita c, String f, String h) {
        pilaTemp.pop(c);// elimina el ulitmo, quiza necesita un x
        pilaTemp.push(newDate(c, f, h));

    }

    /**
     *
     * @param c : cita a modificar en el nuevo archivo guarda
     */
    public void removeAndModify(Cita c) {
        pilaTemp.pop(c);// elimina el ulitmo, quiza necesita un x

    }

    /**
     *
     * @param s
     * @return
     */
    public boolean search(String s) {

        return pilaTemp.search(s);

    }
    
//    prueba logicaclientes = new prueba();
//    public String nameC;
//    public String cedula;
//    public File f = new File("clientes//Cliente " + nameC + " " + cedula + " personal.txt");

    /*
    con modificar tenes que leer el archivo que queres modificar, 
    guardar la linea a modificar en un auxiliar, lo elimina del
    archivo, modifica el auxiliar que guardaste y luego guardar 
    el archivo de nuevo pero ya modificado
     */
    
//    public void readToModify(Persona u) throws IOException {
//        prueba listaP = new prueba();
////        ArrayList<String> temp = new ArrayList<>();
//        //Lista listaP = new listaIMplementacion();
//     //   Usuario usser = new Usuario(nombreMod, newCorreo, contra, cedul);
//        // archivo en el cual va a ir guardando todas las propiedades
//        // del objeto
//        File flieMod = new File("clientes//Cliente " + u.getNombre()+ " " + u.getCedula() + " personal.txt");
//        try {
//            // metodo para leer un archivo
//            FileInputStream fis = new FileInputStream(f);
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader bR = new BufferedReader(isr);
//
//            String linesUpdate = bR.readLine();
//            // creacion de un objeto StringTokenizer
//            while (linesUpdate != null) {
//                StringTokenizer sT = new StringTokenizer(linesUpdate, ";");
//                int counterTok = 0;
//                String cedulaU = u.getCedula();
//                String name = u.getNombre();
//                String apellido = u.getApellido();
//                String contrasenia = u.getContraseña();
//                String direccion = u.getDireccion();
//                int tipo = u.getTipo();
//                int tel = u.getTel();
//
//                // va a controlar cada separador
//                    while (sT.hasMoreTokens()) {
//                        if (counterTok == 0) {
//                            cedulaU = sT.nextToken();
//                            counterTok++;
//                        } else if (counterTok == 1) {
//                            name = sT.nextToken();
//                            counterTok++;
//                        } else if (counterTok == 2) {
//                            apellido = sT.nextToken();
//                            counterTok++;
//                        } else if (counterTok == 3) {
//                            contrasenia = sT.nextToken();
//                            counterTok++;
//                        }else if(counterTok == 4){
//                            direccion = sT.nextToken();
//                            counterTok++;
//                        }else if (counterTok == 5) {
//                        tipo = Integer.parseInt(sT.nextToken());
//                        counterTok++;
//                    } else if (counterTok == 6) {
//                        tel = Integer.parseInt(sT.nextToken());
//                        counterTok++;
//                        } else {
//                            sT.nextToken();
//                        }
//                    }// end while pequeño()
//                
//                Persona usu = new Persona(cedulaU ,name, apellido, contrasenia, direccion, tipo, tel);
//                listaP.add(usu);
//                linesUpdate = bR.readLine();
//            }// end while grande
//            System.out.println("LINES UPDATE: "+linesUpdate);
//        } catch (FileNotFoundException fnfe) {
//
//            System.out.println("PROBLEMAS "+ fnfe);
//        } catch (IOException ioe) {
//
//            System.out.println("PROBLEMAS "+ ioe);
//
//        }//end catch
//
//    }// end showMeTheFiles()
//    /*
//    Lo que yo hago es leer el archivo, guardar EN EL NODO
//    todo menos la línea que quiero modificar, borrar el 
//    archivo y crear uno nuevo con lo que guardé en el nodo
//    y agregarle la que modifiqué (aquí en esto último se
//    usa index of)
//    */
//    
}
