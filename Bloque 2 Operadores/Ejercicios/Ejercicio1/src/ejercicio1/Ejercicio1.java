/*
 Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones.
 */
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        /*
        PROPÓSITO: Recibe 3 calificaciones y las suma.
        
        PARÁMETROS:
            *calificación1: número decimal - Describe una calificación.
            *calificación2: número decimal - Describe una calificación.
            *calificación3: número decimal - Describe una calificación.
        
        PRECONDICIONES: 
            * Las calificaciones deben ser números.
            * Si hay alguna calificacion en decimal, debe escribirse con ",".
        */
       Scanner entrada = new Scanner(System.in);
       float calificación1, calificación2, calificación3, resultado;
       
       //Guardamos las 3 calificaciones.
        System.out.print("Escriba las 3 calificaciones para sumarla: ");
        calificación1 = entrada.nextFloat();
        calificación2 = entrada.nextFloat();
        calificación3 = entrada.nextFloat();
        
        //Sumamos las 3 calificaciones.
        resultado = calificación1 + calificación2 + calificación3;
        
        //
        System.out.println("\nEl resultado es: " + resultado);
    }
    
}
