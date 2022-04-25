/*
    Ejercicio 12: Leer por teclado una tabla de 10 elementos númericos enteros y una posición (entre 0 y 9).
Eliminar el elemento situado en la posición dada sin dejar huecos.
*/
package ejercicio.pkg12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posición;
        
        System.out.println("Llenando arreglo con elementos...");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(i+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        do{
            System.out.print("\nDigite la posición del número que desea eliminar(entre 0 y 9): ");
            posición  = entrada.nextInt();
        }while(posición < 0 || posición > 9);
                
        for (int i = posición; i < 9; i++) {
            arreglo[i]=arreglo[i+1];
        }
        
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i]+" - ");
        }
    }
    
}
