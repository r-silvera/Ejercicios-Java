/*
    Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares
de la primera, y a continuación los elementos impares.
*/
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], pares[], impares[], conteoPares = 0, conteoImpares = 0;
        
        
        arreglo = new int[10];
        
        System.out.println("Llenando arreglo con elementos...");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
            
            if(arreglo[i] % 2 == 0){
                conteoPares++;
            }
            else{
                conteoImpares++;
            }
        }
        
        pares = new int[conteoPares];
        impares = new int[conteoImpares];
        
        System.out.println("\nGuardando elementos pares e impares...");
        
        conteoPares = 0;
        conteoImpares = 0;
        
        
        for (int i = 0; i < 10; i++) {
            
            if(arreglo[i]%2 == 0){
                pares[conteoPares] = arreglo[i];
                conteoPares++;
            }
            else{
                impares[conteoImpares] = arreglo[i];
                conteoImpares++;
            }
            
        }
        
        System.out.println("\nImprimiendo tablas...\n");
        
        System.out.print("Tabla de pares: ");
        
        for (int i = 0; i < conteoPares; i++) {
            System.out.print(pares[i]+" - ");
        }
        
        System.out.println();
        
        System.out.print("Tabla de impares: ");
            
        for (int i = 0; i < conteoImpares; i++) {
            System.out.print(impares[i]+" - ");
        }
        
        System.out.println();
    }
    
}
