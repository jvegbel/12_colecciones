package ejemploContenedor;

/**
 * Clase genérica básica con un solo parámetro de tipo (T).
 * Actúa como una caja física: metes algo y, cuando lo sacas, la caja queda vacía.
 * @author jvega
 */
public class Contenedor<T> {
    
    // El tipo T se sustituirá por el tipo real (Integer, String, etc.) al instanciar la clase.
    private T objeto; // Se inicializa por defecto a null: contenedor vacío.

    public Contenedor() {
    }

    // Método para guardar un elemento en el contenedor
    public void guardar(T nuevo) {
        objeto = nuevo; //
    }

    // Extrae el elemento y vacía el contenedor
    public T extraer() {
        T resultado = objeto; // Guardamos el objeto en una variable temporal
        objeto = null;        // Vaciamos el contenedor (importante para evitar duplicados o fugas de memoria)
        return resultado;     // Devolvemos lo que había en la caja
    }
}