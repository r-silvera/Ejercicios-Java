/*
    Ejercicio 4: Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en
el siguiente orden: El primero, el ultimo, el segundo, el penultimo, el tercero, etc.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int números[] = new int[10];
        
        System.out.println("Guardando los números en el arreglo...\n");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un número: ");
            números[i] = entrada.nextInt();
        }
        System.out.print("Los números del arreglo en el siguiente orden son: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(números[i]+" ");
            System.out.print(números[9-i]+" ");
        }
        System.out.println();
    }
}
    

