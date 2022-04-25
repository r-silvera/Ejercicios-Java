//Operadores Aritmeticos
package operadores;

import java.util.Scanner;

/**
 *
 * @author t1no
 */
public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float número1, número2, suma, resta, mult, div, resto;
        
        System.out.print("Escribe 2 números decimales: ");
        número1 = entrada.nextFloat();
        número2 = entrada.nextFloat();
        
        suma = número1 + número2;
        resta = número1 - número2; 
        mult = número1 * número2;
        div = número1 / número2;
        resto = número1 % número2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);
        System.out.println("El resto de la división es: "+resto);
    }
    
}
