
package ciclowhile;

import java.util.Scanner;

public class CicloWhile {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int número = 1, contador;
        
        System.out.print("Digite cuantos números quiere en pantalla: ");
        contador = entrada.nextInt(); 
       
       while(número <= contador){ // mientras que "número es menor o igual a contador" seguir ejecutando.
           System.out.println(número); // imprimir la variable "número" al principio.
           //número += 2 --> suma en 2 en 2
           número++; //aumentar en 1 la variable número.
       }
    }  
}
