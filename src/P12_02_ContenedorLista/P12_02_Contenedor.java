package P12_02_ContenedorLista;

import java.util.Arrays;

import java.util.Scanner;

public class P12_02_Contenedor {

    public static void main(String[] args) {
        
         
        Contenedor<String> cString =  new Contenedor<>(new String[0]);
        cString.insertarAlFinal("Uno");
        cString.insertarAlFinal("Dos");
        cString.insertarAlFinal("Tres");
        cString.insertarAlFinal("Cuatro"); 
        System.out.println("Sin ordenar: " + cString);
        cString.ordenar();
        System.out.println("Ordenado: " + cString);
        
        Contenedor<Integer> contenedor = new Contenedor<>(new Integer[0]);
        for (int i = 0; i < 20; i++) {
            contenedor.insertarAlFinal((int) (Math.random() * 20));
        }
        System.out.println("Sin ordenar: " + contenedor);
        contenedor.ordenar();
        System.out.println("Ordenado: " + contenedor);
        Integer n = contenedor.extraerDelPrincipio();
        System.out.println("Elemento extraído: " + n);
        System.out.println("Después de extraer: " + contenedor);
        
    }

    
}
