/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteracion__vectores_matrices;

/** 
 * 
 * @author Usuario
 */
public class ciclo_for {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("numero " + i);
            // int i = 0; valor de inicio
            // i < 10; condicional y valor de finalizacion
            // i++ incremento
            // < menor que
            // > mayor que

        }
        // creacion de valor de inicio fuera del ciclo
        int x = 10;
        for(x = 10; x > 2; x--){
            System.out.println("x = " + x);
        }
        
        // incremento o decremento fuera del ciclo
        for(int y = 0; y < 5;){
            y++;
            System.out.println("y = " + y);
        }
        
        //sentencias adicionales dentro de la declaracion del ciclo
        // se pueden omitir las llaves
        for(int v = 0; v < 10; System.out.println("v = "+ v),v++);
        
        //ejemplo desarrollar un programa que muestre los números pares entre 0 y 20 de forma ascendente.
        for(int n = 0; n <= 20; n+=2){
            System.out.println(n + " ");
        }
        
        // ejemplo Desarrollar un programa que permita contar cuántos números entre 1 y 1000 son múltiplos de 7, mostrar el resultado final.
         int contador = 0;
        for(int m = 1; m <= 1000; m++){
            
            if(m % 7 == 0){
                contador++;
            }
            
        }
        
        System.out.println("Los multiplos de 7 entre 1 y 1000 son: " + contador);
        
        
    }
}
