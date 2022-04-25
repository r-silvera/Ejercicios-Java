/*
    Ejercicio 2: Pedir dos números y decir cual es el mayor o si son iguales.
*/
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*
        PROPÓSITO: Indica si los dos números pedidos son iguales o cual es el mayor.
        
        PARÁMETROS:
            * número1 : Número entero - Describe un número entero.
            * número2 : Número entero - Describe un número entero.
        
        PRECONDICIONES:
            * Los números *número1* y  *número2* son enteros.
        */
        int número1, número2;
        
        número1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        número2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        
        if(número1 < número2){
            JOptionPane.showMessageDialog(null, número2+" es mayor a "+número1);
        }
        else if(número2 < número1){
            JOptionPane.showMessageDialog(null, número1+" es mayor que "+número2);
            }
        else{
            JOptionPane.showMessageDialog(null, número1+" es igual a "+número2);
        }
   }
    
}
