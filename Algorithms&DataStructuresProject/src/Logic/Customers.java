package Logic;

import GUI.CRUD;
import Interfaces.LinkedList;
import Logic.Roles;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
class ListaNodo { //Se puede poner en otra clase

    Object element;
    ListaNodo sgte;

    public ListaNodo(Object n) {
        element = n;
        sgte = null;
    }

    public Object getElemento() {
        return element;
    }
}

public class Customers implements LinkedList {

    public Customers() { //Vacio      
    }

    ListaNodo inicio;
    Roles roles = new Roles(); 

    /**
     * Agrega un nuevo nodo en la lista.
     */
    @Override
    public void add(Object element) {
        ListaNodo aux = inicio; //Para iniciar, si es el primer recorrido es null sino va hacer igual a n

        if (aux == null) { //Si no tiene nada,crea el primer objeto
            aux = new ListaNodo(element); //Le asigno el objecto
            inicio = aux; //Como inicio ya tiene un valor n entonces en el proximo insert saltara directo al while
        } else {
            while (aux.sgte != null) { //Cuando sigt sea null quiere decir que es el ultimo nodo    
                aux = aux.sgte; //recorre toda lista hasta que encuentre el null
            }
            aux.sgte = new ListaNodo(element); //Si es igual a null ingresa
        }//endElse
    }

    /**
     * Limpia los valores de la lista
     */
    @Override
    public void clear() {
        inicio = null;
    }

    /**
     * Busca si existe un valor en la lista.
     *
     * @param element valor a buscar.
     * @return true si existe el valor en la lista o false si no existe el valor
     * en la lista
     */
    @Override
    public boolean contains(Object element) {
        ListaNodo aux = inicio;
        boolean encontrado = false; // Bandera para indicar si el valor existe.
        // Recorre la lista hasta encontrar el element o hasta 
        // llegar al final de la lista.
        while (aux != null && encontrado != true) {
            // Consulta si el valor del nodo es igual al de referencia.
            if (element == aux.element) {
                // Cambia el valor de la bandera
                encontrado = true;
            } else {
                // Avanza al siguiente nodo
                aux = aux.sgte;
            }
        }
        return encontrado;
    }

