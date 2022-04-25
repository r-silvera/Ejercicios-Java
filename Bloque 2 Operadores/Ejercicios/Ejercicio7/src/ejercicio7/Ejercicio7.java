/*
    Ejercicio 7: Construir un programa que, dado un número total de horas, devuelve el número de semanas,
días y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16
horas.
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    /*
    PROPÓSITO: Describe el número equivalente de semanas, días y horas a un total de horas dado.
    
    PARÁMETROS:
        * cantidadDeHoras: Número entero - Describe la cantidad de horas.
    
    PRECONDICIONES:
        * *cantidadDeHoras*: Debe ser un valor mayor o igual a 1.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cantidadDeHoras, cantidadDeSemanasEquivalentes, cantidadDeDíasEquivalentes, cantidadDeHorasEquivalentes;
        
        System.out.println("Introduzca la cantidad de hotas:");
        cantidadDeHoras = entrada.nextInt();
        
        cantidadDeSemanasEquivalentes = cantidadDeHoras / 168; 
        cantidadDeDíasEquivalentes = cantidadDeHoras % 168 /24;
        cantidadDeHorasEquivalentes = cantidadDeHoras % 24;
        
        System.out.print("\nEl equivalente es:" );
        System.out.println("\nEl número de semanas es: "+cantidadDeSemanasEquivalentes);
        System.out.println("\nEl número de días es: "+cantidadDeDíasEquivalentes);
        System.out.println("\nEl número de horas es: "+cantidadDeHorasEquivalentes);
    }
}
