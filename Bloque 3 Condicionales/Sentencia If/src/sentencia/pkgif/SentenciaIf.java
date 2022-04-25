
package sentencia.pkgif;

import javax.swing.JOptionPane;

public class SentenciaIf {

    public static void main(String[] args) {
        int numero, dato = 5;
    
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        /*
         == : Igualdad
         != : Diferencia
         > : Mayor
         >= : Mayor o igual
         < : Menor
         <= : Menor o igual
        */
        
        if(numero == dato){ // --> Si el valor de numero es igual a dato entonces:
            JOptionPane.showMessageDialog(null, "El número es 5"); // --> Ejecutar esta parte del condigo
        }
        else{ // --> Sino (caso contrario)
            JOptionPane.showMessageDialog(null, "El numero no es 5"); // --> Ejecutar esta otra parte del codigo
        }
    }
    
}
