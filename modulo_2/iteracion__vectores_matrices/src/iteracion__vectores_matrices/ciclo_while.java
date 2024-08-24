/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteracion__vectores_matrices;

/**
 *
 * @author Usuario
 */
/** La estructura del ciclo while se compone principalmente de una condición
que tiene que tomar un valor booleano (verdadero o falso). Si este valor es verdadero,
se ejecutará la sentencia. Concluida esta acción, se vuelve a evaluar la condición.
Proseguirán los ciclos hasta que la condición cambie a falso */
public class ciclo_while {
    public static void main (String[] args){
        boolean x = true;
        while(x){
            System.out.println("Ciclo while");
            x = false;
        }
        
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }
        
        // Desarrolla un programa que imprima los numeros imapres entre 1 y 25
        int y = 0;
        while (y <= 25){
            if (y % 2 != 0){
                System.out.println(y);
               
            }
            y++;
        }
        
        String p = "Guayahack";
        int n = 0;
        while(n < p.length()){ // .length() : devuelve el número de caracteres del string, vector y otras estructuras de datos.
            System.out.println(p.charAt(n) + " "); // chatAt() devuelve el carácter de una posición del string.
            n++;
        }
        
        String palabra = "Guayahack";
        int numero = 0;
        
        System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " caracteres");
        
        while(numero < palabra.length()){
            System.out.println(palabra.charAt(numero) + " en la posicion: " + numero);
            numero++;
        }
        
        
        
    }
}
