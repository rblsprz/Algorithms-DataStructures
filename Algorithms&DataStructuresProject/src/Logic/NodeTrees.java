package Logic;

import Interfaces.Trees;

/**
 *
 * @author David Robles
 */

public class NodeTrees implements Trees {

    private class NodoBinario {

        int dato;
        NodoBinario izq, der;

        NodoBinario(int n) {
            dato = n;
            izq = der = null;
        }//End Constructor NodoBinario
    }//End NodoBinario

    //PUNTERO AL NODO RAÍZ DEL ÁRBOL SERÁ NULO EN UN ÁRBOL VACÍO
    private NodoBinario raiz;

    public NodeTrees() {
        this.raiz = null;
    }//End ArbolBinario

    //MÉTODOS PÚBLICOS
    @Override
    public void insertar(int dato) {
        raiz = insertar(raiz, dato);
    }//End insertar

    @Override
    public boolean BusquedaBinaria(int dato) {
        return BusquedaBinaria(raiz, dato);
    }//End BusquedaBinaria

    @Override
    public void suprimir(int dato) {
        raiz = suprimir(raiz, dato);
    }//End suprimir

    @Override
    public int minValor() {
        return minValor(raiz);
    }//End minValor

    @Override
    public void PreOrden() {
        PreOrden(raiz);
    }//End PreOrden

    @Override
    public void PostOrden() {
        PostOrden(raiz);
    }//End PostOrden

    @Override
    public void InOrden() {
        InOrden(raiz);
    }//End InOrden

    //MÉTODOS PRIVADOS DE IMPLEMENTACIÓN
    private NodoBinario insertar(NodoBinario nodo, int dato) {
        NodoBinario elemento = new NodoBinario(dato);
        if (nodo == null) { //VERIFICA SI EL ÁRBOL ESTÁ VACÍO
            nodo = elemento; //NODO SE ASIGNA AL ELEMENTO
            raiz = nodo;//AGREGA EL NODO EN LA RAÍZ
        }//End if
        else if (dato < nodo.dato) {//AGREGA EL HIJO EN EN LADO IZQUIERDO
            nodo.izq = insertar(nodo.izq, dato);
        }//End else if
        else {//AGREGA EL HIJO EN EN LADO DERECHO
            nodo.der = insertar(nodo.der, dato);
        }//End else
        return nodo;
    }//End NodoBinario insertar

    private boolean BusquedaBinaria(NodoBinario nodo, int dato) {
        //TODO Hacer implementacion
        return true;
    }//End BusquedaBinaria

    private NodoBinario suprimir(NodoBinario nodo, int n) {
        if (n < nodo.dato) {
            nodo.izq = suprimir(nodo.izq, n);
        } else if (n > nodo.dato) {
            nodo.der = suprimir(nodo.der, n);
        } else if (nodo.dato == n) {
            //primer  caso es un dodo sin hijos
            if (nodo.izq == null && nodo.der == null) {
                return nodo = null;
            } //segundo caso  el nodo solo tiene un hijo
            //en este caso el nodo es remplazado por el hio
            else if (nodo.izq != null && nodo.der == null) {
                return (nodo = nodo.izq);
            } else if (nodo.izq == null && nodo.der != null) {
                return (nodo = nodo.der);
            } //tercer caso el nodo tiene hijos
            else if (nodo.izq != null && nodo.der != null) {
                //obtener el elemento mas peque�o del sub_arbol derecho
                int HijoMenoSbArbolderecho = minValor(nodo.der);
                //cambia el nodo raiz con el elemnto obtenido
                nodo.dato = HijoMenoSbArbolderecho;
                nodo.der = suprimir(nodo.der, HijoMenoSbArbolderecho);
            }// nfin de nodos con ds hjod
        }//fin de else
        return nodo;//en cualquier caso retorna el nuevo puntero
    }

    private int minValor(NodoBinario nodo) {
        while (nodo.izq != null) {
            nodo = nodo.izq;
        }//End while
        int valor = nodo.dato;
        nodo = null;
        return valor;
    }//End minValor

    private void PreOrden(NodoBinario nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato);
            PreOrden(nodo.izq);//IMPRESIÓN DEL ÁRBOL EN FORMA RECURSIVA
            PreOrden(nodo.der);//IMPRESIÓN DEL ÁRBOL EN FORMA RECURSIVA
        }//End if 
    }//End PreOrden

    private void InOrden(NodoBinario nodo) {
        if (nodo != null) {
            InOrden(nodo.izq);//IMPRESIÓN DEL ÁRBOL EN FORMA RECURSIVA
            System.out.print(nodo.dato);
            InOrden(nodo.der);//IMPRESIÓN DEL ÁRBOL EN FORMA RECURSIVA
        }//End if 
    }//End InOrden

    private void PostOrden(NodoBinario nodo) {
        if (nodo != null) {
            PostOrden(nodo.izq);//IMPRESIÓN DEL ÁRBOL EN FORMA RECURSIVA
            PostOrden(nodo.der);//IMPRESIÓN DEL ÁRBOL EN FORMA RECURSIVA
            System.out.print(nodo.dato);
        }//End if  
    }//End PostOrden
}//End NodeTrees
