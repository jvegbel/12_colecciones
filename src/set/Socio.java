package set;

import java.io.Serializable;


public class Socio implements Comparable<Socio>, Serializable {

    String dni;
    String nombre;
    int alta; // El formato de la fecha debe ser YYYYMMDD (Ej: 1 de marzo de 2025 -> 20250301)

    public Socio(String dni, String nombre, int alta) {
        this.dni = dni;
        this.nombre = nombre;
        this.alta = alta;
    }

        public Socio(String dni) {
        this.dni = dni;
    }
    
    
    @Override
    public int compareTo(Socio socio) {
        return dni.compareTo(socio.dni);
    }


    @Override
    public boolean equals(Object o) {
        return dni.equals(((Socio) o).dni);
    }

    @Override
    public String toString() {
        String fechaAlta =  String.valueOf(this.alta);
        return "Socio{" + "dni = " + dni + ", nombre=" + nombre
                + ", Fecha Alta = " + fechaAlta + "}\n";
    } 
}
