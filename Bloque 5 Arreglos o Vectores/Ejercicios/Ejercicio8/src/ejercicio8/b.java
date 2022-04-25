/*
    Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer
mediante el teclado 8 números. Despues se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que esten detras.
*/
package ejercicio8;

import java.util.Scanner;

public class b {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int  arreglo[] = new int[10];
       int número, posición;
       
        System.out.println("Llenamos un arreglo...\n");
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1)+ ". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("\nDigite otro número: \n");
        número = entrada.nextInt();
        System.out.println("Digite una posición: \n");
        posición = entrada.nextInt();
        
        for (int i = 7; i >= posición; i--) {
            arreglo[i+1] = arreglo[i]; 
        }
        arreglo[posición] = número;
        
        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < 9; i++) {
            System.out.println("Posición"+i+": "+arreglo[i]);
        }
    }
}
    
