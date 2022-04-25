/*
    Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre
0-100, y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto 
a N. El proceso termina cuando el usuario acierta y mostrar el números de intentos.
*/
package ejercicio5;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        int númeroAleatorio, respuesta, intentos = 0;
        
        númeroAleatorio = (int)(Math.random()*100);
        
        do{
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            
            if(respuesta > númeroAleatorio){
                System.out.println("Es menor.");
            }
            else{
                System.out.println("Es mayor.");
            }
            intentos++;
        }while(respuesta != númeroAleatorio);
        
        JOptionPane.showMessageDialog(null, "Muy bien adivinaste el número en "+intentos+" intentos.");
    }
}

