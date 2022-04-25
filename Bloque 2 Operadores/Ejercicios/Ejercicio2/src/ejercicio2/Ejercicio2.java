/*
    Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
de sos horas semanales trabajadas y de su salario por hora.
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    PROPÓSITO: Calcula e imprime el salario semanal de un empleado a partir de sus horas trabajadas
    y de su salario por hora.
    
    PARÁMETROS:
        * horasSemanales: Número entero - Describe la cantidad de horas trabajadas semanalmente.
        * salarioPorHora: Número entero - Describe el salario por hora.
    
    PRECONDICIONES: 
        * Ninguna.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasTrabajadas;
        float salarioPorHora, salarioSemanal;
        
        System.out.print("Digite el salario por hora de su empleo: ");
        salarioPorHora = entrada.nextFloat();
        
        System.out.print("Digite las horas de trabajo que usted realiza semanalmente: ");
        horasTrabajadas = entrada.nextInt();
        
        salarioSemanal = horasTrabajadas * salarioPorHora;
        
        System.out.println("\nSu salario semanal es: "+salarioSemanal);
    }
    
}
