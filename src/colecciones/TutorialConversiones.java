package colecciones;
import java.util.*;

public class TutorialConversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*******************************************************************************
 *                       CONVERSIONES ENTRE COLECCIONES                         *
 *******************************************************************************/
    //Una característica interesante de los conjuntos y de todas las colecciones en
    //general es la posibilidad de crear unas a partir de otras, del mismo o distinto tipo,
    //por medio de los constructores. Podemos obtener un conjunto ordenado (un TreeSet) 
    //a partir de otro que no lo está (un HashSet o LinkedHashSet) 
    //Vamos a crear un LinkedHashSet de números enteros. Después le añadimos cinco
    //elementos, que se irán colocando por orden de inserción. 
        Set<Integer> conjuntoEnteros = new LinkedHashSet<>();
        conjuntoEnteros.add(4);
        conjuntoEnteros.add(1) ;
        conjuntoEnteros.add(5);
        conjuntoEnteros.add(10);
        conjuntoEnteros.add(3);
        System.out.println ("Se visualiza por orden de inserción (LinkedHashSet): " 
        + conjuntoEnteros) ; //[4, 1, 5, 10, 3]
   
    //Disponemos de varios caminos para ordenar el conjunto 
    
    
//1. Construimos un TreeSet con el criterio de ordenación que deseamos y luego
    //le añadimos con addAll() el conjunto que queremos ordenar.
    //En la variable conjuntoEnteros hemos usado el tipo Set, es decir, el nombre de la
    //interfaz. Esto es una prática común si queremos tener la posibilidad de referenciar,
    //con la mis- ma variable, conjuntos con distintas implementaciones. Si la variable
    //conjuntoEnteros fuera de tipo LinkedHashSet, solo serviría para referenciar objetos
    //de esa clase, pero no un TreeSet. Es una forma más de polimorfismo en Java.
    //Volviendo a nuestro ejemplo, si queremos obtener un conjunto ordenado a partir de
    //los elementos de conjuntoEnteros, podemos crear un TreeSet y añadírselos.
        Set<Integer> conjuntoEnterosOrdenados = new TreeSet<>();
        conjuntoEnterosOrdenados.addAll(conjuntoEnteros);
        System.out.println("Se visualiza por orden de natural (TreeSet): " + conjuntoEnterosOrdenados) ;
    //[1, 3, 4, 5, 10]
    //Ahora podemos dejar las variables conjuntoEnteros y conjuntoEnterosOrdenados,
    //referenciando cada una un tipo distinto de conjunto, o referenciar con
    //conjuntoEnteros el nuevo conjunto ordenado.       
        conjuntoEnteros = conjuntoEnterosOrdenados;
        System.out.println("Se visualiza por orden de inserción el nuevo LinkedHashSet convertido: " + conjuntoEnteros) ;
    //con lo cual, a todos los efectos, habríamos ordenado conjuntoEnteros. A partir de
    //ese momento conjuntoEnteros seria un TreeSet y mantendria el orden al insertar o
    //eliminar elementos.
    System.out.println();
    
//2. Si el criterio de ordenación va a ser el natural (el de la interfaz Comparable),
    //podemos construir un TreeSet pasando como argumento a su constructor el
    //conjunto que queremos ordenar.
        Set<Integer> conjuntoEnterosOrdenados2 = new TreeSet<>(conjuntoEnteros);
    //No obstante, este segundo método solo sirve si queremos un conjunto con el orden
    //natural de los elementos. Si, en vez de enteros, tuviéramos un conjunto de clientes
    //sin ordenar y quisiéramos ordenarlos por nombre, tendríamos que usar el primer
    //procedimento, construyendo un TreeSet con un comparador ComparaNombres
        Comparator<Cliente1> comparaNombres = new Comparator<>() {
            @Override
            public int compare(Cliente1 c1, Cliente1 c2) {
                return c1.nombre.compareTo(c2.nombre);
            }
        };
    //Creo un conjunto LinkedHashSet (Orden de inserción)
        Set<Cliente1> conjuntoClientes = new LinkedHashSet<>(); /*Sin orden*/
        conjuntoClientes.add(new Cliente1("111", "Marta", "12/02/2000"));
        conjuntoClientes.add(new Cliente1("115", "Jorge", "16/03/1999"));
        conjuntoClientes.add(new Cliente1("112", "Carlos", "01/10/2002"));
        System.out.println("Elementos de conjuntoClientes (LinkedHashSet):\n " + conjuntoClientes);
    //Creo un conjunto TreeSet (Orden por Comparator: comparaNombres)
        Set<Cliente1> conjuntoClientesOrdenados = new TreeSet<>(comparaNombres);
    //Con addAll añado al conjuntoClientesOrdenados (TreeSet) los elmentos del 
    //conjunto conjuntoClientes (LinkedHashSet) y así los ordenaría por nombres
        conjuntoClientesOrdenados.addAll(conjuntoClientes);
        System.out.println("Elementos de conjuntoClientesOrdenados (TreeSet):\n " + conjuntoClientesOrdenados);    

// CONVERSIONES ENTRE TODO TIPO DE COLECCIONES
    //Utilizando los constructores, es posible hacer conversiones entre todo tipo de
    //colecciones. Se pueden crear listas pasando conjuntos a su constructor y viceversa;
    //también se pueden añadir a una lista todos los elementos de un conjunto. Un
    //ejemplo útil es la creación de un conjunto a partir de una lista para eliminar
    //elementos repetidos.
        List<Integer> lista = new ArrayList<>() ;
        lista.add(5);
        lista.add(3);
        lista.add(5); //elemento repetido
        lista.add(2);
        lista.add(5); //elemento repetido
        System.out.println("Lista (respeta orden inserción): " + lista) ; //[5, 3, 5, 2, 5]
    //Transformamos una lista en un conjunto
        Set<Integer> conjunto = new LinkedHashSet<>(lista); /*sin repetidos */
        System.out.println("Transformamos una lista en un conjunto: " + conjunto) ; //[5, 3, 2]
    //donde se han eliminado las repeticiones. Se muestran por orden de inserción
        lista = new ArrayList<>(conjunto);
    //El orden de los elementos se ha mantenido en todas estas transformaciones porque
    //tanto ArrayList como LinkedHashSet respetan el orden de inserción.
    //
    //Cuando se trabaja con colecciones de distinto tipo, siempre que se usen constructores 
    //o métodos comunes a listas y conjuntos, es costumbre definir las variables de
    //tipo Collection para permitir que la misma variable referencie a diferentes tipos de
    //colección en caso de conversiones. El código anterior podía ser:

        Collection<Integer> coleccion = new ArrayList<>();
        coleccion.add(5);
        coleccion.add(3);
        coleccion.add(7);
        coleccion.add(7);
        coleccion = new LinkedHashSet<>(coleccion);//de lista a conjunto
        coleccion = new ArrayList<>(coleccion);//de conjunto a lista
        System.out.println(coleccion) ;

    //En este caso, con coleccion podemos referenciar cualquier lista o conjunto. El
    //comportamiento dependerá del objeto referenciado.
    //También es posible hacer las conversiones encadenadas con una única sentencia, 
    coleccion = new ArrayList<>( new LinkedHashSet<>(coleccion));
    //dando los mismos resultados. Aquí habría valido una variable de tipo List        

    
    }
    
}
