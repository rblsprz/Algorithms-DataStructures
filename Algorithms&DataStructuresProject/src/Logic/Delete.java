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
                    String cedula = "", nombre = "", apellido = "", nombreUsuario = "", contraseña = "";
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
                        } else if (counterTok == 4) {
                            contraseña = st.nextToken();
                            counterTok++;
                        } else if (counterTok == 5) {
                            edad = Integer.parseInt(st.nextToken());
                            counterTok++;
                        } else if (counterTok == 6) {
                            telefono = Integer.parseInt(st.nextToken());
                            counterTok++;
                        } else if (counterTok == 7) {
                            correo = st.nextToken();
                            counterTok++;
                        } else if (counterTok == 8) {
                            tipoRol = Integer.parseInt(st.nextToken());
                            counterTok++;
                        } else {
                            st.nextToken();
                        }
                    }// end while pequeño()
                    Roles usu = new Roles(cedula, nombre, apellido, nombreUsuario, contraseña, edad, telefono, correo, tipoRol);
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
                        + listaTemp.indexOf(i).getNombre() + ";"
                        + listaTemp.indexOf(i).getApellido() + ";" + listaTemp.indexOf(i).getNombreUsuario() + ";"
                        + listaTemp.indexOf(i).getContraseña() + ";" + listaTemp.indexOf(i).getEdad() + ";"
                        + listaTemp.indexOf(i).getTelefono() + ";" + listaTemp.indexOf(i).getCorreo() + ";" + listaTemp.indexOf(i).getTipoRol());
            }
        } catch (FileNotFoundException fnfe) {

            System.out.println("PROBLEMAS ");
        }
        //---------------

    }// end removeLines()

    public void removeLinesPila(String fe, String h) throws IOException {

         NodeStacks pilaTemp = new NodeStacks();
        File f = new File("citas.txt");
        try {
            // metodo para leer un archivo
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bR = new BufferedReader(isr);

            String linesUpdate = bR.readLine();
            // creacion de un objeto StringTokenizer
            while (linesUpdate != null) {
                if (!linesUpdate.contains(fe) || !linesUpdate.contains(h)) {

                    StringTokenizer sT = new StringTokenizer(linesUpdate, ";");
                    int counterTok = 0;
                    String fecha = "";
                    String hora = "";
                    String cedula = "";
                    String nombre = "";

                    // va a controlar cada separador
                    while (sT.hasMoreTokens()) {
                        if (counterTok == 0) {
                            fecha = sT.nextToken();
                            counterTok++;
                        } else if (counterTok == 1) {
                            hora = sT.nextToken();
                            counterTok++;
                        } else if (counterTok == 2) {
                            cedula = sT.nextToken();
                            counterTok++;
                        } else if (counterTok == 3) {
                            nombre = sT.nextToken();
                            counterTok++;
                        } else {
                            sT.nextToken();
                        }
                    }// end while pequeño()
                    Cita cita = new Cita(fecha, hora, cedula, nombre);
                    //System.out.println("Fabe" + usu.getContrasenia());
                    pilaTemp.push(cita);// crea al usuario y lo agrega
                }// end if()
                linesUpdate = bR.readLine();

            }// end while grande

        } catch (FileNotFoundException fnfe) {

            System.out.println("PROBLEMAS ");
        } catch (IOException ioe) {

            System.out.println("PROBLEMAS ");

        }//end catch
        File fNuevo = new File("citas.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fNuevo);
            PrintStream ps = new PrintStream(fos);
            for (int i = 0; i < pilaTemp.size(); i++) {
                ps.println(pilaTemp.IndexOf(i).getFecha() + ";"
                        + pilaTemp.IndexOf(i).getHora() + ";"
                        + pilaTemp.IndexOf(i).getCedula()+ ";" + pilaTemp.IndexOf(i).getNombre()+ ";");
            }
        } catch (FileNotFoundException fnfe) {

            System.out.println("PROBLEMAS ");
        }
        //---------------

    }// end removeLines()

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

    //Retorna un BufferedReader
    public BufferedReader getBufferedReader(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Problemas con el archivo.");
        }
        return br;
    }//End getBufferedReader

    //Retorna cuántas líneas tiene un archivo
    public int cuentaLineasArchivo(String archivo) {
        int contador = 0;
        BufferedReader br = getBufferedReader(archivo);
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

    //Retorna un arreglo con los string del archivo
    public String[] getArregloArchivo(String nombreArchivo) {
        String arregloArchivo[] = new String[cuentaLineasArchivo(nombreArchivo)];
        int indice = 0;
        BufferedReader br = getBufferedReader(nombreArchivo);
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

    //Retorna un string especifico de una linea del archivo
    public String getNombreArchivo(String archivo, int lugarNombre) {
        String nombreArchivo = "";
        int contandor = 0;
        for (int i = 0; i < archivo.length() && contandor != lugarNombre + 1; i++) {
            if (archivo.charAt(i) == ';') {
                contandor++;
            }
            if (contandor == lugarNombre && archivo.charAt(i) != ';') {
                nombreArchivo += archivo.charAt(i);
            }
        }
        return nombreArchivo;
    }//Fin getNombreArchivo

    public void borrarCita(String archivo, String fecha, String hora) throws IOException {
        String[] arregloArchivo = getArregloArchivo(archivo);

        PrintStream ps = getPrintStream(archivo, false);
        for (int i = 0; i < arregloArchivo.length; i++) {
            if (!getNombreArchivo(arregloArchivo[i], 0).equalsIgnoreCase(fecha) || !getNombreArchivo(arregloArchivo[i], 1).equalsIgnoreCase(hora)) {
                ps.println(arregloArchivo[i]);
            }
        }
    }//End borrarCita

    public void borrarHistorial(String archivo, String fecha, String hora) throws IOException {
        String[] arregloArchivo = getArregloArchivo(archivo);

        PrintStream ps = getPrintStream(archivo, false);
        for (int i = 0; i < arregloArchivo.length; i++) {
            if (!getNombreArchivo(arregloArchivo[i], 0).equalsIgnoreCase(fecha) || !getNombreArchivo(arregloArchivo[i], 1).equalsIgnoreCase(hora)) {
                ps.println(arregloArchivo[i]);
            }//End if   
        }//End for 
    }//End borrarHistorial

    public void removeLinesCola(String c) throws IOException {
        //prueba colaTemp = new prueba();
        ColaMetodos colaTemp = new ColaMetodos();
        File f = new File("notasPaciente.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String linesUpdate = br.readLine();

            while (linesUpdate != null) {
                if (!linesUpdate.contains(c)) {
                    StringTokenizer sT = new StringTokenizer(linesUpdate, ";");
                    int counterTok = 0;
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

                    while (sT.hasMoreTokens()) {
                        if (counterTok == 0) {
                            cedula = sT.nextToken();
                            counterTok++;
                        } else if (counterTok == 1) {
                            nombre = sT.nextToken();
                            counterTok++;
                        } else if (counterTok == 2) {
                            notas = sT.nextToken();
                            counterTok++;
                        } else if (counterTok == 3) {
                            peso = Double.parseDouble(sT.nextToken());
                            counterTok++;
                        } else if (counterTok == 4) {
                            musculo = Double.parseDouble(sT.nextToken());
                            counterTok++;
                        } else if (counterTok == 5) {
                            grasa = Double.parseDouble(sT.nextToken());
                            counterTok++;
                        } else if (counterTok == 6) {
                            altura = Double.parseDouble(sT.nextToken());
                            counterTok++;
                        } else if (counterTok == 7) {
                            edad = Integer.parseInt(sT.nextToken());
                            counterTok++;
                        } else if (counterTok == 8) {
                            masaCorporal = Double.parseDouble(sT.nextToken());
                            counterTok++;
                        } else if (counterTok == 9) {
                            agua = Double.parseDouble(sT.nextToken());
                            counterTok++;
                        } else if (counterTok == 10) {
                            fecha = sT.nextToken();
                            counterTok++;
                        } else {
                            sT.nextToken();
                        }
                    }
                    NotasCliente cM = new NotasCliente(cedula, nombre, notas, peso, musculo, grasa, altura, edad, masaCorporal, agua, fecha);///////******************************* Modificado  DANIEL COLO
                    colaTemp.Enqueue(cM);
                }
                linesUpdate = br.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
        }

        File fNuevo = new File("notasPaciente.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fNuevo);
            PrintStream ps = new PrintStream(fos);
            for (int i = 0; i < colaTemp.Size(); i++) {
                ps.println(colaTemp.indexOf(i).getCedula() + ";" + colaTemp.indexOf(i).getNombre() + ";" + colaTemp.indexOf(i).getNotas() + ";" + colaTemp.indexOf(i).getPeso() + ";"
                        + colaTemp.indexOf(i).getMusculo() + ";" + colaTemp.indexOf(i).getGrasa() + ";"
                        + colaTemp.indexOf(i).getAltura() + ";" + colaTemp.indexOf(i).getEdad() + ";" + colaTemp.indexOf(i).getMasaCorporal() + ";"
                        + colaTemp.indexOf(i).getAgua() + ";" + colaTemp.indexOf(i).getFecha());
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS");
        }
    }//End removeLines
}
