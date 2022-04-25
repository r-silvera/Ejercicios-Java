/*
    Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números enteros y desplace
N posiciones en el arreglo (N es digitado por el usuario).
*/
package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] =  new int[10];
        int posición;
        
        System.out.println("Llenando el arreglo...");
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Pedimos la posición
        System.out.print("Digite cuantas posiciones desea correr hacia abajo: ");
        posición = entrada.nextInt();
        
        //Creamos un arreglo desde la posición para guardar los elementos
        int arregloGuardado[] = new int[10];
        int j = 0; //la variable j nos sirve para guardar los elementos de forma ordenada
        
        System.out.println("\nGuardando elementos...");
        
        //Guardamos los elementos que quedan afuera
        for (int i = 10 - posición; i < 10; i++) {
           arregloGuardado[j] = arreglo[i]; 
           j++;
        }
        //Desplazamos las posiciones
        System.out.println("Desplazando "+posición+" posiciones...");
        
        int repetición = 0;
        
        while (repetición < posición){
            for (int i = 8; i >= 0; i--) {
            arreglo[i+1] = arreglo[i];
            }
            repetición++;
        }
        
        System.out.println("Copiando elementos guardados...\n");
        
        for (int i = 0; i < posición; i++) {
            arreglo[i] = arregloGuardado[i];
        }
        
        System.out.println("Imprimiendo arreglo...\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
