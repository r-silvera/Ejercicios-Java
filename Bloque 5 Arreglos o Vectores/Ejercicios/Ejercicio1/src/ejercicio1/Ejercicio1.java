/*
    Ejercicio 1: Leer 5 números, guardalos en un arreglo y mostrarlos en el mismo orden introducido.
*/
package ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arrayNúmeros = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        
        for(int i=0; i<arrayNúmeros.length;i++){
            System.out.print((i+1)+". Digite un número: ");
            arrayNúmeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\n Imprimir los elementos del arreglo");
        for(float i:arrayNúmeros){
            System.out.println(i);
        }
    }
    
}
