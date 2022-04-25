
package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        llenarPoligono();
        mostrarResultados();
    }
    
    
    public static void llenarPoligono(){
        char respuesta;
        int opción;  
        
        do{
            do{
                System.out.println("Digite el poligono que desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opción: ");
                opción = entrada.nextInt();
            
            }while(opción < 1 || opción > 2);
            
            switch (opción){
                case 1: llenarTriangulo();
                    break;
                case 2 : llenarRectangulo();
                    break;
            }
            System.out.print("\nDesea introducir otro poligono(s/n): \n");
            respuesta = entrada.next().charAt(0);
        }while(respuesta == 's' || respuesta == 'S');
    }                       
    
    public static void llenarTriangulo(){
            double lado1,lado2,lado3;
            System.out.println("\nDigite cada lado del triangulo...");
            System.out.print("Digite el lado 1: ");
            lado1 = entrada.nextDouble();
            System.out.print("Digite el lado 2: ");
            lado2 = entrada.nextDouble();
            System.out.print("Digite el lado 3: ");
            lado3 = entrada.nextDouble();
            
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
            
            poligono.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1,lado2;
        
        System.out.println("\nDigite cada lado del rectangulo...");
        System.out.print("Digite el lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        for(Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area= "+poli.área());
            System.out.println();
        }
    }
}
