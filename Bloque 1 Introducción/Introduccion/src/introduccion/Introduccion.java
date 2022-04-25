/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccion;

import java.util.Scanner;

public class Introduccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //int numero;
        //String cadena;
        char letra;
        
        System.out.print("Escribe una letra o una palabra: ");
        letra = entrada.next().charAt(0);
        
        System.out.println("La letra o primera letra de la palabra es: "+letra);
    }
    
}
