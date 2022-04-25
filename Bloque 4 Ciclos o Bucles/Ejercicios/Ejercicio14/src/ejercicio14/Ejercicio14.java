/*
    Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000.
*/
package ejercicio14;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {
        float sueldo, sumaDeSueldos = 0;
        int sueldosMayoresA1000 = 0;
        
        for(int i=1; i<=10; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite un sueldo: "));
            
            sumaDeSueldos += sueldo;
            
            if (sueldo >= 1000){
                sueldosMayoresA1000++;
            }
        }
        System.out.println("La suma total de los sueldos es de $"+sumaDeSueldos);
        System.out.println("Cantidad de sueldos mayores a $1000: $"+sueldosMayoresA1000);
    }
    
    
}
