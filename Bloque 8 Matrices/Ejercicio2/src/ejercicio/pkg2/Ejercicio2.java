/*
    Ejercicio 2: Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar suma.
*/
package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizA[][], matrizB[][], sumaMatriz[][];
        
        matrizA = new int[3][3];
        matrizB = new int[3][3];
        sumaMatriz = new int[3][3];
        
        System.out.println("Digite la matriz A...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nDigite la matriz B...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nCalculando suma entre matriz A y B...\n");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaMatriz[i][j]=matrizA[i][j]+ matrizB[i][j];
            }
        }
        System.out.println("El resultado de la suma es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumaMatriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
