/*
    Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que
todos los meses son de 30 días.
*/
package ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {
        int día, mes, año;
        
        boolean díaEsCorrecto, mesEsCorrecto;
        
        día = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día de una fecha:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes de una fecha:"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de una fecha:"));
        
        díaEsCorrecto = (día > 1) && (día <= 30);
        mesEsCorrecto = (mes > 1) && (mes <= 12);
        
        if((díaEsCorrecto) && (mesEsCorrecto)){
            JOptionPane.showMessageDialog(null, "La fecha es correcta.");
        }
        else if ((díaEsCorrecto) && !(mesEsCorrecto)){
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, el mes es incorrecto.");
        }
        else if (!(díaEsCorrecto)&&(mesEsCorrecto)){
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, el día es incorrecto.");
        }
        else{
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, el día y el mes son incorrectos");
        }
    }
    
}
