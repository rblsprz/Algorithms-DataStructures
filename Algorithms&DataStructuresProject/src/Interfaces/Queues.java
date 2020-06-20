
package Interfaces;

import Logic.CustomerNotes;

/**
 *
 * @author David Robles
 */
public interface Queues {
    public int Size();
    
    public boolean isEmpty();
    
    public void Enqueue(CustomerNotes h);//adiciona un elemento
    
    public void Dequeue(CustomerNotes h);//remueve el primer elemento de la cola
    
    public CustomerNotes startQueue();//Trae el primer elemento de la cola
    
    public boolean isFull();
    
    public CustomerNotes indexOf(int index); //Busca elemento en especifico
}//End Queues
