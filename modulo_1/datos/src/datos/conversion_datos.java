/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Usuario
 */
public class conversion_datos {
    
    public static void main (String[] args) {
    
    int numerosA[] ={3,9,2,4,6};
    int numerosB[] = numerosA;
    
    // conversion String a int
    
    String edadTexto = "19";
    int edadNumero = Integer.parseInt(edadTexto);
   
    System.out.println(edadNumero);
    
    // String a double
    String alturaDouble = "182";
    double doubleAltura = Double.parseDouble(alturaDouble);
    
    // double a int
    
    double numeroDouble = 9.2;
    int numeroEntero = (int) numeroDouble;
    
    // int a double
    int numeroEntero2 = 9;
    double numeroDouble2 = (double) numeroEntero;
    
    
    
    
    
    }
}
