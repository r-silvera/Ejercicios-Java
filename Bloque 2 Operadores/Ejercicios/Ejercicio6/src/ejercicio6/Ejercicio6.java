/*
    Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma.
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    /*
    PROPÓSITO: Calcula el cuadrado de una suma.
    
    PARÁMETROS:
        * valor1: Número - Describe el primer valor a operar.
        * valor2: Número - Describe el segundo valor a operar.
    
    PRECONDICIONES:
        * Si los valores a introducir son decimales, poner ",".
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor1, valor2, resultado;
        
        System.out.print("Introduzca el primer valor: ");
        valor1 = entrada.nextDouble();
       
        System.out.print("Introduzca el segundo valor: ");
        valor2 = entrada.nextDouble();
        
        resultado = Math.pow(valor1,2) + Math.pow(valor2, 2) + (2*valor1*valor2);
        
        System.out.println("\nEl resultado es: "+ resultado);
    }
    
}
