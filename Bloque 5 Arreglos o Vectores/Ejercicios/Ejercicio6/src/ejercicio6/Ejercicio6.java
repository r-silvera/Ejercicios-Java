/*
    Ejercicio 6: Leer los datos correspondientes a dos tablas de 12 elementos númericos, y mezclarlos
en una tercera de la forma: 3 de la tabla A, 3 de la tabla B, otros 3 de A, otros 3 de la B, etc.
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a[], b[], c[];
        
        a = new int[12];
        b = new int[12];
        c = new int[24];
        
        System.out.println("Tabla A:\n");
        
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+". Digite un número: ");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("\nGuardando números de la Tabla A...");
        
        System.out.println("\nTabla B:\n");
        
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+". Digite un número: ");
            b[i] = entrada.nextInt();
        }
        
        System.out.println("\nGuardando números de la Tabla B...");
        
        System.out.println("\nCreando Tabla C...");
        
        // Ahora vamos a mezclar los arreglos a[] y b[].
        // El iterador i sera para los arreglos a[] y b[].
        // y el iterador j sera para el arreglo c[].
        
        int j = 0;
        int i = 0;
        
       while(i<12){
           //Copiamos los 3 elementos de a[]
           for (int k = 0; k < 3; k++) {
               c[j] = a[i+k];
               j++;
           }
           //Ahora, copiamos 3 elementos de b[]
           for (int k = 0; k < 3; k++) {
               c[j] = b[i+k];
               j++;
           }
           //Sumamos 3 al iterador para que siga avanzando la posición de los elementos a[] y b[]
           i+=3;
       }
       
        System.out.print("\nImprimiendo tabla C: ");
        
        for (int k = 0; k < 24; k++) {
           System.out.print(c[k]+" ");   
        }
    }  
}
