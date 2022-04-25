/*
    Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
*/
package ejercicio20;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
        int número;
        float sueldo, sueldoMax = 0;
        
        número = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos a introducir: "));
        
        for(int i=1; i<= número; i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Sueldo N°"+i+":\n"));
            if(sueldo > sueldoMax){
                sueldoMax = sueldo;
            }
        }
        System.out.println("El sueldo máximo es de $"+sueldoMax);
    }
    
}
