/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteracion__vectores_matrices;

/**
 *
 * @author Usuario
 */
public class matrices {
    // Las matrices son una estructura de datos que permite almacenar un grupo de datos de un mismo tipo,
    // al igual que ocurre con los vectores, pero de una manera bidimensional.
    
    public static void main (String[] args){
        // Estructura de una matriz
        int numeros[][] = new int[2][2];
            numeros[0][0] = 1;
            numeros[0][1] = 2;
            numeros[1][0] = 3;
            numeros[1][1] = 4;
            
        //El tamaño de la matriz no puede ser redefinido.
        //Las matrices se pueden declarar únicamente o declarar e inicializar como ocurre con las variables.
           int edades[][] = {{19,18,16},{15,14,12},{12,11,8},{22,30,44}};
           for(int i = 0; i < 3; i++){
               for(int j = 0; j < 3; j++){
                   System.out.println(edades[i][j] + " ");   
               }
               System.out.println("");
               
           }
    }
}
