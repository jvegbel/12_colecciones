
package contenedorLista;

import java.util.Arrays;

/**
 *
 * @author jvegbel <jvegbel@canariaseducacion.es>
 */
public class Contenedor <T> {
    private T[] objetos;
    
    
    public Contenedor( ) {
    
    }

    public Contenedor (T[] objetos) {
        this.objetos = objetos;
    }
    
    void insertarAlPrincio(T nuevo) {
        //T[] auxArray = new T[objetos.length];
        objetos = Arrays.copyOf(getObjetos(), getObjetos().length+1);
          for (int i = getObjetos().length-1; i > 0; i-- ) {
              objetos[i] = getObjetos()[i-1];
          }
          objetos[0] = nuevo;   
    }

    /**
     * @return the objetos
     */
    public T[] getObjetos() {
        return objetos;
    }
    
    
}

