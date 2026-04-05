package set;


import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P12_22_LinkedKashSet {

    public static void main(String[] args) {
        //para preservar el orden de inserción:
        Set<String> palabras = new LinkedHashSet<>();
        System.out.print("Introducir palabra ('fin' para terminar): ");
        String palabra = new Scanner(System.in).next();
        while (!palabra.equals("fin")) {
            palabras.add(palabra);
            System.out.print("Introducir palabra ('fin' para terminar): ");
            palabra = new Scanner(System.in).next();
        }
        System.out.println(palabras);
        
        
        // El ejercicio P12.23 lo puedo hacer convirtiendo un linkedHAshSet en 
        // un TreeSet con el comparador que quiera.
        
        // operador Lambda
        //Comparator<String> comparaNombres = (String s1, String s2) -> s1.compareTo(s2);   
        //TreeSet<String> treeSetAlfabetico = new TreeSet<>(comparaNombres);
        
        // No hace falta comparador, va a ordenar por el orde natural de la clase String (orden alfabético)
        TreeSet<String> treeSetAlfabetico = new TreeSet<>();
        
        treeSetAlfabetico.addAll(palabras);     
        System.out.println(treeSetAlfabetico);
    }

}
