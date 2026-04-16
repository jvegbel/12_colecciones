
package set;

import java.util.*;
//import java.util.Arrays;
public class TutorialSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Instancio un conjunto Hash y le añado objetos
        HashSet<Integer> conjuntoHash = new HashSet<>();
        conjuntoHash.add(7);
        conjuntoHash.add(5);
        conjuntoHash.add(4);
        conjuntoHash.add(7);
        conjuntoHash.add(3);
        System.out.println(conjuntoHash);
        
    //El conjunto de métodos disponibles es el mismo que vimos en los apartados de 
    //métodos básicos y globales de las colecciones:
    //1. int size()
        System.out.println("\n1. int size():");
        System.out.println("Nº elementos de conjuntoHash: " + conjuntoHash.size());
    //2. boolean isEmpty()
        System.out.println("\n2 boolean isEmpty():");
        System.out.println("¿Está vacío conjuntoHash?: " + conjuntoHash.isEmpty());
    //3. boolean contains(Object element)
        System.out.println("\n3. boolean contains(Object element):");
        System.out.println("¿Contiene  el 7 conjuntoHash?: " + conjuntoHash.contains(7));
    //4. boolean add(E element)
        System.out.println("\n4. boolean add():");
        System.out.println("¿Añado el 7 a conjuntoHash?: " + conjuntoHash.add(7));
        //Como ya está devuelve un false
        System.out.println("¿Añado el 9 a conjuntoHash?: " + conjuntoHash.add(9));
        //Como no está devuelve un true
        System.out.println(conjuntoHash);
    //5. boolean remove(Object element)
        System.out.println("\n5. Iterator (boolean remove):");
        System.out.println("¿Elimino el 11 de conjuntoHash?: " + conjuntoHash.remove(11));
        //Como no lo encuentra devuelve un false
        System.out.println("¿Elimino el 9 de conjuntoHash?: " + conjuntoHash.remove(9));
        //Como S�? lo encuentra devuelve un true y lo elimina del conjunto
        System.out.println(conjuntoHash);
    //6. Iterator<E>1terator()
        System.out.println("\n\n6a. Iterator (while):");
         Iterator<Integer> it = conjuntoHash.iterator();
         // Recorro con el iterador el conjunto con un while
         System.out.print("Recorro con el iterador el conjunto con un while: ");
         while (it.hasNext()) {
              System.out.print(it.next()+ " ");
        }
        // Recorro con el iterador el conjunto con un foreach 
        System.out.println("\n\n6b. Iterator (foreach):");
        System.out.print("Recorro con el iterador el conjunto con un foreach: ");
        for (Integer c : conjuntoHash) {
            System.out.print(c + " ");
        }
         // Recorro con el iterador el conjunto con un for tradicional 
         System.out.println("\n\n6c. Iterator (for convencional):");
         System.out.print("Recorro con el iterador el conjunto con un for tradicional: ");
        for (Iterator<Integer> itfor = conjuntoHash.iterator(); itfor.hasNext();) {
            System.out.print(itfor.next() + " ");
            }
    //7. boolean containsAll(Collection <? >c)
        //Genero otro conjunto
        HashSet<Integer> conjuntoAux = new HashSet<>();
        conjuntoAux.add(7);
        conjuntoAux.add(5);
        conjuntoAux.add(4);
