/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Logic.Cita;

/**
 *
 * @author pc
 */
public interface Stacks {
    
     public int size(); //Muestra el tamaño de la pila

    public boolean isEmpty(); //Muestra si la pila esta vacia

    public boolean isFull(); //Muestra si la pila tiene datos

    public void push(Cita c); //Agregar

    public Cita peek(); //Obtener el ultimo

    public Cita pop(Cita c); //Eliminar el ultimo

    public Cita IndexOf(int index);// me devuelve el elemento del indice indicado
    
}