    /**
     * Elimina un nodo que se encuentre en la lista ubicado por un valor de
     * referencia.
     *
     * @param element valor del nodo que se desea eliminar.
     */
    @Override
    public void remove(Object element) {
        // Consulta si el valor de referencia existe en la lista.
        if (contains(element)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (inicio.element == element) {
                // El primer nodo apunta al siguiente.
                inicio = inicio.sgte;
            } else {
                // Crea ua copia de la lista.
                ListaNodo aux = inicio;
                // Recorre la lista hasta llegar al nodo anterior 
                // al de referencia.
                while (aux.sgte.element != element) {
                    aux = aux.sgte;
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                ListaNodo siguiente = aux.sgte.sgte;
                // Enlaza el nodo anterior al de eliminar con el 
                // sguiente despues de el.
                aux.sgte = siguiente;
            }
        }
    }

    /**
     * Obtiene el valor de un nodo en la ultima posicion.
     *
     * @return el numero que se encuentra el la ultima posicion de la lista
     */
    public Object getLast() {
        ListaNodo aux = inicio;
        Object lastNodo = null;
        if (aux == null) { //Si no tiene nada, retorna una salida
            return "La lista esta vacía";
        } else {
            while (aux != null) { //Cuando sigt sea null quiere decir que es el ultimo nodo 
                lastNodo = aux.element; //Como va a salir cuando encuentre el null entonces obtenemos el valor antes de que salga del ciclo
                aux = aux.sgte; //recorre toda lista hasta que encuentre el null    
            }
            return lastNodo;
        }//endElse
    }

    /**
     * Elimina el ultimo nodo de la lista
     */
    public void removeLast() {
        ListaNodo actual = inicio; //Inicializa la lista 

        if (inicio == null) //Si la lista esta vacia entonces muestra un mensaje
        {
            System.out.println("La lista esta vacia");
        } else if (inicio == getLast()) //Si el inicio es igual al final
        {
            inicio = null;
        } else {
            while (actual.sgte.element != getLast()) { //Recorre la lista hasta llegar al ultimo valor, cuando llega al ultimo rompe el ciclo
                actual = actual.sgte; //Recorre 
            }
        }
        actual.sgte = null; //Remueve el ultimo valor 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Obtiene el tamaño de la lista
     *
     * @return salida con el tamaño de la lista
     */
    @Override
    public int size() {
        int salida = 1; //Contador
        ListaNodo aux = inicio; //Inicia la lista

        while (aux.sgte != null) { // Recorre la lista hasta llegar al ultimo nodo
            salida++; //Cada recorrido incrementa el contador
            aux = aux.sgte; //Cada nodo va cambiando por el sgte hasta llegar a null
        }
        return salida; //retorna el tamaño de la lista
    }

    /**
     * Retorna si la lista está vacía
     *
     * @return true si la lista esta vacia y false si la lista esta vacia
     */
    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    /**
     * Obtiene el valor de un nodo en una determinada posición.
     *
     * @param index del nodo que se desea obtener su valor.
     * @return un numero entero entre [0,n-1] n = numero de nodos de la lista y
     * sino lo encuentra un mensaje donde indique tal cosa
     */
    // @Override
    public Object indexOf(int index) {
        // Verifica si la posición ingresada se encuentre en el rango de elementos de la lista
        if (index >= 0 && index < size()) {
            // Consulta si la posicion es el inicio de la lista.
            if (index == 0) {
                // Retorna el valor del inicio de la lista.
                return inicio.element;
            } else {
                // Crea una copia de la lista.
                ListaNodo aux = inicio;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < index; i++) {
                    aux = aux.sgte;
                }
                // Retorna el valor del nodo.
                return aux.element;
            }
            // Crea una excepción de Posicion inexistente en la lista.
        } else {
            return "Posición inexistente en la lista";
        }
    }

    /**
     * Crea un nuevo cliente y lo agrega al archivo
     *
     * @param constructor
     * @return boolean true, en caso de afirmativo, false en caso contrario
     * 
     */
    //Busca a un Customer en un archivo txt. Si no existe es agregado, de otra forma no.
    public boolean createCliente(String cedula, String nombre, String apellido, String nombreUsuario, String contraseña, int edad, int telefono, String correo, int tipoRol) throws FileNotFoundException {

        roles.setCedula(cedula);
        roles.setNombre(nombre);
        roles.setApellido(apellido);
        roles.setNombreUsuario(nombreUsuario);
        roles.setContraseña(contraseña);
        roles.setEdad(edad);
        roles.setTelefono(telefono);
        roles.setCorreo(correo);
        roles.setTipoRol(tipoRol);

        File f2 = new File("registers.txt");
        FileOutputStream fos = new FileOutputStream(f2, true);
        PrintStream ps = new PrintStream(fos);

        if ( !roles.getCedula().equals("") 
                &&!roles.getNombre().equals("") 
                && !roles.getApellido().equals("") 
                && !roles.getNombreUsuario().equals("") 
                && !roles.getContraseña().equals("")  
                && !roles.getCorreo().equals("")) {

            ps.println(roles.getCedula() + ";" + roles.getNombre() + ";" + roles.getApellido() + ";" + roles.getNombreUsuario()+ ";"+ roles.getContraseña() + ";" + roles.getEdad() + ";" + roles.getTelefono() + ";" + roles.getCorreo() + ";" + roles.getTipoRol());
            return true;
        } else {
            return false;
        }
    }//end createEmployee()

    /**
     * Muestra los datos del cliente
     *
     * @param mostrarClientes
     * @return lista de los clientes
     * 
     */
    public Customers showCustomers() {

        Customers list = new Customers();
        File f = new File("registers.txt");
        int counter = 1;

        try {
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String reader = "";
            while (reader != null) {

                reader = br.readLine();
                list.add("(" + Integer.toString(counter) + ")" + reader + "\n");
                counter++;
            }//end while   
        }//end try  
        catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡PROBLEMAS DE ARCHIVO!" + fnfe);
        } catch (IOException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.removeLast();
        return list;
    }//end showCustomers
}//End Customers
