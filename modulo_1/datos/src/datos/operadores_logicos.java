/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Usuario
 */
public class operadores_logicos {
    public static void main (String[] args){
    
    // Realizan operaciones sobre datos booleanos y tienen como resultado un valor booleano
    boolean negacion = !false;
        System.out.println(negacion);
        boolean sumaLogicaBits = true | false;
        System.out.println(sumaLogicaBits);
        boolean sumaLogicaExclusiva = (5 == 5)^(5 < 4);
        System.out.println(sumaLogicaExclusiva);
        boolean productoLogico = (5 == 5) & (5 < 4);
        System.out.println(productoLogico);
        boolean sumaLogicaCortocircuito = true || false; // Operador OR ( || ) – if( a || b) [si uno de ellos es verdadero para ejecutar, de lo contrario no lo haga]
        System.out.println(sumaLogicaCortocircuito);
        boolean productoLogicoCortocircuito = (5 == 5) && (5 < 4); // AND ( && ) – si (a && b) [si es verdadero, ejecute, de lo contrario no lo haga]
        System.out.println(productoLogicoCortocircuito);
        
        
        
        
        
    
    
    
    }
}
