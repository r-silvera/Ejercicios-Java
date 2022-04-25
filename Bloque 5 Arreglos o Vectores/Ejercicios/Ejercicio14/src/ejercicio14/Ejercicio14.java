/*
    Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
*/
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arregloA[], arregloB[], arregloC[];
        boolean creciente = true;
        
        arregloA = new int[10];
        arregloB = new int[10];
        arregloC = new int[20];
        
        System.out.println("Llenando el arreglo A con elementos...");
        
        do{
            for (int i = 0; i < 10; i++) {
                System.out.print(i+". Digite un número: ");
                arregloA[i] = entrada.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if(arregloA[i]<arregloA[i+1]){
                    creciente = true;
                }
                if(arregloA[i]>arregloA[i+1]){
                    creciente = false;
                    System.out.println("\nDigite los elementos del arreglo A de forma creciente...");
                    break;
                } 
            }
        }while(creciente == false);
        
        System.out.println("\nLlenando el arreglo B con elementos...");
        
        do{
            for (int i = 0; i < 10; i++) {
                System.out.print(i+". Digite un número: ");
                arregloB[i] = entrada.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if(arregloB[i]<arregloB[i+1]){
                    creciente = true;
                }
                if(arregloB[i]>arregloB[i+1]){
                    creciente = false;
                    System.out.println("Digite los elementos del arreglo B de forma creciente...");
                    break;
                }  
            } 
        }while(creciente == false);
        
        System.out.println("\nOrganizando arreglo A y B en arreglo C...");
        
        int i = 0 ,j = 0, k = 0;
        
        while(i<10 && j<10){
            if(arregloA[i]< arregloB[j]){
                arregloC[k] = arregloA[i];
                i++;
            }
            else{
                arregloC[k] = arregloB[j];
                j++;
            }
            k++;
        }
        
        if(i==10){
            while(j<10){
                arregloC[k] = arregloB[j];
                j++;
                k++;
            }
        }
        else{
            while(i<10){
                arregloC[k] = arregloA[i];
                i++;
                k++;
            }
        }
        
        
        System.out.println("\nImprimiendo arreglo C....\n");
        for (int l = 0; l < 20; l++) {
            System.out.print(arregloC[l]+" - ");
        }
    }
    
}
