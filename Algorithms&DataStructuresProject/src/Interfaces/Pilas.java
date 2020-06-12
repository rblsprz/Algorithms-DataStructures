/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author pc
 */
public interface Pilas {
    
    public int size(); //Muestra el tamaño de la pila
    public boolean isEmpty(); //Muestra si la pila esta vacia
    public boolean isFull(); //Muestra si la pila tiene datos
    public void push(int x); //Agregar
    public int peek(); //Obtener el ultimo
    public Object pop(); //Eliminar el ultimo
    
}
