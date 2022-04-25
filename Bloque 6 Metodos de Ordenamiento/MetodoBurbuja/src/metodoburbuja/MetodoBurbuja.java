
package metodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        
        arreglo = new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Metodo burbuja
        
        int aux = 0;
        
        for (int i = 0; i < (nElementos)-1; i++) {
            for (int j = 0; j < (nElementos)-1; j++) {
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        System.out.print("\nArreglo ordenado de forma creciente: ");
        for (int i = 0; i < (nElementos); i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
        
        System.out.print("\nArreglo ordenado de forma decreciente: ");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
    
}
