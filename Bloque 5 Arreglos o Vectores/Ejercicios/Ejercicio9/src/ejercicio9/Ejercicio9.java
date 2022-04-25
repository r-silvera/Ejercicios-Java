/*
    Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la 
desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser
el tercero y así sucesivamente. El último pasa a ser el primero.
*/
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] =  new int[10];
        int arregloActual,arregloProximo,arregloInicial, arregloFinal;
        
        System.out.println("Llenando arreglo con 10 números enteros...");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        arregloFinal = arreglo[9];    
        
        System.out.println("\nDesplazando números una posición hacia abajo...");
        
        arregloProximo = arreglo[0];
        
        for (int i = 0; i < 9; i++) {
            arregloActual = arregloProximo;
            arregloProximo = arreglo[i+1];
            arreglo[i+1] = arregloActual;
        }
        arreglo[0] = arregloFinal;
            
        System.out.println("\nImprimiendo arreglo... ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]+" ");
        }
    }
    
}
