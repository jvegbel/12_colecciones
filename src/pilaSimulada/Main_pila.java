/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaSimulada;

/**
 *
 * @author jvegbel <jvegbel@canariaseducacion.es>
 */
public class Main_pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arrayEnteros = {1,2,3,4};
        //Pila<Integer> pila = new Contenedor<> (new Integer[0]);
        Pila<Integer> pila = new Contenedor<> (arrayEnteros);
        
        System.out.println(pila);
    }
    
}
