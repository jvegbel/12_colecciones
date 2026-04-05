package mapas;
//import java.io.*;
import java.util.*;

public class ResueltaP1215A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Map<String, Integer> existencias = new TreeMap<>();
        
        int opcion;
        do {
            System.out.println("1.Alta producto");
            System.out.println("2.Baja producto");
            System.out.println("3.Cambio stock de producto");
            System.out.println("4.Listar existencias");
            System.out.println("5.Ordenar por número de productos en stock");
            System.out.println("6.Salir");
            System.out.print("\nIntroducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Código producto: ");
                    String codigo = new Scanner(System.in).next();
                    if (!existencias.containsKey(codigo)) {
                        existencias.put(codigo, 0);
                    } else {
                        System.out.println("El producto ya existe");
                    }
                }
                case 2 -> {
                    System.out.print("Código producto: ");
                    String codigo = new Scanner(System.in).next();
                    existencias.remove(codigo);
                }
                case 3 -> {
                    System.out.print("Código producto: ");
                    String codigo = new Scanner(System.in).next();
                    System.out.print("Nuevo stock: ");
                    int stock = new Scanner(System.in).nextInt();
                    existencias.put(codigo, stock);
                }
                case 4 -> {
                    System.out.println(existencias);
                }
                case 5 -> {
                    //Cconvertimos el mapa a una lista de entradas
                    List<Map.Entry<String, Integer>> lista = new ArrayList<>(existencias.entrySet());
                    // Ordenamos la lista con un comparador personalizado3                   
//                    lista.sort(new Comparator<Map.Entry<String, Integer>>() {
//                        @Override
//                        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
//                            return e1.getValue() - e2.getValue(); // Para orden creciente de los valores
//                        }
//                    });
                     Comparator<Map.Entry<String, Integer>> comparaValor = new Comparator<>() {
                     @Override
                        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                            return e1.getValue() - e2.getValue(); // Para orden creciente de los valores
                        }
                     };
                    lista.sort(comparaValor);
                    System.out.println(lista);
                }

            }
        } while (opcion != 6);
    }
    
}
