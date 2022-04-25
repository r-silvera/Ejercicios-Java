/*
    Ejercicio 21: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
*/
package ejercicio21;

import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static void main(String[] args) {
        int número;
        boolean hayNúmeroNegativo = false;
        
        for(int i=1; i<=10; i++){
            número = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            
            if(número<0){
                hayNúmeroNegativo = true;
            }
        }
        if(hayNúmeroNegativo == true){
            System.out.println("Se ha introducido al menos un número negativo.");   
        }
        else{
            System.out.println("No se ha introducido ningun número negativo");
        }
    }
    
}
