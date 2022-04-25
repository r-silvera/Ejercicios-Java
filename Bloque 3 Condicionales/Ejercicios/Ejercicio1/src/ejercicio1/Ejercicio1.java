/*
    Ejercicio 1: Hacer un programa que lea un número entero y muestre si el número es multiplo de 10.
*/
package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*
        PROPÓSITO: Indica si el número dado es multiplo de 10.
        
        PARÁMETROS: 
            * númeroADeterminar: Número entero - Describe un número.
        
        PRECONDICIONES:
            * El *númeroADeterminar* debe ser del dominio de los números enteros.
        */
        int número;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if(número%10 == 0){
            JOptionPane.showMessageDialog(null, "El número " +número+ " es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número " +número+ " no es un multiplo de 10");
        }
    }
    
}
