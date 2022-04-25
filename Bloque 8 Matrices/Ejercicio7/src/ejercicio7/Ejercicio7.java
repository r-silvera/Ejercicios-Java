/*
    Ejercicio 7: Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben ser 0 
salvo los de los bordes que deben ser 1. Mostrarla.
*/
package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        int matrizMarco[][] = new int[5][5];
        
        
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 0 ||i == 4){
                   matrizMarco[i][j] = 1; 
                } 
                if(j == 0 || j == 4){
                   matrizMarco[i][j] = 1;
                }
            }
        }
        
        System.out.println("Imprimiendo matriz...");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizMarco[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
