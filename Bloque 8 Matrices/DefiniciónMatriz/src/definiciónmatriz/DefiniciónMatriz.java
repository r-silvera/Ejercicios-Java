
package definiciónmatriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DefiniciónMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas, nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la matriz...");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        for (int i = 0; i < nFilas; i++) {//Número de filas
            for (int j = 0; j < nCol; j++) {//Número de columnas
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
