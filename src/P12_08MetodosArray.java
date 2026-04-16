
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;



/**
 *
 * @author jvegbel <jvegbel@canariaseducacion.es>
 */
public class P12_08MetodosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int  i=0; i<20; i++) {
            lista.add((int) (Math.random()*10+1));
        }        
        System.out.println(lista);
        // Conversión de Colleccion a Array
        // Convierto una Coleccion en un array
        Integer[] arrayEnteros = lista.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrayEnteros));
        // Ordeno el array
        Arrays.sort(arrayEnteros);
        System.out.println(Arrays.toString(arrayEnteros));
        Collection<Integer> listaCreciente = new ArrayList<>();
        // CONVIERTO UN ARRAY EN UNA COLLECCION
        listaCreciente.addAll(Arrays.asList(arrayEnteros));
        System.out.println(listaCreciente);

        Comparator<Integer> ordenCreciente = new Comparator<>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1 - num2; // cambiar a 'num1 - num2' para orden ascendente
            }
        };
        lista.sort(ordenCreciente);
        System.out.println(lista);
   
          
           
         
        
        
        
    }
    
}
