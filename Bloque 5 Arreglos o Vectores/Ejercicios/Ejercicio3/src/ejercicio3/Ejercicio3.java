/*
    Ejercicio 3: Leer 5 números  por teclado, almacenarlos en un arreglo y a continuación analizar
la media de los números positivos, la media de los negativos y contar el número de ceros.
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int conteoCeros = 0, conteoNegativos = 0, conteoPositivos = 0;
        float mediaNegativos, mediaPositivos, sumaNegativos = 0, sumaPositivos = 0;
        float números[] = new float[5];
        
        System.out.println("Guardando los números en el arreglo...\n");
        for(int i=0; i<5; i++){
            System.out.print((i+1)+". Digite un número: ");
            números[i] = entrada.nextFloat();
            
            if(números[i] == 0){
                conteoCeros++;
            }
            else if(números[i] > 0){
                conteoPositivos++;
                sumaPositivos += números[i] ;
            }
            else{
                conteoNegativos++;
                sumaNegativos += números[i];
            }
        }
        
        if(conteoPositivos == 0 ){
            System.out.println("No se puede sacar la media de los números positivos.");
        }
        else{
            mediaPositivos = sumaPositivos / conteoPositivos;
            System.out.println("La media de los números positivos es: "+mediaPositivos);
        }
        
        if(conteoNegativos == 0){
            System.out.println("No se puede sacar la media de los números negativos.");
        }
        else{
            mediaNegativos = sumaNegativos / conteoNegativos;
            System.out.println("La media de los números negativos es: "+mediaNegativos);
        }
        System.out.println("Cantidad de ceros: "+conteoCeros);
        }
    }

    
