/*
    Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y
trasponerla en la segundo.
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], matrizTraspuesta[][];
        
        System.out.println("Llenando matriz....");
        
        matriz = new int[5][9];
        matrizTraspuesta = new int[9][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nMostrando matriz original...\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        int k = 0, l = 0;
        System.out.println("\nCreando la matriz traspuesta...\n");
      
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
               k = 0; 
               matrizTraspuesta[i][j] = matriz[j][i];
               k++;
            }
            l++;
        }
        
        System.out.println("Mostrando...");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizTraspuesta[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
