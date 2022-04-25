/*
    Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación debe
indicarnos si los números están ordenados de forma creciente, decreciente, o si estan desordenados.
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente = false;
        
        System.out.println("Llenar el arreglo...\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            }
            if(arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }
        }
        if(creciente == true && decreciente == false){
            System.out.println("\nEl arreglo esta en forma creciente...");
        }
        else if(decreciente == true && creciente == false){
            System.out.println("\nEl arreglo esta en forma decreciente...");
        }
        else if(decreciente == true && creciente == true){
            System.out.println("\nEl arreglo esta en forma desordenada...");
        }
        else{
            System.out.println("\nTodos los números del arreglo son iguales");
        }
    }
}
