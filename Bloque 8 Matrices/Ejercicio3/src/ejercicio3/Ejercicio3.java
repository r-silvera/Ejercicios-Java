/*
    Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        System.out.println("Digite la matriz...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz introducida es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\nSu matriz traspuesta es:\n");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
