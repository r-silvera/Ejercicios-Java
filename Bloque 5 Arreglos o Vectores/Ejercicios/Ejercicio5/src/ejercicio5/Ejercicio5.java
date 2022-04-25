/*
    Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera
forma: el 1° de A, 1° de B, el 2° de A, el 2° de B, etc.
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tablaA[] = new int[10];
        int tablaB[] = new int[10];
        int tablaC[] = new int[20];
        int j=0;
        
        System.out.println("Tabla A\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".Digite un número de la tabla A: ");
            tablaA[i] = entrada.nextInt();
        }
        
        System.out.println("\nGuardando números de Tabla A...\n");
        
        System.out.println("\nTabla B\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un número de la tabla B: ");
            tablaB[i] = entrada.nextInt();
        }
        
        System.out.println("\nGuardando números de Tabla B...\n");
        
        
        
        for (int i = 0; i < 10; i++) {
           tablaC[j] = tablaA[i];
           j++;
           tablaC[j] = tablaB[i];
           j++;
        }
        
        System.out.print("\nImprimiendo la tablas con cierto orden: ");
        for(int i:tablaC){
            System.out.print(i+" ");
        }
    }
    
}

