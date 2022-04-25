/*
    Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
*/
package ejercicio.pkg4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        int número, contador = 0 ;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(número >= 0){
            contador++;
            
            número = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("La cantida de números introducidos es: "+contador);
    }
    
}
