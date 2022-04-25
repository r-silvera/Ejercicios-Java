/*
    Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N.
*/
package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        int número, i = 0;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(i< número){
            i+= 5;
            System.out.println(i);
        }
    }
    
}
