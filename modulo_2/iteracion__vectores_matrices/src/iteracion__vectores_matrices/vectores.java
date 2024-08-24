/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteracion__vectores_matrices;

/**
 *
 * @author Usuario
 */
public class vectores {
    public static void main (String[] args){
        //Los vectores son una estructura de datos que permite almacenar un grupo
        //de datos de un mismo tipo. También son conocidos popularmente como arrays.
        
        String estudiantes[] = new String[3]; // El tamaño del vector no puede ser redefinido.
        estudiantes[0] = "Pedro";
        estudiantes[1] = "Juan";
        estudiantes[2] = "Andres";
        
        for(int i = 0; i < estudiantes.length; i++){
            System.out.println("Nombre " + i + " - " + estudiantes[i]);
        }
        // Los vectores pueden ser de N posiciones, siendo N cualquier número entero.
        String carros[] = new String[300];
        double motos[] = new double[200];
        
        // Los vectores inicializados sin datos se representan de la siguiente forma por defecto.
        // Vectores de números: se inicializan en 0 los valores de las posiciones.
        
        int alturas[] = new int[3];
        System.out.println(alturas[0]);
        
        // los vectores de cadenas de texto: se inicializan en vacío o null los valores de las posiciones.
         String nombre[] = new String[3];
         System.out.println(nombre[0]);
         
        // los vectores de booleanos: se inicializan en false los valores de las posiciones.
        
        boolean estados[] = new boolean[3];
        System.out.println(estados[0]);
                 
        double notas[] = new double[5];
        int porcentajes[] = {20,10,30,20,20};
        
        notas[0] = 4.5;
        notas[1] = 3.2;
        notas[2] = 5.0;
        notas[3] = 1.5;
        notas[4] = 4.3;
        
       double  promedio = 0;
       
       for (int x = 0; x < notas.length; x++){
           promedio = (notas[x] * (porcentajes[x])/100) + promedio;
       }
        System.out.println("Promedio final: " + Math.round(promedio));
                
                
                
    }
    
}
