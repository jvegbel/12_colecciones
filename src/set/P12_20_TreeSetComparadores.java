package set;


import java.util.*;

public class P12_20_TreeSetComparadores {

    public static void main(String[] args) {
        TreeSet<Cliente> conjuntoClientes = new TreeSet<>();
        
        conjuntoClientes.add(new Cliente("111", "Marta", "12/02/2000"));
        conjuntoClientes.add(new Cliente("115", "Jorge", "16/03/1999"));
        conjuntoClientes.add(new Cliente("112", "Carlos", "01/10/2002"));
        System.out.println(conjuntoClientes);
        
        //Creamos una clase anónima para el comparador de edades:
        Comparator<Cliente> comparaEdades = new Comparator<Cliente>() {
            public int compare(Cliente c1, Cliente c2) {
                return Integer.compare(c1.edad(), c2.edad());
            }
        };       
        
        // Creo un TreSet y le pongo el criterio comparador por el que quiero que se ordene
        // cada vez que añada un conjunto de clientes, lo reordenará por el critero quehaya seleccionado
        // independientemente del criterio que tuviera el conjunto que añado.
        TreeSet<Cliente> clientesPorEdad = new TreeSet<>(comparaEdades);
        clientesPorEdad.addAll(conjuntoClientes);
        clientesPorEdad.add(new Cliente("121", "Martita", "12/02/2025"));

        System.out.println(clientesPorEdad);
          
       //Creamos una clase anónima para el comparador de nombres:
       Comparator<Cliente> comparaNombres = new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                return c1.nombre.compareTo(c2.nombre);
            }
        };        
        
       // Se puede resumir todo con una expresión Lambda
       // Comparator<Cliente> comparaNombres = (Cliente c1, Cliente c2) -> c1.nombre.compareTo(c2.nombre);        
       
        //Idem para el comparador de nombres:
        TreeSet<Cliente> clientesPorNombre = new TreeSet<>(comparaNombres);
        
        
        clientesPorNombre.addAll(clientesPorEdad);
        clientesPorNombre.add(new Cliente("151", "Aitor", "12/02/2020"));
        System.out.println(clientesPorNombre);

    }
}
