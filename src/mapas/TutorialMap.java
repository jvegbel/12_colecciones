
package mapas;
import java.util.*;

public class TutorialMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    //HashMap: Map<K, V> m = new HashMap<>() ; 
    //HashMap no garantiza ningún orden de inserción de las entradas, aunque es
    //muy eficiente en cuanto a la velocidad de acceso a los datos. 

        Map<String, Double> map = new HashMap<>() ;

//1. INSERTAR ENTRADAS en MAPs:  V put(K clave, V valor)
    // si no había ninguna entrada previa con la misma clave, se inserta en el 
    //mapa la nueva entrada con esa clave y ese valor, y el método devuelve null. 
    //Si ya había una entrada con la misma clave, se sustituye el valor antiguo 
    //por el nuevo, sin cambiar la clave, y la funcion devuelve el valor antiguo
        map.put("Ana", 1.65);
        map.put("Marta", 1.60);
        map.put("Luis", 1.73);
        map.put("Pedro", 1.69);
    // Ocurre como en los conjuntos, se añaden elementos repetidos
        map.put("Pedro", 1.69);
    //Con los mapas, igual que con los conjuntos, disponemos también de una
    //implementacion de toString()
        System.out.println(map);
        // {Marta=1.6, Ana=1.65, Luis=1.73, Pedro=1.69}
        // Al introducir un valor del que ya existe una clave, imprimo el valor sustituido
        System.out.println(map.put("Pedro", 1.71));
        System.out.println("Se cambia el valor asociado a la clave de Pedro: "+ map);
        // {Marta=1.6, Ana=1.65, Luis=1.73, Pedro=1.71}
 
//2. ELIMINAR ENTRADAS en MAPs:  V remove(Object k):
    //V remove(Object k): elimina la entrada cuya clave es k, si existe devuelve 
    //el valor asociado con esa clave. En caso contrario, devuelve null.
        System.out.println("Elimino el par con clave \"Pedro\" y devuelve su valor asociado: " 
        + map.remove("Pedro"));
        System.out.println("Intento eliminar un para con clave  \"Juan\" y como no existe devuelve: " 
        + map.remove("Juan"));
    
//3. ELIMINAR TODAS las ENTRADAS de un MAPA: void clear():   
    //void clear(): elimina todas las entradas, dejando el mapa vacío.
        Map<String, Double> mapCopia = new HashMap<>() ;
        mapCopia.clear();
        System.out.println("Al imprimir el contenido de la copia del mapa eliminado: " + mapCopia);
    
//4. VISUALIZAR el VALOR de una ENTRADA a PARTIR de su CLAVE:  V get(Object k) 
    //V get(Object k): devuelve el valor asociado con la clave k o nulL si no hay
    //ninguna entrada con esa clave.
       System.out.println("Obtengo el valor del elemento con clave \"Ana\": " + 
       map.get("Ana"));

//5. SABER si una CLAVE está PRESENTE en in MAPA: boolean containsKey(Object k)       
    //boolean containsKey(Object k): devuelve true si hay una entrada con la clave k
        System.out.println("¿Hay un elemento con clave \"Ana\"?: " 
        +  map.containsKey("Ana"));
        System.out.println("¿Hay un elemento con clave \"Antonio\"?: " 
        +  map.containsKey("Antonio"));        

//6. SABER si una HAY alguna ENTRADA con un VALOR: boolean containsValue(Object k)   
    //boolean containsValue(Object k): devuelve "true" si hay algún elemento con
    //con el valor solicitado y "false" en caso contrario.
        System.out.println("¿Hay un elemento con valor \"1.71\"?: " 
        +  map.containsValue(1.65));
        System.out.println("¿Hay un elemento con valor \"1.90\"?: " 
        +  map.containsValue(1.90));
        
//7. COMPARACIÓN: Dos mapas se pueden comparar entre sí con el método equals(), 
    //que devuelve true si ambos tienen exactamente las mismas entradas, 
    //independientemente del orden.
    // Generamos un mapa con los mismos elementos insertados en distinto orden
        Map<String, Double> mapaNuevo = new HashMap<>() ;    
        mapaNuevo.put("Marta", 1.60);
        mapaNuevo.put("Ana", 1.65);
        mapaNuevo.put("Luis", 1.73); 
        System.out.println(map);
        System.out.println(mapaNuevo);
        System.out.println("¿Son iguales map y mapCopia?: " + 
        map.equals(mapaNuevo));    
   

    
