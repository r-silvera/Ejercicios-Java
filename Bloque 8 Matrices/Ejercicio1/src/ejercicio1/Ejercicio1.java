/*
    Ejercicio 1: Crear y cagar una matriz de tamaño n x m y decir si es simétrica o no.
*/
package ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;
        boolean simetrica = false;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas de la matriz: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas de la matriz: "));
        
        matriz = new int[nFilas][nColumnas];
        
        System.out.println("Digite la matriz...");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Verificando si la matriz es simetrica...");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                if(nFilas == nColumnas && matriz[i][j] == matriz[j][i]){
                    simetrica = true;
                }
                if(nFilas != nColumnas || matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break;
                }
            }
            if(simetrica == false){
                    break;
                }
        }
        
        if(simetrica == true){
         
            JOptionPane.showMessageDialog(null, "La matriz es simetrica");
        }
        else{

            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
        
    }
    
}
