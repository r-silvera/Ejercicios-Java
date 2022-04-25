/*
    Ejercicio 15: Leer 10 enteros ordenadados crecientemente. Leer N y buscarlo en la tabla.
Se debe mostrar en la posición que se encuentra. Si no esta indicarlo con un mensaje.
*/
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int número, contadorLugar = 0;
        boolean creciente = true;
        System.out.println("Llenando arreglo con números enteros...");
        
        do{
            for (int i = 0; i < 10; i++) {
                System.out.print(i+". Digite un número entero: ");
                arreglo[i] = entrada.nextInt();
            }
            
            for (int i = 0; i < 9; i++) {
                
                if(arreglo[i]<arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i]>arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("\nDigite los números de forma creciente...");
                System.out.println("\nVuelva a intentarlo...\n");
            }
               
        }while(creciente == false);
        
        System.out.print("\nDigite el número que desea encontrar en el arreglo: ");
        número = entrada.nextInt();
        
        System.out.println("\nBuscando número...\n");
        
        int i=0;
        
        while(i < 10 && arreglo[i] != número ){
            i++;
        }
        
        if(i == 10){
            System.out.println("El número "+número+" no esta en el arreglo...");
        }
        else{
            System.out.println("El número esta en la posición "+i+" del arreglo." );
        }
    }
}
