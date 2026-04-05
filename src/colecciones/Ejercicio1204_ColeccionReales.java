
/**
 * Implementar una aplicación que pida por consola números reales hasta que se 
 * introduczca 0 (el programa dejará de pedir valores y continuará). 
 * Los números positivos se irán insertando en una colección, y los negativos en 
 * otra (los números pueden repetirse menos el cero).  
 * Al terminar de leer valores, se mostrarán la colecciones por pantalla. 
 * El programa también eliminará de la colección de positivos los valores múltiplos
 * de 3, se mostrará todos los valores restantes.
 * Por último, se eliminarán todos los múltiplos de 3 de la colección con los 
 * valores positivos y se mostrará por pantalla la colección resultante.
 * También se eliminarán de la colección de negativos los valores < -10
 */
package colecciones;

import java.util.*;
public class Ejercicio1204_ColeccionReales {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Double sumPos = 0.;
        Double sumNeg = 0.;
        Collection<Double> positivos = new ArrayList<>();
        Collection<Double> negativos = new ArrayList<>();
        System.out.println("Intruducir número real ( para terminar): ");
        Double dato = new Scanner(System.in).useLocale(Locale.US).nextDouble();
        // Lectura de valores por pantalla
        while (!dato.equals(0.)) { // El programa para cuando se introduce el valor 0
            if (dato > 0) {
                positivos.add(dato);
                sumPos += dato;
            } else {
                negativos.add(dato);
                sumNeg += dato;
            }
            System.out.println("Intruducir número real (0 para terminar): ");
            dato = new Scanner(System.in).useLocale(Locale.US).nextDouble();
        }
        System.out.println("Colección con valores positivos: " + positivos);
        System.out.println("Colección con valores negativos: "+ negativos);
        System.out.println("Suma de los positivos: " + sumPos);
        System.out.println("Suma de los negativos: " + sumNeg);
        
        // Declaro un iterador dentro del for para poder ir recorriendo y 
        // haciendo acciones sobre la colección
        Iterator<Double> it = positivos.iterator();

        while (it.hasNext()) {
            Double datoDouble = it.next();
            if (datoDouble % 3 == 0) {
                it.remove();
            }
        }
        System.out.println("Colección de positivos sin múltiplos de 3: " + positivos);
                
        // Aprovecho el iterador anterior, lo reseteo y lo puedo poner dentro del 
        // for para poder ir recorriendo y haciendo acciones sobre la colección
        for (it = negativos.iterator(); it.hasNext();) {
            Double n = it.next();
             if (n < -10) {
                it.remove();
            }
        }
        System.out.println("Colección de negativos mayores que -10: " + negativos);

    }
    
}
