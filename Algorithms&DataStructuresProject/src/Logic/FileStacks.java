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
public class FileStacks {
     NodeStacks pilaTemp = new NodeStacks();
    public void insertCita(Cita c) {
        File mainFileE = new File("citas.txt");
        try {
            //                                                  
            FileOutputStream fos = new FileOutputStream(mainFileE, true);
            PrintStream ps = new PrintStream(fos);
             ps.println(c.getFecha()+";"+c.getHora()+";"+c.getCedula()+";"+c.getNombre());

        } catch (FileNotFoundException fnfe) {

            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
        }// end catch()
    }
    
    public void readingFiles() {

        File f = new File("citas.txt");
        try {
            // metodo para leer un archivo
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bR = new BufferedReader(isr);

            String linesUpdate = bR.readLine();
            // creacion de un objeto StringTokenizer
            while (linesUpdate != null) {
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
                    }// end else   
                }// end while pequeño

                Cita cita = new Cita(fecha, hora, cedula, nombre);
                pilaTemp.push(cita);
                linesUpdate = bR.readLine();
            }// end while grande()
           
        }// end while grande
        catch (FileNotFoundException fnfe) {
            System.out.println("PROBLEMAS ");
        } catch (IOException ioe) {

            System.out.println("PROBLEMAS ");

        }//end catch
        //-------------------------------------------------------

    }// end showMeTheFiles()     

    public void buscarCita() throws IOException {

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

                    StringTokenizer sT = new StringTokenizer(linesUpdate, ";");
                    String fecha = "", hora = "", cedula = "", nombre = "";
                int counterTok = 0;

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
                    Cita usu = new Cita(fecha,hora, cedula, nombre);
                   // pilaTemp.push(fecha,hora, nombre, cedula);// crea al usuario y lo agrega
                linesUpdate = bR.readLine();

            }// end while grande
            
        } catch (FileNotFoundException fnfe) {

            System.out.println("PROBLEMAS ");
        } catch (IOException ioe) {

            System.out.println("PROBLEMAS ");

        }//end catch

    }// end removeLines()
    public void insertHora(String c) {
        File mainFileE = new File("horasConsulta.txt");
        try {
            //                                                  
            FileOutputStream fos = new FileOutputStream(mainFileE, true);
            PrintStream ps = new PrintStream(fos);
             ps.println(c);

        } catch (FileNotFoundException fnfe) {

            JOptionPane.showMessageDialog(null, "Problemas con el archivo");
        }// end catch()
    }
    
}
