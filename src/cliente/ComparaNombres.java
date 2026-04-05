
package cliente;

import java.util.Comparator;
/**
 *
 * @author jvega
 */
public class ComparaNombres implements Comparator<Cliente>{
    public int compare(Cliente objeto1, Cliente objeto2) {
        return objeto1.nombre.compareTo(objeto2.nombre);
    }
}
