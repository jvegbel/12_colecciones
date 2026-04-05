
package contenedorOld;

/**
 *
 * @author jvega
 */
public class ContenedorDoble<T,V> {
    private T objeto; //Se inicializa a null: contenedor vacío
    private V objeto2;//Se inicializa a null: contenedor vacío
    public ContenedorDoble(){
    }
    void guardar(T nuevo, V nuevo2) {
        objeto = nuevo;
        objeto2 = nuevo2;
    }

//    void guardar(T nuevo) {
//        objeto = nuevo;
//    }
//
//    void guardar(V nuevo) {
//        objeto2 = nuevo;
//    }

    
    T extraer1(){
        T resultado = objeto;
        objeto = null; // vació el contenedor
        return resultado;
    }
    
        V extraer2(){
        V resultado = objeto2;
        objeto2 = null; // vació el contenedor
        return resultado;
    }
    

}
