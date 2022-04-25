/*
    Ejercicio 6: Hacer un programa que tome dos números y diga si ambos son pares o iguales.
*/
package ejercicio6;

import static javafx.beans.binding.Bindings.and;
import javax.swing.JOptionPane;

/**
 *
 * @author t1no
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       int número1, número2;
       
       número1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
       número2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
       
       if((número1%2 == 0)&&(número2%2 == 0)){
           JOptionPane.showMessageDialog(null, "Ambos números son pares.");
       }
       else if((número1%2 == 0)&&(número2%2 != 0)){
           JOptionPane.showMessageDialog(null, "El número "+número1+" es par y el número "+número2+" es impar.");
       }
       else if((número1%2 != 0)&&(número2 == 0)){
           JOptionPane.showMessageDialog(null, "El número "+número1+" es impar y el número "+número2+" es par.");
       }
       else{
           JOptionPane.showMessageDialog(null, "Ambos números son impares.");
       }
       
    }
    
}
