package Logic;

import Interfaces.Queues;
import java.util.Queue;

/**
 *
 * @author pc
 */


class NodeQueue {

    //Atributos de los Nodos
    CustomerNotes element;
    NodeQueue next;

    /**
     * Construye objetos tipo NodeQueue
     *
     * @param n
     */
    public NodeQueue(CustomerNotes h) {
        element = h;
        next = null;
    }
    
    CustomerNotes seeElement() {
        return this.element;
    }// end seeElement
    // me permite ver el elemento
    // método utilizado para el indexOf

    NodeQueue seeNext() {
        return this.next;
    }// ver siguiente
    
}//end class NodeQueue

////SE USA PARA LOS PLANES ALIMENTICIOS 
class NodeQueue2 {

    //Atributos de los Nodos
    Plans element;
    NodeQueue2 next;

    /**
     * Construye objetos tipo NodeQueue
     *
     * @param n
     */
    public NodeQueue2(Plans h) {
        element = h;
        next = null;
    }
    
    Plans seeElement2() {
        return this.element;
    }// end seeElement
    // me permite ver el elemento
    // método utilizado para el indexOf

    NodeQueue2 seeNext2() {
        return this.next;
    }// ver siguiente
    
}//end class NodeQueue

public class QueueMethods implements Queues{
    
    //Atributos de las Queue
    NodeQueue start;
    NodeQueue end;
    int size;
    
    NodeQueue2 start2;
    NodeQueue2 end2;
    int size2;
    
    public int size2(){
        return size2;
    }

    @Override
    public int Size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    @Override
    public void Enqueue(CustomerNotes h) {
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
    
    public void Enqueue2(Plans a) {
        NodeQueue2 aux = start2;

        // se pregunta si la lista está vacia
        if (aux == null) {

            // se crea mi primer objeto
            aux = new NodeQueue2(a);
            start2 = aux;
            size2++;
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
            aux.next = new NodeQueue2(a);
            size2++;
            // se hace un system.out.println para que 
            //se pueda mostrar el resultado por consola
            //resultado del resto de elementos de la lista
           // System.out.println(n);
        }// end else 
    }

    @Override
    public void Dequeue(CustomerNotes h) {
        CustomerNotes element = start.element;//dato= elemento
        if (start == end) { // siguiente= sgte
            start = null;
            end = null;
        } else {
            start = start.next;
        }
    }

    @Override
    public CustomerNotes startQueue() {
         return start.element;
    }

    @Override
    public boolean isFull() {
        return start != null ? true : false;
    }

    @Override
    public CustomerNotes indexOf(int index) {
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
    
    public Plans indexOf2(int index) {
        NodeQueue2 aux = start2;

        // indice para recorrer la cola por medio de la 
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
    
    public boolean search3(String a){
        
        NodeQueue2 current = start2;   
        int num = 0;
        while (current != null) {
            if (current.element.getCedula().equals(a)){
                return true;
            }
            current = current.next;
            num++;
        }
        return false;    //data not found 
    }
}
