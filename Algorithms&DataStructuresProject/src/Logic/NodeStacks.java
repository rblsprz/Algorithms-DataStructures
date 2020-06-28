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

    // variables de la clase nodo
    Cita element;
    NodeCita next;

    // constructor del nodo
    public NodeCita(Cita n) {

        this.element = n;
        next = null;
    }

    Cita seeElement() {

        return this.element;
    }// end seeElement
    // me permite ver el elemento
    // método utilizado para el indexOf

    NodeCita seeNext() {

        return this.next;
    }// ver siguiente
}// end class Node()

class NodeHoras {

    // variables de la clase nodo
    String element;
    NodeHoras next;

    // constructor del nodo
    public NodeHoras(String n) {

        this.element = n;
        next = null;
    }

    String seeElement2() {

        return this.element;
    }// end seeElement
    // me permite ver el elemento
    // método utilizado para el indexOf

    NodeHoras seeNext2() {

        return this.next;
    }// ver siguiente
}// end class Node()

public class NodeStacks implements Stacks{
    NodeHoras start2;
    NodeCita start, end;// nodos para utilizar y mover las pilas

    // constructor vacio
    public NodeStacks() {

    }

    @Override
    public int size() {
        int Tam = 1;
        NodeCita aux = start;
        // pila vacia
        if (aux == null) {
            return 0;
        } else {
            do {
                // aumenta el tamaño mientras en el recorrido
                // el elemento sea diferente de nulo
                Tam++;
                aux = aux.next;
            } while (aux.next != null);
        }
        return Tam;
    }

    @Override
    public boolean isEmpty() {
        return start == null ? true : false;
    }

    @Override
    public boolean isFull() {
        return start != null ? true : false;
    }

    @Override
    public void push(Cita n) {
        NodeCita aux = start;

        if (aux == null) {
            aux = new NodeCita(n);
            start = aux;
            System.out.println(n);
        }// end if
        else {
            while (aux.next != null) {//para encontrar el ultimo elemento
                aux = aux.next;
            }// end while

            aux.next = new NodeCita(n);
            // end = aux.next;
            System.out.println(n);
        }// end else
    }
    
     public void push2(String n) {
        NodeHoras aux = start2;

        if (aux == null) {
            aux = new NodeHoras(n);
            start2 = aux;
            System.out.println(n);
        }// end if
        else {
            while (aux.next != null) {//para encontrar el ultimo elemento
                aux = aux.next;
            }// end while

            aux.next = new NodeHoras(n);
            // end = aux.next;
            System.out.println(n);
        }// end else
    }
     
     
    public String IndexOf2(int index) {
        NodeHoras aux = start2;

        // indice para recorrer la lista por medio de la 
        //variable indice
        for (int i = -1; i < index - 1; i++) {

            // método de la clase NODO para llevar al siguiente
            // elemento.
            aux = aux.seeNext2();
        }
        // instancia del método para ver el elemento actual
        // (el metodo está en la clase NODO)
        return aux.seeElement2();
    }
    
    @Override
    public Cita peek() {
        NodeCita aux = start;
        Cita pokiNode = null;
        if (aux == null) {
            // si la pila esta vacia entonces
            // retorna null
            return null;
        } else {
            do {
                // si el nodo siguiente está vacio
                // entonces signfica que el actual es el ultimo
                if (aux.next == null) {
                    // entonces el nodo actual pasa
                    // a ser pokiNode
                    pokiNode = aux.element;
                }
                // para recorrer la pila
                aux = aux.next;
            } while (aux != null);// todo mientras el auxiliar sea diferente de nulo
        }

        return pokiNode;
    }

    @Override
    public Cita pop(Cita c) {
        NodeCita aux = start;// nodos auxiliares
        NodeCita temporal = null;
        Cita pokiNode = null;
        if (aux == null) {
            return null;
        } else {
            do {
                if (aux.next == null) {
                    temporal = aux;
                    pokiNode = aux.element;
                }
                aux = aux.next;
            } while (aux != null);
        }

        if (!isEmpty()) { //usa el metodo "isEmpty" para saber si está vacío
            if (start.equals(end) && temporal.equals(start.element)) { //si el inicio es igual al final y el elemento es igual al inicio.elemento
                start = end = null; //inicio es igual a fin y ambos son iguales a nulo
            }//end if
            else if (temporal.equals(start.element)) { //else if
                start = start.next; //recorre toda la lista

            }// end else if
            else { //else
                NodeCita aux1, aux3; //nodos auxiliares
                aux1 = start; //auxiliar1 es inicio
                aux3 = start.next; //auxiliar es el siguiente de inicio
                while (!(aux3.equals(null)) && !(aux3 == (temporal))) { //mientras auxiliar sea diferente de nulo y el elemento de exiñiar sea diferente de elemento
                    aux1 = aux1.next; //siguiente
                    aux3 = aux3.next; //siguiente del siguiente
                }//end while
                if (aux3 != null) { //si el auxiliar (siguiente) es diferente de nulo
                    aux1.next = aux3.next; //el auxiliar1 siguiente es igual al auxiliar siguiente del siguiente
                    if (aux3.equals(end)) { ////si auxiliar es igual a fin
                        end = aux1; //fin es igual a auxiliar1
                    }//end if
                }//end if
            }//end else

        }//end IF

        return pokiNode;
    }

    @Override
    public Cita IndexOf(int index) {
        NodeCita aux = start;

        // indice para recorrer la lista por medio de la 
        //variable indice
        for (int i = -1; i < index - 1; i++) {

            // método de la clase NODO para llevar al siguiente
            // elemento.
            aux = aux.seeNext();
        }
        // instancia del método para ver el elemento actual
        // (el metodo está en la clase NODO)
        return aux.seeElement();
    }
    
    public void display() {
        NodeCita current = start;

        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("linked list: ");
        while (current != null) {
            System.out.print(current.element.getCedula()+ " ");
            current = current.next;
        }
        System.out.println();
    }// end display

    public boolean search(String x) {
        NodeCita current = start;
        while (current != null) {

            if (current.element.getFecha().equals(x) || current.element.getHora().equals(x) || current.element.getCedula().equals(x) || current.element.getNombre().equals(x)) {
                return true;
            }
            current = current.next;
        }
        return false;    //data not found 
    }// end search()
     
}
    

