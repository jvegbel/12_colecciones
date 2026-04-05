
package colecciones;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author jvega
 */
public class TutorialColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean respuesta;
    //Para estudiar la interfaz Collection, dado que la interfaz List hereda 
    //de ella, vamos a referenciar la lista listaClientes

    List<Cliente> listaClientes = new ArrayList<>() ;

    //con la variable coleccionCliente del tipo Collection. Con ello conseguiremos tener
    //acceso únicamente a las funcionalidades de Collection, que son las que
    //vamos a estudiar a continuación, y no a las específicas de la interfaz List que
    //veremos luego.

    Collection<Cliente> coleccionCliente = listaClientes;

    //Mientras usemos la variable coleccionCliente, el objeto referenciado (una lista)
    //se comportará como una simple colección, sin ninguna de las particularidades
    //específicas de las listas

    
    // Métodos de inserción
    //boolean add(E elem): Añade un nuevo elemento a la lista
        Cliente cliente = new Cliente("111", "Marta", "12/02/2000");
        System.out.println((coleccionCliente.add(cliente)));
        System.out.println("colecciones.Main_colecciones.main()\n " + coleccionCliente);
        
        
    // Métodos de eliminación
    //boolean remove(Object ob): Elimina la primera ocurrencia del elemento
    //indicado. Se puede observar que no se exige a ob que sea del tipo genérico
    //E con el que se ha declarado la colección. Esto se debe a que el método no
    //va a añadir ningún elemento, y no hay peligro de que se inserte un objeto de
    //una clase no permitida.

    System.out.println("Elimino el primer cliente asociado a Marta: " + coleccionCliente.remove(cliente)) ;
    System.out.println("Intento eliminar otro cliente asociado a Marta: " + coleccionCliente.remove(cliente)) ;
    
    System.out.print("Compruebo que se añade correctamente un elemento: "); 
    System.out.println((coleccionCliente.add(cliente)));

    //void clear(): elimina todos los elementos de una colección y la deja vacía.
    //Esto no significa eliminar la propia colección. La colección, simplemente,
    //queda vacía y disponible para volver a insertar nuevos elementos.

    coleccionCliente.clear();
    System.out.print( "¿Está vacía la lista? " );
    System.out.println(  coleccionCliente.isEmpty()); //devolverá True
    System.out.print( "¿Número de elementos después de vaciar la lista? " );
    System.out.println( coleccionCliente.size());
    
    // Métodos de comprobación
    //Nos permiten comprobar el estado de una colección. Como hemos dejado la colección
    //vacía, vamos a empezar insertando algunos elementos para seguir experimentando:
    
    // Añado clientes  a la lista
    Cliente pedro = new Cliente("116", "Pedro", "01/12/2002");
    coleccionCliente.add(new Cliente("111", "Marta", "12/02/2000")) ;
    coleccionCliente.add(new Cliente("115", "Jorge", "16/03/1999")) ;
    coleccionCliente.add(new Cliente("112", "Carlos", "01/10/2002")) ;
    coleccionCliente.add(pedro);
    coleccionCliente.add(pedro) ;

    //int size () : nos permite saber, en cada momento, el número de elementos (o
    //nodos) insertados en una colección. Por ejemplo,
    System.out.print( "\n¿Número de elementos después de añadir clientes la lista? " );
    System.out.println( coleccionCliente.size()); //devuelve 4


    //boolean isEmpty (): permite saber si una colección esta vacía. Devuelve true si
    //está vacía y false en caso contrario.

    System.out.println( "\n ¿Está vacía la lista? " + coleccionCliente.isEmpty()); //devolverá false

    //boolean contains (Object ob) : nos dice si un elemento ob determinado está en
    //una colección. Devuelve true si ob pertenece a la colección y false en caso 
    //contrario. En nuestro ejemplo,
    
    respuesta = coleccionCliente.contains(new Cliente("110", "Luis", "16/03/1999"));  //false
    System.out.print( "\n¿Contiene al cliente Luis? " + respuesta );
   
    respuesta = coleccionCliente.contains(pedro);
    System.out.println( "\n¿Contiene al cliente Pedro? " + respuesta );

    
    System.out.println(coleccionCliente);
   
    
    //Iterator<E> iterator(): invocado por la colección, nos devuelve un iterador
    //asociado a ella. Aquí E será del mismo tipo que el de la colección.
     Iterator<Cliente> it = coleccionCliente.iterator();
      
    //Con el caso clientes, si queremos eliminar de nuestra colección aquellos
    //clientes nacidos antes del año 2000.
     
    //boolean hasNext(): comprueba si hay un elemento siguiente, es decir, si
    //quedan elementos por visitar, y nos devuelve true o false, según el caso.
    //
    //E next(): el iterador avanza al siguiente elemento, si existe, y nos lo devuelve.
    //En caso de que no haya siguiente, porque estemos al final de la colección o
    //porque esta estuviera vacía, next() lanzará la excepción NoSuchElement
    //Exception. La primera llamada a next() nos devuelve el primer elemento de la
    //colección si esta no está vacía.
        
    System.out.println("Elimino clientes nacidos antes del 1 de enero de 2000:");
    while (it.hasNext()) {
        Cliente p = it.next();
        if (p.fechaNacimiento.compareTo(LocalDate.of(2000, 1, 1)) < 0) {
            it.remove();
            /*elimina p, ultimo cliente devuelto por next ()
            ¡No usar coleccionClie.remove(p) !*/
        }

    }

    
        for (Cliente p : coleccionCliente) {
            System.out.print(p);
        }

        System.out.println("\nElimino todos los clientes iguales a pedro:");

        it = coleccionCliente.iterator();  // Reseteo el iterador si no está en la posición dejada anteriormente
        // Para eliminar duplicados con equals
        while (it.hasNext()) {
            Cliente p = it.next();
            if (p.equals(pedro)) {
                it.remove();
                /*elimina p, ultimo cliente devuelto por next ()
            ¡No usar coleccionClie.remove(p) !*/
            }

        }

        for (Cliente p : coleccionCliente) {
            System.out.print(p);
        }
        
//      Conversión a un Array normal
        Cliente[] arrayClientes = listaClientes.toArray(new Cliente[0]);
        System.out.print(Arrays.toString(arrayClientes));
        

    }  // Fin del main
  
}  // Fin de la Clase
