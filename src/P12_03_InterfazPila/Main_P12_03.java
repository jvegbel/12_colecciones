package P12_03_InterfazPila;

import java.util.Scanner;

public class Main_P12_03 {

    public static void main(String[] args) {
        Pila<Integer> p = new Contenedor<>(new Integer[0]);
        
        Contenedor<String>  cString  = new Contenedor<>(new String[0]);
        cString.apilar("Uno");
        cString.apilar("Dos");
        cString.apilar("Tres");
        cString.apilar("Cuatro"); 
        cString.getObjeto();
        System.out.println("Sin ordenar: " + cString);
        cString.ordenar();
        System.out.println("Ordenado: " + cString);
       
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir entero positivo (-1 para terminar): ");
        Integer n = sc.nextInt();
        while (n != -1) {
            p.apilar(n);
            System.out.print("Introducir entero positivo (-1 para terminar): ");
            n = sc.nextInt();
        }
        
//         System.out.print(p);
//         n = p.desapilar();
//         System.out.print(p);
         
        System.out.print("Desapilamos: ");
        n = p.desapilar();
        while (n != null) {
            System.out.print(n + " ");
            n = p.desapilar();
        }
        System.out.println("");
    }
       //System.out.print(p);

}
