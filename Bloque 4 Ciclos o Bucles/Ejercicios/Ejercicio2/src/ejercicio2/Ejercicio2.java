/*
    Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que
se introduzca un 0.
*/
package ejercicio2;

import javax.swing.JOptionPane;


public class Ejercicio2 {
    
    public static void main(String[] args) {
        int número;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(número != 0){
            if(número > 0){
                System.out.println("El número "+número+" es positivo.");
                
            }
            else{
                System.out.println("El número "+número+" es negativo.");
                
            }
            número = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
    }
    
}
