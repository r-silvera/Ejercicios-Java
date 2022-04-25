
package sentencia.pkgswitch;

import javax.swing.JOptionPane;

public class SentenciaSwitch {

    public static void main(String[] args) {
       int dato;
       
       dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1-5"));
       
       switch (dato){ // --> Evaluamos la variable "dato".
           case 1 : JOptionPane.showMessageDialog(null, "El número es 1"); // --> Si en el caso de que el dato sea igual a 1 entonces, el programa ejecuta esa porción de codigo
                    break;
           case 2 : JOptionPane.showMessageDialog(null, "El número es 2"); // --> Si en el caso de que el dato sea igual a 2 entonces, el programa ejecuta esa porción de codigo
                    break;
           case 3 : JOptionPane.showMessageDialog(null, "El número es 3"); // --> Si en el caso de que el dato sea igual a 3 entonces, el programa ejecuta esa porción de codigo
                    break;
           case 4 : JOptionPane.showMessageDialog(null, "El número es 4"); // --> Si en el caso de que el dato sea igual a 4 entonces, el programa ejecuta esa porción de codigo
                    break;
           case 5 : JOptionPane.showMessageDialog(null, "El número es 5"); // --> Si en el caso de que el dato sea igual a 5 entonces, el programa ejecuta esa porción de codigo
                    break;
           default: JOptionPane.showMessageDialog(null, "El número esta fuera del rango de 1-5"); // --> Caso contrario, el programa ejecuta la porción del codigo restante.
       }
    }
}
