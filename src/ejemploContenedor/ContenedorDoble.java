package ejemploContenedor;

/**
 * Clase genérica que admite dos parámetros de tipo (T y V).
 * Permite almacenar dos objetos independientes de distinto (o igual) tipo.
 * @author jvega
 */
public class ContenedorDoble<T, V> { //
    
    private T objeto;  // Hueco 1, de tipo T
    private V objeto2; // Hueco 2, de tipo V

    public ContenedorDoble() {
    }

    // Guardamos ambos objetos al mismo tiempo
    public void guardar(T nuevo, V nuevo2) {
        objeto = nuevo; //
        objeto2 = nuevo2; //
    }
    
    // Extrae y vacía el primer hueco
    public T extraer1() { //
        T resultado = objeto; //
        objeto = null; // Vacía el contenedor 1
        return resultado; //
    }
    
    // Extrae y vacía el segundo hueco
    public V extraer2() { //
        V resultado = objeto2; //
        objeto2 = null; // Vacía el contenedor 2
        return resultado; //
    }
}