/*******************************************************************************
 *                      VISTAS COLLECTION de los MAPAS                         *
 *******************************************************************************/
    //Map no hereda de Collection pero los mapas están íntimamente ligados a las
    //colecciones.  Se trabaja simultáneamente con ambas interfaces a través de 
    //distintas vistas con estructura de colección.
    //Por vista de un mapa entendemos una colección respaldada por el mapa original,
    //de forma que cuando accedemos a un elemento de la vista estamos accediendo a
    //la entrada original en el mapa, y los cambios que se hagan en aquella se reflejarán
    //en éste.

    //Hay tres tipos de vistas de un mapa. Vemos los casos siguiendo el ejemplo anterior
        
//1. Set<K> keySet(): Devuelve una vista, con estructura Set, de las claves
    //presentes en un mapa.
        Set<String> claves = map.keySet();
        System.out.println("Salida del mapa (se muestra entre llaves): " + map);
        System.out.println("Salida de la vista \"Set<K> keySet()\" (entre corchetes):" + claves);
    // Recuerdca que entre corchetes es una colección. Si lo imprimo como mapa 
    // los elmentos saldrán entre llaves
        System.out.println("Salida como mapa (se muestra entre llaves): " + map);
        
//2. Collection<V> values(): devuelve una vista Collection de los valores. 
    //Si alguno se encuentra más de una vez en el mapa, también aparece repetido 
    //en la colección devuelta
        Collection<Double> estaturas = map.values();
        System.out.println("Salida de los valores como vita Collection (entre corchetes):  " +estaturas);

//3. Set<Map.Entry<K, V>> entrySet(): devuelve una vista conjunto de las entradas,
    //objetos del tipo "Map.Entry", de las que se puede obtener la clave con getKey() 
    //o el valor con getValue(). "Map.Entry" es una interfaz (no una clase) implementada 
    //en los elementos del mapa y del conjunto devuelto por entrySet().
        Set<Map.Entry<String, Double>> entradas = map.entrySet ();
        System.out.println("vista conjunto de las entradas de objetos del tipo \"Map.Entry\": " + entradas);
    //Se puede usar la vista de entradas para acceder a las entradas individuales y
    //obtener la clave o el valor, o bien para cambiar este último, con los métodos de la
    //interfaz "Map.Entry".
    //
    //K getKey(): devuelve la clave de la entrada.
    //V getValue(): devuelve el valor de la entrada.
    //V setValue (V nuevoValor): asigna nuevoValor a la entrada y devuelve el valor
    //antiguo.

//4. Métodos invocados por "vista":  remove() de Iterator, remove() de Collection, removeAll()
    //o retainAll().  
    //Uno de los inconvenientes de los mapas es que no son iterables. Esto supone que,
    //además de no poder usar iteradores para recorrerlos ni eliminar entradas, tampoco
    //es posible el uso de la estructura for-each, cosa que sí podemos hacer con las
    //vistas, que son colecciones.
    //
    //Los cambios que hagamos en ellas se reflejarán en el mapa. En particular, 
    //podemos eliminar entradas a través del conjunto de claves devuelto por
    //keySet() con los métodos remove() de Iterator, remove() de Collection, removeAll()
    //o retainAll(). Estos métodos, invocados por la vista, eliminarán las entradas
    //correspondientes en el mapa. Por ejemplo, si eliminamos la clave «Marta» del
    //conjunto claves ...
        claves.remove ("Marta") ;
        System.out.println("Elimino \"Marta\" de la vista \"claves\" y se elimina en claves: " + claves);  
        System.out.println("Elimino \"Marta\" de la vista \"claves\" y se elimina en entradas: " + entradas); 
        System.out.println("Elimino \"Marta\" de la vista \"claves\" y se elimina en estaturas: " + estaturas); 
        System.out.println("Elimino \"Marta\" de la vista \"claves\" y tiene efecto en el mapa: " + map);   
    //La única forma segura de eliminar entradas durante un proceso de iteración sobre
    //cual quiera de las tres vistas es el método remove() de la interfaz Iterator. Veamos
    //un ejemplo, pero antes vamos a añadir algunas entradas a nuestro mapa:
        map.put("Lucas", 1.8);
        map.put("Marta", 1.60);
        map.put("Jorge", 1.75);
        System.out.println("Nuevos cambios introducidos en \"map\": " + map); 
    //Ahora vamos a filtrar el mapa eliminando todos aquellos alumnos con estatura
    //mayor que 1,71. Para ello iteramos sobre el conjunto de las entradas:
        entradas = map.entrySet(); /*Set de entradas */ // Ya lo habíamos delcarado antes 
        Iterator<Map.Entry<String, Double>> it; //iterador de entradas
        for (it = entradas.iterator(); it.hasNext();) {
            Map.Entry<String, Double> e = it.next();  //Doy valores a "e" que es un elemento Map.Entry
            if (e.getValue() > 1.71) {
                it.remove();
            }
        }
        System.out.println("Listado del mapa donde se eliminarán los elementos con valor > 1.71 " + map);     
    //Esto mismo podriamos haberlo hecho iterando sobre la vista de los valores.
        Collection<Double> estaturasVista = map.values();
        for (Iterator<Double> itNew = estaturasVista.iterator(); itNew.hasNext();) {
            Double v = itNew.next();
            if (v > 1.60) {
                itNew.remove();
            }
        }
        System.out.println("Listado del mapa donde se eliminarán los elementos con valor > 1.60 " + map); 
           
