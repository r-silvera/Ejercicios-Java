/*
    EJercicio 6: Pedir números hasta que se  teclee un 0, mostrar la suma de todos los números introducidos.
*/
package ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        int número, acumulador = 0;
        
        do{
            número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            acumulador += número;
        }while(número != 0);
                
        System.out.println("La suma de todos los números introducidos es: "+acumulador);
    }
    
}
