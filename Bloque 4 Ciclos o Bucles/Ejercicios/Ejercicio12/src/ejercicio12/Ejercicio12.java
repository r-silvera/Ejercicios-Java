/*}
    Ejercicio 12: Pedir un número y calcular su factorial.  
*/
package ejercicio12;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        int número, factorial = 1;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        for(int i=1 ; i<=número; i++){
            factorial *= i;
    }
        System.out.println("El factorial del número "+número+" es "+factorial);   
   }
    
}
