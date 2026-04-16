/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaSimulada;

import java.util.Arrays;

/**
 *
 * @author jvegbel <jvegbel@canariaseducacion.es>
 */

// Aunque Comparable sea una interfaz si utilizo un genérico pongo extends en vez de implements
public class Contenedor<T extends Comparable<T>> implements Pila<T>{ 
     private T[] arrayObjetos;

    public Contenedor(T[] arrayObejetos) {
        this.arrayObjetos = arrayObejetos;
    }
    
    
     
     

    @Override
    public void push(T nuevo) {
        this.arrayObjetos = Arrays.copyOf(arrayObjetos, arrayObjetos.length+1);
        arrayObjetos[arrayObjetos.length-1] = nuevo;
    }

    @Override
    public T pop() {
        T aux = arrayObjetos[arrayObjetos.length-1];
        this.arrayObjetos = Arrays.copyOf(arrayObjetos, arrayObjetos.length-1);
        return aux;
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0 ; i< arrayObjetos.length; i++ ) {
            resultado += arrayObjetos[i] + " ";
        }
        return resultado;
    }
    
    
    
    
}
