
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
public class FileTrees {
    
    public void addDatingHistory(History c) {
        File mainFileE = new File("historia.txt");
        try {
            //                                                  
            FileOutputStream fos = new FileOutputStream(mainFileE, true);
            PrintStream ps = new PrintStream(fos);
            ps.println(c.getNombre() + ";" + c.g + ";" + c.getCedula() + ";" + c.getNombre());

        }//End try 
        catch (FileNotFoundException fnfe) {

            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!");
        }//End catch
    }//End addDate

    public void searchDate() throws IOException {

        NodeStacks tempStack = new NodeStacks();
        File f = new File("historia.txt");
        try {
            // metodo para leer un archivo
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bR = new BufferedReader(isr);

            String linesUpdate = bR.readLine();
            // creacion de un objeto StringTokenizer
            while (linesUpdate != null) {
                StringTokenizer sT = new StringTokenizer(linesUpdate, ";");
                String date = "", time = "", ID = "", name = "";
                int counterTok = 0;
                // va a controlar cada separador
                while (sT.hasMoreTokens()) {
                    if (counterTok == 0) {
                        date = sT.nextToken();
                        counterTok++;
                    }//End if 
                    else if (counterTok == 1) {
                        time = sT.nextToken();
                        counterTok++;
                    }//End else if 
                    else if (counterTok == 2) {
                        ID = sT.nextToken();
                        counterTok++;
                    }//End else if 
                    else if (counterTok == 3) {
                        name = sT.nextToken();
                        counterTok++;
                    }//End else if 
                    else {
                        sT.nextToken();
                    }//End else
                }//End while
                History usu = new History(date, time, ID, name);
                tempStack.push(date, time, name, ID);// crea al usuario y lo agrega
                linesUpdate = bR.readLine();
            }//End while
        }//End try 
        catch (FileNotFoundException fnfe) {
            System.out.println("¡PROBLEMAS DE ARCHIVO!");
        }//End catch 
        catch (IOException ioe) {
            System.out.println("¡PROBLEMAS DE ARCHIVO!");
        }//End catch
    }//End searchDate
    
}//End FileTrees
