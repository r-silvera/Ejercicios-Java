
package ordenamiento.por.selección;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoPorSelección {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, min, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo: "));
        
        arreglo = new int[nElementos];
        
        System.out.println("Rellenando el arreglo...");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por selección
        
        for (int i = 0; i < nElementos; i++) {
            min = i;
            for (int j = i+1 ; j < nElementos; j++) {
                if(arreglo[j] < arreglo[min]){
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i]=arreglo[min];
            arreglo[min]=aux;
        }
        
        System.out.print("\nOrden creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
        
        System.out.print("\nOrden decreciente: ");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
    
}
