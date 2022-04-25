
package busquedabinaria;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BusquedaBinaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, min, aux;
        int dato, inf, sup, mitad, i;
        boolean band = false;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        
        arreglo = new int[nElementos];
        
        System.out.println("Llenando el arreglo...");
        
            for (int j = 0; j < nElementos; j++) {
                System.out.print(j+". Digite un número: ");
                arreglo[j] = entrada.nextInt();
            }
        //Ordenamos el arreglo con el ordenamiento por selección
        
        System.out.println("\nOrdenando el arreglo...\n");
        
        for (int j = 0; j < nElementos; j++) {
            min = j;
            for (int k = j+1 ; k < nElementos; k++) {
                if(arreglo[k] < arreglo[min]){
                    min = k;
                }
            }
            aux = arreglo[j];
            arreglo[j]=arreglo[min];
            arreglo[min]=aux;
        }
        
        System.out.println("Arreglo de forma creciente:");
        for (int j = 0; j < nElementos; j++) {
            System.out.println(j+". Posición: "+arreglo[j]);
        }
            
       dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));
       
       //Busqueda Binaria
       inf = 0;
       sup = nElementos;
       i = 0;
       
       mitad = (inf + sup) / 2;
       while(inf <= sup && i < 5){
           if(arreglo[mitad] == dato){
               band = true;
               break;
           }
           if(arreglo[mitad]> dato){
               sup = mitad;
               mitad = (inf + sup)/2;
           }
           if(arreglo[mitad] < dato){
               inf = mitad;
               mitad = (inf + sup)/2;
           }
           i++;
       }
        if (band == true) {
            JOptionPane.showMessageDialog(null, "El número "+dato+" a sido encontrado en la posición: "+mitad);
        }
        else{
            JOptionPane.showMessageDialog(null, "No hemos encontrado el número en el arreglo.");
        }
       
    }
    
}
