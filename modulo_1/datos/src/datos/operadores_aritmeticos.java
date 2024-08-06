/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class operadores_aritmeticos {

    public static void main(String[] args) {
        // • El resultado es de tipo long si, al menos, uno de los operandos es de tipo long y ninguno es real (float o double).
        long numero1 = 8;
        int numero2 = 13;
        long resta = numero1 - numero2;
        System.out.println("El resultado es: " + resta);

        // El resultado es de tipo int si ninguno de los operandos es de tipo long y tampoco es real (float o double).
        int numero3 = 3;
        int numero4 = 52;
        int suma = numero3 + numero4;
        System.out.println("El resultado es: " + suma);

        //El resultado es de tipo double si, al menos, uno de los operandos es de tipo double.
        double numero5 = 7.6;
        int numero6 = 4;
        double multiplicacion = numero5 * numero6;
        System.out.println("El resultado es: " + multiplicacion);

        //El resultado es de tipo float si, al menos, uno de los operandos es de tipo float y ninguno es double.
        float numero7 = 2.3F;
        int numero8 = 5;
        float division = numero7 / numero8;
        System.out.println("El resultado es: " + division);

        int num_mod = 56;
        int num_mod2 = 20;
        double mod = num_mod % num_mod2;
        System.out.println(mod);

        // operadores aritmeticos combinados 
        int a = 5;
        int b = 2;
        b += a; // b = b + a

        System.out.println("la suma combinada es :" + b);

        b -= a; // b = b - a
        System.out.println("la resta combinada es :" + b);

        b *= a; // b = b * a
        System.out.println("la multiplicacion combinada es :" + b);
        
        int c = 5;
        double d = 2.0;
        c /= d; // c = c / d
        
        System.out.println("la division combinada es :" + d);
        
        b %= a;
        
        System.out.println("el residuo combinado es :" + b);
       

    }
}
