
package Ejercicio4;

import java.util.Scanner;

public class Main {
    
    public static int indiceGanador(Atleta atletas[]){
        float tiempoDeCarrera;
        int indice = 0;
        
        tiempoDeCarrera = atletas[0].getTiempoDeCarrera();
        
        for (int i = 1; i < atletas.length; i++) {
            if(atletas[i].getTiempoDeCarrera() < tiempoDeCarrera){
                tiempoDeCarrera = atletas[i].getTiempoDeCarrera();
                indice = i;
            }
        }
    return indice;
}
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int númeroAtleta, cantidadDeAtletas, ganador;
        String nombre;
        float tiempoDeCarrera;
        
        System.out.print("Digite la cantidad de atletas que habra en la carrera: ");
        cantidadDeAtletas = entrada.nextInt();
        
        Atleta atletas[] = new Atleta[cantidadDeAtletas];
        
        for (int i = 0; i < atletas.length; i++) {
            entrada.nextLine();
            System.out.println("\nDigite los datos del atleta "+(i+1)+": ");
            System.out.print("Introduzca el número de atleta: ");
            númeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzque el nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca el tiempo de carrera del atleta: ");
            tiempoDeCarrera = entrada.nextFloat();
            
            atletas[i] = new Atleta(númeroAtleta, nombre, tiempoDeCarrera);
        }
        
        ganador = indiceGanador(atletas);
        
        System.out.println("\nEl atleta ganador es: ");
        System.out.println(atletas[ganador].mostrarDatos());
    }
}
