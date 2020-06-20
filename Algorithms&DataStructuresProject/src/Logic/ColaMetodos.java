package Logic;

import Interfaces.Queues;
import java.util.Queue;

/**
 *
 * @author pc
 */


class NodeQueue {

    //Atributos de los Nodos
    NotasCliente element;
    NodeQueue next;

    /**
     * Construye objetos tipo NodeQueue
     *
     * @param n
     */
    public NodeQueue(NotasCliente h) {
        element = h;
        next = null;
    }
    
    NotasCliente seeElement() {
        return this.element;
    }// end seeElement
    // me permite ver el elemento
    // método utilizado para el indexOf

    NodeQueue seeNext() {
        return this.next;
    }// ver siguiente
    
}//end class NodeQueue

public class ColaMetodos implements Queues{
    
    //Atributos de las Queue
    NodeQueue start;
    NodeQueue end;
    int size=0;

    @Override
    public int Size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    @Override
    public void Enqueue(NotasCliente h) {
        NodeQueue aux = start;

        // se pregunta si la lista está vacia
        if (aux == null) {

            // se crea mi primer objeto
            aux = new NodeQueue(h);
            start = aux;
            size++;
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
            aux.next = new NodeQueue(h);
            size++;
            // se hace un system.out.println para que 
            //se pueda mostrar el resultado por consola
            //resultado del resto de elementos de la lista
           // System.out.println(n);
        }// end else 
    }

    @Override
    public void Dequeue(NotasCliente h) {
        NotasCliente element = start.element;//dato= elemento
        if (start == end) { // siguiente= sgte
            start = null;
            end = null;
        } else {
            start = start.next;
        }
    }

    @Override
    public NotasCliente startQueue() {
         return start.element;
    }

    @Override
    public boolean isFull() {
        return start != null ? true : false;
    }

    @Override
    public NotasCliente indexOf(int index) {
        NodeQueue aux = start;

        // indice para recorrer la cola por medio de la 
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
    
    
    
    public boolean search(String a){
        NodeQueue current = start;   
        while (current != null) {
            
            if (current.element.getCedula().equals(a)){
                return true;
            }
            current = current.next;
        }
        return false;    //data not found 
    }
    
    public int search2(String a){
        
        NodeQueue current = start;   
        int num = 0;
        while (current != null) {
            if (current.element.getCedula().equals(a)){
                return num;
            }
            current = current.next;
            num++;
        }
        return num;    //data not found 
    }
}
