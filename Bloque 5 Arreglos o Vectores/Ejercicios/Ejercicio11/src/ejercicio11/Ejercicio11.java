/*
    Ejercicio 11: Leer 5 elementos númericos que se introducirán ordenados de forma creciente.
Éstos los guardaremos en un tabla de tamaño 10. Leer un número N, e insertarlo en el lugar
adecuado para que la tabla continúe ordenada.
*/
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int número, sitioNúmero=0, j=0;
        boolean creciente = false;
        
        System.out.println("Llenando el arreglo...");
        do{
            for (int i = 0; i < 5; i++){
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                if(arreglo[i]<arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i]>arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo no esta ordenado de forma creciente, vuelva a digitarlo: \n");
            }
            
       }while(creciente == false);
        
        System.out.print("Digite un elemento a insertar: ");
        número = entrada.nextInt();
        
        while(arreglo[j]< número && j<5){
            sitioNúmero++;
            j++;
        }
        
        for (int i = 4; i >= sitioNúmero; i--) {
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[sitioNúmero] = número;
        
        System.out.print("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i]+" - ");
        }
    }
}
