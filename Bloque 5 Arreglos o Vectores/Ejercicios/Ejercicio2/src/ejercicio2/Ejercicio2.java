/*
    Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en orden inverso al introducido.
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float números[] =  new float[5];
        
        System.out.println("Guardando digitos en el arreglo...\n");
        
        for(int i=0; i<5; i++){
            System.out.print((i+1)+". Digite un número: ");
            números[i]=entrada.nextFloat();
        }
        System.out.println("Imprimiendo los elementos del arreglo en orden inverso\n");
        for(int i=4; i>=0; i--){
            System.out.println(números[i]);
        }
    }
}
