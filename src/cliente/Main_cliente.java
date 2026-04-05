
package cliente;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author jvega
 */
public class Main_cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 =  new Cliente("0000003Q", "Juan CArlos", 57);   
        Cliente cliente2 =  new Cliente("0000002Q", "Pedro", 38);   
        Cliente cliente3 =  new Cliente("0000001Q", "Juan", 33);   
        
        Cliente[] agenda = {cliente1, cliente2, cliente3};
        
        System.out.println(Arrays.toString(agenda));
        Arrays.sort(agenda);
        System.out.println("\nAgenda ordenada por DNI");
        System.out.println(Arrays.toString(agenda));
        
        Arrays.sort(agenda,  new ComparaNombres());
        System.out.println("\nAgenda ordenada por Nombres");
        System.out.println(Arrays.toString(agenda));
        
        
        Comparator<Cliente> ordenCliente = Comparator.naturalOrder();
    
        Arrays.sort(agenda,  ordenCliente);
        System.out.println("\nAgenda ordenada por orden natiral");
        System.out.println(Arrays.toString(agenda));
        
        
        
    }
    
}
