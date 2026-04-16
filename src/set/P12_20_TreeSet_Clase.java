
package set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author jvegbel <jvegbel@canariaseducacion.es>
 */
public class P12_20_TreeSet_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Cliente> conjuntoClientes = new TreeSet<>();
        conjuntoClientes.add(new Cliente("111111111", "Marta", "12/02/2000"));
        conjuntoClientes.add(new Cliente("555555555", "Luisa", "12/02/1999"));
        boolean isPresent = conjuntoClientes.add(new Cliente("333333333", "Paco", "12/02/2002"));
        if (!isPresent) {
            System.out.println("El Cliente ya estaba en el sistema");
        }
        if (!conjuntoClientes.add(new Cliente("333333333", "Paca", "12/02/2010"))) {
            System.out.println("El Cliente ya estaba en el sistema");
        }
        
        System.out.println(conjuntoClientes);
        
        
        Comparator<Cliente> comparaEdades = new Comparator<Cliente>() {
            public int compare(Cliente c1, Cliente c2) {
                return Integer.compare(c1.edad(), c2.edad());
            }
        };
        
        TreeSet<Cliente> clientesPorEdad = new TreeSet<>(comparaEdades);
        clientesPorEdad.addAll(conjuntoClientes);
        
        System.out.println("Clientes ordenados por edad/n" + clientesPorEdad);
        
        Comparator<Cliente> comparaNombres = new Comparator<Cliente>() {
            public int compare(Cliente c1, Cliente c2) {
                return c1.getNombre().compareTo(c2.getNombre());
            }
        };
        
        TreeSet<Cliente> clientesPorNombre = new TreeSet<>(comparaNombres);
        clientesPorNombre.addAll(conjuntoClientes);
        System.out.println("Clientes ordenados por nombre/n" + clientesPorNombre);
                
         
    }
    
}