//        conjuntoAux.add(10);
//        conjuntoAux.add(11);
        System.out.println("\n\n7. containsAll():");
        System.out.print("Imprimo elementos del nuevo conjunto: ");
        System.out.println(conjuntoAux);
        System.out.println("Compruebo si conjuntoAux está contenido en conjuntoHash: " 
        + conjuntoHash.containsAll(conjuntoAux));
        System.out.println("Compruebo si conjuntoHash está contenido en conjuntoAux: " 
        + conjuntoAux.containsAll(conjuntoHash));
    //8. boolean addAll (Collection <? extends E>c)
        //Uno los dos conjuntos
        System.out.println("\n8. addAll():");
        System.out.println("Compruebo si conjuntoAux está contenido en conjuntoHash (saldrá un false): " +
        conjuntoHash.addAll(conjuntoAux));
        System.out.println(conjuntoHash);
        //Añado un elemento que no esté en conjuntoHash;
        conjuntoAux.add(11);
        System.out.println("Si con addAll() hay elementos no contenidos en conjuntoHash (saldrá un true): " +
        conjuntoHash.addAll(conjuntoAux));
        System.out.println(conjuntoHash);
    //9. boolean removeAll(Collect1on <? >c)
        System.out.println("\n9. removeAll():");
        System.out.println("Si con removeAll() hay elementos en común saldrá true): " + 
        conjuntoHash.removeAll(conjuntoAux));
        System.out.println(conjuntoHash);
        HashSet<Integer> conjuntoAux2 = new HashSet<>();
        conjuntoAux2.add(20);
        conjuntoAux2.add(21);
        conjuntoAux2.add(22);
        System.out.println("Si con removeAll() NO hay elementos en común saldrá FALSE): " + 
        conjuntoHash.removeAll(conjuntoAux2));
    //10. boolean retainAll(Collection <? >c)
        conjuntoAux.add(20);
        conjuntoAux.add(21);
        //realiza la intersección de los dos conjuntos
        System.out.println("\n10. retainAll():");
        System.out.println("Elementos de conjuntoAux: " + conjuntoAux);
        System.out.println("Elementos de conjuntoAux2: " + conjuntoAux2);
        System.out.println("Si con retainAll() hay elementos en común saldrá TRUE): " + 
        conjuntoAux.retainAll(conjuntoAux2));
        System.out.println("Intersección entre conjuntoAux y conjuntoAux2: "+ conjuntoAux);
    //11. void clear ()
        System.out.println("\n11.  void clear ():");
        conjuntoAux.clear();
        System.out.println("vacío un conjunto: " + conjuntoAux);
        
     //12. Object[] toArray()   
        System.out.println("\n12. Object[] toArray():");
        HashSet<Cliente> conjuntoClientes = new HashSet<>();
        conjuntoClientes.add(new Cliente("111", "Marta", "12/02/2000"));
        conjuntoClientes.add(new Cliente("115", "Jorge", "16/03/1999"));
        conjuntoClientes.add(new Cliente("112", "Carlo", "01/10/2002"));
        //El orden no es el de inserción
        Object[] tablaObjeto = conjuntoClientes.toArray();
        System.out.println( Arrays.toString(tablaObjeto));
        
        //Para acceder a los nombres hay que hacer un cast
        System.out.println("DNI del primer cliente según el orden del conjunto: " + 
        ((Cliente)tablaObjeto[0]).dni + " que corresponde a " +  ((Cliente)tablaObjeto[0]).getNombre()) ;
        //Reordeno la tabla por orden natural (DNI es el compareTo)
        Arrays.sort(tablaObjeto);
        System.out.println( Arrays.toString(tablaObjeto));
        
        
    //13a. <T>T[] toArray (T[])
        System.out.println("\n13a. <T>T[] toArray (T[]):");

        conjuntoAux2.add(3);
        conjuntoAux2.add(-4);
        conjuntoAux2.add(-10);
        System.out.println("Conjunto sin ordenar: " + conjuntoAux2);
        Integer[] tabla = conjuntoAux2.toArray(new Integer[0]);
        
        Arrays.sort(tabla);
        System.out.println("Array ordenado: " + Arrays.toString(tabla));
        
    //13b. <T>T[] toArray (T[])
        System.out.println("\n13b. <T>T[] toArray (T[]):");
        //Ejemplo con conjuntos de objetos propios
//        HashSet<Cliente> conjuntoClientes = new HashSet<>();
//        conjuntoClientes.add(new Cliente("111", "Marta", "12/02/2000"));
//        conjuntoClientes.add(new Cliente("115", "Jorge", "16/03/1999"));
//        conjuntoClientes.add(new Cliente("112", "Carlo", "01/10/2002"));
        System.out.println("\nConjunto de Clientes:\n " + conjuntoClientes);
        // Convierto un conjunto en un array
        Cliente[] tablaClientes = conjuntoClientes.toArray(new Cliente[0]);
        Arrays.sort(tablaClientes);
        System.out.println("Array de clientes ordenado (orden natural):\n " + Arrays.deepToString(tablaClientes));
        // Para ordenar por un criterio distinto al natural creamos una clase comparator (por NOMBRE)
        Comparator<Cliente> ordenaNombre = new Comparator<>() {
            //@Override
            public int compare(Cliente c1, Cliente c2) {
                return c1.getNombre().compareTo(c2.getNombre());
            }
        };
        Arrays.sort(tablaClientes, ordenaNombre.reversed());
        System.out.println("Array de clientes ordenado (por nombre orden alfabético inverso):\n " + Arrays.deepToString(tablaClientes));
       
        // Para ordenar por un criterio distinto al natural creamos una clase comparator (por EDAD)
        Comparator<Cliente> ordenaEdad = new Comparator<>() {
            //@Override
            public int compare(Cliente c1, Cliente c2) {
                return c1.edad() - c2.edad();
            }
        };
        Arrays.sort(tablaClientes, ordenaEdad);
        System.out.println("Array de clientes ordenado (por edad ascendente):\n " + Arrays.deepToString(tablaClientes));
       
        
// 
//        
//        TreeSet<Integer> conjuntoTree = new TreeSet<>();
//        conjuntoTree.add(7);
//        conjuntoTree.add(5);
//        conjuntoTree.add(4);
//        conjuntoTree.add(7);
//        conjuntoTree.add(3);
//        System.out.println(conjuntoTree);   
//        
//        LinkedHashSet<Integer> conjuntoLinkedHashSet = new LinkedHashSet<>();
//        conjuntoLinkedHashSet.add(7);
//        conjuntoLinkedHashSet.add(5);
//        conjuntoLinkedHashSet.add(4);
//        conjuntoLinkedHashSet.add(7);
//        conjuntoLinkedHashSet.add(3);
//        System.out.println(conjuntoLinkedHashSet);   
           
           
    }
    
}
