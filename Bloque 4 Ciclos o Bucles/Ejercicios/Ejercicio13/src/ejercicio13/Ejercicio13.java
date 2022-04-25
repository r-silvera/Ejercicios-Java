/*
    Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la media de los
números negativos y la cantidad de ceros.
*/
package ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
        int elementosNegativos=0, elementosPositivos=0, cantidadDeCeros=0,totalPositivos=0, totalNegativos=0 , número;
        float mediaDeNegativos = 0, mediaDePositivos = 0;
        
        for(int i=1; i<=10; i++){
            número = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            
            if(número == 0){ // Si el número es cero
                cantidadDeCeros++; // Aumentamos en 1 el conteo de 0
            }
            else if(número > 0){ // Si el número es positivo
                elementosPositivos++; // Aumentamos en 1 el conteo de números positivos
                totalPositivos += número; //Suma iterativa de positivos
            }
            else{ //Sino sabemos que el número es negativo
                elementosNegativos++; // Aumentamos en 1 el conteo de números negativos
                totalNegativos += número; // Suma iterativa de negativos
            }
        }
        if(elementosPositivos == 0){
            System.out.println("No se puede sacar la media de los números positivos.");
        }
        else{
            mediaDePositivos = (float) totalPositivos / elementosPositivos;
            System.out.println("la media de elementos positivos es: "+mediaDePositivos);
        }
        
        if(elementosNegativos == 0){
            System.out.println("No se puede sacar la media de los números negativos");
        }
        else{
             mediaDeNegativos = (float) totalNegativos / elementosNegativos;
             System.out.println("la media de elementos negativos es: "+mediaDeNegativos);
        }
        System.out.println("La cantidad de ceros es: "+cantidadDeCeros);
    }
    
}
