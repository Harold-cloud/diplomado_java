/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteracion__vectores_matrices;

/**
 *
 * @author Usuario
 */
public class condicionales {

    public static void main(String[] args) {
        // La estructura condicional más simple en Java es if, esta se encarga de
//evaluar una condición, que para el correcto funcionamiento retornará un valor booleano. 

        if (9 < 12) {
            System.out.println("9 si es menor que 12");
        }

        if (4 > 2) {
            System.out.println("4 si es mayor que 2");

        }

        if (9 < 12 && 4 > 2) {
            System.out.println("9 si es menor que 12");
            System.out.println("4 si es mayor que 2");
        }

        String respuesta1 = "No";
        String respuesta2 = "Si";
        System.out.println("- ¿Quieres un cafe?");
        System.out.println("* " + respuesta1);
        if (respuesta1 == "Si") {
            System.out.println("- ¿Vas a comprarlo?");
            if (respuesta2 == "Si") {
                System.out.println("*" + respuesta2);
                System.out.println("- Comprar cafe");
            } else {
                System.out.println("* " + respuesta2);
                System.out.println("- Hacer el cafe");
            }
            System.out.println("- Beber");

        } else {
            System.out.println("- Sigue estudiando");
        }
        
        
           int velocidad = 101;
           
           if (velocidad >= 0 && velocidad <= 30){
               System.out.println("Zonas Escolares");
           }
           
           else if (velocidad > 30 && velocidad <= 60){
               System.out.println("Zonas Urbanas");
               
           }
           
           else if(velocidad > 80 && velocidad <= 100){
               System.out.println("Zonas Nacionales");
           }
           
           else {
               System.out.println("Estas infringiendo las leyes de velocidad");
           }
           
           // if anidados
           
          int numero = 9;
           
           if (numero >= 0){
               
               if(numero > 0 && numero <= 4){
                   System.out.println("Bajo valor");
               }
               
               else if (numero > 4 && numero <= 8){
                   System.out.println("Medio valor");
               }
               
               else if (numero > 8 && numero <= 10){
                   System.out.println("Alto valor");   
               }
                 
           }
           
           else {
               System.out.println("Es negativo");
           }
    }

}
