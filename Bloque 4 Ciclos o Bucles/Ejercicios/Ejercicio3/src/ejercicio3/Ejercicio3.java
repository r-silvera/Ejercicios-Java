/*
    Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
*/
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        int número;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(número != 0){
            if(número%2 == 0){
                System.out.println("El número "+número+" es par.");
            }
            else{
                System.out.println("El número "+número+" es impar.");
            }
            número = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        
    }
    
}
