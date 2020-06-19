
package Interfaces;

import Logic.NotasCliente;

/**
 *
 * @author David Robles
 */
public interface Queues {
    public int Size();
    
    public boolean isEmpty();
    
    public void Enqueue(NotasCliente h);//adiciona un elemento
    
    public void Dequeue(NotasCliente h);//remueve el primer elemento de la cola
    
    public NotasCliente startQueue();//Trae el primer elemento de la cola
    
    public boolean isFull();
    
    public NotasCliente indexOf(int index); //Busca elemento en especifico
}//End Queues
