package ejemploComodines;

/**
 * Clase principal para demostrar el uso de comodines (wildcards) en genéricos.
 * * @author jvega
 */
public class Main_comodines {

    public static void main(String[] args) {
        
        System.out.println("--- 1. LÍMITE SUPERIOR (? extends Number) ---");
        // "? extends Number" significa: "Cualquier tipo que sea Number o una subclase de Number (Integer, Double, etc.)"
        
        Contenedor<? extends Number> cInt = new Contenedor<Integer>(123);
        Contenedor<? extends Number> cDouble = new Contenedor<Double>(456.789);
        
        // ERROR EXPLICADO 1: 
        // Contenedor<? extends Number> cString = new Contenedor<String>("123");  
        // Explicación: String no hereda de Number, por lo que no cumple el límite superior impuesto.

        System.out.println("Contenido de cInt: " + cInt.getContenido());
        System.out.println("Contenido de cDouble: " + cDouble.getContenido());
        
        // LECTURA VS ESCRITURA con "? extends":
        Number num = cInt.getContenido(); // CORRECTO: Sabemos seguro que devolverá un Number o un hijo de Number.
        // cInt.setContenido(124);        // ERROR: El compilador no sabe si el contenedor es de Integer, Double, Float... 
                                          // Para evitar meter un Double en un Contenedor<Integer>, prohíbe la escritura.


        System.out.println("\n--- 2. LÍMITE INFERIOR (? super Number) ---");
        // "? super Number" significa: "Cualquier tipo que sea Number o una SUPERCLASE de Number (como Object)"
        
        Contenedor<? super Number> cObject = new Contenedor<Object>(123);
        Contenedor<? super Number> cNumber = new Contenedor<Number>(45.5);
        
        // ERROR EXPLICADO 2:
        // Contenedor<? super Number> cIntSuper = new Contenedor<Integer>(123); 
        // Explicación: Integer es una SUBCLASE de Number, no una superclase. El comodín exige que sea Number o superior (Object).

        System.out.println("Contenido de cObject original: " + cObject.getContenido());
        
        // LECTURA VS ESCRITURA con "? super":
        // CORRECTO: Podemos escribir (modificar) de forma segura porque sabemos que el contenedor 
        // admite al menos Number (o algo más genérico como Object).
        cObject.setContenido(999); 
        cObject.setContenido(88.88); // Double es un Number, así que es válido.
        System.out.println("Contenido de cObject tras modificarlo: " + cObject.getContenido());
        
        // Object leido = cObject.getContenido(); // AL LEER: Solo podemos garantizar que devuelve un Object.
    }
}