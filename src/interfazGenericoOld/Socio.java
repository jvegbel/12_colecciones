
package interfazGenericoOld;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jvega
 */
public class Socio implements Comparable<Socio> {
    int id; //nº identificativo del socio
    private String nombre;
    LocalDate fechaNacimiento;
    public Socio(int id, String nombre,String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        // establecemos el formato español para las fechas: 
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }
    
    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }   /* el cast (int) es porque until() devuelve un valor long. Al ser de estrechamiento 
        en teoría podría suponer una pérdida de información para númeeros muy grandes (de
        ahí un warning del compilador), pero por desgracia, las edades de las personas son
        valores muy pequeños.
        */
        
    // la implementación debe declararse public
//   public int compareTo(Object ob) {
//        return id - ((Socio) ob).id;
//    }   
    
// Con genéricos me ahorro el cast. Con el compareTo  es el orden natural (defecto al usar un sort)
   public int compareTo(Socio socio) {
        return id - socio.id;
    }   
    
    
//    @Override
//    public int compareTo(Object ob) {
//        int resultado;
//        Socio otroSocio = (Socio) ob;
//        if (id < otroSocio.id) {
//            resultado = -1; 
//        } else if (id > otroSocio.id) {
//            resultado = 1;
//        } else {
//            resultado = 0;
//        }
//        return resultado;
//    }
    
//     @Override
//       public int compareTo(Object otro) {
//           Socio otroSocio = (Socio) ob;
//           return nombre.compareTo(((Socio)otroSocio).nombre);
//       }
//       
    
//       @Override
//       public int compareTo(Object otro) {
//           return fechaNacimiento.compareTo(((Socio)otro).fechaNacimiento);
//       }
//       
       
      
    
    @Override
    public String toString() {
        return "Id: " + id + " | Nombre: " + getNombre() + " | Edad: " + edad() + "\n";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
}
