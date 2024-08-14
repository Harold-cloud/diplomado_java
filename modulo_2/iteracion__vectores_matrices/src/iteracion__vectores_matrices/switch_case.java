/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteracion__vectores_matrices;

/**
 *
 * @author Usuario
 */
public class switch_case {
    public static void main (String[] args){
        int num = 2;
        
        switch (num)
        {
            case 1: 
                System.out.println("Numero 1");
                break;
            case 2:
                System.out.println("Numero 2");
                break;
            case 3: 
                System.out.println("Numero 3");
                break;
            default:
                System.out.println("Error");
        }
        
        for (int i = 0; i < 10; i++){
            System.out.println("Dentro del ciclo");
            break;
        }
        System.out.println("Fuera del ciclo");
        
        
        // continue
        for (int x = 0; x < 5; x++){
            if(x == 3){
                continue;
            }
            
            System.out.println("Dentro del ciclo");
        }
        
        // omision break
        int diaNum = 6;
        String diaLab;
        
        switch(diaNum){
            
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                diaLab  = "dia laborable";
                break;
            case 6:
            case 7:
                diaLab = "fin de semana";
                break;
            default: 
                diaLab = "dia invalido";
        }
        
        System.out.println(diaNum + " es un " + diaLab);
        
        // switch anidado
        
        int promedio = 4;
        int parcial = 4;
        switch(promedio){
            
            case 1:
            case 2:
            case 3:
                System.out.println("Perdiste la materia");
                break;
            case 4:
            case 5:
                System.out.println("Ganaste la materia");
                switch (parcial) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("Perdiste el parcial");
                        break;
                    case 4:
                    case 5:
                        System.out.println("Ganaste el parcial");
                        break;
                      
                }
                break;
                default: System.out.println("Error");
        }
        
        
    }
}
