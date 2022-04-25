/*
    Ejercicio 8: Pedir un número entre 0 y 99999 y decir cúantas cifras tiene.
*/
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author t1no
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int número;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 0 y 99999"));
        
        if(número <= 9){
            JOptionPane.showMessageDialog(null, "El número tiene 1 cifra.");
        }
        else if (número <= 99){
            JOptionPane.showMessageDialog(null, "El número tiene 2 cifras.");
        }
        else if (número <= 999){
        JOptionPane.showMessageDialog(null, "El número tiene 3 cifras.");
        }
        else if(número <= 9999){
            JOptionPane.showMessageDialog(null, "El número tiene 4 cifras.");
        }
        else if (número <= 99999){
            JOptionPane.showMessageDialog(null, "El número tiene 5 cifras.");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número tiene mas de 5 cifras.");
        }
    }
    
}
