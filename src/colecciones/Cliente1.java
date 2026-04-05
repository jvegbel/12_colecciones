package colecciones;

import set.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Cliente1 implements Comparable<Cliente1> {

    String dni;
    String nombre;
    LocalDate fechaNacimiento;

    Cliente1(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFechas
                = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object ob) {
        return dni.equals(((Cliente1) ob).dni);
    }

    @Override
    public int compareTo(Cliente1 otro) {
        return dni.compareTo(otro.dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }
}
