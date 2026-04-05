package set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class P12_23_ConjuntoOrdenAflfabetico {

    public static void main(String[] args) {
          //el orden alfabético es el natural de la clase String:
        Set<String> palabras = new TreeSet<>();
        System.out.print("Introducir palabra ('fin' para terminar): ");
        String palabra = new Scanner(System.in).next();
        while (!palabra.equals("fin")) {
            palabras.add(palabra);
            System.out.print("Introducir palabra ('fin' para terminar): ");
            palabra = new Scanner(System.in).next();
        }
        System.out.println(palabras);
    }

}
