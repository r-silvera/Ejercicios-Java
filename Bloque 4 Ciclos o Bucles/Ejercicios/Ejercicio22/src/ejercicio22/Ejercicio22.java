/*
    Ejercicio 22: Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso.
*/
package ejercicio22;

import javax.swing.JOptionPane;

public class Ejercicio22 {

    public static void main(String[] args) {
        int calificación;
        boolean haySuspenso = false;
        
        for(int i=1; i<=5; i++){
            do{
                calificación = Integer.parseInt(JOptionPane.showInputDialog("Digite una calificación de 0-10: "));
            }while(calificación < 0 || calificación >10);
            
            if(calificación < 5){
                haySuspenso = true;
            }
        }
        if (haySuspenso == true){
            System.out.println("Hay al menos un alumno suspenso.");
        }
        else{
            System.out.println("No hay ningun alumnos suspenso.");
        }
    }
    
}
