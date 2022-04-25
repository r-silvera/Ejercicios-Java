/*
    Ejercicio 5: Un obrero necesita calcular  su salario semanal, el cual se obtiene de la siguiente manera:
        * Si trabaja 40 horas o menos se le paga $16 por hora. 
        * Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
*/
package ejercicio5;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        int horasTrabajadas;
        float horasExtra, salarioSemanal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite sus horas trabajadas semanalmente: "));
        
        if(horasTrabajadas > 40){
            horasExtra = (horasTrabajadas - 40) * 20;
            salarioSemanal = (40 * 16) + horasExtra;
            
        }
        else{
            salarioSemanal = horasTrabajadas * 16;
        }
        
        JOptionPane.showMessageDialog(null, "Su salario semanal es de: $"+ salarioSemanal);
    }
    
}
