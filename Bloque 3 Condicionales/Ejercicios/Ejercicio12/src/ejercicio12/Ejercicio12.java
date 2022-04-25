/*
    Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de forma: insuficiente, suficiente, bien, notable y sobresaliente.
*/
package ejercicio12;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite una nota del 0 al 10: "));
        
        switch(nota){
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 : JOptionPane.showMessageDialog(null, "Insuficiente");
                    break;
            case 7 : JOptionPane.showMessageDialog(null, "Suficiente");
                    break;
            case 8 : JOptionPane.showMessageDialog(null, "Buena");
                    break;
            case 9 : JOptionPane.showMessageDialog(null, "Notable");
                    break;
            case 10 : JOptionPane.showMessageDialog(null, "Sobresaliente");
                    break;
            default : JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
}
