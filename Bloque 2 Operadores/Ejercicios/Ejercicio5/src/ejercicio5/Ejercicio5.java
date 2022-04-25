/*
    Ejercicio 5: La calificación final de un estudiante de Informática se calcula con base a las calificaciones de 
cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10% , 25%, 25% y 40%.
Hacer un programa que calcule e imprima la calificación final obtenida por el estudiante.
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    PROPÓSITO: Calcula e imprime la calificación final obtenida del estudiante en base a cuatro aspectos: participación,
    primer examen parcial, segundo examen parcial y examen final.
    
    PARÁMETROS:
        * notaDeParticipación: Número - Describe la nota de la participación del alumno.
        * notaDelPrimerParcial: Número - Describe la nota del primer parcial del alumno.
        * notaDelSegundoParcial: Número - Describe la nota del segundo parcial del alumno.
        * notaDelParcialFinal: Número - Describe la nota parcial final del alumno.
    
    PRECONDICIONES:
        * Todas las notas deben recibir un número del 1 al 10 inclusive.
    */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      float notaDeParticipación, notaDelPrimerParcial, notaDelSegundoParcial, notaDelParcialFinal, notaFinal;
      
      //Pedir los datos necesarios y hacemos los calculos
      System.out.print("Introduzca la nota de participación del alumno: ");
      notaDeParticipación = entrada.nextFloat() * 0.10f;
      System.out.print("Introduzca la nota del primer parcial del alumno: ");
      notaDelPrimerParcial = entrada.nextFloat() * 0.25f;
      System.out.print("Introduzca la nota del segundo parcial del alumno: ");
      notaDelSegundoParcial = entrada.nextFloat() * 0.25f;
      System.out.print("Introduzca la nota del parcial final del alumno: ");
      notaDelParcialFinal = entrada.nextFloat() * 0.40f;
      
      //Sumamos las notas
      notaFinal = notaDeParticipación + notaDelPrimerParcial + notaDelSegundoParcial + notaDelParcialFinal;
      
      //Imprimimos el resultado en pantalla
      System.out.println("\nLa nota final del alumno es: "+notaFinal);
    }
}
