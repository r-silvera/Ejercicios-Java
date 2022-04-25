/*
    Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la media.
*/
package ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {
        int número, acumulador = 0, elementos = 0;
        float mitad;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(número >= 0){
            acumulador += número;
            elementos ++;
            
            número = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        
        if(elementos == 0){
            System.out.println("Error, la division entre 0 no existe.");
        }
        else{
        mitad = (float)acumulador/elementos;
        System.out.println("La mitad es: "+mitad);
    }
   }
}
