/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jvega
 */
public class Main_Frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo Frutas
    
    ArrayList<String> frutas = new ArrayList<>();
    frutas.add("Fresa");
    frutas.add("Pera");
    frutas.add("Kiwi");
    frutas.add("Melón");

    Iterator<String> it = frutas.iterator();

    while (it.hasNext()) {
        String fruta = it.next();
        System.out.println(fruta);
    }
        
    // Elimino las frutas con 5 letras
    it = frutas.iterator(); // Reiniciar
    while (it.hasNext()) {
        String fruta = it.next();
        if (fruta.length() == 5) {
            it.remove();
        }
    }

    System.out.println("\n Listado Iterador quitando frutas don 5 letras");
    it = frutas.iterator(); // Reiniciar
    while (it.hasNext()) {
       String fruta = it.next();
        System.out.println(fruta);
    }

    System.out.println("\n Listado Foreach");
    //Para listar más fácil un foreach
     for (String f : frutas) {
        System.out.println(f);
    }
    }
    
}
