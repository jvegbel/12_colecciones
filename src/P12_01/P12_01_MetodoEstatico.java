
package P12_01;
 import java.util.Arrays;
/**
 *
 * @author jvega
 */
public class P12_01_MetodoEstatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arrayAutos = {"rueda", "frenos", "volante"};//o bien new String[0]
        System.out.println(Arrays.toString(arrayAutos));
        arrayAutos = append("coche", arrayAutos);
        arrayAutos = append("moto", arrayAutos);
        System.out.println(Arrays.toString(arrayAutos));
        String[] arrayAves = {"mirlo", "paloma", "gaviota"};
        
        String[] arrayStringSuma = concatenar(arrayAutos, arrayAves);
        System.out.println("Tabla resultante Strings: " + Arrays.deepToString(arrayStringSuma));
        
        
        
        Integer datos[] = {};
        datos = append(10, datos);
        datos = append(20, datos);
        System.out.println(Arrays.toString(datos));
        
        
        Integer[] tabla1 = {1, 2, 3, 4, 5, 6};
        Integer[] tabla2 = {7, 8, 9, 10};
        
        // Método estático que devuelve dos tablas en una: 
        // Tabla resultante: [1,2,3,4,5,6,7,8,9,10]
        Integer[] tablaResultante = concatenar(tabla1, tabla2);
        System.out.println("Tabla resultante: " + Arrays.deepToString(tablaResultante));
        
       // System.out.println(Arrays.deepToString(concatenar2(tabla1, tabla2)));
        
    }

    static <E> E[] append(E elem, E[] tabla) {
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length - 1] = elem;
        return nuevaTabla;
    }
    
    static <E> E[] concatenar2(E[] tabla1, E[] tabla2) {
        E[] nuevaTabla = tabla1;
      //For tradicional          
        for (int i = 0; i <tabla2.length; i++) {
            nuevaTabla = append(tabla2[i], nuevaTabla)  ;
        }
//      Foreach         
//         for (E elem : tabla2) {
//            nuevaTabla = append(elem, nuevaTabla)  ;
//        }
         
        return nuevaTabla;
    }
    
    
    static <E> E[] concatenar(E[] t1, E[] t2) {
        E[] nuevaTabla = Arrays.copyOf(t1, t1.length + t2.length);
        System.arraycopy(t2, 0, nuevaTabla, t1.length, t2.length);
        return nuevaTabla;
    }
    
    
}
