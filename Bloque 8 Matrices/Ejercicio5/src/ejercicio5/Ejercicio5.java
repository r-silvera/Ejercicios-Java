/*
    Ejercicio 5: Crear y cargar una matriz de tamaño n x m y mostrar la suma de cada fila y cada columna.
*/
package ejercicio5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas, nColumnas, sumaFilas[], sumaColumnas[], k;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas de la matriz: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas de la matriz: "));
        
        matriz = new int[nFilas][nColumnas];
        
        System.out.println("Digite la matriz...");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nMostrando matriz...\n");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
            System.out.println();
        }
        
        System.out.println("Calculando sumas de cada Fila...");
        
        sumaFilas = new int[nFilas];
        
        //forma 1
        for (int i = 0; i < nFilas; i++) {
            k = 0;
            while(k<nColumnas){
                sumaFilas[i] += matriz[i][k];
                k++;
            }
        }
        
        for (int i = 0; i < nFilas; i++) {        
                System.out.println(i+". Fila: "+sumaFilas[i]);

        }
        
        System.out.println("\nCalculando suma de cada Columna...");
        
        sumaColumnas = new int[nColumnas];
        
        //forma 2
        for (int i = 0; i < nColumnas; i++) {
            for (int j = 0; j < nFilas; j++) {
                sumaColumnas[i] += matriz[j][i];
            }
        }
        
        
        for (int i = 0; i < nColumnas; i++) {
            System.out.println(i+". Columna: "+sumaColumnas[i]);
        }
    }
    
}
