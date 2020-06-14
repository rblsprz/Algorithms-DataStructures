/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import Interfaces.Stacks;

/**
 *
 * @author pc
 */
class NodeCita {

    String numCel;
    String nombre, cedula, fecha, hora;
    NodeCita sgte;

    public NodeCita(String nombre, String cedula, String fecha, String hora) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
        this.hora = hora;
        sgte = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public String getNumCel() {
        return this.numCel;
    }
}

public class NodeStacks implements Stacks {

    NodeCita inicio;

    @Override
    public int size() {
        int salida = 1; //Contador
        NodeCita aux = inicio; //Inicia la lista

        while (aux.sgte != null) { // Recorre la lista hasta llegar al ultimo nodo
            salida++; //Cada recorrido incrementa el contador
            aux = aux.sgte; //Cada nodo va cambiando por el sgte hasta llegar a null
        }
        return salida; //retorna el tamaño de la lista
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public boolean isFull() {
        if (!isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        NodeCita aux = inicio;
        int lastNodo = 0;
        if (aux == null) { //Si no tiene nada, retorna una salida
        } else {
            while (aux != null) { //Cuando sigt sea null quiere decir que es el ultimo nodo 
                lastNodo = aux.hashCode(); //Como va a salir cuando encuentre el null entonces obtenemos el valor antes de que salga del ciclo
                aux = aux.sgte; //recorre toda lista hasta que encuentre el null    
            }
        }//endElse
        return lastNodo;
    }

//        @Override
//        public Object pop() {
//            NodeCita actual = inicio; //Inicializa la lista 
//            if (inicio == null) //Si la lista esta vacia entonces muestra un mensaje
//            {
//                return "La pila esta vacia";
//            } else if (inicio.nombre == peek()) //Si el inicio es igual al final
//            {
//                return inicio = null;
//            } else {
//                while (actual.sgte.nombre != peek()) { //Recorre la lista hasta llegar al ultimo valor, cuando llega al ultimo rompe el ciclo
//                    actual = actual.sgte; //Recorre 
//                }
//            }
//            //Remueve el ultimo valor 
//            return actual.sgte = null;
//        }
    public void push(String fecha, String hora, String nombre, String cedula) {
        NodeCita aux = inicio; //Para iniciar, si es el primer recorrido es null sino va hacer igual a n

        if (aux == null) { //Si no tiene nada,crea el primer objeto
            aux = new NodeCita(fecha, hora, cedula, nombre); //Le asigno el objecto
            inicio = aux; //Como inicio ya tiene un valor n entonces en el proximo insert saltara directo al while
        } else {
            while (aux.sgte != null) { //Cuando sigt sea null quiere decir que es el ultimo nodo    
                aux = aux.sgte; //recorre toda lista hasta que encuentre el null
            }
            aux.sgte = new NodeCita(fecha, hora, cedula, nombre); //Si es igual a null ingresa
        }//endElse
    }

    public String printPila() {
        NodeCita aux = inicio;
        String output = "";
        while (aux != null) {
            String dato1 = aux.getNumCel();
            String dato2 = aux.getNombre();
            String dato3 = aux.getNombre();
            output += "[" + dato1 + "," + dato2 + "," + dato3 + "," + "]" + "->";
            aux = aux.sgte;
        }
        return output;
    }

    @Override
    public void push(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
