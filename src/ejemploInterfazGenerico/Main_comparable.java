package ejemploInterfazGenerico;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jvega
 */
public class Main_comparable {

    public static void main(String[] args) {
        // Creamos algunos socios de prueba
        Socio luisito = new Socio(2, "Luisito", "11-07-2002"); //
        Socio luisa = new Socio(5, "Luisa", "21-11-2001"); //
        Socio elena = new Socio(15, "Elena", "21-11-2010"); //
        Socio pedro = new Socio(1, "Pedro", "21-11-2015"); //
        
        // El array original tal como se insertan los datos
        Socio[] arraySocios = {luisito, luisa, elena, pedro}; //
        
        System.out.println("--- ARRAY ORIGINAL ---");
        System.out.println(Arrays.deepToString(arraySocios)); //

        
        // 1. ORDEN NATURAL (Comparable)
        // Usa internamente el método compareTo() de la clase Socio (orden por ID).
        Arrays.sort(arraySocios); //
        System.out.println("--- ORDEN NATURAL (Por ID creciente) ---");
        System.out.println(Arrays.deepToString(arraySocios));

        
        // 2. COMPARADOR POR EDAD (Comparator moderno)
        // Usamos referencias a métodos (Socio::edad) en lugar de crear una clase extra.
        Comparator<Socio> compEdad = Comparator.comparing(Socio::edad);
        Arrays.sort(arraySocios, compEdad); //
        System.out.println("--- ORDEN POR EDAD (Creciente) ---");
        System.out.println(Arrays.deepToString(arraySocios));

        
        // 3. COMPARADOR POR NOMBRE (Comparator moderno)
        // Extrae el String del nombre y usa su propio compareTo internamente.
        Comparator<Socio> compNombre = Comparator.comparing(Socio::getNombre);
        Arrays.sort(arraySocios, compNombre); //
        System.out.println("--- ORDEN POR NOMBRE (Alfabético) ---");
        System.out.println(Arrays.deepToString(arraySocios)); //


        // 4. COMPARADOR COMPUESTO (Múltiples criterios y orden inverso)
        // Primero ordenamos por Edad de forma DESCENDENTE (reversed)
        // Si hay empate en la edad, desempatamos por Nombre ALFABÉTICAMENTE (thenComparing)
        Comparator<Socio> compComplejo = Comparator.comparing(Socio::edad).reversed()
                                                   .thenComparing(Socio::getNombre);
        
        Arrays.sort(arraySocios, compComplejo);
        System.out.println("--- ORDEN COMPUESTO (Edad descendente, luego Nombre) ---");
        System.out.println(Arrays.deepToString(arraySocios));
    }
}