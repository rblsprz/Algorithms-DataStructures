package Logic;

import Interfaces.Queues;

/**
 *
 * @author pc
 */

class Nodo {
    
    private NotasCliente valor;
    // Atributo para enlazar los nodos.
    private Nodo siguiente;
    
    int prioridad;

    Nodo(NotasCliente valor, int prioridad) {
       this.valor=valor;
       this.prioridad=prioridad;
    }

    Nodo() {
       
    }
    
    public void Nodo(){
        this.valor = null;
        this.siguiente = null;
    }

    public NotasCliente getValor() {
        return valor;
    }

    public void setValor(NotasCliente valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

class NodeCola {
    
    public int prioridad;
    public NotasCliente nombreTarea;

    public NodeCola(int prioridad, NotasCliente nombreTarea) {
        this.prioridad = prioridad;
        this.nombreTarea = nombreTarea;
    }

    public int getPrioridad() {
        return prioridad;
    }
}   


public class ColaMetodos implements Queues{
    
    private Nodo inicio;
    // Puntero que indica el final de la lista o el ultimo nodo.
    private Nodo ultimo;

    public void Lista() {
        inicio = null;
        ultimo = null;
    }

    
    public void Enqueue(NotasCliente valor, int prioridad) {
        Nodo nuevo = new Nodo(valor, prioridad);

        if (inicio == null) {
            inicio = ultimo = nuevo;
        } else {

            if (inicio.prioridad > prioridad) {
                nuevo.setSiguiente(inicio);
                inicio=nuevo;
            }else{
              Nodo ant=null;
              Nodo sig=inicio;
              while(sig!=null && prioridad>=sig.prioridad){
                  ant=sig;
                  sig=sig.getSiguiente();
              }
              nuevo.setSiguiente(sig);
              ant.setSiguiente(nuevo);
              if(sig==null){
                 ultimo=nuevo;
              }
            
            }

        }
    }

  
    public int size() {
        int salida = 1; //Contador
        Nodo aux = inicio; //Inicia la lista

        while (aux.getSiguiente() != null) { // Recorre la lista hasta llegar al ultimo nodo
            salida++; //Cada recorrido incrementa el contador
            aux = aux.getSiguiente(); //Cada nodo va cambiando por el sgte hasta llegar a null
        }
        return salida; //retorna el tamaño de la lista
    }

   
    public boolean isEmpty() {
        return inicio == null;
    }

   
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
