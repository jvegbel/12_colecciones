package ejemploComodines;

/**
 * Clase genérica que almacena un elemento de tipo T.
 * * @author jvega
 * @param <T> El tipo de dato que almacenará el contenedor.
 */
public class Contenedor<T> {
   
   private T contenido;
 
   public Contenedor(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }
    
    // Método añadido: fundamental para explicar el comportamiento de los comodines
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
}