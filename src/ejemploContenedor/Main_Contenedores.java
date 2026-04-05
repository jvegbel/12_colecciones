package ejemploContenedor;

import java.util.Arrays;

/**
 * @author jvega
 */
public class Main_Contenedores
{

    public static void main(String[] args) {
        
        System.out.println("--- 1. CONTENEDOR SIMPLE (Integer y String) ---");
        
        // Contenedor de enteros
        Contenedor<Integer> contenedorEnteros = new Contenedor<>(); //
        contenedorEnteros.guardar(17); //
        
        // Al imprimir el objeto directamente, como no está sobrescrito el método toString(), 
        // mostrará la referencia de memoria (ej. contenedor.Contenedor@2f92e0f4)
        System.out.println("Contenedor (sin toString): " + contenedorEnteros); //
        
        int auxint = contenedorEnteros.extraer(); //
        System.out.println("Imprimo el entero extraído: " + auxint); //
        
        // Contenedor de texto
        Contenedor<String> contenedorString = new Contenedor<>(); //
        contenedorString.guardar("Prueba texto de Contenedor"); //
        String auxstring = contenedorString.extraer(); //
        System.out.println("Imprimo el string extraído: " + auxstring); //
       

        System.out.println("\n--- 2. CONTENEDOR DE ARRAYS (Integer[]) ---");
        
        // Los genéricos pueden envolver a otros objetos complejos, como un array de Integers.
        Contenedor<Integer[]> contenedorArrayEnteros = new Contenedor<>(); //
        Integer[] lista = {1, 2, 3, 4, 5, 6, 7}; //
        
        contenedorArrayEnteros.guardar(lista); //
        
        Integer[] objetoDevuelto = contenedorArrayEnteros.extraer(); //
        // Usamos Arrays.toString() porque imprimir un array directamente muestra su referencia de memoria
        System.out.println("Array extraído: " + Arrays.toString(objetoDevuelto)); //
        
        
        System.out.println("\n--- 3. CONTENEDOR DOBLE (Múltiples tipos) ---");
        
        // T será un String[] y V será un Double[]
        ContenedorDoble<String[], Double[]> contenedorDoble = new ContenedorDoble<>(); //
        
        Double[] arrayDouble = {1.0, 2.0, 3.0, 4.0}; //
        String[] arrayString = {"uno", "dos", "tres", "cuatro"}; //
        
        // Guardamos ambos arrays
        contenedorDoble.guardar(arrayString, arrayDouble); //
        
        // Primera extracción del objeto T (El array de Strings)
        String[] arrayStringDevuelto = contenedorDoble.extraer1(); //
        System.out.println("Primera extracción (T): " + Arrays.toString(arrayStringDevuelto)); //
        
        // Segunda extracción del MISMO objeto T
        // Como el método extraer() vacía el contenedor poniéndolo a null, esto devolverá null.
        String[] arrayStringDevuelto2 = contenedorDoble.extraer1(); //
        System.out.println("Intento sacar de nuevo (T) de la caja vacía: " + Arrays.toString(arrayStringDevuelto2)); //
    }
}