/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import java.util.Arrays;

/**
 *
 * @author jvega
 */
public class Cliente implements Comparable<Cliente> {
    String dni;
    String nombre;
    int edad;
    
    public  Cliente(String dni, String nombre, int edad) { 
      this.dni = dni; 
      this.nombre = nombre; 
      this.edad =  edad; 
   }
   
    @Override
   public int compareTo(Cliente objeto) {
       return dni.compareTo(objeto.dni);
   } 
    
      @Override
   public String toString() {
      return ("DNI: " + dni + "; Nombre: " + nombre + "; Peso: " + edad + "\n"); 
   }
   
 
    
}
