/*
    Ejercicio 10: Pedir 10 números y escribir la suma total.
*/
package ejercicio10;

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args){
        int número, suma = 0;
        
        for(int i = 10; i >= 1; i--){
            número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            suma += número; 
        }
        System.out.println("la suma es: " +suma);
    }
    
}
