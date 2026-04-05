
package ejempoInterfazGenericoOld;

import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author jvega
 */
public class Main_comparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio luisito = new Socio(2, "Luisito", "11-07-2002");
        Socio luisa = new Socio(5, "Luisa", "21-11-2001");
        Socio elena = new Socio(15, "Elena", "21-11-2010");
//        int resultado = luisito.compareTo(luisa);
//         System.out.print("resultado = " + resultado + ": ");
//        if (resultado >= 1) {
//            System.out.println( "luisa es un socio más antiguo que luisito.\n" );
//        } else if (resultado <= -1) {
//            System.out.println("luisito es un socio más antiguo que luisa.\n" );
//        } else {
//            System.out.println("Error luisito y luisa tienen el mismo nº de socio.\n" );
//        }

        
//        Socio[] arraySocios = new Socio[] {
//           new Socio(3, "Luisito", "11-07-2002"),
//           new Socio(5, "Luisa", "21-11-2001"),
//           new Socio(200, "Elena", "21-11-2010")
//        };
        Socio[] arraySocios = {luisito, luisa, elena, new Socio(1, "Pedro", "21-11-2015")};
        System.out.println(Arrays.deepToString(arraySocios));
        

        
        Arrays.sort(arraySocios);
        System.out.println(Arrays.deepToString(arraySocios));
        
        Comparator cEdad = new ComparaEdades();
        
        Arrays.sort(arraySocios, cEdad);
        System.out.println(Arrays.deepToString(arraySocios));
        
        
        // Comparador por nombres de socio
        Comparator cNombres = new ComparaNombres();
         Arrays.sort(arraySocios, cNombres);
        System.out.println(Arrays.deepToString(arraySocios));
        
        
        
        
        
    }
    
    
}
