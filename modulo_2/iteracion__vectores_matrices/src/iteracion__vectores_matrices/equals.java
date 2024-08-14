/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteracion__vectores_matrices;

/**
 *
 * @author Usuario
 */
public class equals {

    public static void main(String[] args) {

        // equals Se encarga de comparar la cadena de texto contra un objeto que devolverá
        //true si las cadenas comparadas son iguales; en caso contrario, devolverá false. equals se aplica a objetos.
        // el "==" se utiliza para ver si los objetos apuntan a la misma direccion de memoria mientras que equals apunta a objetos.
        
        
        String nombre = "Pedro";
        if (nombre.equals("Pedro")) {

            System.out.println("True");
        }
        
        String x = new String ("Saludo");
        String y = new String ("Saludo");
        
        if (x == y){
            System.out.println("true");
        }
        
        else {
            System.out.println("false");
        }
        
        if(x.equals(y)){
            System.out.println("true");
        }
        
        else {
            System.out.println("false");
        }
    }

}
