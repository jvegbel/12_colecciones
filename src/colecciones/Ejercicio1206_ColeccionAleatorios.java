package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ejercicio1206_ColeccionAleatorios {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();//admite repetidos
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
       
        //Resuelto sin iterator mediante el boolean remove();
        //boolean remove (Object ob) : elimina un elemento ob de una colecciÃ³n. 
        //Si está¡ repetido, elimina solo el primero que encuentra. Devuelve true 
        //si la eliminación ha tenido éxito y false en caso contrario, por ejemplo, 
        // si el objeto no estaba en la colección.   
        System.out.println(lista);
        boolean eliminado = lista.remove(5);
        while (eliminado) {
            eliminado = lista.remove(5);
        }
        System.out.println("Eliminado el 5: " + lista);
         int contador = 0;
        //Método sin iterator simplificado mediante el boolean remove() ;    
        while (lista.remove(7)) {
            contador++;
        }
        System.out.println("El valor 7 se ha encontrado " + contador + " veces");
        System.out.println("Coleccion Eliminando el 7: " + lista);
         
        // Método con iterator y foreach
        for (Iterator<Integer> it = lista.iterator(); it.hasNext(); ) {
           if (it.next() == 4) {
               it.remove();
           }
        }
        System.out.println("Eliminado el 4: " + lista);
        
        // Método con iterator y while
        Iterator<Integer> it = lista.iterator(); // Reiniciar
        while (it.hasNext()) {
            if (it.next() == 3) {
               it.remove();
            }
        }
        System.out.println("Eliminado el 3: " + lista);
        
    }

}