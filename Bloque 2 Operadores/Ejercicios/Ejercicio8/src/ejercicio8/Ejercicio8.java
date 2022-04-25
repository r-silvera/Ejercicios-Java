/*
    Ejercicio 8: Construir un programa que calcule y muestre en pantalla las raices de la ecuación de segundo
grado de coeficientes reales.
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    double a,b,c, resultado1, resultado2;
    
        System.out.print("Introduzca el valor de a: ");
        a = entrada.nextDouble();
        
        System.out.print("Introduzca el valor de b: ");
        b = entrada.nextDouble();
        
        System.out.print("Introduzca el valor de c: ");
        c = entrada.nextDouble();
        
        resultado1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        resultado2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        
        System.out.println("\nEl primer resultado haciendo las raices de la ecuación de segundo grado puede ser: "+resultado1);
        System.out.println("\nEl segundo resultado haciendo las raices de la ecuación de segundo grado puede ser: "+resultado2);
    }
    
}