/*******************************************************************************
 *                           IMPLEMENTACIÓN DE MAP                             *
 *******************************************************************************/
//1. Ordenación natural por claves
    //La interfaz Map tiene otras dos implementaciones, TreeMap y LinkedHashMap.
    //TreeMap, a semejanza de TreeSet, tiene una estructura de árbol que permite una
    //inserción ordenada y una búsqueda rápida y eficiente de las entradas. Estas se
    //insertan por orden natural creciente de las claves.
    //
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Ana", 1.65);
        treeMap.put("Marta", 1.60);
        treeMap.put("Luis", 1.73);
        treeMap.put("Pedro", 1.71);
        treeMap.put("Antonio", 1.65);
        System.out.println("Listado del TreeMap ordenados por orden natural " + treeMap); 
        
//2. Ordenación por claves con un comparador         
    //Podemos hacer que el orden de un TreeMap sea distinto. Para ello le pasamos un
    //comparador al constructor como parámetro de entrada, igual que hacíamos con
    //TreeSet. En cualquier caso, el orden siempre se refiere a las claves, nunca a los
    //valores.
        Comparator<String> ordenaNombre = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Para orden inverso alfabético
            }
        };
        TreeMap<String, Double> treeMapInv = new TreeMap<>(ordenaNombre);
        treeMapInv.put("Ana", 1.65);
        treeMapInv.put("Marta", 1.60);
        treeMapInv.put("Luis", 1.73);
        treeMapInv.put("Pedro", 1.71);
        treeMapInv.put("Antonio", 1.65);
        System.out.println("Listado del TreeMap ordenados por orden inverso alfabético " + treeMapInv);
 
//3. Ordenación por valor utilizando una lista         
    // Para ordenar respecto al valor en vez de la clave aunque en Java ordena 
    //las entradas por claves y no por valores. Sin embargo, se puede hacer indirectamente
    //utilizando una lista y un comparador personalizado    
    //Cconvertimos el mapa a una lista de entradas
        List<Map.Entry<String, Double>> lista = new ArrayList<>(treeMap.entrySet());
    // Ordenamos la lista con un comparador personalizado
        lista.sort(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
                return (int) (e1.getValue()- e2.getValue()); // Para orden creciente de los valores
                
            }
        });
    // Imprimimos la lista
        System.out.println("Imprimo la lista ordenada por el valor creciente estatura con foreach: ");
        for (Map.Entry<String, Double> entrada : lista) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }  
        
        System.out.println("Imprimo la lista ordenada por el valor creciente estatura con toString(): " + lista);
        
    //Por último, la implementacion LinkedHashMap mantiene el orden en que se van
    //insertando las entradas, de forma similar a lo que ocurre con LinkedHashSet. Es
    //muy eficiente en las operaciones de inserción y eliminación de entradas y algo más
    //lento en las búsquedas.
    }
}
