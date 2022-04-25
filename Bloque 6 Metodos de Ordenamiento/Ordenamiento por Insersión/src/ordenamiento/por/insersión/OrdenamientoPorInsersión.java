
package ordenamiento.por.insersión;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoPorInsersión {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, pos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos que desea tener el arreglo: "));
        
        arreglo = new int[nElementos];
        
        System.out.println("Digite el arreglo...");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por inserción
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];
            
            while( (pos>0) && ( arreglo[pos-1]> aux )){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.print("\nOrden Ascendente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
        
        System.out.print("\nOrden Descendente: ");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
    
}
