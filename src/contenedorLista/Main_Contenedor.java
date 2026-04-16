/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contenedorLista;

/**
 *
 * @author jvegbel <jvegbel@canariaseducacion.es>
 */
public class Main_Contenedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor<String> cString = new Contenedor<>(new String[0]);
        cString.insertarAlPrincio("Uno");
        cString.insertarAlPrincio("Dos");
        cString.insertarAlPrincio("Tres");
        for (String texto : cString.getObjetos() ) {
            System.out.println(texto + " ");
        }



        
    }
    
}
