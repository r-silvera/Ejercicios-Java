/*
    Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados(=4) y suspendidos.
*/
package ejercicio19;

import javax.swing.JOptionPane;

public class Ejercicio19 {

    public static void main(String[] args) {
        float nota;
        int aprobados = 0, condicionados = 0, suspendidos = 0;
    
        for(int i=1; i<=6; i++){
            do{
            nota = Float.parseFloat(JOptionPane.showInputDialog("Alumno N°"+i+"\nDigite una nota: "));
            }while(nota < 0 || nota > 10);
                    
            switch ((int)nota){
                case 10 : 
                case 9 :
                case 8 :    
                case 7 :
                case 6 : 
                case 5 : aprobados++; break;
                case 4 : condicionados++;break;
                case 3 :
                case 2 : 
                case 1 :
                case 0 : suspendidos++;
            }
        }
            System.out.println("La cantidad de alumnos aprobados es: "+aprobados);
            System.out.println("La cantidad de alumnos condicionados es: "+condicionados);
            System.out.println("La cantidad de alumnos suspendidos es: "+suspendidos);
    }
    
}
