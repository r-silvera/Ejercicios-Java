
package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Complejo número1,número2,suma,mult;
        double a,b,c,d;
        int opción, entero;
    
        do{
            System.out.println("\t\n.:Operaciones con número complejos:.");
            System.out.println("1. Sumar dos números complejos");
            System.out.println("2. Multiplicar 2 números complejos");
            System.out.println("3. Comparar 2 números complejos(iguales o no)");
            System.out.println("4. Multiplicar un número complejo por un entero");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Digite una opción del menu: ");
            opción = entrada.nextInt();
            
            switch(opción){
                case 1: System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    
                    System.out.println("\nDigite el segundo número complejo: ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    número1 = new Complejo(a, b);
                    número2 = new Complejo(c, d);
                    
                    suma = número1.calcularSuma(número2);
                    System.out.println("La suma es: "+suma.getA()+", "+suma.getB()+"i");
                    break;
                    
                case 2: System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    
                    System.out.println("\nDigite el segundo número complejo: ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    número1 = new Complejo(a, b);
                    número2 = new Complejo(c, d);
                    
                    mult = número1.calcularMult((número2));
                    System.out.println("La multiplicación es: "+mult.getA()+", "+mult.getB()+"i");
                    break;
                    
                case 3: System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    
                    System.out.println("\nDigite el segundo número complejo: ");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    
                    número1 = new Complejo(a, b);
                    número2 = new Complejo(c, d);
                    if(número1.compararIgualdad(número2) == false){
                        System.out.println("\nLos números complejos no son iguales");
                    }
                    else{
                        System.out.println("\nLos números complejos son iguales");
                    }
                    break;
                case 4: System.out.println("\nDigite el número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    
                    número1 = new Complejo(a, b);
                    
                    System.out.print("\n Digite un número entero: ");
                    entero = entrada.nextInt();
                    
                    mult = número1.multiplicarConEntero(entero);
                    System.out.println("\n La multiplicación con un entero es: "+mult.getA()+", "+mult.getB()+"i");
            }
        }while(opción != 5);
    }
}
    
