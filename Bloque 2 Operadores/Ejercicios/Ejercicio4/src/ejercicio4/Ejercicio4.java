/*
    Ejercicio 4: Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas
una comisión de $150 por cada carro vendido, mas el 5% del valor de la venta por el carro. Cada mes el capturista de la empresa
ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual del vendedor dado.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    /*
    PROPÓSITO: Calcula e imprime el salario mensual de un vendedor dado sabiendo que cobra un salario de $1000 mensuales, mas
    una comisión de $150 por cada carro vendido, mas el 5% del valor de la venta por el carro.
    
    PARÁMETROS: 
        * cantidadDeAutosVendidos: Número entero - Describe la cantidad de autos vendidos.
        * valorDelAuto: Número entero - Decribe la cantidad de dinero que vale el auto.
    
    PRECONDICIONES:
        * Ninguna.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int salarioMensual = 1000;
        int cantidadDeAutosVendidos;
        float comision, salarioTotal, valorDelAuto;
        
        System.out.print("Introduzca la cantidad de autos vendidos por el vendedor: ");
        cantidadDeAutosVendidos = entrada.nextInt();
        System.out.print("Introduzca la cantidad de dinero que sale el auto vendido: ");
        valorDelAuto = entrada.nextFloat();
        
        comision = (cantidadDeAutosVendidos * 150) + ((valorDelAuto * 0.05f)* cantidadDeAutosVendidos);
        
        salarioTotal = salarioMensual + comision;
        
        System.out.println("El salario total del vendedor es: $"+salarioTotal);
    }   
    
}
