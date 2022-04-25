/*
    Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos
de la diagonal principal sean 1 y el resto 0.
*/
package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        
        int j = 0;
        for (int i = 0; i < 7; i++) {
            matriz[i][j] = 1;
            j++;
        }
        
        for (int i = 0; i < 7; i++) {
            for (int k = 0; k < 7; k++) {
                System.out.print(matriz[i][k]+" ");
            }
            System.out.println();
        }
    }
    
}
