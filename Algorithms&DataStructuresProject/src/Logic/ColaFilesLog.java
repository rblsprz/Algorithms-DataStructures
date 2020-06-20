/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Logic.NotasCliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author pc
 */
public class ColaFilesLog {
    
    public ColaMetodos queue = new ColaMetodos();
    
    /**
     * metodo que lee el archivo y mientras lo va leyendo agrega a la pila
     */
    public boolean readingFiles(String cedula1) {
        

        File f = new File("notasPaciente.txt");
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

                // va a controlar cada separador
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
                    } else if (counterTok == 3) {
                        agua = Double.parseDouble(sT.nextToken());
                        counterTok++;
                    } else if (counterTok == 3) {
                        fecha = sT.nextToken();
                        counterTok++;
                    } else {
                       sT.nextToken();  
                    }// end else   
                }// end while pequeño

                NotasCliente cliente = new NotasCliente(cedula, nombre, notas, peso, musculo, grasa, altura, edad, masaCorporal, agua, fecha);
                queue.Enqueue(cliente);
                linesUpdate = bR.readLine();
            }// end while grande()
           
        }// end while grande
        catch (FileNotFoundException fnfe) {
            System.out.println("PROBLEMAS ");
        } catch (IOException ioe) {

            System.out.println("PROBLEMAS ");

        }//end catch
        //-------------------------------------------------------

        boolean encuentra = false;
        
        if(queue.search(cedula1) == true){
            encuentra = true;
        }
        
        return encuentra;
        
    }// end showMeTheFiles()     
    
    public int tamaño(){
        return queue.Size();
    }
    
    
}
