/*
    Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer
mediante el teclado 8 números. Despues se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que esten detras.
*/
package ejercicio8;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int número, posición, númeroPosterior = 0, númeroGuardado= 0;
        
        System.out.println("TABLA: \n");
        
        System.out.println("Llenar la tabla con números enteros...\n");
        
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.print("\nDigite un número para ubicarlo en la tabla: ");
        arreglo[8] = entrada.nextInt();
        
        System.out.print("\nDigite una posición para ubicar al número "+arreglo[8]+" en la tabla: ");
        arreglo[9] = entrada.nextInt();
       
        int i = 0;
        int j = 1;
        
        System.out.println("\nReemplazando número "+arreglo[8]+" en posición "+arreglo[9]);
        
        arreglo[9] -= 1;
        
        númeroPosterior = arreglo[arreglo[9]];
        
        arreglo[arreglo[9]] = arreglo[8];
        
        System.out.println("\nOrdenando TABLA...\n");
       
        while(arreglo[9] + i < 9){
           númeroGuardado = númeroPosterior;
           númeroPosterior = arreglo[arreglo[9]+j];
           arreglo[arreglo[9]+j] = númeroGuardado;
           i++;
           j++;
           }
         
        for (int k = 0; k < 10; k++) {
            System.out.print(arreglo[k]+" ");   
        }
       }
    }
    
