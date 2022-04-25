/*
    Ejercicio 16: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho 
número.
*/
package ejercicio16;

import javax.swing.JOptionPane;

public class Ejercicio16 {

    public static void main(String[] args) {
        int número;
        
        do{
        número= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }while (número < 0 || número > 10);
        
        System.out.println("La tabla de multiplicación del número "+número+" es: ");
        
        for(int i=1; i<=10; i++){
            System.out.println(número+" * "+i+" = "+número*i);
        }
    }
    
}
