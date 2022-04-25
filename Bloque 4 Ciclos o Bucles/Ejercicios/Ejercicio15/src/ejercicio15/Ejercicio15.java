/*
    Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos
mayores a 18 años, y la cantidad de alumnos que miden más de 1.75.
*/
package ejercicio15;

import javax.swing.JOptionPane;

public class Ejercicio15 {

    public static void main(String[] args) {
        float mediaDeAltura, mediaDeEdad, sumaDeAlturas = 0, altura;
        int cantidadMayoresDe18 = 0, cantidadQueMidenMasDe175 = 0, sumaDeEdad = 0, edad;
        
        for(int i=1; i<= 5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad de un alumno"+i+":"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Digite la altura del alumno "+i+":"));
            
            sumaDeAlturas += altura;
            sumaDeEdad+= edad;
            
            if(altura >1.75){
                cantidadQueMidenMasDe175++;
            }
            if(edad > 18){
                cantidadMayoresDe18++;
            }
        }
        mediaDeEdad = (float) sumaDeEdad / 5;
        System.out.println("La media de edad es : "+mediaDeEdad+" años");
        
        mediaDeAltura = (float) sumaDeAlturas / 5;
        System.out.println("La media de altura es : "+mediaDeAltura+"cm");
        
        System.out.println("La cantidad de alumnos mayores a 18 es: "+cantidadMayoresDe18);
        System.out.println("La cantidad de alumnos mayores a 1.75 es: "+cantidadQueMidenMasDe175);
    }
    
}
