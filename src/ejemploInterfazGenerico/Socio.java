package ejemploInterfazGenerico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * La clase implementa Comparable<Socio> para definir su "orden natural".
 * @author jvega
 */
public class Socio implements Comparable<Socio> {
    
    private int id; // nº identificativo del socio
    private String nombre; //
    private LocalDate fechaNacimiento; //

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        // Establecemos el formato español para las fechas: 
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f); //
    }
    
    // Método para calcular la edad actual
    public int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS); //
    } 
    
    /**
     * Define el ORDEN NATURAL del objeto.
     * Al usar Comparable<Socio>, nos ahorramos hacer casting desde Object.
     */
    @Override
    public int compareTo(Socio otroSocio) {
        // Ordenamos por id de menor a mayor
        return Integer.compare(this.id, otroSocio.id); 
    }   
    
    public String getNombre() {
        return nombre; //
    }
    
    @Override
    public String toString() {
        return "Id: " + id + " | Nombre: " + getNombre() + " | Edad: " + edad() + "\n"; //
    }
}