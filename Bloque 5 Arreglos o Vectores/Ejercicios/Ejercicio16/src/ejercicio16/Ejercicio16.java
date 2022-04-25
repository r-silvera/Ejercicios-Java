/*
    Ejercicio 16: Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre
de un grupo. Devemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra
en la posición N (N se lee por teclado).
*/
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float clase[], primerTrimestre[], segundoTrimestre[], tercerTrimestre[];
        float sumaPrimer = 0, sumaSegundo = 0, sumaTercero = 0, sumaAlumno = 0;
        float mediaPrimer, mediaSegundo, mediaTercero, mediaAlumno;
        int posición;
        boolean alumnoEncontrado = false;
        
        
        primerTrimestre = new float[5];
        segundoTrimestre = new float[5];
        tercerTrimestre = new float[5];
        
        
        
        System.out.println("Llenando notas de la clase...\n");
        System.out.println("PRIMER TRIMESTRE: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota del alumno "+i+": ");
            primerTrimestre[i] = entrada.nextFloat();
        }
        
        
        
        System.out.println("\nSEGUNDO TRIMESTRE: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota del alumno "+i+": ");
            segundoTrimestre[i] = entrada.nextFloat();
        }
        
        
        
        System.out.println("\nTERCER TRIMESTRE:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota del alumno "+i+": ");
            tercerTrimestre[i] = entrada.nextFloat();
        }    
        
        
        
        System.out.println("\nCalculando nota media del grupo por cada trimestre...");
        
        for (int j = 0; j < 5; j++) {
            sumaPrimer += primerTrimestre[j];
            sumaSegundo += segundoTrimestre[j];
            sumaTercero += tercerTrimestre[j];
        }
        mediaPrimer = sumaPrimer / 5;
        mediaSegundo = sumaSegundo / 5;
        mediaTercero = sumaTercero / 5;
            
        
        do{
            System.out.println("\nDigite la posición del alumno(0-4), para sacar la media: ");
            posición = entrada.nextInt();
        }while(posición < 0 || posición > 4);
        
        
        
        System.out.println("\nCalculando nota media del alumno por cada trimestre...");
        
        sumaAlumno = primerTrimestre[posición]+segundoTrimestre[posición]+tercerTrimestre[posición];
        
        mediaAlumno = sumaAlumno / 3;
        
        System.out.println("\nImprimiendo los datos requeridos");
        System.out.println("\n La nota media del grupo en cada trimestre: ");
        System.out.println("Primer Trimestre: "+mediaPrimer);
        System.out.println("Segundo Trimestre: "+mediaSegundo);
        System.out.println("Tercer Trimestre: "+mediaTercero);
        System.out.println("\n La nota media del alumno: "+mediaAlumno);
        System.out.println();
    }

}