/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author pc
 */

class Node {

    // se crean los nodos necsarios para poder
    //utilizar la lista de forma adecuada
    Roles element;
    Node next;

    // constructores
    public Node(Roles n) {
        element = n;
        next = null;

    }// end public Node

    // metodo utilizado para el indexOf
    // me permite obtener el elemento
    Roles seeElement() {

        return this.element;
    }// end seeElement
    // me permite ver el elemento
    // método utilizado para el indexOf

    Node seeNext() {

        return this.next;
    }// ver siguiente

}// end NODE CLASS()

public class prueba {

    // se define el nodo inicio y final
    Node start, end;

//    Node help; 
    //int size;
    // constructor vacío de la clase
    public prueba() {

    }

    public void add(Roles n) {
        Node aux = start;

        // se pregunta si la lista está vacia
        if (aux == null) {

            // se crea mi primer objeto
            aux = new Node(n);
            start = aux;
            // se hace un system.out.println para que 
            //se pueda mostrar el resultado por consola   
            //resultado del primer elemento de la lista
            // System.out.println(n);
        } else {
            // se hará una busqueda, recorre mi lista
            // preguntando si el siguiente elemento es diferente
            //de vacío o sea, si existe o no
            while (aux.next != null) {

                // se le asigna la variable aux al resto de nodos 
                aux = aux.next;

            }// end while
            aux.next = new Node(n);
            // se hace un system.out.println para que 
            //se pueda mostrar el resultado por consola
            //resultado del resto de elementos de la lista
            // System.out.println(n);
        }// end else 

    }// end add()

    // recibe como parmatetro un objeto que será agregado
    // en la primer posición del arreglo
    public void addFirst(Roles n) {
        // int di, double d2

        Node nodito = new Node(n);
        //
        nodito.next = start;
        start = nodito;

    }// end addFirst

    public void addLast(Roles n) {
        Node nodito = new Node(n);
        nodito.next = null;
        end.next = nodito;
        end = nodito;
    }// end addLast()

    //metodo 
    public void clear() {

        // Elimina el valor y la referencia a los demas nodos.
        start = null;
        // Reinicia el contador de tamaño de la lista a 0.

    }// end clear()

    // metodo para ver si la lista contiene al elemento 
    // ingresado por parámetro
    public boolean contains(Roles n) {
        // true si existe el elemento
        // false si no se encuentra
        boolean fullSpace = true;
        Node aux = start;

        // pregunta si el elemento mediante el auxiliar
        // es nulo o ni, si es false, entonces
        if (aux.element != null || start != null) {

            return fullSpace = false;

        }// end if
        else {
            return fullSpace;
        }// end else
    }

    // metodo para remover un elemento especifico de la lista
    public void remove(Roles n) {
        // si el espacio solicitado realmente contiene un elemento
        //entonces procede a eliminarlo
        // ya que de lo contrario tira error
        if (isEmpty() == false) {
            if (start.equals(end) && n.equals(start.element)) {
                start = end = null;
            }//end if interno
            else if (n.equals(start.element)) {
                start = start.next;

            }// end else if
            else {
                Node ant, aux;
                ant = start;
                aux = start.next;

                while (!(aux.equals(null)) && !(aux.element.getCedula().equals(n.getCedula()))) {
                    System.out.println("Antiguo" + aux.element.getCedula() + "  :  Nuevo  " + n.getCedula());
                    ant = ant.next;
                    aux = aux.next;
                }//end while
                if (aux != null) {
                    ant.next = aux.next;
                    if (aux.equals(end)) {
                        end = ant;
                    }//end if intereno
                }//end if interno2
            }//end else

        }//end if grande 

    }
//
//    // metodo que remueve el primer elemento de la lista
//    public void removeFirst() {
//        // variable de tipo var ya que no sabemos que tipo
//        // de elemento se va pasar o insertar
//        var element = start.element;//dato= elemento
//        if (start == end) { // siguiente= sgte
//            start = null;
//            end = null;
//        } else {
//            start = start.next;
//        }
//        //return elemento;
//    }

//    // metodo que remueve el utlimo elemento de la lista
//    public void removeLast() {
//        // se cae si solo hay un elemento
//
//        var Object = end.element; // si admite var
//        // se pone var ya que no se sabe 
//        //aun el tipo de elemento que será
//
//        if (start == end.next) {
//            start = end = null;
//            System.out.println("esta vacio");
//        }//end if
//        else {
//            Node temporal = start;
//            while (temporal.next != end) {
//                temporal = temporal.next;
//
//            }//end while
//            end = temporal;
//            end.next = null;
//
//        }//end else
////       // return elemento;
//
//    }
    public int size() {
        // contador salida que servirá de indice
        //para las posiciones de los nodos y así 
        //mismo sirve de tamaño de la lista
        int output = 0;
        Node aux = start;
        // mientras el auxiliar siguiente sea diferente de null
        // entonces seguirá con el recorriso y el contador 
        // aumentará

        while (aux.next != null) {
            aux = aux.next;
            output++;
        }// end while 

        return output + 1;
    }// end size()

    public boolean isEmpty() {
        // false : NO ESTÁ VACÍO
        // true: ESTÁ VACIO
        // variable inicializada en false
        boolean emptySpace = false;
        Node aux = start;

        // si el auxiliar es nulo, entonces 
        // está vacío
        if (aux == null) {
            return emptySpace = true;
        }// end if
        else {
            return emptySpace;
        }// end else
    }

    public Roles indexOf(int indice) {
        Node aux = start;

        // indice para recorrer la lista por medio de la 
        //variable indice
        for (int i = -1; i < indice - 1; i++) {

            // método de la clase NODO para llevar al siguiente
            // elemento.
            aux = aux.seeNext();
        }
        // instancia del método para ver el elemento actual
        // (el metodo está en la clase NODO)
        return aux.seeElement();

    }// end IndexOf()

//
//    // metodo para obtener el primer elemento de la lista
//    public Persona getFirst() {
//        var object = start.element;
//
//        return object;
//    }
//
//
//    // método paa obtener el ultimo elemento de la lista
//    public Persona getLast() {
//        var object = end.element;
//
//        return object;
//    
//    }
}
