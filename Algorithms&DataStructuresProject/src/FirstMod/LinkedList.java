package FirstMod;

/**
 *
 * @author pc
 */
public interface LinkedList {
    
    void add(Object element); //Realizada en clase Inserta un elemento en la lista 
    
    void clear(); //Remueve todos los elementos de la lista 
    
    boolean contains(Object element);// returna true o false si el elemento existe o no en la lista 

    void remove(Object element); //Remueve el elemento 
    
    int size(); //Retorna el tamaño de la lista 
    
    boolean isEmpty(); //Retorna si la lista está vacía 
}
