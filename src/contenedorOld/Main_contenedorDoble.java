
package contenedorOld;
import java.util.Arrays;
/**
 *
 * @author jvega
 */
public class Main_contenedorDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor<Integer> contenedorEnteros  = new Contenedor<>(); //contenedor de enteros
        
        contenedorEnteros.guardar(17);
        System.out.println("No tengo sobrescrito el método toString(): " + contenedorEnteros); 
        // No tengo sobrescrito el método tiString()
        
        int auxint =  contenedorEnteros.extraer();
        System.out.println("Imprimo auxint: " + auxint); 
        
        Contenedor<String> contenedorString  = new Contenedor<>(); //contenedor de texto
        contenedorString.guardar("Prueba texto de Contenedor");
        System.out.println("No tengo sobrescrito el método toString(): " + contenedorString); 
        // No tengo sobrescrito el método tiString()
       
        String auxstring =  contenedorString.extraer();
        System.out.println("Imprimo auxstring: " + auxstring);
       
        Contenedor<Integer []> contenedorArrayEnteros = new Contenedor<>();
        
        Integer[] lista = {1,2,3,4,5,6,7} ;
        
        contenedorArrayEnteros.guardar(lista);
        
        
        Integer[] objetoDevuelto = contenedorArrayEnteros.extraer();
        System.out.println(Arrays.toString(objetoDevuelto));
        
        
        
        ContenedorDoble<String[], Double[]> contenedorDoble = new ContenedorDoble<>();
        Double[] arrayDouble = {1.,2.,3.,4.};
        String[] arrayString = { "uno", "dos", "tres", "cuatro"};
        
        contenedorDoble.guardar(arrayString, arrayDouble);
        
        
        String [] arrayStringDevuelto = contenedorDoble.extraer1();
        System.out.println(Arrays.toString(arrayStringDevuelto));
        
        String [] arrayStringDevuelto2 = contenedorDoble.extraer1();
        System.out.println(Arrays.toString(arrayStringDevuelto2));
       
//        String texto = "prueba Contenedor";
//        
//        c2.guardar(valor, texto);
//        c2.guardar(valor2, texto);
//        Double[] n = c2.extraer1();
//        
//        System.out.println(Arrays.toString(n));
//        
//        String s = c2.extraer2();
//        
//        System.out.println(s);
    }
    
}
