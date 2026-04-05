package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resuelta1227A {

    public static void main(String[] args) {
        List<Character> lista = leeCadena();
        System.out.println(lista);
    }
    
    static List<Character> leeCadena(){
        System.out.print("Introducir cadena: ");
        String cadena=new Scanner(System.in).nextLine();
        List<Character> lista=new ArrayList<>();
        for (int i = 0; i < cadena.length(); i++) {
            lista.add(cadena.charAt(i));
        }
        return lista;
    }
    
}
