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

    public void actualizarPersona(String cedula, String nombre, String apellido, String nombreUsuario, String contraseña, int edad, int telefono, String correo, int tipoRol) throws IOException {
        String[] arregloArchivo = getArregloArchivo("registros.txt");

        PrintStream ps = getPrintStream("registros.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 0).equals(cedula)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(cedula + ";" + nombre + ";" + apellido + ";" + nombreUsuario + ";" + contraseña + ";" + edad + ";" + telefono + ";" + correo + ";" + tipoRol);
            }
        }//End for
    }//End actualizarDatos

    public void actualizarCita(String fecha, String hora, String nombre, String cedula) throws IOException {
        String[] arregloArchivo = getArregloArchivo("citas.txt");

        PrintStream ps = getPrintStream("citas.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 0).equals(fecha) && !getNameFile(arregloArchivo[i], 1).equals(hora)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(fecha + ";" + hora + ";" + cedula + ";" + nombre);
            }
        }//End for
    }//End actualizarPaises

    public void actualizarCita2(String fecha, String hora, String nombre, String cedula) throws IOException {
        String[] arregloArchivo = getArregloArchivo("citas.txt");

        PrintStream ps = getPrintStream("citas.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 0).equals(fecha) && !getNameFile(arregloArchivo[i], 1).equals(hora)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(fecha + ";" + hora + ";" + cedula + ";" + nombre);
            }
        }//End for
    }//End actualizarCita2

    public void actualizarHistorial(String fecha, String hora, String nombre, String cedula) throws IOException {
        String[] arregloArchivo = getArregloArchivo("historia.txt");

        PrintStream ps = getPrintStream("historia.txt", false);
        for (int i = 0; i < arregloArchivo.length; i++) {

            if (!getNameFile(arregloArchivo[i], 0).equals(fecha) && !getNameFile(arregloArchivo[i], 1).equals(hora)) {
                ps.println(arregloArchivo[i]);
            } else {
                ps.println(fecha + ";" + hora + ";" + cedula + ";" + nombre);
            }
        }//End for
    }//End actualizarCita2

    public Cita newDate(Cita element, String fecha, String hora) {
        Cita u = element;
        Cita cita = new Cita(fecha, hora, u.getCedula(), u.getNombre());

        return cita;
    }

    /**
     *
     * @param c : cita a modificar
     * @param f : fecha que se
     * @param h ; hora que se desea modificar/hora nueva
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
    }//End actualizarPaises
    
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

}//End Update
