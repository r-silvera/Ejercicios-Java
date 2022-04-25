/*
    Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
*/
package ejercicio.pkg1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int número, cuadrado;
      
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(número >=0){
            cuadrado = (int)Math.pow(número, 2);
            
            JOptionPane.showMessageDialog(null, "El cuadrado del número "+número+" es: "+cuadrado);
            
            número = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
    }
    
}
