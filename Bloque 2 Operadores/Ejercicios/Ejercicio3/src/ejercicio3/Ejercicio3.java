/*
    Ejercicio3: Guillermo tiene N dólares. Luis tiene la mitad de los que posee Guillermo. Juan tiene
la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero
que tiene entre los tres.
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    PROPÓSITO: Calcula y imprime la cantidad de dinero que tienen Guillermo, Luis y Juan.
    
    PARÁMETROS:
        * cantidadDeDineroDeGuillermo: Número - Describe la cantidad de dinero que tiene Guillermo.
    
    PRECONDICIONES:
        * Si *cantidadDeDineroDeGuillermo* es decimal, poner ",".
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cantidadDeDineroDeGuillermo, cantidadDeDineroDeLuis, cantidadDeDineroJuan, cantidadDeDineroEntreLosTres;
        
        System.out.print("Introduzca la cantidad de dinero que tiene Guillermo: ");
        cantidadDeDineroDeGuillermo = entrada.nextDouble();
        
        cantidadDeDineroDeLuis = cantidadDeDineroDeGuillermo / 2; //Luis tiene la mitad de lo que tiene Guillermo.
        cantidadDeDineroJuan = (cantidadDeDineroDeGuillermo + cantidadDeDineroDeLuis) / 2; //Juan tiene la mitad de lo que tiene Luis y Guillermo juntos.
        
        cantidadDeDineroEntreLosTres = cantidadDeDineroDeGuillermo + cantidadDeDineroDeLuis + cantidadDeDineroJuan; 
        
        System.out.println("\nLa cantidad de dinero entre los tres es: "+cantidadDeDineroEntreLosTres);
    }
    
}
