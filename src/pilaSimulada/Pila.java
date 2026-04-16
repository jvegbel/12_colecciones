
package pilaSimulada;

/**
 *
 * @author jvegbel <jvegbel@canariaseducacion.es>
 */
public interface Pila<T> {
   void push (T nuevo);
   T pop();
   T peek();
    
}
