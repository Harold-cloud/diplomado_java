/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Usuario
 */
public class operadores_incrementales {

    public static void main(String[] args) {
        // incrementa el valor de la variable y luego la usa.
        int a = 10;
        int b = ++a;

        System.out.println("a: " + a + " " + "b: " + b);

        // incrementa el valor de la variable pero deja la variable en su primer estado.
        int c = 10;
        int d = c++;

        System.out.println("c: " + c + " " + "d: " + d);

        int e = 5;
        int f = e--;

        System.out.println("e: " + e + " " + "f: " + f);

        int g = 5;
        int h = --g;

        System.out.println("g: " + g + " " + "h: " + h);
    }

}
