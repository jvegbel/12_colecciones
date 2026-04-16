
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author jvegbel <jvegbel@canariaseducacion.es>
 */
public class Main_Frutas_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Ejemplo Frutas

        ArrayList<String> frutas = new ArrayList<>();
        // add Métodos básicos
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Kiwi");
//
//        System.out.println(frutas);
//
//        // boolean remove (Object ob)
//        //boolean respuesta = frutas.remove("Fresa");
//        System.out.println(frutas.remove("Fresa"));
//        System.out.println(frutas);
//        System.out.println(frutas.remove("Platano"));
//        
//        
//        // void clear()
//        
//        frutas.clear();
//        System.out.println(frutas);
//        
//        // boolean isEmpty()
//        
//        System.out.println(frutas.isEmpty());
//        frutas.add("Fresa");
//        System.out.println(frutas.isEmpty());
//        
//        
//        // boolean contains (Object objeto)
//        System.out.println(frutas.contains("Fresa"));
//        System.out.println(frutas.contains("Pera"));
//        frutas.add("Platano");
//         
//        // int size() 
//        System.out.println(frutas.size());
//        
        
        //METODOS GLOBALES
         ArrayList<String> frutasExoticas = new ArrayList<>();
         frutasExoticas.add("Mango");
         frutasExoticas.add("Piña");
         //  frutasExoticas.add("Maracuya");
         
         frutas.add("Mango");
         frutas.add("Piña");
         
         System.out.println(frutas);
         
         System.out.println(frutasExoticas);
         
         
         // boolean containsAll( Collection<?> c)
         
         System.out.println(frutas.containsAll(frutasExoticas));
         
         // boolean addAll (Collection<? extends E> c)
          ArrayList<String> frutasSosas = new ArrayList<>();
          frutasSosas.add("Lichi");
          frutasSosas.add("Pitaya");
          
          
          frutas.addAll(frutasSosas);
          System.out.println(frutas);
          frutas.addAll(frutasExoticas);
          System.out.println(frutas);
          
          
    }

}
